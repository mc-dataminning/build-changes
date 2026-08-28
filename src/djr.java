import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djr extends dgy {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<djr> a = b(djr::new);
   public static final dvm b = djp.a;
   public static final dvj c = dvi.A;
   private static final ky f = new ky();
   public static final Map<cvn, kz> d = ad.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(f));
   private static final int g = 4;

   @Override
   public MapCodec<? extends djr> a() {
      return a;
   }

   public static void a(dei $$0, kz $$1) {
      d.put($$0.q(), $$1);
   }

   public static void a(dei $$0) {
      d.put($$0.q(), new lb($$0.q()));
   }

   protected djr(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dso $$5) {
         $$3.a($$5);
         $$3.a($$5 instanceof dsp ? awq.ac : awq.ae);
      }

      return brs.a;
   }

   protected void a(arj $$0, dus $$1, jf $$2) {
      dso $$3 = $$0.a($$2, drx.f).orElse(null);
      if ($$3 == null) {
         e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         kw $$4 = new kw($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(dzp.a, $$2, dzp.a.a($$3.m()));
         } else {
            cvs $$6 = $$3.a($$5);
            kz $$7 = this.a($$0, $$6);
            if ($$7 != kz.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected kz a(dej $$0, cvs $$1) {
      return (kz)(!$$1.a($$0.J()) ? f : d.get($$1.h()));
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.d());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dso($$0, $$1);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.d().g());
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static jy a(kw $$0) {
      return a($$0, 0.7, eyw.c);
   }

   public static jy a(kw $$0, double $$1, eyw $$2) {
      jk $$3 = $$0.d().c(b);
      return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }
}
