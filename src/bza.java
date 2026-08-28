import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bza extends bxq<bvz> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eue e;
   @Nullable
   private jh f;
   private float g;

   public bza() {
      this(150, 250);
   }

   public bza(int $$0, int $$1) {
      super(ImmutableMap.of(cfb.E, cfc.c, cfb.t, cfc.b, cfb.m, cfc.a), $$0, $$1);
   }

   protected boolean a(arx $$0, bvz $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwz<?> $$2 = $$1.ec();
         cfe $$3 = $$2.c(cfb.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ad())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cfb.m);
            if ($$4) {
               $$2.b(cfb.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arx $$0, bvz $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cfe> $$3 = $$1.ec().c(cfb.m);
         boolean $$4 = $$3.<Boolean>map(bza::a).orElse(false);
         cfj $$5 = $$1.L();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arx $$0, bvz $$1, long $$2) {
      if ($$1.ec().a(cfb.m) && !this.a($$1, $$1.ec().c(cfb.m).get()) && $$1.L().s()) {
         this.d = $$0.H_().a(40);
      }

      $$1.L().o();
      $$1.ec().b(cfb.m);
      $$1.ec().b(cfb.t);
      this.e = null;
   }

   protected void c(arx $$0, bvz $$1, long $$2) {
      $$1.ec().a(cfb.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(arx $$0, bvz $$1, long $$2) {
      eue $$3 = $$1.L().k();
      bwz<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cfb.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cfe $$5 = $$4.c(cfb.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ad())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvz $$0, cfe $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bwz<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cfb.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cfb.E);
         } else if (!$$4.a(cfb.E)) {
            $$4.a(cfb.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fbr $$6 = cgs.a((bwf)$$0, 10, 7, fbr.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvz $$0, cfe $$1) {
      return $$1.a().b().k($$0.dw()) <= $$1.c();
   }

   private static boolean a(cfe $$0) {
      return $$0.a() instanceof byb $$2 ? $$2.c().aa_() : false;
   }
}
