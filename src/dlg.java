import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dlg extends dix<dux> implements drj {
   public static final MapCodec<dlg> b = b($$0 -> new dlg(() -> dus.b, $$0));
   public static final dyl<jm> c = dob.aF;
   public static final dyl<dyg> d = dye.bf;
   public static final dyf e = dye.J;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fcl i = dkd.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fcl j = dkd.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fcl k = dkd.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fcl l = dkd.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fcl m = dkd.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dml.b<dux, Optional<bst>> n = new dml.b<dux, Optional<bst>>() {
      public Optional<bst> a(dux $$0, dux $$1) {
         return Optional.of(new bss($$0, $$1));
      }

      public Optional<bst> a(dux $$0) {
         return Optional.of($$0);
      }

      public Optional<bst> a() {
         return Optional.empty();
      }
   };
   private static final dml.b<dux, Optional<btc>> o = new dml.b<dux, Optional<btc>>() {
      public Optional<btc> a(final dux $$0, final dux $$1) {
         final bst $$2 = new bss($$0, $$1);
         return Optional.of(new btc() {
            @Nullable
            @Override
            public cst createMenu(int $$0x, cpn $$1x, cpo $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctc.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xk p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (xk)($$1.l_() ? $$1.p_() : xk.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<btc> a(dux $$0) {
         return Optional.of($$0);
      }

      public Optional<btc> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dlg> a() {
      return b;
   }

   protected dlg(Supplier<dus<? extends dux>> $$0, dxn.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dyg.a).b(e, Boolean.valueOf(false)));
   }

   public static dml.a h(dxo $$0) {
      dyg $$1 = $$0.c(d);
      if ($$1 == dyg.a) {
         return dml.a.a;
      } else {
         return $$1 == dyg.c ? dml.a.b : dml.a.c;
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.b;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dyg $$8 = $$6.c(d);
         if ($$0.c(d) == dyg.a && $$8 != dyg.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dyg.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      if ($$0.c(d) == dyg.a) {
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

   public static jm i(dxo $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dyg.b ? $$1.h() : $$1.i();
   }

   @Override
   public dxo a(dax $$0) {
      dyg $$1 = dyg.a;
      jm $$2 = $$0.g().g();
      etq $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dyg.c : dyg.b;
         }
      }

      if ($$1 == dyg.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dyg.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dyg.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == etr.c));
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(dax $$0, jm $$1) {
      dxo $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dyg.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1 instanceof arx $$5) {
         btc $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cod.a($$5, $$3, true);
         }
      }

      return bta.a;
   }

   protected axc<alp> c() {
      return axf.i.b(axf.ao);
   }

   public dus<? extends dux> d() {
      return this.a.get();
   }

   @Nullable
   public static bst a(dlg $$0, dxo $$1, dgz $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dml.c<? extends dux> a(dxo $$0, dgz $$1, jh $$2, boolean $$3) {
      BiPredicate<dha, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dlg::a;
      }

      return dml.a(this.a.get(), dlg::h, dlg::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dml.b<dux, Float2FloatFunction> a(final dvw $$0) {
      return new dml.b<dux, Float2FloatFunction>() {
         public Float2FloatFunction a(dux $$0x, dux $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dux $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dux($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? a($$2, this.d(), dux::a) : null;
   }

   public static boolean a(dha $$0, jh $$1) {
      return a((dge)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dge $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dha $$0, jh $$1) {
      List<chr> $$2 = $$0.a(
         chr.class, new fbm((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chr $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      duq $$4 = $$1.c_($$2);
      if ($$4 instanceof dux) {
         ((dux)$$4).k();
      }
   }
}
