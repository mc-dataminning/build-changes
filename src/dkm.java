import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dkm extends dhk implements dnq {
   public static final MapCodec<dkm> a = b(dkm::new);
   protected static final fab b = dhy.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   protected dkm(dvc.d $$0) {
      super($$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtz($$0, $$1);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected fab a_(dvd $$0, dev $$1, jg $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ag() == dev.k && $$3 instanceof arn $$4 && !$$4.g) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public esc a(arm $$0, btz $$1, jg $$2) {
      alg<dev> $$3 = $$0.ag() == dev.k ? dev.i : dev.k;
      arm $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dev.k;
         jg $$6 = $$5 ? arm.a : $$4.W();
         ezh $$7 = $$6.c();
         float $$8;
         Set<bvj> $$9;
         if ($$5) {
            eed.a($$4, jg.a((jz)$$7).e(), true);
            $$8 = jl.e.p();
            $$9 = bvj.a(bvj.l, Set.of(bvj.e));
            if ($$1 instanceof arn) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvj.a(bvj.l, bvj.k);
            if ($$1 instanceof arn $$12) {
               return $$12.a(false, esc.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new esc($$4, $$7, ezh.c, $$8, 0.0F, $$9, esc.b.then(esc.c));
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lq.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return cvx.k;
   }

   @Override
   protected boolean a(dvd $$0, erd $$1) {
      return false;
   }
}
