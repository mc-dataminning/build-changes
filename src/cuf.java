import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cuf extends crv<ddg> implements dab {
   public static final MapCodec<cuf> b = b($$0 -> new cuf($$0, () -> ddb.b));
   public static final dfx c = cww.aE;
   public static final dgb<dfv> d = dft.bc;
   public static final dfu e = dft.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eia i = ctc.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eia j = ctc.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eia k = ctc.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eia l = ctc.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eia m = ctc.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cvh.b<ddg, Optional<bgx>> n = new cvh.b<ddg, Optional<bgx>>() {
      public Optional<bgx> a(ddg $$0, ddg $$1) {
         return Optional.of(new bgw($$0, $$1));
      }

      public Optional<bgx> a(ddg $$0) {
         return Optional.of($$0);
      }

      public Optional<bgx> a() {
         return Optional.empty();
      }
   };
   private static final cvh.b<ddg, Optional<bhh>> o = new cvh.b<ddg, Optional<bhh>>() {
      public Optional<bhh> a(final ddg $$0, final ddg $$1) {
         final bgx $$2 = new bgw($$0, $$1);
         return Optional.of(new bhh() {
            @Nullable
            @Override
            public cer createMenu(int $$0x, cbz $$1x, cca $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cey.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public tl N_() {
               if ($$0.ac()) {
                  return $$0.N_();
               } else {
                  return (tl)($$1.ac() ? $$1.N_() : tl.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bhh> a(ddg $$0) {
         return Optional.of($$0);
      }

      public Optional<bhh> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cuf> a() {
      return b;
   }

   protected cuf(dfc.d $$0, Supplier<ddb<? extends ddg>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ha.c).a(d, dfv.a).a(e, Boolean.valueOf(false)));
   }

   public static cvh.a g(dfd $$0) {
      dfv $$1 = $$0.c(d);
      if ($$1 == dfv.a) {
         return cvh.a.a;
      } else {
         return $$1 == dfv.c ? cvh.a.b : cvh.a.c;
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.b;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dfv $$6 = $$2.c(d);
         if ($$0.c(d) == dfv.a && $$6 != dfv.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dfv.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      if ($$0.c(d) == dfv.a) {
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

   public static ha h(dfd $$0) {
      ha $$1 = $$0.c(c);
      return $$0.c(d) == dfv.b ? $$1.h() : $$1.i();
   }

   @Override
   public dfd a(clt $$0) {
      dfv $$1 = dfv.a;
      ha $$2 = $$0.g().g();
      eag $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ha $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ha $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dfv.c : dfv.b;
         }
      }

      if ($$1 == dfv.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dfv.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dfv.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eah.c));
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(e) ? eah.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ha a(clt $$0, ha $$1) {
      dfd $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dfv.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof ddg) {
            ((ddg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof bgx) {
            bha.a($$1, $$2, (bgx)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         bhh $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            car.a($$3, true);
         }

         return bhe.b;
      }
   }

   protected apn<aez> c() {
      return apq.i.b(apq.ao);
   }

   public ddb<? extends ddg> d() {
      return this.a.get();
   }

   @Nullable
   public static bgx a(cuf $$0, dfd $$1, cqb $$2, gw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cvh.c<? extends ddg> a(dfd $$0, cqb $$1, gw $$2, boolean $$3) {
      BiPredicate<cqc, gw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cuf::a;
      }

      return cvh.a(this.a.get(), cuf::g, cuf::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cvh.b<ddg, Float2FloatFunction> a(final deb $$0) {
      return new cvh.b<ddg, Float2FloatFunction>() {
         public Float2FloatFunction a(ddg $$0x, ddg $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(ddg $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? a($$2, this.d(), ddg::a) : null;
   }

   public static boolean a(cqc $$0, gw $$1) {
      return a((cph)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cph $$0, gw $$1) {
      gw $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cqc $$0, gw $$1) {
      List<bva> $$2 = $$0.a(
         bva.class, new ehc((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bva $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cer.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      dcz $$4 = $$1.c_($$2);
      if ($$4 instanceof ddg) {
         ((ddg)$$4).i();
      }
   }
}
