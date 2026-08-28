import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgk extends deb<dpw> implements dmi {
   public static final MapCodec<dgk> b = b($$0 -> new dgk($$0, () -> dpr.b));
   public static final dte c = djd.aE;
   public static final dti<dtc> d = dta.bc;
   public static final dtb e = dta.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewy i = dfh.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewy j = dfh.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewy k = dfh.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewy l = dfh.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewy m = dfh.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dho.b<dpw, Optional<bpz>> n = new dho.b<dpw, Optional<bpz>>() {
      public Optional<bpz> a(dpw $$0, dpw $$1) {
         return Optional.of(new bpy($$0, $$1));
      }

      public Optional<bpz> a(dpw $$0) {
         return Optional.of($$0);
      }

      public Optional<bpz> a() {
         return Optional.empty();
      }
   };
   private static final dho.b<dpw, Optional<bqk>> o = new dho.b<dpw, Optional<bqk>>() {
      public Optional<bqk> a(final dpw $$0, final dpw $$1) {
         final bpz $$2 = new bpy($$0, $$1);
         return Optional.of(new bqk() {
            @Nullable
            @Override
            public cph createMenu(int $$0x, cmj $$1x, cmk $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cpp.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wu O_() {
               if ($$0.ah()) {
                  return $$0.O_();
               } else {
                  return (wu)($$1.ah() ? $$1.O_() : wu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqk> a(dpw $$0) {
         return Optional.of($$0);
      }

      public Optional<bqk> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgk> a() {
      return b;
   }

   protected dgk(dsj.d $$0, Supplier<dpr<? extends dpw>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, jf.c).a(d, dtc.a).a(e, Boolean.valueOf(false)));
   }

   public static dho.a g(dsk $$0) {
      dtc $$1 = $$0.c(d);
      if ($$1 == dtc.a) {
         return dho.a.a;
      } else {
         return $$1 == dtc.c ? dho.a.b : dho.a.c;
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.b;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dtc $$6 = $$2.c(d);
         if ($$0.c(d) == dtc.a && $$6 != dtc.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dtc.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$0.c(d) == dtc.a) {
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

   public static jf h(dsk $$0) {
      jf $$1 = $$0.c(c);
      return $$0.c(d) == dtc.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsk a(cxm $$0) {
      dtc $$1 = dtc.a;
      jf $$2 = $$0.g().g();
      eoh $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jf $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jf $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dtc.c : dtc.b;
         }
      }

      if ($$1 == dtc.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dtc.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dtc.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eoi.c));
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(e) ? eoi.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jf a(cxm $$0, jf $$1) {
      dsk $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dtc.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         bqk $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clb.a($$3, true);
         }

         return bqg.c;
      }
   }

   protected avo<akk> c() {
      return avr.i.b(avr.ao);
   }

   public dpr<? extends dpw> d() {
      return this.a.get();
   }

   @Nullable
   public static bpz a(dgk $$0, dsk $$1, dcf $$2, ja $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dho.c<? extends dpw> a(dsk $$0, dcf $$1, ja $$2, boolean $$3) {
      BiPredicate<dcg, ja> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgk::a;
      }

      return dho.a(this.a.get(), dgk::g, dgk::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dho.b<dpw, Float2FloatFunction> a(final dqt $$0) {
      return new dho.b<dpw, Float2FloatFunction>() {
         public Float2FloatFunction a(dpw $$0x, dpw $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpw $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpw::a) : null;
   }

   public static boolean a(dcg $$0, ja $$1) {
      return a((dbl)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbl $$0, ja $$1) {
      ja $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dcg $$0, ja $$1) {
      List<ceu> $$2 = $$0.a(
         ceu.class, new ewa((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ceu $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dpp $$4 = $$1.c_($$2);
      if ($$4 instanceof dpw) {
         ((dpw)$$4).l();
      }
   }
}
