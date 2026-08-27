import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dbu extends dbk {
   public static final MapCodec<dbu> a = b(dbu::new);
   public static final dpt b = dft.aE;
   public static final dpx<dpn> c = dpp.V;
   public static final dpq d = dpp.w;
   private static final est f = dby.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final est g = dby.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final est h = dby.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final est i = dby.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final est j = esq.a(i, h);
   private static final est k = esq.a(j, dby.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final est l = esq.a(j, dby.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final est m = esq.a(j, dby.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final est n = esq.a(j, dby.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final est o = esq.a(j, dby.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final est F = esq.a(j, dby.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final est G = esq.a(j, dby.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   public dbu(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dpn.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(cyx $$0, doz $$1, erw $$2, ckl $$3) {
      bpv $$4 = $$3.u();
      cjt $$5 = $$4 instanceof cjt ? (cjt)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? boa.a($$1.B) : boa.d;
   }

   public boolean a(cyx $$0, doz $$1, erw $$2, @Nullable cjt $$3, boolean $$4) {
      ih $$5 = $$2.b();
      ib $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(auw.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(doz $$0, ih $$1, double $$2) {
      if ($$1.o() != ih.a.b && !($$2 > 0.8124F)) {
         ih $$3 = $$0.c(b);
         dpn $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cyx $$0, ib $$1, @Nullable ih $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bpv $$0, cyx $$1, ib $$2, @Nullable ih $$3) {
      dmf $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dmd) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dmd)$$4).a($$3);
         $$1.a(null, $$2, aum.bZ, aun.e, 2.0F, 1.0F);
         $$1.a($$0, dts.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private est m(doz $$0) {
      ih $$1 = $$0.c(b);
      dpn $$2 = $$0.c(c);
      if ($$2 == dpn.a) {
         return $$1 != ih.c && $$1 != ih.d ? g : f;
      } else if ($$2 == dpn.b) {
         return G;
      } else if ($$2 == dpn.d) {
         return $$1 != ih.c && $$1 != ih.d ? l : k;
      } else if ($$1 == ih.c) {
         return o;
      } else if ($$1 == ih.d) {
         return F;
      } else {
         return $$1 == ih.f ? n : m;
      }
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.m($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.m($$0);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      cyx $$3 = $$0.q();
      ih.a $$4 = $$1.o();
      if ($$4 == ih.a.b) {
         doz $$5 = this.n().a(c, $$1 == ih.a ? dpn.b : dpn.a).a(b, $$0.g());
         if ($$5.a((cza)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ih.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ih.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ih.e)
            || $$4 == ih.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ih.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ih.c);
         doz $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dpn.d : dpn.c);
         if ($$7.a((cza)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ih.b);
         $$7 = $$7.a(c, $$8 ? dpn.a : dpn.b);
         if ($$7.a((cza)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      dpn $$6 = $$0.c(c);
      ih $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dpn.d) {
         return dca.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dpn.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dpn.c).a(b, $$1.g());
            }

            if ($$6 == dpn.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dpn.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = n($$0).g();
      return $$3 == ih.b ? dby.a($$1, $$2.c(), ih.a) : des.b($$1, $$2, $$3);
   }

   private static ih n(doz $$0) {
      switch ((dpn)$$0.c(c)) {
         case a:
            return ih.b;
         case b:
            return ih.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.E, $$0.B ? dmd::a : dmd::b);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   public doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
