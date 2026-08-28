import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dge extends ddv<dpq> implements dmc {
   public static final MapCodec<dge> b = b($$0 -> new dge($$0, () -> dpl.b));
   public static final dsy c = dix.aE;
   public static final dtc<dsw> d = dsu.bc;
   public static final dsv e = dsu.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewm i = dfb.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewm j = dfb.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewm k = dfb.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewm l = dfb.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewm m = dfb.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhi.b<dpq, Optional<bqp>> n = new dhi.b<dpq, Optional<bqp>>() {
      public Optional<bqp> a(dpq $$0, dpq $$1) {
         return Optional.of(new bqo($$0, $$1));
      }

      public Optional<bqp> a(dpq $$0) {
         return Optional.of($$0);
      }

      public Optional<bqp> a() {
         return Optional.empty();
      }
   };
   private static final dhi.b<dpq, Optional<bra>> o = new dhi.b<dpq, Optional<bra>>() {
      public Optional<bra> a(final dpq $$0, final dpq $$1) {
         final bqp $$2 = new bqo($$0, $$1);
         return Optional.of(new bra() {
            @Nullable
            @Override
            public cpw createMenu(int $$0x, cmy $$1x, cmz $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqd.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xp O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (xp)($$1.ag() ? $$1.O_() : xp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bra> a(dpq $$0) {
         return Optional.of($$0);
      }

      public Optional<bra> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dge> a() {
      return b;
   }

   protected dge(dsd.d $$0, Supplier<dpl<? extends dpq>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dsw.a).a(e, Boolean.valueOf(false)));
   }

   public static dhi.a g(dse $$0) {
      dsw $$1 = $$0.c(d);
      if ($$1 == dsw.a) {
         return dhi.a.a;
      } else {
         return $$1 == dsw.c ? dhi.a.b : dhi.a.c;
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.b;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dsw $$6 = $$2.c(d);
         if ($$0.c(d) == dsw.a && $$6 != dsw.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dsw.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(d) == dsw.a) {
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

   public static je h(dse $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dsw.b ? $$1.h() : $$1.i();
   }

   @Override
   public dse a(cyc $$0) {
      dsw $$1 = dsw.a;
      je $$2 = $$0.g().g();
      enx $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dsw.c : dsw.b;
         }
      }

      if ($$1 == dsw.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dsw.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dsw.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eny.c));
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(e) ? eny.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cyc $$0, je $$1) {
      dse $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dsw.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         bra $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            clq.a($$3, true);
         }

         return bqw.c;
      }
   }

   protected awh<alf> c() {
      return awk.i.b(awk.ao);
   }

   public dpl<? extends dpq> d() {
      return this.a.get();
   }

   @Nullable
   public static bqp a(dge $$0, dse $$1, dca $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhi.c<? extends dpq> a(dse $$0, dca $$1, iz $$2, boolean $$3) {
      BiPredicate<dcb, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dge::a;
      }

      return dhi.a(this.a.get(), dge::g, dge::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhi.b<dpq, Float2FloatFunction> a(final dqm $$0) {
      return new dhi.b<dpq, Float2FloatFunction>() {
         public Float2FloatFunction a(dpq $$0x, dpq $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpq $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpq::a) : null;
   }

   public static boolean a(dcb $$0, iz $$1) {
      return a((dbg)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbg $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dcb $$0, iz $$1) {
      List<cfk> $$2 = $$0.a(
         cfk.class, new evo((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfk $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dpj $$4 = $$1.c_($$2);
      if ($$4 instanceof dpq) {
         ((dpq)$$4).l();
      }
   }
}
