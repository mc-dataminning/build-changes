import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsx extends dpl implements dnf {
   public static final MapCodec<dsx> c = b(dsx::new);
   public static final int d = 4;
   public static final ece e = ebu.aw;
   public static final ecc<eca> f = dpl.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fgk i = dnc.b(6.0, -1.0, 3.0);
   private static final fgk D = dnc.b(10.0, -1.0, 5.0);
   private final Function<ebe, fgk> R = this.b();

   @Override
   public MapCodec<dsx> a() {
      return c;
   }

   public dsx(ebd.d $$0) {
      super($$0);
   }

   private Function<ebe, fgk> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((eca)$$1.c(f)) {
            case b -> dnc.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dnc.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return this.m();
   }

   @Override
   public fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.R.apply($$0);
   }

   @Override
   public fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      if ($$0.c(f) == eca.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return fgh.a();
      }
   }

   @Override
   public ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dne.a.m();
      }
   }

   @Override
   public boolean a(ebe $$0, dka $$1, iv $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.cN);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$1 instanceof ars $$5 && $$3 instanceof cpe && $$5.O().c(djt.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(ebe $$0, ddr $$1) {
      return false;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
   }

   @Override
   public boolean f(ebe $$0) {
      return $$0.c(f) == eca.b && !this.q($$0);
   }

   @Override
   public void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      float $$4 = doz.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ars $$0, ebe $$1, iv $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         ebe $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, eca.a), 3);
         }
      }
   }

   private static boolean a(dka $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dne.lh);
   }

   private static boolean b(dka $$0, iv $$1) {
      return doz.a($$0, $$1);
   }

   private static boolean o(ebe $$0) {
      return $$0.a(dne.lh) && $$0.c(f) == eca.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dka $$0, iv $$1, ebe $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(ebe $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dsx.a c(dka $$0, iv $$1, ebe $$2) {
      if (o($$2)) {
         return new dsx.a($$1, $$2);
      } else {
         iv $$3 = $$1.e();
         ebe $$4 = $$0.a_($$3);
         return o($$4) ? new dsx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      dsx.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      dsx.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iv a, ebe b) {
   }
}
