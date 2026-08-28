import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dgb extends dds<dpn> implements dlz {
   public static final MapCodec<dgb> b = b($$0 -> new dgb($$0, () -> dpi.b));
   public static final dsv c = diu.aE;
   public static final dsz<dst> d = dsr.bc;
   public static final dss e = dsr.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final ewj i = dey.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final ewj j = dey.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final ewj k = dey.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final ewj l = dey.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final ewj m = dey.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dhf.b<dpn, Optional<bqm>> n = new dhf.b<dpn, Optional<bqm>>() {
      public Optional<bqm> a(dpn $$0, dpn $$1) {
         return Optional.of(new bql($$0, $$1));
      }

      public Optional<bqm> a(dpn $$0) {
         return Optional.of($$0);
      }

      public Optional<bqm> a() {
         return Optional.empty();
      }
   };
   private static final dhf.b<dpn, Optional<bqx>> o = new dhf.b<dpn, Optional<bqx>>() {
      public Optional<bqx> a(final dpn $$0, final dpn $$1) {
         final bqm $$2 = new bql($$0, $$1);
         return Optional.of(new bqx() {
            @Nullable
            @Override
            public cpt createMenu(int $$0x, cmv $$1x, cmw $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.l);
                  $$1.e_($$1.l);
                  return cqa.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xo O_() {
               if ($$0.ag()) {
                  return $$0.O_();
               } else {
                  return (xo)($$1.ag() ? $$1.O_() : xo.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bqx> a(dpn $$0) {
         return Optional.of($$0);
      }

      public Optional<bqx> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dgb> a() {
      return b;
   }

   protected dgb(dsa.d $$0, Supplier<dpi<? extends dpn>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, je.c).a(d, dst.a).a(e, Boolean.valueOf(false)));
   }

   public static dhf.a g(dsb $$0) {
      dst $$1 = $$0.c(d);
      if ($$1 == dst.a) {
         return dhf.a.a;
      } else {
         return $$1 == dst.c ? dhf.a.b : dhf.a.c;
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.b;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         dst $$6 = $$2.c(d);
         if ($$0.c(d) == dst.a && $$6 != dst.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, dst.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(d) == dst.a) {
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

   public static je h(dsb $$0) {
      je $$1 = $$0.c(c);
      return $$0.c(d) == dst.b ? $$1.h() : $$1.i();
   }

   @Override
   public dsb a(cxz $$0) {
      dst $$1 = dst.a;
      je $$2 = $$0.g().g();
      enu $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      je $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         je $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dst.c : dst.b;
         }
      }

      if ($$1 == dst.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dst.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dst.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == env.c));
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(e) ? env.c.a(false) : super.b_($$0);
   }

   @Nullable
   private je a(cxz $$0, je $$1) {
      dsb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dst.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         bqx $$5 = this.b($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$5);
            $$3.b(this.c());
            cln.a($$3, true);
         }

         return bqt.c;
      }
   }

   protected awg<ale> c() {
      return awj.i.b(awj.ao);
   }

   public dpi<? extends dpn> d() {
      return this.a.get();
   }

   @Nullable
   public static bqm a(dgb $$0, dsb $$1, dbx $$2, iz $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dhf.c<? extends dpn> a(dsb $$0, dbx $$1, iz $$2, boolean $$3) {
      BiPredicate<dby, iz> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dgb::a;
      }

      return dhf.a(this.a.get(), dgb::g, dgb::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dhf.b<dpn, Float2FloatFunction> a(final dqj $$0) {
      return new dhf.b<dpn, Float2FloatFunction>() {
         public Float2FloatFunction a(dpn $$0x, dpn $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dpn $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? a($$2, this.d(), dpn::a) : null;
   }

   public static boolean a(dby $$0, iz $$1) {
      return a((dbd)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dbd $$0, iz $$1) {
      iz $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(dby $$0, iz $$1) {
      List<cfh> $$2 = $$0.a(
         cfh.class, new evl((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cfh $$3 : $$2) {
            if ($$3.y()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      dpg $$4 = $$1.c_($$2);
      if ($$4 instanceof dpn) {
         ((dpn)$$4).l();
      }
   }
}
