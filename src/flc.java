import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flc extends fld {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wu c = wu.c("recover_world.title").a(n.r);
   private static final wu d = wu.c("recover_world.bug_tracker");
   private static final wu r = wu.c("recover_world.restore");
   private static final wu s = wu.c("recover_world.no_fallback");
   private static final wu u = wu.c("recover_world.done.title");
   private static final wu v = wu.c("recover_world.done.success");
   private static final wu w = wu.c("recover_world.done.failed");
   private static final wu x = wu.c("recover_world.issue.none").a(n.k);
   private static final wu y = wu.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fiv A = fiv.d().a(8);
   private final wu B;
   private final ffy C;
   private final ffy D;
   private final eob.c E;

   public flc(fde $$0, BooleanConsumer $$1, eob.c $$2) {
      super(c);
      this.z = $$1;
      this.B = wu.a("recover_world.message", wu.b($$2.f()).a(n.h));
      this.C = new ffy(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wu $$5 = wu.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new ffy($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fgl(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fiv $$7 = fiv.e().a(5);
      $$7.a(ffe.a(d, fju.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(ffe.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fgp.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(ffe.a(wt.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fde $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fkj(wu.c("recover_world.restoring")));
         fpv.a(this.E);
         if (this.E.n()) {
            $$0.a(new fjv(this.z, u, v, wt.j, wt.k));
         } else {
            $$0.a(new fjp(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fjp(() -> this.z.accept(false), u, w));
      }
   }

   private wu a(eob.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wu.i();
      } else {
         xi $$3 = wu.i();
         Instant $$4 = $$0.a($$1);
         xi $$5 = $$4 != null ? wu.b(fqe.a.format($$4)) : wu.c("recover_world.state_entry.unknown");
         $$3.b(wu.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof ur) {
            $$3.b(wu.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wu.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eob.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (ul | ur | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.n - 50);
      this.C.d(this.n - 50);
      this.A.a();
      fip.a(this.A, this.G());
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
