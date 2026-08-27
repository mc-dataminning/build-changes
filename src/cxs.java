import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxs extends cvj<dhb> implements ddp {
   public static final MapCodec<cxs> b = b($$0 -> new cxs($$0, () -> dgw.b));
   public static final dka c = dak.aE;
   public static final dke<djy> d = djw.bc;
   public static final djx e = djw.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final eml i = cwp.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final eml j = cwp.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final eml k = cwp.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final eml l = cwp.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final eml m = cwp.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cyw.b<dhb, Optional<bjt>> n = new cyw.b<dhb, Optional<bjt>>() {
      public Optional<bjt> a(dhb $$0, dhb $$1) {
         return Optional.of(new bjs($$0, $$1));
      }

      public Optional<bjt> a(dhb $$0) {
         return Optional.of($$0);
      }

      public Optional<bjt> a() {
         return Optional.empty();
      }
   };
   private static final cyw.b<dhb, Optional<bkd>> o = new cyw.b<dhb, Optional<bkd>>() {
      public Optional<bkd> a(final dhb $$0, final dhb $$1) {
         final bjt $$2 = new bjs($$0, $$1);
         return Optional.of(new bkd() {
            @Nullable
            @Override
            public cia createMenu(int $$0x, cfg $$1x, cfh $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cih.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public vf Q_() {
               if ($$0.ae()) {
                  return $$0.Q_();
               } else {
                  return (vf)($$1.ae() ? $$1.Q_() : vf.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bkd> a(dhb $$0) {
         return Optional.of($$0);
      }

      public Optional<bkd> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cxs> a() {
      return b;
   }

   protected cxs(djf.d $$0, Supplier<dgw<? extends dhb>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ic.c).a(d, djy.a).a(e, Boolean.valueOf(false)));
   }

   public static cyw.a g(djg $$0) {
      djy $$1 = $$0.c(d);
      if ($$1 == djy.a) {
         return cyw.a.a;
      } else {
         return $$1 == djy.c ? cyw.a.b : cyw.a.c;
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.b;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         djy $$6 = $$2.c(d);
         if ($$0.c(d) == djy.a && $$6 != djy.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, djy.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      if ($$0.c(d) == djy.a) {
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

   public static ic h(djg $$0) {
      ic $$1 = $$0.c(c);
      return $$0.c(d) == djy.b ? $$1.h() : $$1.i();
   }

   @Override
   public djg a(cpg $$0) {
      djy $$1 = djy.a;
      ic $$2 = $$0.g().g();
      eeq $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ic $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ic $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? djy.c : djy.b;
         }
      }

      if ($$1 == djy.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = djy.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = djy.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == eer.c));
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(e) ? eer.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ic a(cpg $$0, ic $$1) {
      djg $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == djy.a ? $$2.c(c) : null;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dhb) {
            ((dhb)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         bkd $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cdy.a($$3, true);
         }

         return bka.b;
      }
   }

   protected ary<ahg> c() {
      return asb.i.b(asb.ao);
   }

   public dgw<? extends dhb> d() {
      return this.a.get();
   }

   @Nullable
   public static bjt a(cxs $$0, djg $$1, cto $$2, hx $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cyw.c<? extends dhb> a(djg $$0, cto $$1, hx $$2, boolean $$3) {
      BiPredicate<ctp, hx> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cxs::a;
      }

      return cyw.a(this.a.get(), cxs::g, cxs::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cyw.b<dhb, Float2FloatFunction> a(final dhx $$0) {
      return new cyw.b<dhb, Float2FloatFunction>() {
         public Float2FloatFunction a(dhb $$0x, dhb $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dhb $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? a($$2, this.d(), dhb::a) : null;
   }

   public static boolean a(ctp $$0, hx $$1) {
      return a((csu)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(csu $$0, hx $$1) {
      hx $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(ctp $$0, hx $$1) {
      List<bya> $$2 = $$0.a(
         bya.class, new eln((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (bya $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      dgu $$4 = $$1.c_($$2);
      if ($$4 instanceof dhb) {
         ((dhb)$$4).m();
      }
   }
}
