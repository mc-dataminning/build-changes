import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frv extends frw {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final xj c = xj.c("recover_world.title").a(n.r);
   private static final xj d = xj.c("recover_world.bug_tracker");
   private static final xj s = xj.c("recover_world.restore");
   private static final xj u = xj.c("recover_world.no_fallback");
   private static final xj v = xj.c("recover_world.done.title");
   private static final xj w = xj.c("recover_world.done.success");
   private static final xj x = xj.c("recover_world.done.failed");
   private static final xj y = xj.c("recover_world.issue.none").a(n.k);
   private static final xj z = xj.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer A;
   private final fpw B = fpw.d().a(8);
   private final xj C;
   private final fmx D;
   private final fmx E;
   private final eub.c F;

   public frv(fke $$0, BooleanConsumer $$1, eub.c $$2) {
      super(c);
      this.A = $$1;
      this.C = xj.a("recover_world.message", xj.b($$2.f()).a(n.h));
      this.D = new fmx(this.C, $$0.h);
      this.F = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      xj $$5 = xj.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.E = new fmx($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.B.c().b();
      this.B.a(new fnk(this.l, $$0.h));
      this.B.a(this.D.b(true));
      this.B.a(this.E);
      fpw $$7 = fpw.e().a(5);
      $$7.a(fmd.a(d, fqt.b(this, ayi.j)).b(120, 20).a());
      $$7.a(fmd.a(s, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fno.a(u)).a()).j = $$6;
      this.B.a($$7);
      this.B.a(fmd.a(xi.k, $$0x -> this.aO_()).b(120, 20).a());
      this.B.a(this::c);
   }

   private void a(fke $$0) {
      Exception $$1 = this.a(this.F, false);
      Exception $$2 = this.a(this.F, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new frh(xj.c("recover_world.restoring")));
         fwy.a(this.F);
         if (this.F.n()) {
            $$0.a(new fqu(this.A, v, w, xi.j, xi.k));
         } else {
            $$0.a(new fqp(() -> this.A.accept(false), v, x));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fqp(() -> this.A.accept(false), v, x));
      }
   }

   private xj a(eub.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return xj.i();
      } else {
         xx $$3 = xj.i();
         Instant $$4 = $$0.a($$1);
         xx $$5 = $$4 != null ? xj.b(fxj.a.format($$4)) : xj.c("recover_world.state_entry.unknown");
         $$3.b(xj.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(y);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(z);
         } else if ($$2 instanceof vc) {
            $$3.b(xj.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(xj.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(eub.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uw | vc | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c();
   }

   @Override
   protected void c() {
      this.E.d(this.n - 50);
      this.D.d(this.n - 50);
      this.B.a();
      fpq.a(this.B, this.H());
   }

   @Override
   public xj i() {
      return xi.a(super.i(), this.C);
   }

   @Override
   public void aO_() {
      this.A.accept(false);
   }
}
