import com.mojang.serialization.MapCodec;

public class djx extends dgv implements dnc {
   public static final MapCodec<djx> a = b(djx::new);
   protected static final ezm b = dhj.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dun.d $$0) {
      super($$0);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtl($$0, $$1);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3.o(false) && ezj.c(ezj.a($$3.cO().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.f($$1, $$2), eyw.i)) {
         if (!$$1.B && $$1.ag() == deg.j && $$3 instanceof ari $$4 && !$$4.f) {
            $$4.q();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public ern a(arh $$0, bto $$1, je $$2) {
      alb<deg> $$3 = $$0.ag() == deg.j ? deg.h : deg.j;
      arh $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == deg.j;
         je $$6 = $$5 ? arh.a : $$4.W();
         eys $$7 = $$6.c();
         float $$8 = $$1.dI();
         if ($$5) {
            edo.a($$4, je.a((jx)$$7).e(), true);
            $$8 = jj.e.p();
            if ($$1 instanceof ari) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            if ($$1 instanceof ari $$9) {
               return $$9.a(false, ern.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new ern($$4, $$7, $$1.dv(), $$8, $$1.dK(), ern.b.then(ern.c));
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ln.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return cvp.k;
   }

   @Override
   protected boolean a(duo $$0, eqo $$1) {
      return false;
   }
}
