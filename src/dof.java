import com.mojang.serialization.MapCodec;

public class dof extends dka {
   public static final MapCodec<dof> a = b(dof::new);
   public static final dvu b = dvt.s;
   public static final dwd e = dvt.aA;

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jl.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$3.gl().e) {
         return bry.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bry.a;
      }
   }

   @Override
   protected int h(dvd $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.a && !this.b($$3, $$5, $$2)) {
         return dia.a.m();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dey $$0, jg $$1, dvd $$2) {
      return this.a((dfm)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(d)) {
         jl $$4 = $$0.c(aF);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(ll.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, e, b, d);
   }
}
