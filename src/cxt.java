import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cxt extends cvk<dhc> implements ddq {
   public static final MapCodec<cxt> b = b($$0 -> new cxt($$0, () -> dgx.b));
   public static final dkb c = dal.aE;
   public static final dkf<djz> d = djx.bc;
   public static final djy e = djx.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final emm i = cwq.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final emm j = cwq.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final emm k = cwq.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final emm l = cwq.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final emm m = cwq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final cyx.b<dhc, Optional<bju>> n = new cyx.b<dhc, Optional<bju>>() {
      public Optional<bju> a(dhc $$0, dhc $$1) {
         return Optional.of(new bjt($$0, $$1));
      }

      public Optional<bju> a(dhc $$0) {
         return Optional.of($$0);
      }

      public Optional<bju> a() {
         return Optional.empty();
      }
   };
   private static final cyx.b<dhc, Optional<bke>> o = new cyx.b<dhc, Optional<bke>>() {
      public Optional<bke> a(final dhc $$0, final dhc $$1) {
         final bju $$2 = new bjt($$0, $$1);
         return Optional.of(new bke() {
            @Nullable
            @Override
            public cib createMenu(int $$0x, cfh $$1x, cfi $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.e_($$1.m);
                  $$1.e_($$1.m);
                  return cii.b($$0, $$1, $$2);
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

      public Optional<bke> a(dhc $$0) {
         return Optional.of($$0);
      }

      public Optional<bke> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends cxt> a() {
      return b;
   }

   protected cxt(djg.d $$0, Supplier<dgx<? extends dhc>> $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(c, ic.c).a(d, djz.a).a(e, Boolean.valueOf(false)));
   }

   public static cyx.a g(djh $$0) {
      djz $$1 = $$0.c(d);
      if ($$1 == djz.a) {
         return cyx.a.a;
      } else {
         return $$1 == djz.c ? cyx.a.b : cyx.a.c;
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.b;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      if ($$2.a(this) && $$1.o().d()) {
         djz $$6 = $$2.c(d);
         if ($$0.c(d) == djz.a && $$6 != djz.a && $$0.c(c) == $$2.c(c) && h($$2) == $$1.g()) {
            return $$0.a(d, $$6.a());
         }
      } else if (h($$0) == $$1) {
         return $$0.a(d, djz.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      if ($$0.c(d) == djz.a) {
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

   public static ic h(djh $$0) {
      ic $$1 = $$0.c(c);
      return $$0.c(d) == djz.b ? $$1.h() : $$1.i();
   }

   @Override
   public djh a(cph $$0) {
      djz $$1 = djz.a;
      ic $$2 = $$0.g().g();
      eer $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ic $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ic $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? djz.c : djz.b;
         }
      }

      if ($$1 == djz.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = djz.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = djz.c;
         }
      }

      return this.o().a(c, $$2).a(d, $$1).a(e, Boolean.valueOf($$3.a() == ees.c));
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(e) ? ees.c.a(false) : super.c_($$0);
   }

   @Nullable
   private ic a(cph $$0, ic $$1) {
      djh $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == djz.a ? $$2.c(c) : null;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dhc) {
            ((dhc)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         bke $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cdz.a($$3, true);
         }

         return bkb.b;
      }
   }

   protected arz<ahg> c() {
      return asc.i.b(asc.ao);
   }

   public dgx<? extends dhc> d() {
      return this.a.get();
   }

   @Nullable
   public static bju a(cxt $$0, djh $$1, ctp $$2, hx $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public cyx.c<? extends dhc> a(djh $$0, ctp $$1, hx $$2, boolean $$3) {
      BiPredicate<ctq, hx> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = cxt::a;
      }

      return cyx.a(this.a.get(), cxt::g, cxt::h, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static cyx.b<dhc, Float2FloatFunction> a(final dhy $$0) {
      return new cyx.b<dhc, Float2FloatFunction>() {
         public Float2FloatFunction a(dhc $$0x, dhc $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dhc $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? a($$2, this.d(), dhc::a) : null;
   }

   public static boolean a(ctq $$0, hx $$1) {
      return a((csv)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(csv $$0, hx $$1) {
      hx $$2 = $$1.c();
      return $$0.a_($$2).g($$0, $$2);
   }

   private static boolean b(ctq $$0, hx $$1) {
      List<byb> $$2 = $$0.a(
         byb.class, new elo((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (byb $$3 : $$2) {
            if ($$3.A()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      dgv $$4 = $$1.c_($$2);
      if ($$4 instanceof dhc) {
         ((dhc)$$4).m();
      }
   }
}
