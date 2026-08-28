import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsm extends dpa implements dmu {
   public static final MapCodec<dsm> c = b(dsm::new);
   public static final int d = 4;
   public static final ebt e = ebj.aw;
   public static final ebr<ebp> f = dpa.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final ffw i = dmr.b(6.0, -1.0, 3.0);
   private static final ffw D = dmr.b(10.0, -1.0, 5.0);
   private final Function<eat, ffw> R = this.b();

   @Override
   public MapCodec<dsm> a() {
      return c;
   }

   public dsm(eas.d $$0) {
      super($$0);
   }

   private Function<eat, ffw> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((ebp)$$1.c(f)) {
            case b -> dmr.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dmr.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      return this.m();
   }

   @Override
   public ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      if ($$0.c(f) == ebp.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return fft.a();
      }
   }

   @Override
   public eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dmt.a.m();
      }
   }

   @Override
   public boolean a(eat $$0, djp $$1, iv $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.cN);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3 instanceof cot && $$5.O().c(dji.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(eat $$0, ddg $$1) {
      return false;
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
   }

   @Override
   public boolean f(eat $$0) {
      return $$0.c(f) == ebp.b && !this.q($$0);
   }

   @Override
   public void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      float $$4 = doo.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arq $$0, eat $$1, iv $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         eat $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, ebp.a), 3);
         }
      }
   }

   private static boolean a(djp $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dmt.lh);
   }

   private static boolean b(djp $$0, iv $$1) {
      return doo.a($$0, $$1);
   }

   private static boolean o(eat $$0) {
      return $$0.a(dmt.lh) && $$0.c(f) == ebp.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(djp $$0, iv $$1, eat $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(eat $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dsm.a c(djp $$0, iv $$1, eat $$2) {
      if (o($$2)) {
         return new dsm.a($$1, $$2);
      } else {
         iv $$3 = $$1.e();
         eat $$4 = $$0.a_($$3);
         return o($$4) ? new dsm.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      dsm.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      dsm.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iv a, eat b) {
   }
}
