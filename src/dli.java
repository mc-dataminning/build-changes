import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dli extends diy<duw> implements dri {
   public static final MapCodec<dli> b = b($$0 -> new dli(() -> dur.b, $$0));
   public static final dyk<jm> c = doc.aF;
   public static final dyk<dyf> d = dyd.bd;
   public static final dye e = dyd.D;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fcm i = dke.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fcm j = dke.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fcm k = dke.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fcm l = dke.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fcm m = dke.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dmn.b<duw, Optional<bsx>> n = new dmn.b<duw, Optional<bsx>>() {
      public Optional<bsx> a(duw $$0, duw $$1) {
         return Optional.of(new bsw($$0, $$1));
      }

      public Optional<bsx> a(duw $$0) {
         return Optional.of($$0);
      }

      public Optional<bsx> a() {
         return Optional.empty();
      }
   };
   private static final dmn.b<duw, Optional<btg>> o = new dmn.b<duw, Optional<btg>>() {
      public Optional<btg> a(final duw $$0, final duw $$1) {
         final bsx $$2 = new bsw($$0, $$1);
         return Optional.of(new btg() {
            @Nullable
            @Override
            public csx createMenu(int $$0x, cpr $$1x, cps $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctg.b($$0, $$1, $$2);
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

      public Optional<btg> a(duw $$0) {
         return Optional.of($$0);
      }

      public Optional<btg> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dli> a() {
      return b;
   }

   protected dli(Supplier<dur<? extends duw>> $$0, dxm.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dyf.a).b(e, Boolean.valueOf(false)));
   }

   public static dmn.a h(dxn $$0) {
      dyf $$1 = $$0.c(d);
      if ($$1 == dyf.a) {
         return dmn.a.a;
      } else {
         return $$1 == dyf.c ? dmn.a.b : dmn.a.c;
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.b;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dyf $$8 = $$6.c(d);
         if ($$0.c(d) == dyf.a && $$8 != dyf.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dyf.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$0.c(d) == dyf.a) {
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

   public static jm i(dxn $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dyf.b ? $$1.h() : $$1.i();
   }

   @Override
   public dxn a(dbb $$0) {
      dyf $$1 = dyf.a;
      jm $$2 = $$0.g().g();
      etp $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dyf.c : dyf.b;
         }
      }

      if ($$1 == dyf.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dyf.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dyf.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == etq.c));
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(e) ? etq.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(dbb $$0, jm $$1) {
      dxn $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dyf.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1 instanceof ash $$5) {
         btg $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            coh.a($$5, $$3, true);
         }
      }

      return bte.a;
   }

   protected axm<alz> c() {
      return axp.i.b(axp.ao);
   }

   public dur<? extends duw> d() {
      return this.a.get();
   }

   @Nullable
   public static bsx a(dli $$0, dxn $$1, dha $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dmn.c<? extends duw> a(dxn $$0, dha $$1, jh $$2, boolean $$3) {
      BiPredicate<dhb, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dli::a;
      }

      return dmn.a(this.a.get(), dli::h, dli::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dmn.b<duw, Float2FloatFunction> a(final dvv $$0) {
      return new dmn.b<duw, Float2FloatFunction>() {
         public Float2FloatFunction a(duw $$0x, duw $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(duw $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new duw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? a($$2, this.d(), duw::a) : null;
   }

   public static boolean a(dhb $$0, jh $$1) {
      return a((dgf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dgf $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dhb $$0, jh $$1) {
      List<chv> $$2 = $$0.a(
         chv.class, new fbn((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chv $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      dup $$4 = $$1.c_($$2);
      if ($$4 instanceof duw) {
         ((duw)$$4).k();
      }
   }
}
