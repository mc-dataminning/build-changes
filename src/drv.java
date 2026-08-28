import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class drv extends dmq {
   public static final MapCodec<drv> a = b(drv::new);
   public static final ece<jc> b = drf.e;
   public static final ebx c = ebw.A;
   public static final ebx d = ebw.r;
   private static final fgm e = fgj.a(dne.b(16.0, 0.0, 2.0), dne.b(8.0, 2.0, 14.0));
   private static final Map<jc, fgm> f = fgj.c(
      fgj.a(dne.a(16.0, 10.0, 14.0, 1.0, 5.333333), dne.a(16.0, 12.0, 16.0, 5.333333, 9.666667), dne.a(16.0, 14.0, 18.0, 9.666667, 14.0), e)
   );
   private static final int g = 2;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgm d_(ebg $$0) {
      return e;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   public ebg a(ddt $$0) {
      djz $$1 = $$0.q();
      daa $$2 = $$0.n();
      crz $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         dci $$5 = $$2.a(kl.aa, dci.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f.get($$0.c(b));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzk($$0, $$1);
   }

   public static boolean a(@Nullable bxw $$0, djz $$1, iw $$2, ebg $$3, daa $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bxw $$0, djz $$1, iw $$2, ebg $$3, daa $$4) {
      if ($$1.c_($$2) instanceof dzk $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awr.cz, aws.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bwv $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      ebg $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(egg.c, $$2, egg.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(djz $$0, iw $$1, ebg $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(djz $$0, iw $$1, ebg $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(djz $$0, iw $$1, ebg $$2) {
      eyy $$3 = eyu.a($$0, $$2.c(b).g(), jc.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if ($$0.c(c)) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 == jc.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      if ($$0.c(d)) {
         dye $$3 = $$1.c_($$2);
         if ($$3 instanceof dzk) {
            return ((dzk)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$1.c(d)) {
         return but.f;
      } else if ($$0.a(axo.ba)) {
         return (but)(a($$4, $$2, $$3, $$1, $$0) ? but.a : but.e);
      } else {
         return (but)($$0.f() && $$5 == bus.a ? but.e : but.f);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return but.a;
      } else {
         return but.c;
      }
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(djz $$0, iw $$1, crz $$2) {
      dye $$3 = $$0.c_($$1);
      if ($$3 instanceof dzk) {
         $$2.a((dzk)$$3);
         $$2.a(axb.au);
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
