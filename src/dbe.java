import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dbe extends cye {
   public static final MapCodec<dbe> a = b(dbe::new);
   protected static final eos b = cys.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hz> c = hz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hz::i).toList();

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   protected dbe(dli.d $$0) {
      super($$0);
   }

   public static boolean a(cvr $$0, hz $$1, hz $$2) {
      return $$0.a_($$1.a((jd)$$2)).a(aua.co) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aua.cp);
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (hz $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               jz.t,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return $$0.B ? a($$2, diz.m, djr::a) : null;
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return blw.b;
      }
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      dix $$3 = $$1.c_($$2);
      if ($$3 instanceof djr) {
         vq $$4 = ((bmb)$$3).Q_();
         return new bmg(($$2x, $$3x, $$4x) -> new ckz($$2x, $$3x, ckq.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof djr) {
            ((djr)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
