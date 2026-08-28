import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dlq extends djg<dve> implements drq {
   public static final MapCodec<dlq> b = b($$0 -> new dlq(() -> duz.b, $$0));
   public static final dys<jm> c = dok.aF;
   public static final dys<dyn> d = dyl.bd;
   public static final dym e = dyl.D;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fcs i = dkm.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fcs j = dkm.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fcs k = dkm.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fcs l = dkm.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fcs m = dkm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dmv.b<dve, Optional<btc>> n = new dmv.b<dve, Optional<btc>>() {
      public Optional<btc> a(dve $$0, dve $$1) {
         return Optional.of(new btb($$0, $$1));
      }

      public Optional<btc> a(dve $$0) {
         return Optional.of($$0);
      }

      public Optional<btc> a() {
         return Optional.empty();
      }
   };
   private static final dmv.b<dve, Optional<btl>> o = new dmv.b<dve, Optional<btl>>() {
      public Optional<btl> a(final dve $$0, final dve $$1) {
         final btc $$2 = new btb($$0, $$1);
         return Optional.of(new btl() {
            @Nullable
            @Override
            public ctc createMenu(int $$0x, cpw $$1x, cpx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctl.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xv p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (xv)($$1.l_() ? $$1.p_() : xv.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<btl> a(dve $$0) {
         return Optional.of($$0);
      }

      public Optional<btl> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dlq> a() {
      return b;
   }

   protected dlq(Supplier<duz<? extends dve>> $$0, dxu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dyn.a).b(e, Boolean.valueOf(false)));
   }

   public static dmv.a h(dxv $$0) {
      dyn $$1 = $$0.c(d);
      if ($$1 == dyn.a) {
         return dmv.a.a;
      } else {
         return $$1 == dyn.c ? dmv.a.b : dmv.a.c;
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.b;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dyn $$8 = $$6.c(d);
         if ($$0.c(d) == dyn.a && $$8 != dyn.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dyn.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(d) == dyn.a) {
         return m;
      } else {
         switch (i($$0)) {
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

   public static jm i(dxv $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dyn.b ? $$1.h() : $$1.i();
   }

   @Override
   public dxv a(dbg $$0) {
      dyn $$1 = dyn.a;
      jm $$2 = $$0.g().g();
      etx $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dyn.c : dyn.b;
         }
      }

      if ($$1 == dyn.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dyn.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dyn.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == ety.c));
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(e) ? ety.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(dbg $$0, jm $$1) {
      dxv $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dyn.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1 instanceof ash $$5) {
         btl $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            com.a($$5, $$3, true);
         }
      }

      return btj.a;
   }

   protected axm<alz> c() {
      return axp.i.b(axp.ao);
   }

   public duz<? extends dve> d() {
      return this.a.get();
   }

   @Nullable
   public static btc a(dlq $$0, dxv $$1, dhi $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dmv.c<? extends dve> a(dxv $$0, dhi $$1, jh $$2, boolean $$3) {
      BiPredicate<dhj, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dlq::a;
      }

      return dmv.a(this.a.get(), dlq::h, dlq::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dmv.b<dve, Float2FloatFunction> a(final dwd $$0) {
      return new dmv.b<dve, Float2FloatFunction>() {
         public Float2FloatFunction a(dve $$0x, dve $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dve $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dve($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? a($$2, this.d(), dve::a) : null;
   }

   public static boolean a(dhj $$0, jh $$1) {
      return a((dgn)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dgn $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dhj $$0, jh $$1) {
      List<cia> $$2 = $$0.a(
         cia.class, new fbt((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cia $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      dux $$4 = $$1.c_($$2);
      if ($$4 instanceof dve) {
         ((dve)$$4).k();
      }
   }
}
