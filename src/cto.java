import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cto extends crg<dct> implements czn {
   public static final dfu b = cwf.aC;
   public static final dfy<dfs> c = dfq.bc;
   public static final dfr d = dfq.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final ehx h = csm.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ehx i = csm.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ehx j = csm.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ehx k = csm.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ehx l = csm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cup.b<dct, Optional<bgj>> m = new cup.b<dct, Optional<bgj>>() {
      public Optional<bgj> a(dct $$0, dct $$1) {
         return Optional.of(new bgi($$0, $$1));
      }

      public Optional<bgj> a(dct $$0) {
         return Optional.of($$0);
      }

      public Optional<bgj> a() {
         return Optional.empty();
      }
   };
   private static final cup.b<dct, Optional<bgt>> n = new cup.b<dct, Optional<bgt>>() {
      public Optional<bgt> a(final dct $$0, final dct $$1) {
         final bgj $$2 = new bgi($$0, $$1);
         return Optional.of(new bgt() {
            @Nullable
            @Override
            public cee createMenu(int $$0x, cbm $$1x, cbn $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cel.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public tf H_() {
               if ($$0.ac()) {
                  return $$0.H_();
               } else {
                  return (tf)($$1.ac() ? $$1.H_() : tf.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bgt> a(dct $$0) {
         return Optional.of($$0);
      }

      public Optional<bgt> a() {
         return Optional.empty();
      }
   };

   protected cto(dez.d $$0, Supplier<dco<? extends dct>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, ha.c).a(c, dfs.a).a(d, Boolean.valueOf(false)));
   }

   public static cup.a g(dfa $$0) {
      dfs $$1 = $$0.c(c);
      if ($$1 == dfs.a) {
         return cup.a.a;
      } else {
         return $$1 == dfs.c ? cup.a.b : cup.a.c;
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.b;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dfs $$6 = $$2.c(c);
         if ($$0.c(c) == dfs.a && $$6 != dfs.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dfs.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$0.c(c) == dfs.a) {
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

   public static ha h(dfa $$0) {
      ha $$1 = $$0.c(b);
      return $$0.c(c) == dfs.b ? $$1.h() : $$1.i();
   }

   @Override
   public dfa a(clg $$0) {
      dfs $$1 = dfs.a;
      ha $$2 = $$0.g().g();
      ead $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ha $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ha $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dfs.c : dfs.b;
         }
      }

      if ($$1 == dfs.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dfs.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dfs.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == eae.c));
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(d) ? eae.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ha a(clg $$0, ha $$1) {
      dfa $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dfs.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof dct) {
            ((dct)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof bgj) {
            bgm.a($$1, $$2, (bgj)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         bgt $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            cae.a($$3, true);
         }

         return bgq.b;
      }
   }

   protected apd<aer> b() {
      return apg.i.b(apg.ao);
   }

   public dco<? extends dct> c() {
      return this.a.get();
   }

   @Nullable
   public static bgj a(cto $$0, dfa $$1, cpm $$2, gu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cup.c<? extends dct> a(dfa $$0, cpm $$1, gu $$2, boolean $$3) {
      BiPredicate<cpn, gu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cto::a;
      }

      return cup.a(this.a.get(), cto::g, cto::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cup.b<dct, Float2FloatFunction> a(final ddo $$0) {
      return new cup.b<dct, Float2FloatFunction>() {
         public Float2FloatFunction a(dct $$0x, dct $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dct $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dct($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? a($$2, this.c(), dct::a) : null;
   }

   public static boolean a(cpn $$0, gu $$1) {
      return a((cos)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cos $$0, gu $$1) {
      gu $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpn $$0, gu $$1) {
      List<bun> $$2 = $$0.a(
         bun.class, new egz((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bun $$3 : $$2) {
            if ($$3.t()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      dcm $$4 = $$1.c_($$2);
      if ($$4 instanceof dct) {
         ((dct)$$4).i();
      }
   }
}
