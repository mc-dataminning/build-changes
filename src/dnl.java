import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnl extends dhn implements djw {
   public static final MapCodec<dnl> c = b(dnl::new);
   public static final dtf<dtd> d = dhn.b;
   protected static final float e = 6.0F;
   protected static final ews f = dff.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnl> a() {
      return c;
   }

   public dnl(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return f;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.d($$1, $$2, jf.b) && !$$0.a(dfh.kJ);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(dfh.bw);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = super.a($$0);
      if ($$1 != null) {
         eob $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awa.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      if ($$0.c(d) == dtd.a) {
         dsh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dtd.b;
      } else {
         eob $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awa.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return eoc.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return false;
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      return false;
   }
}
