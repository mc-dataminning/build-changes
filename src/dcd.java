import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dcd extends dbt {
   public static final MapCodec<dcd> a = b(dcd::new);
   public static final dqc b = dgc.aE;
   public static final dqg<dpw> c = dpy.V;
   public static final dpz d = dpy.w;
   private static final etc f = dch.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final etc g = dch.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final etc h = dch.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final etc i = dch.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final etc j = esz.a(i, h);
   private static final etc k = esz.a(j, dch.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final etc l = esz.a(j, dch.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final etc m = esz.a(j, dch.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final etc n = esz.a(j, dch.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final etc o = esz.a(j, dch.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final etc F = esz.a(j, dch.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final etc G = esz.a(j, dch.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dcd> a() {
      return a;
   }

   public dcd(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, dpw.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      bqa $$4 = $$3.u();
      cka $$5 = $$4 instanceof cka ? (cka)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bof.a($$1.B) : bof.d;
   }

   public boolean a(czg $$0, dpi $$1, esf $$2, @Nullable cka $$3, boolean $$4) {
      ij $$5 = $$2.b();
      id $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(auz.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dpi $$0, ij $$1, double $$2) {
      if ($$1.o() != ij.a.b && !($$2 > 0.8124F)) {
         ij $$3 = $$0.c(b);
         dpw $$4 = $$0.c(c);
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

   public boolean a(czg $$0, id $$1, @Nullable ij $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bqa $$0, czg $$1, id $$2, @Nullable ij $$3) {
      dmo $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dmm) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dmm)$$4).a($$3);
         $$1.a(null, $$2, auo.bZ, aup.e, 2.0F, 1.0F);
         $$1.a($$0, dub.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private etc m(dpi $$0) {
      ij $$1 = $$0.c(b);
      dpw $$2 = $$0.c(c);
      if ($$2 == dpw.a) {
         return $$1 != ij.c && $$1 != ij.d ? g : f;
      } else if ($$2 == dpw.b) {
         return G;
      } else if ($$2 == dpw.d) {
         return $$1 != ij.c && $$1 != ij.d ? l : k;
      } else if ($$1 == ij.c) {
         return o;
      } else if ($$1 == ij.d) {
         return F;
      } else {
         return $$1 == ij.f ? n : m;
      }
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.m($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.m($$0);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.k();
      id $$2 = $$0.a();
      czg $$3 = $$0.q();
      ij.a $$4 = $$1.o();
      if ($$4 == ij.a.b) {
         dpi $$5 = this.n().a(c, $$1 == ij.a ? dpw.b : dpw.a).a(b, $$0.g());
         if ($$5.a((czj)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ij.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ij.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ij.e)
            || $$4 == ij.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ij.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ij.c);
         dpi $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dpw.d : dpw.c);
         if ($$7.a((czj)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ij.b);
         $$7 = $$7.a(c, $$8 ? dpw.a : dpw.b);
         if ($$7.a((czj)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      dpw $$6 = $$0.c(c);
      ij $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dpw.d) {
         return dcj.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dpw.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dpw.c).a(b, $$1.g());
            }

            if ($$6 == dpw.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dpw.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      ij $$3 = n($$0).g();
      return $$3 == ij.b ? dch.a($$1, $$2.c(), ij.a) : dfb.b($$1, $$2, $$3);
   }

   private static ij n(dpi $$0) {
      switch ((dpw)$$0.c(c)) {
         case a:
            return ij.b;
         case b:
            return ij.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.E, $$0.B ? dmm::a : dmm::b);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   public dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
