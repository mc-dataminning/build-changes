import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbf extends cyw<dkp> implements dhc {
   public static final MapCodec<dbf> b = b($$0 -> new dbf($$0, () -> dkk.b));
   public static final dnv c = ddx.aE;
   public static final dnz<dnt> d = dnr.bc;
   public static final dns e = dnr.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eqm i = dac.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eqm j = dac.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eqm k = dac.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eqm l = dac.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eqm m = dac.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dcj.b<dkp, Optional<bmw>> n = new dcj.b<dkp, Optional<bmw>>() {
      public Optional<bmw> a(dkp $$0, dkp $$1) {
         return Optional.of(new bmv($$0, $$1));
      }

      public Optional<bmw> a(dkp $$0) {
         return Optional.of($$0);
      }

      public Optional<bmw> a() {
         return Optional.empty();
      }
   };
   private static final dcj.b<dkp, Optional<bnh>> o = new dcj.b<dkp, Optional<bnh>>() {
      public Optional<bnh> a(final dkp $$0, final dkp $$1) {
         final bmw $$2 = new bmv($$0, $$1);
         return Optional.of(new bnh() {
            @Nullable
            @Override
            public clq createMenu(int $$0x, cit $$1x, ciu $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return clx.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vu O_() {
               if ($$0.ae()) {
                  return $$0.O_();
               } else {
                  return (vu)($$1.ae() ? $$1.O_() : vu.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bnh> a(dkp $$0) {
         return Optional.of($$0);
      }

      public Optional<bnh> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dbf> a() {
      return b;
   }

   protected dbf(dna.d $$0, Supplier<dkk<? extends dkp>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ih.c).a(d, dnt.a).a(e, Boolean.valueOf(false)));
   }

   public static dcj.a g(dnb $$0) {
      dnt $$1 = $$0.c(d);
      if ($$1 == dnt.a) {
         return dcj.a.a;
      } else {
         return $$1 == dnt.c ? dcj.a.b : dcj.a.c;
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.b;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dnt $$6 = $$2.c(d);
         if ($$0.c(d) == dnt.a && $$6 != dnt.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dnt.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$0.c(d) == dnt.a) {
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

   public static ih h(dnb $$0) {
      ih $$1 = $$0.c(c);
      return $$0.c(d) == dnt.b ? $$1.h() : $$1.i();
   }

   @Override
   public dnb a(csu $$0) {
      dnt $$1 = dnt.a;
      ih $$2 = $$0.g().g();
      eip $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ih $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ih $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dnt.c : dnt.b;
         }
      }

      if ($$1 == dnt.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dnt.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dnt.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eiq.c));
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(e) ? eiq.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ih a(csu $$0, ih $$1) {
      dnb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dnt.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dkp) {
            ((dkp)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         bnh $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            chl.a($$3, true);
         }

         return bnd.b;
      }
   }

   protected auf<ajh> c() {
      return aui.i.b(aui.ao);
   }

   public dkk<? extends dkp> d() {
      return this.a.get();
   }

   @Nullable
   public static bmw a(dbf $$0, dnb $$1, cxb $$2, ib $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dcj.c<? extends dkp> a(dnb $$0, cxb $$1, ib $$2, boolean $$3) {
      BiPredicate<cxc, ib> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dbf::a;
      }

      return dcj.a(this.a.get(), dbf::g, dbf::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dcj.b<dkp, Float2FloatFunction> a(final dll $$0) {
      return new dcj.b<dkp, Float2FloatFunction>() {
         public Float2FloatFunction a(dkp $$0x, dkp $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dkp $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? a($$2, this.d(), dkp::a) : null;
   }

   public static boolean a(cxc $$0, ib $$1) {
      return a((cwh)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cwh $$0, ib $$1) {
      ib $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cxc $$0, ib $$1) {
      List<cbh> $$2 = $$0.a(
         cbh.class, new epo((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cbh $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dki $$4 = $$1.c_($$2);
      if ($$4 instanceof dkp) {
         ((dkp)$$4).l();
      }
   }
}
