import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvw extends ctm<dey> implements dbt {
   public static final MapCodec<cvw> b = b($$0 -> new cvw($$0, () -> det.b));
   public static final dhq c = cyo.aE;
   public static final dhu<dho> d = dhm.bc;
   public static final dhn e = dhm.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ekb i = cut.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ekb j = cut.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ekb k = cut.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ekb l = cut.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ekb m = cut.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cwz.b<dey, Optional<bij>> n = new cwz.b<dey, Optional<bij>>() {
      public Optional<bij> a(dey $$0, dey $$1) {
         return Optional.of(new bii($$0, $$1));
      }

      public Optional<bij> a(dey $$0) {
         return Optional.of($$0);
      }

      public Optional<bij> a() {
         return Optional.empty();
      }
   };
   private static final cwz.b<dey, Optional<bit>> o = new cwz.b<dey, Optional<bit>>() {
      public Optional<bit> a(final dey $$0, final dey $$1) {
         final bij $$2 = new bii($$0, $$1);
         return Optional.of(new bit() {
            @Nullable
            @Override
            public cge createMenu(int $$0x, cdl $$1x, cdm $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cgl.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public ur O_() {
               if ($$0.ac()) {
                  return $$0.O_();
               } else {
                  return (ur)($$1.ac() ? $$1.O_() : ur.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bit> a(dey $$0) {
         return Optional.of($$0);
      }

      public Optional<bit> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cvw> a() {
      return b;
   }

   protected cvw(dgv.d $$0, Supplier<det<? extends dey>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, hx.c).a(d, dho.a).a(e, Boolean.valueOf(false)));
   }

   public static cwz.a g(dgw $$0) {
      dho $$1 = $$0.c(d);
      if ($$1 == dho.a) {
         return cwz.a.a;
      } else {
         return $$1 == dho.c ? cwz.a.b : cwz.a.c;
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.b;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dho $$6 = $$2.c(d);
         if ($$0.c(d) == dho.a && $$6 != dho.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dho.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(d) == dho.a) {
         return m;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return i;
            case d:
               return j;
            case e:
               return k;
            case f:
               return l;
         }
      }
   }

   public static hx h(dgw $$0) {
      hx $$1 = $$0.c(c);
      return $$0.c(d) == dho.b ? $$1.h() : $$1.i();
   }

   @Override
   public dgw a(cnj $$0) {
      dho $$1 = dho.a;
      hx $$2 = $$0.g().g();
      ecg $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hx $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hx $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dho.c : dho.b;
         }
      }

      if ($$1 == dho.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dho.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dho.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ech.c));
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(e) ? ech.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hx a(cnj $$0, hx $$1) {
      dgw $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dho.a ? $$2.c(c) : null;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dey) {
            ((dey)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         bit $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            ccd.a($$3, true);
         }

         return biq.b;
      }
   }

   protected aqu<agg> c() {
      return aqx.i.b(aqx.ao);
   }

   public det<? extends dey> d() {
      return this.a.get();
   }

   @Nullable
   public static bij a(cvw $$0, dgw $$1, crs $$2, ht $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cwz.c<? extends dey> a(dgw $$0, crs $$1, ht $$2, boolean $$3) {
      BiPredicate<crt, ht> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cvw::a;
      }

      return cwz.a(this.a.get(), cvw::g, cvw::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cwz.b<dey, Float2FloatFunction> a(final dfu $$0) {
      return new cwz.b<dey, Float2FloatFunction>() {
         public Float2FloatFunction a(dey $$0x, dey $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dey $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dey($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? a($$2, this.d(), dey::a) : null;
   }

   public static boolean a(crt $$0, ht $$1) {
      return a((cqy)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cqy $$0, ht $$1) {
      ht $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(crt $$0, ht $$1) {
      List<bwm> $$2 = $$0.a(
         bwm.class, new ejd((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bwm $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      der $$4 = $$1.c_($$2);
      if ($$4 instanceof dey) {
         ((dey)$$4).i();
      }
   }
}
