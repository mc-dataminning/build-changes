import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsg extends djp implements dnm {
   public static final MapCodec<dsg> a = b(dsg::new);
   public static final dyl<dyx> b = dye.bm;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   protected dsg(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyx.b));
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwi($$0, $$1);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      duq $$5 = $$1.c_($$2);
      if ($$5 instanceof dwi) {
         return (bta)(((dwi)$$5).a($$3) ? bta.a : bta.e);
      } else {
         return bta.e;
      }
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            duq $$5 = $$0.c_($$1);
            if ($$5 instanceof dwi) {
               ((dwi)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$1 instanceof arx) {
         if ($$1.c_($$2) instanceof dwi $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.C();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((arx)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(arx $$0, dwi $$1) {
      switch ($$1.u()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.A();
         case d:
      }
   }
}
