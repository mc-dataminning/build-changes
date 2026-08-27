import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmg extends dgi implements dir {
   public static final MapCodec<dmg> c = b(dmg::new);
   public static final dsb<drz> d = dgi.b;
   protected static final float e = 6.0F;
   protected static final evf f = dea.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dmg> a() {
      return c;
   }

   public dmg(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return f;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.d($$1, $$2, it.b) && !$$0.a(dec.kJ);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(dec.bw);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      if ($$1 != null) {
         emw $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awc.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      if ($$0.c(d) == drz.a) {
         drd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == drz.b;
      } else {
         emw $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awc.a) && $$4.e() == 8;
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return emx.c.a(false);
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return false;
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      return false;
   }
}
