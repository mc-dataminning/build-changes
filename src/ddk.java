import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ddk extends dbb<dmv> implements djh {
   public static final MapCodec<ddk> b = b($$0 -> new ddk($$0, () -> dmq.b));
   public static final dqc c = dgc.aE;
   public static final dqg<dqa> d = dpy.bc;
   public static final dpz e = dpy.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final etc i = dch.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final etc j = dch.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final etc k = dch.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final etc l = dch.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final etc m = dch.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final deo.b<dmv, Optional<bny>> n = new deo.b<dmv, Optional<bny>>() {
      public Optional<bny> a(dmv $$0, dmv $$1) {
         return Optional.of(new bnx($$0, $$1));
      }

      public Optional<bny> a(dmv $$0) {
         return Optional.of($$0);
      }

      public Optional<bny> a() {
         return Optional.empty();
      }
   };
   private static final deo.b<dmv, Optional<boj>> o = new deo.b<dmv, Optional<boj>>() {
      public Optional<boj> a(final dmv $$0, final dmv $$1) {
         final bny $$2 = new bnx($$0, $$1);
         return Optional.of(new boj() {
            @Nullable
            @Override
            public cmw createMenu(int $$0x, cjz $$1x, cka $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cnd.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wi O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (wi)($$1.ae() ? $$1.O_() : wi.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<boj> a(dmv $$0) {
         return Optional.of($$0);
      }

      public Optional<boj> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends ddk> a() {
      return b;
   }

   protected ddk(dph.d $$0, Supplier<dmq<? extends dmv>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ij.c).a(d, dqa.a).a(e, Boolean.valueOf(false)));
   }

   public static deo.a g(dpi $$0) {
      dqa $$1 = $$0.c(d);
      if ($$1 == dqa.a) {
         return deo.a.a;
      } else {
         return $$1 == dqa.c ? deo.a.b : deo.a.c;
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.b;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dqa $$6 = $$2.c(d);
         if ($$0.c(d) == dqa.a && $$6 != dqa.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dqa.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(d) == dqa.a) {
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

   public static ij h(dpi $$0) {
      ij $$1 = $$0.c(c);
      return $$0.c(d) == dqa.b ? $$1.h() : $$1.i();
   }

   @Override
   public dpi a(cux $$0) {
      dqa $$1 = dqa.a;
      ij $$2 = $$0.g().g();
      elb $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ij $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ij $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dqa.c : dqa.b;
         }
      }

      if ($$1 == dqa.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dqa.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dqa.c;
         }
      }

      return this.n().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == elc.c));
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(e) ? elc.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ij a(cux $$0, ij $$1) {
      dpi $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dqa.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         boj $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cir.a($$3, true);
         }

         return bof.b;
      }
   }

   protected auv<ajv> c() {
      return auz.i.b(auz.ao);
   }

   public dmq<? extends dmv> d() {
      return this.a.get();
   }

   @Nullable
   public static bny a(ddk $$0, dpi $$1, czg $$2, id $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public deo.c<? extends dmv> a(dpi $$0, czg $$1, id $$2, boolean $$3) {
      BiPredicate<czh, id> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = ddk::a;
      }

      return deo.a(this.a.get(), ddk::g, ddk::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static deo.b<dmv, Float2FloatFunction> a(final dnr $$0) {
      return new deo.b<dmv, Float2FloatFunction>() {
         public Float2FloatFunction a(dmv $$0x, dmv $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dmv $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? a($$2, this.d(), dmv::a) : null;
   }

   public static boolean a(czh $$0, id $$1) {
      return a((cym)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cym $$0, id $$1) {
      id $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(czh $$0, id $$1) {
      List<ccl> $$2 = $$0.a(
         ccl.class, new ese((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (ccl $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dmo $$4 = $$1.c_($$2);
      if ($$4 instanceof dmv) {
         ((dmv)$$4).l();
      }
   }
}
