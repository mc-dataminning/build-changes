import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctm extends cre<dcr> implements czl {
   public static final dfs b = cwd.aC;
   public static final dfw<dfq> c = dfo.bc;
   public static final dfp d = dfo.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final ehy h = csk.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ehy i = csk.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ehy j = csk.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ehy k = csk.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ehy l = csk.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cun.b<dcr, Optional<bgh>> m = new cun.b<dcr, Optional<bgh>>() {
      public Optional<bgh> a(dcr $$0, dcr $$1) {
         return Optional.of(new bgg($$0, $$1));
      }

      public Optional<bgh> a(dcr $$0) {
         return Optional.of($$0);
      }

      public Optional<bgh> a() {
         return Optional.empty();
      }
   };
   private static final cun.b<dcr, Optional<bgr>> n = new cun.b<dcr, Optional<bgr>>() {
      public Optional<bgr> a(final dcr $$0, final dcr $$1) {
         final bgh $$2 = new bgg($$0, $$1);
         return Optional.of(new bgr() {
            @Nullable
            @Override
            public cec createMenu(int $$0x, cbk $$1x, cbl $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cej.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public te H_() {
               if ($$0.ac()) {
                  return $$0.H_();
               } else {
                  return (te)($$1.ac() ? $$1.H_() : te.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bgr> a(dcr $$0) {
         return Optional.of($$0);
      }

      public Optional<bgr> a() {
         return Optional.empty();
      }
   };

   protected ctm(dex.d $$0, Supplier<dcm<? extends dcr>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, hb.c).a(c, dfq.a).a(d, Boolean.valueOf(false)));
   }

   public static cun.a g(dey $$0) {
      dfq $$1 = $$0.c(c);
      if ($$1 == dfq.a) {
         return cun.a.a;
      } else {
         return $$1 == dfq.c ? cun.a.b : cun.a.c;
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.b;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dfq $$6 = $$2.c(c);
         if ($$0.c(c) == dfq.a && $$6 != dfq.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dfq.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(c) == dfq.a) {
         return l;
      } else {
         switch (h($$0)) {
            case c:
            default:
               return h;
            case d:
               return i;
            case e:
               return j;
            case f:
               return k;
         }
      }
   }

   public static hb h(dey $$0) {
      hb $$1 = $$0.c(b);
      return $$0.c(c) == dfq.b ? $$1.h() : $$1.i();
   }

   @Override
   public dey a(cle $$0) {
      dfq $$1 = dfq.a;
      hb $$2 = $$0.g().g();
      eab $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      hb $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         hb $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dfq.c : dfq.b;
         }
      }

      if ($$1 == dfq.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dfq.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dfq.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == eac.c));
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(d) ? eac.c.a(false) : super.c_($$0);
   }

   @Nullable
   private hb a(cle $$0, hb $$1) {
      dey $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dfq.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dcr) {
            ((dcr)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof bgh) {
            bgk.a($$1, $$2, (bgh)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         bgr $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            cac.a($$3, true);
         }

         return bgo.b;
      }
   }

   protected apb<aep> b() {
      return ape.i.b(ape.ao);
   }

   public dcm<? extends dcr> c() {
      return this.a.get();
   }

   @Nullable
   public static bgh a(ctm $$0, dey $$1, cpk $$2, gv $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cun.c<? extends dcr> a(dey $$0, cpk $$1, gv $$2, boolean $$3) {
      BiPredicate<cpl, gv> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ctm::a;
      }

      return cun.a(this.a.get(), ctm::g, ctm::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cun.b<dcr, Float2FloatFunction> a(final ddm $$0) {
      return new cun.b<dcr, Float2FloatFunction>() {
         public Float2FloatFunction a(dcr $$0x, dcr $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dcr $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? a($$2, this.c(), dcr::a) : null;
   }

   public static boolean a(cpl $$0, gv $$1) {
      return a((coq)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(coq $$0, gv $$1) {
      gv $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpl $$0, gv $$1) {
      List<bul> $$2 = $$0.a(
         bul.class, new eha((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bul $$3 : $$2) {
            if ($$3.t()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      dck $$4 = $$1.c_($$2);
      if ($$4 instanceof dcr) {
         ((dcr)$$4).i();
      }
   }
}
