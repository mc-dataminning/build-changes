import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dib extends dhv implements dia {
   public static final MapCodec<dib> a = b(dib::new);

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(dvn.d $$0) {
      super($$0);
   }

   @Override
   public cvc b() {
      return cvc.a;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.o, dsm::a);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsm $$5) {
         $$3.a($$5);
         $$3.a(awy.ab);
      }

      return bsh.a;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }
}
