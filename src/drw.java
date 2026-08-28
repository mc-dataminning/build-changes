import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drw extends dlu implements doe {
   public static final MapCodec<drw> c = b(drw::new);
   public static final dxt<dxr> d = dlu.b;
   protected static final float e = 6.0F;
   protected static final fbt f = djl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<drw> a() {
      return c;
   }

   public drw(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return f;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djn.ll);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(djn.bD);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      if ($$1 != null) {
         esy $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      if ($$0.c(d) == dxr.a) {
         dww $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dxr.b;
      } else {
         esy $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return esz.c.a(false);
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return false;
   }

   @Override
   public boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      return false;
   }
}
