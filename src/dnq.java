import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dnq extends dlg<dxu> implements dtx {
   public static final MapCodec<dnq> b = b($$0 -> new dnq(() -> dxo.b, $$0));
   public static final ebm<jb> c = dqn.e;
   public static final ebm<ebg> d = ebe.bf;
   public static final ebf e = ebe.I;
   public static final int f = 1;
   private static final ffr g = dmm.b(14.0, 0.0, 14.0);
   private static final Map<jb, ffr> h = ffo.c(dmm.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dou.b<dxu, Optional<btz>> i = new dou.b<dxu, Optional<btz>>() {
      public Optional<btz> a(dxu $$0, dxu $$1) {
         return Optional.of(new bty($$0, $$1));
      }

      public Optional<btz> a(dxu $$0) {
         return Optional.of($$0);
      }

      public Optional<btz> a() {
         return Optional.empty();
      }
   };
   private static final dou.b<dxu, Optional<bui>> D = new dou.b<dxu, Optional<bui>>() {
      public Optional<bui> a(final dxu $$0, final dxu $$1) {
         final btz $$2 = new bty($$0, $$1);
         return Optional.of(new bui() {
            @Nullable
            @Override
            public cvc createMenu(int $$0x, cri $$1x, crj $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cvl.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wy m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (wy)($$1.h_() ? $$1.m_() : wy.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bui> a(dxu $$0) {
         return Optional.of($$0);
      }

      public Optional<bui> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dnq> a() {
      return b;
   }

   protected dnq(Supplier<dxo<? extends dxu>> $$0, ean.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jb.c).b(d, ebg.a).b(e, Boolean.valueOf(false)));
   }

   public static dou.a h(eao $$0) {
      ebg $$1 = $$0.c(d);
      if ($$1 == ebg.a) {
         return dou.a.a;
      } else {
         return $$1 == ebg.c ? dou.a.b : dou.a.c;
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         ebg $$8 = $$6.c(d);
         if ($$0.c(d) == ebg.a && $$8 != ebg.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, ebg.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return switch ((ebg)$$0.c(d)) {
         case a -> g;
         case b, c -> (ffr)h.get(i($$0));
      };
   }

   public static jb i(eao $$0) {
      jb $$1 = $$0.c(c);
      return $$0.c(d) == ebg.b ? $$1.h() : $$1.i();
   }

   @Override
   public eao a(ddd $$0) {
      ebg $$1 = ebg.a;
      jb $$2 = $$0.g().g();
      ewv $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jb $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jb $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? ebg.c : ebg.b;
         }
      }

      if ($$1 == ebg.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = ebg.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = ebg.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == eww.c));
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(e) ? eww.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jb a(ddd $$0, jb $$1) {
      eao $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == ebg.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1 instanceof arq $$5) {
         bui $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cpz.a($$5, $$3, true);
         }
      }

      return bug.a;
   }

   protected awu<alg> c() {
      return awx.i.b(awx.ao);
   }

   public dxo<? extends dxu> d() {
      return this.a.get();
   }

   @Nullable
   public static btz a(dnq $$0, eao $$1, djh $$2, iv $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dou.c<? extends dxu> a(eao $$0, djh $$1, iv $$2, boolean $$3) {
      BiPredicate<dji, iv> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dnq::a;
      }

      return dou.a(this.a.get(), dnq::h, dnq::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static dou.b<dxu, Float2FloatFunction> a(final dyt $$0) {
      return new dou.b<dxu, Float2FloatFunction>() {
         public Float2FloatFunction a(dxu $$0x, dxu $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dxu $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dxu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$0.C ? a($$2, this.d(), dxu::a) : null;
   }

   public static boolean a(dji $$0, iv $$1) {
      return a((din)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(din $$0, iv $$1) {
      iv $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dji $$0, iv $$1) {
      List<cjc> $$2 = $$0.a(
         cjc.class, new fes((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cjc $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return cvc.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dxm $$4 = $$1.c_($$2);
      if ($$4 instanceof dxu) {
         ((dxu)$$4).k();
      }
   }
}
