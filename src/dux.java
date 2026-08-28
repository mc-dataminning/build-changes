import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dux extends dne {
   public static final MapCodec<dux> a = b(dux::new);
   public static final int b = 8;
   public static final ecg c = ebw.aI;
   private static final fgm[] e = dne.a(8, $$0 -> dne.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dux> a() {
      return a;
   }

   protected dux(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return $$1 == eyf.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgm c(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected float c(ebg $$0, djd $$1, iw $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.e());
      if ($$3.a(axg.cv)) {
         return false;
      } else {
         return $$3.a(axg.cw) ? true : dne.a($$3.g($$1, $$2.e()), jc.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.a(dki.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(ebg $$0, ddt $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jc.b : true;
      }
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }
}
