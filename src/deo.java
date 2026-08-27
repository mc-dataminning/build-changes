import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deo extends cyr implements daz {
   public static final MapCodec<deo> c = b(deo::new);
   public static final djy<djw> d = cyr.b;
   protected static final float e = 6.0F;
   protected static final emf f = cwj.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<deo> a() {
      return c;
   }

   public deo(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return f;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cwl.kJ);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cwl.bw);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      if ($$1 != null) {
         eek $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(asg.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      if ($$0.c(d) == djw.a) {
         dja $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == djw.b;
      } else {
         eek $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(asg.a) && $$4.e() == 8;
      }
   }

   @Override
   public eek c_(dja $$0) {
      return eel.c.a(false);
   }

   @Override
   public boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return false;
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      return false;
   }
}
