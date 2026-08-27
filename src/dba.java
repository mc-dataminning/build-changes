import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dba extends cya {
   public static final MapCodec<dba> a = b(dba::new);
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hz> c = hz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hz::i).toList();

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   protected dba(dle.d $$0) {
      super($$0);
   }

   public static boolean a(cvn $$0, hz $$1, hz $$2) {
      return $$0.a_($$1.a((jd)$$2)).a(atz.co) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(atz.cp);
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
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
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? a($$2, div.m, djn::a) : null;
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return blu.b;
      }
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      dit $$3 = $$1.c_($$2);
      if ($$3 instanceof djn) {
         vq $$4 = ((blz)$$3).Q_();
         return new bme(($$2x, $$3x, $$4x) -> new ckv($$2x, $$3x, ckm.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof djn) {
            ((djn)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
