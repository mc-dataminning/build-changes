import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmx extends fmy {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xl c = xl.c("recover_world.title").a(n.r);
   private static final xl d = xl.c("recover_world.bug_tracker");
   private static final xl r = xl.c("recover_world.restore");
   private static final xl s = xl.c("recover_world.no_fallback");
   private static final xl u = xl.c("recover_world.done.title");
   private static final xl v = xl.c("recover_world.done.success");
   private static final xl w = xl.c("recover_world.done.failed");
   private static final xl x = xl.c("recover_world.issue.none").a(n.k);
   private static final xl y = xl.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fkq A = fkq.d().a(8);
   private final xl B;
   private final fht C;
   private final fht D;
   private final epr.c E;

   public fmx(ffa $$0, BooleanConsumer $$1, epr.c $$2) {
      super(c);
      this.z = $$1;
      this.B = xl.a("recover_world.message", xl.b($$2.f()).a(n.h));
      this.C = new fht(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xl $$5 = xl.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new fht($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fig(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fkq $$7 = fkq.e().a(5);
      $$7.a(fgz.a(d, flp.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(fgz.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fik.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(fgz.a(xk.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(ffa $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fme(xl.c("recover_world.restoring")));
         frp.a(this.E);
         if (this.E.n()) {
            $$0.a(new flq(this.z, u, v, xk.j, xk.k));
         } else {
            $$0.a(new flk(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new flk(() -> this.z.accept(false), u, w));
      }
   }

   private xl a(epr.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xl.i();
      } else {
         xz $$3 = xl.i();
         Instant $$4 = $$0.a($$1);
         xz $$5 = $$4 != null ? xl.b(fry.a.format($$4)) : xl.c("recover_world.state_entry.unknown");
         $$3.b(xl.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof vi) {
            $$3.b(xl.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xl.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(epr.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (vc | vi | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.n - 50);
      this.C.d(this.n - 50);
      this.A.a();
      fkk.a(this.A, this.G());
   }

   @Override
   public xl i() {
      return xk.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
