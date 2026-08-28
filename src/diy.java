import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diy extends djp {
   public static final dyl<jm> a = dob.aF;
   public static final dyf b = dye.v;

   protected diy(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.c).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends diy> a();

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         this.a($$1, $$2, $$3);
      }

      return bta.a;
   }

   protected abstract void a(dgz var1, jh var2, cpo var3);

   @Override
   public dxo a(dax $$0) {
      return this.m().b(a, $$0.g().g());
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         duq $$5 = $$1.c_($$2);
         if ($$5 instanceof due) {
            if ($$1 instanceof arx) {
               bsw.a($$1, $$2, (due)$$5);
               ((due)$$5).a((arx)$$1, fbr.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends duq> dur<T> a(dgz $$0, dus<T> $$1, dus<? extends due> $$2) {
      return $$0 instanceof arx $$3 ? a($$1, $$2, ($$1x, $$2x, $$3x, $$4) -> due.a($$3, $$2x, $$3x, $$4)) : null;
   }
}
