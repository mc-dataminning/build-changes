import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqw extends dky implements dng {
   public static final MapCodec<dqw> c = b(dqw::new);
   public static final dws<dwq> d = dky.b;
   protected static final float e = 6.0F;
   protected static final fas f = diq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dqw> a() {
      return c;
   }

   public dqw(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return f;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dis.kJ);
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(dis.bw);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      if ($$1 != null) {
         erv $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axi.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      if ($$0.c(d) == dwq.a) {
         dvv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dwq.b;
      } else {
         erv $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axi.a) && $$4.e() == 8;
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return erw.c.a(false);
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return false;
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      return false;
   }
}
