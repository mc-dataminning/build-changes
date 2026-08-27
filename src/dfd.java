import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfd extends czg implements dbo {
   public static final MapCodec<dfd> c = b(dfd::new);
   public static final dkn<dkl> d = czg.b;
   protected static final float e = 6.0F;
   protected static final emv f = cwy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dfd> a() {
      return c;
   }

   public dfd(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return f;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cxa.kJ);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cxa.bw);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      if ($$1 != null) {
         eez $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(asn.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      if ($$0.c(d) == dkl.a) {
         djp $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dkl.b;
      } else {
         eez $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(asn.a) && $$4.e() == 8;
      }
   }

   @Override
   public eez c_(djp $$0) {
      return efa.c.a(false);
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return false;
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      return false;
   }
}
