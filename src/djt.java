import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djt extends dhk<dtf> implements dpr {
   public static final MapCodec<djt> b = b($$0 -> new djt(() -> dta.b, $$0));
   public static final dws<jm> c = dml.aF;
   public static final dws<dwn> d = dwl.bc;
   public static final dwm e = dwl.C;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fas i = diq.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fas j = diq.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fas k = diq.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fas l = diq.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fas m = diq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dkx.b<dtf, Optional<bsd>> n = new dkx.b<dtf, Optional<bsd>>() {
      public Optional<bsd> a(dtf $$0, dtf $$1) {
         return Optional.of(new bsc($$0, $$1));
      }

      public Optional<bsd> a(dtf $$0) {
         return Optional.of($$0);
      }

      public Optional<bsd> a() {
         return Optional.empty();
      }
   };
   private static final dkx.b<dtf, Optional<bsm>> o = new dkx.b<dtf, Optional<bsm>>() {
      public Optional<bsm> a(final dtf $$0, final dtf $$1) {
         final bsd $$2 = new bsc($$0, $$1);
         return Optional.of(new bsm() {
            @Nullable
            @Override
            public crz createMenu(int $$0x, cot $$1x, cou $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return csi.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xj o_() {
               if ($$0.k_()) {
                  return $$0.o_();
               } else {
                  return (xj)($$1.k_() ? $$1.o_() : xj.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsm> a(dtf $$0) {
         return Optional.of($$0);
      }

      public Optional<bsm> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends djt> a() {
      return b;
   }

   protected djt(Supplier<dta<? extends dtf>> $$0, dvu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dwn.a).b(e, Boolean.valueOf(false)));
   }

   public static dkx.a h(dvv $$0) {
      dwn $$1 = $$0.c(d);
      if ($$1 == dwn.a) {
         return dkx.a.a;
      } else {
         return $$1 == dwn.c ? dkx.a.b : dkx.a.c;
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.b;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dwn $$8 = $$6.c(d);
         if ($$0.c(d) == dwn.a && $$8 != dwn.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dwn.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$0.c(d) == dwn.a) {
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

   public static jm i(dvv $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dwn.b ? $$1.h() : $$1.i();
   }

   @Override
   public dvv a(dad $$0) {
      dwn $$1 = dwn.a;
      jm $$2 = $$0.g().g();
      erv $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dwn.c : dwn.b;
         }
      }

      if ($$1 == dwn.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dwn.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dwn.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == erw.c));
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(e) ? erw.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(dad $$0, jm $$1) {
      dvv $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dwn.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1 instanceof arp $$5) {
         bsm $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cnj.a($$5, $$3, true);
         }
      }

      return bsk.a;
   }

   protected awu<alj> c() {
      return awx.i.b(awx.ao);
   }

   public dta<? extends dtf> d() {
      return this.a.get();
   }

   @Nullable
   public static bsd a(djt $$0, dvv $$1, dfm $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dkx.c<? extends dtf> a(dvv $$0, dfm $$1, jh $$2, boolean $$3) {
      BiPredicate<dfn, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = djt::a;
      }

      return dkx.a(this.a.get(), djt::h, djt::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dkx.b<dtf, Float2FloatFunction> a(final dud $$0) {
      return new dkx.b<dtf, Float2FloatFunction>() {
         public Float2FloatFunction a(dtf $$0x, dtf $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dtf $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? a($$2, this.d(), dtf::a) : null;
   }

   public static boolean a(dfn $$0, jh $$1) {
      return a((der)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(der $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dfn $$0, jh $$1) {
      List<chb> $$2 = $$0.a(
         chb.class, new ezt((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chb $$3 : $$2) {
            if ($$3.v()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      dsy $$4 = $$1.c_($$2);
      if ($$4 instanceof dtf) {
         ((dtf)$$4).k();
      }
   }
}
