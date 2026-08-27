import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dai extends cxz<djs> implements dgf {
   public static final MapCodec<dai> b = b($$0 -> new dai($$0, () -> djn.b));
   public static final dmy c = dda.aE;
   public static final dnc<dmw> d = dmu.bc;
   public static final dmv e = dmu.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final epo i = czf.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final epo j = czf.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final epo k = czf.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final epo l = czf.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final epo m = czf.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dbm.b<djs, Optional<bme>> n = new dbm.b<djs, Optional<bme>>() {
      public Optional<bme> a(djs $$0, djs $$1) {
         return Optional.of(new bmd($$0, $$1));
      }

      public Optional<bme> a(djs $$0) {
         return Optional.of($$0);
      }

      public Optional<bme> a() {
         return Optional.empty();
      }
   };
   private static final dbm.b<djs, Optional<bmp>> o = new dbm.b<djs, Optional<bmp>>() {
      public Optional<bmp> a(final djs $$0, final djs $$1) {
         final bme $$2 = new bmd($$0, $$1);
         return Optional.of(new bmp() {
            @Nullable
            @Override
            public cku createMenu(int $$0x, chz $$1x, cia $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return clb.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vs Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vs)($$1.ae() ? $$1.Q_() : vs.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bmp> a(djs $$0) {
         return Optional.of($$0);
      }

      public Optional<bmp> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dai> a() {
      return b;
   }

   protected dai(dmd.d $$0, Supplier<djn<? extends djs>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ih.c).a(d, dmw.a).a(e, Boolean.valueOf(false)));
   }

   public static dbm.a g(dme $$0) {
      dmw $$1 = $$0.c(d);
      if ($$1 == dmw.a) {
         return dbm.a.a;
      } else {
         return $$1 == dmw.c ? dbm.a.b : dbm.a.c;
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.b;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dmw $$6 = $$2.c(d);
         if ($$0.c(d) == dmw.a && $$6 != dmw.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dmw.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$0.c(d) == dmw.a) {
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

   public static ih h(dme $$0) {
      ih $$1 = $$0.c(c);
      return $$0.c(d) == dmw.b ? $$1.h() : $$1.i();
   }

   @Override
   public dme a(crx $$0) {
      dmw $$1 = dmw.a;
      ih $$2 = $$0.g().g();
      ehr $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ih $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ih $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dmw.c : dmw.b;
         }
      }

      if ($$1 == dmw.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dmw.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dmw.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ehs.c));
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(e) ? ehs.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ih a(crx $$0, ih $$1) {
      dme $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dmw.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof djs) {
            ((djs)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         bmp $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cgr.a($$3, true);
         }

         return bml.b;
      }
   }

   protected atw<ajc> c() {
      return atz.i.b(atz.ao);
   }

   public djn<? extends djs> d() {
      return this.a.get();
   }

   @Nullable
   public static bme a(dai $$0, dme $$1, cwe $$2, ib $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dbm.c<? extends djs> a(dme $$0, cwe $$1, ib $$2, boolean $$3) {
      BiPredicate<cwf, ib> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dai::a;
      }

      return dbm.a(this.a.get(), dai::g, dai::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dbm.b<djs, Float2FloatFunction> a(final dko $$0) {
      return new dbm.b<djs, Float2FloatFunction>() {
         public Float2FloatFunction a(djs $$0x, djs $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(djs $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? a($$2, this.d(), djs::a) : null;
   }

   public static boolean a(cwf $$0, ib $$1) {
      return a((cvk)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(cvk $$0, ib $$1) {
      ib $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(cwf $$0, ib $$1) {
      List<cap> $$2 = $$0.a(
         cap.class, new eoq((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cap $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      djl $$4 = $$1.c_($$2);
      if ($$4 instanceof djs) {
         ((djs)$$4).l();
      }
   }
}
