import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dnj extends dkz<dxn> implements dtq {
   public static final MapCodec<dnj> b = b($$0 -> new dnj(() -> dxh.b, $$0));
   public static final ebf<ja> c = dqg.e;
   public static final ebf<eaz> d = eax.bf;
   public static final eay e = eax.I;
   public static final int f = 1;
   private static final ffk g = dmf.b(14.0, 0.0, 14.0);
   private static final Map<ja, ffk> h = ffh.c(dmf.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final don.b<dxn, Optional<btw>> i = new don.b<dxn, Optional<btw>>() {
      public Optional<btw> a(dxn $$0, dxn $$1) {
         return Optional.of(new btv($$0, $$1));
      }

      public Optional<btw> a(dxn $$0) {
         return Optional.of($$0);
      }

      public Optional<btw> a() {
         return Optional.empty();
      }
   };
   private static final don.b<dxn, Optional<buf>> D = new don.b<dxn, Optional<buf>>() {
      public Optional<buf> a(final dxn $$0, final dxn $$1) {
         final btw $$2 = new btv($$0, $$1);
         return Optional.of(new buf() {
            @Nullable
            @Override
            public cuv createMenu(int $$0x, crb $$1x, crc $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cve.b($$0, $$1, $$2);
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

      public Optional<buf> a(dxn $$0) {
         return Optional.of($$0);
      }

      public Optional<buf> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dnj> a() {
      return b;
   }

   protected dnj(Supplier<dxh<? extends dxn>> $$0, eag.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, ja.c).b(d, eaz.a).b(e, Boolean.valueOf(false)));
   }

   public static don.a h(eah $$0) {
      eaz $$1 = $$0.c(d);
      if ($$1 == eaz.a) {
         return don.a.a;
      } else {
         return $$1 == eaz.c ? don.a.b : don.a.c;
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         eaz $$8 = $$6.c(d);
         if ($$0.c(d) == eaz.a && $$8 != eaz.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, eaz.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return switch ((eaz)$$0.c(d)) {
         case a -> g;
         case b, c -> (ffk)h.get(i($$0));
      };
   }

   public static ja i(eah $$0) {
      ja $$1 = $$0.c(c);
      return $$0.c(d) == eaz.b ? $$1.h() : $$1.i();
   }

   @Override
   public eah a(dcw $$0) {
      eaz $$1 = eaz.a;
      ja $$2 = $$0.g().g();
      ewo $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      ja $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         ja $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? eaz.c : eaz.b;
         }
      }

      if ($$1 == eaz.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = eaz.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = eaz.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == ewp.c));
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(e) ? ewp.c.a(false) : super.b_($$0);
   }

   @Nullable
   private ja a(dcw $$0, ja $$1) {
      eah $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == eaz.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1 instanceof arq $$5) {
         buf $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cps.a($$5, $$3, true);
         }
      }

      return bud.a;
   }

   protected awu<alg> c() {
      return awx.i.b(awx.ao);
   }

   public dxh<? extends dxn> d() {
      return this.a.get();
   }

   @Nullable
   public static btw a(dnj $$0, eah $$1, dja $$2, iu $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public don.c<? extends dxn> a(eah $$0, dja $$1, iu $$2, boolean $$3) {
      BiPredicate<djb, iu> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dnj::a;
      }

      return don.a(this.a.get(), dnj::h, dnj::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static don.b<dxn, Float2FloatFunction> a(final dym $$0) {
      return new don.b<dxn, Float2FloatFunction>() {
         public Float2FloatFunction a(dxn $$0x, dxn $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dxn $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? a($$2, this.d(), dxn::a) : null;
   }

   public static boolean a(djb $$0, iu $$1) {
      return a((dig)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dig $$0, iu $$1) {
      iu $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(djb $$0, iu $$1) {
      List<cix> $$2 = $$0.a(
         cix.class, new fel((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cix $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dxf $$4 = $$1.c_($$2);
      if ($$4 instanceof dxn) {
         ((dxn)$$4).k();
      }
   }
}
