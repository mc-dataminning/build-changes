import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class det extends dch {
   public static final MapCodec<det> a = b(det::new);
   public static final dqy b = dqo.aT;
   public static final dqp c = dqo.p;
   protected static final ety d = dcv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(b);
   }

   private static void d(dpy $$0, czu $$1, im $$2) {
      int $$3 = $$1.a(dad.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * axw.b($$4));
      }

      $$3 = axw.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$3.gm()) {
         if ($$1.B) {
            return boq.a;
         } else {
            dpy $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dur.c, $$2, dur.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return boq.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dns($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dnf.q, det::a) : null;
   }

   private static void a(czu $$0, im $$1, dpy $$2, dns $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }
}
