import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxh extends bvx<buh> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eqp e;
   @Nullable
   private je f;
   private float g;

   public bxh() {
      this(150, 250);
   }

   public bxh(int $$0, int $$1) {
      super(ImmutableMap.of(cdi.E, cdj.c, cdi.t, cdj.b, cdi.m, cdj.a), $$0, $$1);
   }

   protected boolean a(arg $$0, buh $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bvg<?> $$2 = $$1.dX();
         cdl $$3 = $$2.c(cdi.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cdi.m);
            if ($$4) {
               $$2.b(cdi.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arg $$0, buh $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cdl> $$3 = $$1.dX().c(cdi.m);
         boolean $$4 = $$3.<Boolean>map(bxh::a).orElse(false);
         cdq $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arg $$0, buh $$1, long $$2) {
      if ($$1.dX().a(cdi.m) && !this.a($$1, $$1.dX().c(cdi.m).get()) && $$1.P().s()) {
         this.d = $$0.C_().a(40);
      }

      $$1.P().o();
      $$1.dX().b(cdi.m);
      $$1.dX().b(cdi.t);
      this.e = null;
   }

   protected void c(arg $$0, buh $$1, long $$2) {
      $$1.dX().a(cdi.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arg $$0, buh $$1, long $$2) {
      eqp $$3 = $$1.P().k();
      bvg<?> $$4 = $$1.dX();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cdi.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cdl $$5 = $$4.c(cdi.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(buh $$0, cdl $$1, long $$2) {
      je $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bvg<?> $$4 = $$0.dX();
      if (this.a($$0, $$1)) {
         $$4.b(cdi.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cdi.E);
         } else if (!$$4.a(cdi.E)) {
            $$4.a(cdi.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eye $$6 = cez.a((bun)$$0, 10, 7, eye.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(buh $$0, cdl $$1) {
      return $$1.a().b().k($$0.ds()) <= $$1.c();
   }

   private static boolean a(cdl $$0) {
      return $$0.a() instanceof bwi $$2 ? $$2.c().P_() : false;
   }
}
