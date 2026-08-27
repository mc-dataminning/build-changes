import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctn extends crf<dcs> implements czm {
   public static final dft b = cwe.aC;
   public static final dfx<dfr> c = dfp.bc;
   public static final dfq d = dfp.C;
   public static final int e = 1;
   protected static final int f = 1;
   protected static final int g = 14;
   protected static final ehw h = csl.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ehw i = csl.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ehw j = csl.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ehw k = csl.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ehw l = csl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cuo.b<dcs, Optional<bgj>> m = new cuo.b<dcs, Optional<bgj>>() {
      public Optional<bgj> a(dcs $$0, dcs $$1) {
         return Optional.of(new bgi($$0, $$1));
      }

      public Optional<bgj> a(dcs $$0) {
         return Optional.of($$0);
      }

      public Optional<bgj> a() {
         return Optional.empty();
      }
   };
   private static final cuo.b<dcs, Optional<bgt>> n = new cuo.b<dcs, Optional<bgt>>() {
      public Optional<bgt> a(final dcs $$0, final dcs $$1) {
         final bgj $$2 = new bgi($$0, $$1);
         return Optional.of(new bgt() {
            @Nullable
            @Override
            public ced createMenu(int $$0x, cbl $$1x, cbm $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e($$1.m);
                  $$1.e($$1.m);
                  return cek.b($$0, $$1, $$2);
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

      public Optional<bgt> a(dcs $$0) {
         return Optional.of($$0);
      }

      public Optional<bgt> a() {
         return Optional.empty();
      }
   };

   protected ctn(dey.d $$0, Supplier<dcn<? extends dcs>> $$1) {
      super($$0, $$1);
      this.k(this.C.b().a(b, ha.c).a(c, dfr.a).a(d, Boolean.valueOf(false)));
   }

   public static cuo.a g(dez $$0) {
      dfr $$1 = $$0.c(c);
      if ($$1 == dfr.a) {
         return cuo.a.a;
      } else {
         return $$1 == dfr.c ? cuo.a.b : cuo.a.c;
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.b;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dfr $$6 = $$2.c(c);
         if ($$0.c(c) == dfr.a && $$6 != dfr.a && $$0.c(b) == $$2.c(b) && h($$2) == $$1.g()) {
            return $$0.a(c, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(c, dfr.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(c) == dfr.a) {
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

   public static ha h(dez $$0) {
      ha $$1 = $$0.c(b);
      return $$0.c(c) == dfr.b ? $$1.h() : $$1.i();
   }

   @Override
   public dez a(clf $$0) {
      dfr $$1 = dfr.a;
      ha $$2 = $$0.g().g();
      eac $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ha $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ha $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dfr.c : dfr.b;
         }
      }

      if ($$1 == dfr.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dfr.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dfr.c;
         }
      }

      return this.n().a(b, $$2).a(c, $$1).a(d, Boolean.valueOf($$3.a() == ead.c));
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(d) ? ead.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ha a(clf $$0, ha $$1) {
      dez $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(c) == dfr.a ? $$2.c(b) : null;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dcs) {
            ((dcs)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof bgj) {
            bgm.a($$1, $$2, (bgj)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         bgt $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.b());
            cad.a($$3, true);
         }

         return bgq.b;
      }
   }

   protected apd<aer> b() {
      return apg.i.b(apg.ao);
   }

   public dcn<? extends dcs> c() {
      return this.a.get();
   }

   @Nullable
   public static bgj a(ctn $$0, dez $$1, cpl $$2, gu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(m).orElse(null);
   }

   @Override
   public cuo.c<? extends dcs> a(dez $$0, cpl $$1, gu $$2, boolean $$3) {
      BiPredicate<cpm, gu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ctn::a;
      }

      return cuo.a(this.a.get(), ctn::g, ctn::h, b, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      return this.a($$0, $$1, $$2, false).apply(n).orElse(null);
   }

   public static cuo.b<dcs, Float2FloatFunction> a(final ddn $$0) {
      return new cuo.b<dcs, Float2FloatFunction>() {
         public Float2FloatFunction a(dcs $$0x, dcs $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dcs $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? a($$2, this.c(), dcs::a) : null;
   }

   public static boolean a(cpm $$0, gu $$1) {
      return a((cor)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cor $$0, gu $$1) {
      gu $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cpm $$0, gu $$1) {
      List<bum> $$2 = $$0.a(
         bum.class, new egy((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bum $$3 : $$2) {
            if ($$3.t()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      dcl $$4 = $$1.c_($$2);
      if ($$4 instanceof dcs) {
         ((dcs)$$4).i();
      }
   }
}
