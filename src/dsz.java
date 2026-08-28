import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsz extends dpn implements dnh {
   public static final MapCodec<dsz> c = b(dsz::new);
   public static final int d = 4;
   public static final ecg e = ebw.aw;
   public static final ece<ecc> f = dpn.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fgm i = dne.b(6.0, -1.0, 3.0);
   private static final fgm D = dne.b(10.0, -1.0, 5.0);
   private final Function<ebg, fgm> R = this.b();

   @Override
   public MapCodec<dsz> a() {
      return c;
   }

   public dsz(ebf.d $$0) {
      super($$0);
   }

   private Function<ebg, fgm> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((ecc)$$1.c(f)) {
            case b -> dne.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dne.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return this.m();
   }

   @Override
   public fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.R.apply($$0);
   }

   @Override
   public fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      if ($$0.c(f) == ecc.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return fgj.a();
      }
   }

   @Override
   public ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dng.a.m();
      }
   }

   @Override
   public boolean a(ebg $$0, dkc $$1, iw $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.cN);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$1 instanceof aru $$5 && $$3 instanceof cpg && $$5.O().c(djv.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(ebg $$0, ddt $$1) {
      return false;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
   }

   @Override
   public boolean f(ebg $$0) {
      return $$0.c(f) == ecc.b && !this.q($$0);
   }

   @Override
   public void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      float $$4 = dpb.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aru $$0, ebg $$1, iw $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         ebg $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, ecc.a), 3);
         }
      }
   }

   private static boolean a(dkc $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dng.lh);
   }

   private static boolean b(dkc $$0, iw $$1) {
      return dpb.a($$0, $$1);
   }

   private static boolean o(ebg $$0) {
      return $$0.a(dng.lh) && $$0.c(f) == ecc.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dkc $$0, iw $$1, ebg $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(ebg $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dsz.a c(dkc $$0, iw $$1, ebg $$2) {
      if (o($$2)) {
         return new dsz.a($$1, $$2);
      } else {
         iw $$3 = $$1.e();
         ebg $$4 = $$0.a_($$3);
         return o($$4) ? new dsz.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      dsz.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      dsz.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iw a, ebg b) {
   }
}
