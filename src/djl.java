import com.mojang.serialization.MapCodec;

public class djl extends dfg {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dqy b = dqx.s;
   public static final drh e = dqx.aA;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, is.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!$$3.gb().e) {
         return bpm.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bpm.a($$1.B);
      }
   }

   @Override
   protected int g(dqh $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.a && !this.b($$3, $$5, $$2)) {
         return ddg.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dag $$0, in $$1, dqh $$2) {
      return this.a((dat)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(d)) {
         is $$4 = $$0.c(aE);
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
         $$1.a(kr.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, e, b, d);
   }
}
