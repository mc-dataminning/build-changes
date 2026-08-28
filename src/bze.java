import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bze extends bxu<bwd> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eud e;
   @Nullable
   private jh f;
   private float g;

   public bze() {
      this(150, 250);
   }

   public bze(int $$0, int $$1) {
      super(ImmutableMap.of(cff.E, cfg.c, cff.t, cfg.b, cff.m, cfg.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwd $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxd<?> $$2 = $$1.eb();
         cfi $$3 = $$2.c(cff.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ac())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cff.m);
            if ($$4) {
               $$2.b(cff.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ash $$0, bwd $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cfi> $$3 = $$1.eb().c(cff.m);
         boolean $$4 = $$3.<Boolean>map(bze::a).orElse(false);
         cfn $$5 = $$1.L();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ash $$0, bwd $$1, long $$2) {
      if ($$1.eb().a(cff.m) && !this.a($$1, $$1.eb().c(cff.m).get()) && $$1.L().s()) {
         this.d = $$0.H_().a(40);
      }

      $$1.L().o();
      $$1.eb().b(cff.m);
      $$1.eb().b(cff.t);
      this.e = null;
   }

   protected void c(ash $$0, bwd $$1, long $$2) {
      $$1.eb().a(cff.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(ash $$0, bwd $$1, long $$2) {
      eud $$3 = $$1.L().k();
      bxd<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cff.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cfi $$5 = $$4.c(cff.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ac())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bwd $$0, cfi $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bxd<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cff.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cff.E);
         } else if (!$$4.a(cff.E)) {
            $$4.a(cff.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fbs $$6 = cgw.a((bwj)$$0, 10, 7, fbs.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bwd $$0, cfi $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cfi $$0) {
      return $$0.a() instanceof byf $$2 ? $$2.c().aa_() : false;
   }
}
