import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dlp extends djf<dvd> implements drp {
   public static final MapCodec<dlp> b = b($$0 -> new dlp(() -> duy.b, $$0));
   public static final dyr<jm> c = doj.aF;
   public static final dyr<dym> d = dyk.bd;
   public static final dyl e = dyk.D;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fcr i = dkl.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fcr j = dkl.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fcr k = dkl.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fcr l = dkl.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fcr m = dkl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dmu.b<dvd, Optional<btb>> n = new dmu.b<dvd, Optional<btb>>() {
      public Optional<btb> a(dvd $$0, dvd $$1) {
         return Optional.of(new bta($$0, $$1));
      }

      public Optional<btb> a(dvd $$0) {
         return Optional.of($$0);
      }

      public Optional<btb> a() {
         return Optional.empty();
      }
   };
   private static final dmu.b<dvd, Optional<btk>> o = new dmu.b<dvd, Optional<btk>>() {
      public Optional<btk> a(final dvd $$0, final dvd $$1) {
         final btb $$2 = new bta($$0, $$1);
         return Optional.of(new btk() {
            @Nullable
            @Override
            public ctb createMenu(int $$0x, cpv $$1x, cpw $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctk.b($$0, $$1, $$2);
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

      public Optional<btk> a(dvd $$0) {
         return Optional.of($$0);
      }

      public Optional<btk> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dlp> a() {
      return b;
   }

   protected dlp(Supplier<duy<? extends dvd>> $$0, dxt.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jm.c).b(d, dym.a).b(e, Boolean.valueOf(false)));
   }

   public static dmu.a h(dxu $$0) {
      dym $$1 = $$0.c(d);
      if ($$1 == dym.a) {
         return dmu.a.a;
      } else {
         return $$1 == dym.c ? dmu.a.b : dmu.a.c;
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.b;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dym $$8 = $$6.c(d);
         if ($$0.c(d) == dym.a && $$8 != dym.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dym.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if ($$0.c(d) == dym.a) {
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

   public static jm i(dxu $$0) {
      jm $$1 = $$0.c(c);
      return $$0.c(d) == dym.b ? $$1.h() : $$1.i();
   }

   @Override
   public dxu a(dbf $$0) {
      dym $$1 = dym.a;
      jm $$2 = $$0.g().g();
      etw $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jm $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jm $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dym.c : dym.b;
         }
      }

      if ($$1 == dym.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dym.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dym.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == etx.c));
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jm a(dbf $$0, jm $$1) {
      dxu $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dym.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1 instanceof ash $$5) {
         btk $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            col.a($$5, $$3, true);
         }
      }

      return bti.a;
   }

   protected axm<alz> c() {
      return axp.i.b(axp.ao);
   }

   public duy<? extends dvd> d() {
      return this.a.get();
   }

   @Nullable
   public static btb a(dlp $$0, dxu $$1, dhh $$2, jh $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dmu.c<? extends dvd> a(dxu $$0, dhh $$1, jh $$2, boolean $$3) {
      BiPredicate<dhi, jh> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dlp::a;
      }

      return dmu.a(this.a.get(), dlp::h, dlp::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dmu.b<dvd, Float2FloatFunction> a(final dwc $$0) {
      return new dmu.b<dvd, Float2FloatFunction>() {
         public Float2FloatFunction a(dvd $$0x, dvd $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dvd $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? a($$2, this.d(), dvd::a) : null;
   }

   public static boolean a(dhi $$0, jh $$1) {
      return a((dgm)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dgm $$0, jh $$1) {
      jh $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dhi $$0, jh $$1) {
      List<chz> $$2 = $$0.a(
         chz.class, new fbs((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chz $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      duw $$4 = $$1.c_($$2);
      if ($$4 instanceof dvd) {
         ((dvd)$$4).k();
      }
   }
}
