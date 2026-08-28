import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnk extends fnl {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wu c = wu.c("recover_world.title").a(n.r);
   private static final wu q = wu.c("recover_world.bug_tracker");
   private static final wu r = wu.c("recover_world.restore");
   private static final wu s = wu.c("recover_world.no_fallback");
   private static final wu u = wu.c("recover_world.done.title");
   private static final wu v = wu.c("recover_world.done.success");
   private static final wu w = wu.c("recover_world.done.failed");
   private static final wu x = wu.c("recover_world.issue.none").a(n.k);
   private static final wu y = wu.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fll A = fll.d().a(8);
   private final wu B;
   private final fio C;
   private final fio D;
   private final eqk.c E;

   public fnk(ffw $$0, BooleanConsumer $$1, eqk.c $$2) {
      super(c);
      this.z = $$1;
      this.B = wu.a("recover_world.message", wu.b($$2.f()).a(n.h));
      this.C = new fio(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wu $$5 = wu.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fio($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fjb(this.k, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fll $$7 = fll.e().a(5);
      $$7.a(fhu.a(q, fmi.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fhu.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fjf.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fhu.a(wt.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(ffw $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fmw(wu.c("recover_world.restoring")));
         fsk.a(this.E);
         if (this.E.n()) {
            $$0.a(new fmj(this.z, u, v, wt.j, wt.k));
         } else {
            $$0.a(new fme(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fme(() -> this.z.accept(false), u, w));
      }
   }

   private wu a(eqk.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wu.i();
      } else {
         xi $$3 = wu.i();
         Instant $$4 = $$0.a($$1);
         xi $$5 = $$4 != null ? wu.b(fst.a.format($$4)) : wu.c("recover_world.state_entry.unknown");
         $$3.b(wu.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof uo) {
            $$3.b(wu.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wu.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eqk.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ui | uo | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.m - 50);
      this.C.d(this.m - 50);
      this.A.a();
      flf.a(this.A, this.H());
   }

   @Override
   public wu i() {
      return wt.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
