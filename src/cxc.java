import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxc extends cut<dgk> implements dcz {
   public static final MapCodec<cxc> b = b($$0 -> new cxc($$0, () -> dgf.b));
   public static final djj c = czu.aE;
   public static final djn<djh> d = djf.bc;
   public static final djg e = djf.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final elu i = cvz.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final elu j = cvz.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final elu k = cvz.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final elu l = cvz.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final elu m = cvz.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cyg.b<dgk, Optional<bje>> n = new cyg.b<dgk, Optional<bje>>() {
      public Optional<bje> a(dgk $$0, dgk $$1) {
         return Optional.of(new bjd($$0, $$1));
      }

      public Optional<bje> a(dgk $$0) {
         return Optional.of($$0);
      }

      public Optional<bje> a() {
         return Optional.empty();
      }
   };
   private static final cyg.b<dgk, Optional<bjo>> o = new cyg.b<dgk, Optional<bjo>>() {
      public Optional<bjo> a(final dgk $$0, final dgk $$1) {
         final bje $$2 = new bjd($$0, $$1);
         return Optional.of(new bjo() {
            @Nullable
            @Override
            public chk createMenu(int $$0x, ceq $$1x, cer $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return chr.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vb Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vb)($$1.ae() ? $$1.Q_() : vb.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bjo> a(dgk $$0) {
         return Optional.of($$0);
      }

      public Optional<bjo> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cxc> a() {
      return b;
   }

   protected cxc(dio.d $$0, Supplier<dgf<? extends dgk>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ia.c).a(d, djh.a).a(e, Boolean.valueOf(false)));
   }

   public static cyg.a g(dip $$0) {
      djh $$1 = $$0.c(d);
      if ($$1 == djh.a) {
         return cyg.a.a;
      } else {
         return $$1 == djh.c ? cyg.a.b : cyg.a.c;
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.b;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         djh $$6 = $$2.c(d);
         if ($$0.c(d) == djh.a && $$6 != djh.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, djh.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(d) == djh.a) {
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

   public static ia h(dip $$0) {
      ia $$1 = $$0.c(c);
      return $$0.c(d) == djh.b ? $$1.h() : $$1.i();
   }

   @Override
   public dip a(coq $$0) {
      djh $$1 = djh.a;
      ia $$2 = $$0.g().g();
      edz $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ia $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ia $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? djh.c : djh.b;
         }
      }

      if ($$1 == djh.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = djh.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = djh.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eea.c));
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(e) ? eea.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ia a(coq $$0, ia $$1) {
      dip $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == djh.a ? $$2.c(c) : null;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      if ($$4.A()) {
         dgd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgk) {
            ((dgk)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         bjo $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cdi.a($$3, true);
         }

         return bjl.b;
      }
   }

   protected arj<agt> c() {
      return arm.i.b(arm.ao);
   }

   public dgf<? extends dgk> d() {
      return this.a.get();
   }

   @Nullable
   public static bje a(cxc $$0, dip $$1, csy $$2, hv $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cyg.c<? extends dgk> a(dip $$0, csy $$1, hv $$2, boolean $$3) {
      BiPredicate<csz, hv> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cxc::a;
      }

      return cyg.a(this.a.get(), cxc::g, cxc::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cyg.b<dgk, Float2FloatFunction> a(final dhg $$0) {
      return new cyg.b<dgk, Float2FloatFunction>() {
         public Float2FloatFunction a(dgk $$0x, dgk $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dgk $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? a($$2, this.d(), dgk::a) : null;
   }

   public static boolean a(csz $$0, hv $$1) {
      return a((cse)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cse $$0, hv $$1) {
      hv $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(csz $$0, hv $$1) {
      List<bxl> $$2 = $$0.a(
         bxl.class, new ekw((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bxl $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      dgd $$4 = $$1.c_($$2);
      if ($$4 instanceof dgk) {
         ((dgk)$$4).m();
      }
   }
}
