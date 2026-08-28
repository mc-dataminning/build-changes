import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dso extends dmm implements dow {
   public static final MapCodec<dso> c = b(dso::new);
   public static final dyl<dyj> d = dmm.b;
   protected static final float e = 6.0F;
   protected static final fcl f = dkd.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dso> a() {
      return c;
   }

   public dso(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return f;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkf.ll);
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(dkf.bD);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      if ($$1 != null) {
         etq $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axq.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      if ($$0.c(d) == dyj.a) {
         dxo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dyj.b;
      } else {
         etq $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axq.a) && $$4.e() == 8;
      }
   }

   @Override
   protected etq b_(dxo $$0) {
      return etr.c.a(false);
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      return false;
   }
}
