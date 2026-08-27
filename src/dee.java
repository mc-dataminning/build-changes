import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends cyh implements dap {
   public static final MapCodec<dee> c = b(dee::new);
   public static final djn<djl> d = cyh.b;
   protected static final float e = 6.0F;
   protected static final elu f = cvz.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dee> a() {
      return c;
   }

   public dee(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return f;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.d($$1, $$2, ia.b) && !$$0.a(cwb.kJ);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cwb.bw);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = super.a($$0);
      if ($$1 != null) {
         edz $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(arw.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      if ($$0.c(d) == djl.a) {
         dip $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == djl.b;
      } else {
         edz $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(arw.a) && $$4.e() == 8;
      }
   }

   @Override
   public edz c_(dip $$0) {
      return eea.c.a(false);
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return false;
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      return false;
   }
}
