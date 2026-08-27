import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcy extends cxa implements czj {
   public static final MapCodec<dcy> c = b(dcy::new);
   public static final dhu<dhs> d = cxa.b;
   protected static final float e = 6.0F;
   protected static final ekb f = cut.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dcy> a() {
      return c;
   }

   public dcy(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return f;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cuv.kJ);
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cuv.bw);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      if ($$1 != null) {
         ecg $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(arh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      if ($$0.c(d) == dhs.a) {
         dgw $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dhs.b;
      } else {
         ecg $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(arh.a) && $$4.e() == 8;
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return ech.c.a(false);
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return false;
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      return false;
   }
}
