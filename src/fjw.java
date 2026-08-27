import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjw extends fjx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final wi c = wi.c("recover_world.title").a(n.r);
   private static final wi d = wi.c("recover_world.bug_tracker");
   private static final wi o = wi.c("recover_world.restore");
   private static final wi p = wi.c("recover_world.no_fallback");
   private static final wi q = wi.c("recover_world.done.title");
   private static final wi r = wi.c("recover_world.done.success");
   private static final wi s = wi.c("recover_world.done.failed");
   private static final wi u = wi.c("recover_world.issue.none").a(n.k);
   private static final wi v = wi.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer w;
   private final fhp x = fhp.d().a(8);
   private final wi y;
   private final fes z;
   private final fes A;
   private final ena.c B;

   public fjw(fby $$0, BooleanConsumer $$1, ena.c $$2) {
      super(c);
      this.w = $$1;
      this.y = wi.a("recover_world.message", wi.b($$2.f()).a(n.h));
      this.z = new fes(this.y, $$0.h);
      this.B = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      wi $$5 = wi.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.A = new fes($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.x.c().b();
      this.x.a(new fff(this.i, $$0.h));
      this.x.a(this.z.b(true));
      this.x.a(this.A);
      fhp $$7 = fhp.e().a(5);
      $$7.a(fdy.a(d, fio.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fdy.a(o, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : ffj.a(p)).a()).j = $$6;
      this.x.a($$7);
      this.x.a(fdy.a(wh.k, $$0x -> this.d()).b(120, 20).a());
      this.x.a(this::c);
   }

   private void a(fby $$0) {
      Exception $$1 = this.a(this.B, false);
      Exception $$2 = this.a(this.B, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fjd(wi.c("recover_world.restoring")));
         foo.a(this.B);
         if (this.B.n()) {
            $$0.a(new fip(this.w, q, r, wh.j, wh.k));
         } else {
            $$0.a(new fij(() -> this.w.accept(false), q, s));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fij(() -> this.w.accept(false), q, s));
      }
   }

   private wi a(ena.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return wi.i();
      } else {
         ww $$3 = wi.i();
         Instant $$4 = $$0.a($$1);
         ww $$5 = $$4 != null ? wi.b(foy.a.format($$4)) : wi.c("recover_world.state_entry.unknown");
         $$3.b(wi.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(u);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(v);
         } else if ($$2 instanceof uf) {
            $$3.b(wi.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(wi.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(ena.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (tz | uf | IOException var4) {
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
      this.A.d(this.k - 50);
      this.z.d(this.k - 50);
      this.x.a();
      fhj.a(this.x, this.G());
   }

   @Override
   public wi i() {
      return wh.a(super.i(), this.y);
   }

   @Override
   public void d() {
      this.w.accept(false);
   }
}
