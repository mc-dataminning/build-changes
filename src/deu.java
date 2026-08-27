import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deu extends cyx implements dbf {
   public static final MapCodec<deu> c = b(deu::new);
   public static final dke<dkc> d = cyx.b;
   protected static final float e = 6.0F;
   protected static final eml f = cwp.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<deu> a() {
      return c;
   }

   public deu(djf.d $$0) {
      super($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return f;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.d($$1, $$2, ic.b) && !$$0.a(cwr.kJ);
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cwr.bw);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      if ($$1 != null) {
         eeq $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(asl.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      if ($$0.c(d) == dkc.a) {
         djg $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dkc.b;
      } else {
         eeq $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(asl.a) && $$4.e() == 8;
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return eer.c.a(false);
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return false;
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      return false;
   }
}
