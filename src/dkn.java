import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkn extends die<due> implements dqq {
   public static final MapCodec<dkn> b = b($$0 -> new dkn(() -> dtz.b, $$0));
   public static final dxs<jn> c = dni.aF;
   public static final dxs<dxn> d = dxl.bf;
   public static final dxm e = dxl.J;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fbs i = djk.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fbs j = djk.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fbs k = djk.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fbs l = djk.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fbs m = djk.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dls.b<due, Optional<bsb>> n = new dls.b<due, Optional<bsb>>() {
      public Optional<bsb> a(due $$0, due $$1) {
         return Optional.of(new bsa($$0, $$1));
      }

      public Optional<bsb> a(due $$0) {
         return Optional.of($$0);
      }

      public Optional<bsb> a() {
         return Optional.empty();
      }
   };
   private static final dls.b<due, Optional<bsk>> o = new dls.b<due, Optional<bsk>>() {
      public Optional<bsk> a(final due $$0, final due $$1) {
         final bsb $$2 = new bsa($$0, $$1);
         return Optional.of(new bsk() {
            @Nullable
            @Override
            public csa createMenu(int $$0x, cou $$1x, cov $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return csj.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wo p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (wo)($$1.l_() ? $$1.p_() : wo.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsk> a(due $$0) {
         return Optional.of($$0);
      }

      public Optional<bsk> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dkn> a() {
      return b;
   }

   protected dkn(Supplier<dtz<? extends due>> $$0, dwu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jn.c).b(d, dxn.a).b(e, Boolean.valueOf(false)));
   }

   public static dls.a h(dwv $$0) {
      dxn $$1 = $$0.c(d);
      if ($$1 == dxn.a) {
         return dls.a.a;
      } else {
         return $$1 == dxn.c ? dls.a.b : dls.a.c;
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dxn $$8 = $$6.c(d);
         if ($$0.c(d) == dxn.a && $$8 != dxn.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dxn.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$0.c(d) == dxn.a) {
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

   public static jn i(dwv $$0) {
      jn $$1 = $$0.c(c);
      return $$0.c(d) == dxn.b ? $$1.h() : $$1.i();
   }

   @Override
   public dwv a(dae $$0) {
      dxn $$1 = dxn.a;
      jn $$2 = $$0.g().g();
      esx $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jn $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jn $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dxn.c : dxn.b;
         }
      }

      if ($$1 == dxn.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dxn.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dxn.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == esy.c));
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jn a(dae $$0, jn $$1) {
      dwv $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dxn.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1 instanceof arc $$5) {
         bsk $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cnk.a($$5, $$3, true);
         }
      }

      return bsi.a;
   }

   protected awg<aku> c() {
      return awj.i.b(awj.ao);
   }

   public dtz<? extends due> d() {
      return this.a.get();
   }

   @Nullable
   public static bsb a(dkn $$0, dwv $$1, dgg $$2, ji $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dls.c<? extends due> a(dwv $$0, dgg $$1, ji $$2, boolean $$3) {
      BiPredicate<dgh, ji> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dkn::a;
      }

      return dls.a(this.a.get(), dkn::h, dkn::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dls.b<due, Float2FloatFunction> a(final dvd $$0) {
      return new dls.b<due, Float2FloatFunction>() {
         public Float2FloatFunction a(due $$0x, due $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(due $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new due($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? a($$2, this.d(), due::a) : null;
   }

   public static boolean a(dgh $$0, ji $$1) {
      return a((dfl)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dfl $$0, ji $$1) {
      ji $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dgh $$0, ji $$1) {
      List<cgz> $$2 = $$0.a(
         cgz.class, new fat((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cgz $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      dtx $$4 = $$1.c_($$2);
      if ($$4 instanceof due) {
         ((due)$$4).k();
      }
   }
}
