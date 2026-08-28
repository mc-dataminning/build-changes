import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dko extends dif<duf> implements dqr {
   public static final MapCodec<dko> b = b($$0 -> new dko(() -> dua.b, $$0));
   public static final dxt<jn> c = dnj.aF;
   public static final dxt<dxo> d = dxm.bf;
   public static final dxn e = dxm.J;
   public static final int f = 1;
   protected static final int g = 1;
   protected static final int h = 14;
   protected static final fbt i = djl.a(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   protected static final fbt j = djl.a(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   protected static final fbt k = djl.a(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   protected static final fbt l = djl.a(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   protected static final fbt m = djl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final dlt.b<duf, Optional<bsc>> n = new dlt.b<duf, Optional<bsc>>() {
      public Optional<bsc> a(duf $$0, duf $$1) {
         return Optional.of(new bsb($$0, $$1));
      }

      public Optional<bsc> a(duf $$0) {
         return Optional.of($$0);
      }

      public Optional<bsc> a() {
         return Optional.empty();
      }
   };
   private static final dlt.b<duf, Optional<bsl>> o = new dlt.b<duf, Optional<bsl>>() {
      public Optional<bsl> a(final duf $$0, final duf $$1) {
         final bsc $$2 = new bsb($$0, $$1);
         return Optional.of(new bsl() {
            @Nullable
            @Override
            public csb createMenu(int $$0x, cov $$1x, cow $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return csk.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wp p_() {
               if ($$0.l_()) {
                  return $$0.p_();
               } else {
                  return (wp)($$1.l_() ? $$1.p_() : wp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bsl> a(duf $$0) {
         return Optional.of($$0);
      }

      public Optional<bsl> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dko> a() {
      return b;
   }

   protected dko(Supplier<dua<? extends duf>> $$0, dwv.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(c, jn.c).b(d, dxo.a).b(e, Boolean.valueOf(false)));
   }

   public static dlt.a h(dww $$0) {
      dxo $$1 = $$0.c(d);
      if ($$1 == dxo.a) {
         return dlt.a.a;
      } else {
         return $$1 == dxo.c ? dlt.a.b : dlt.a.c;
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dxo $$8 = $$6.c(d);
         if ($$0.c(d) == dxo.a && $$8 != dxo.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dxo.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if ($$0.c(d) == dxo.a) {
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

   public static jn i(dww $$0) {
      jn $$1 = $$0.c(c);
      return $$0.c(d) == dxo.b ? $$1.h() : $$1.i();
   }

   @Override
   public dww a(daf $$0) {
      dxo $$1 = dxo.a;
      jn $$2 = $$0.g().g();
      esy $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jn $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jn $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dxo.c : dxo.b;
         }
      }

      if ($$1 == dxo.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dxo.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dxo.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == esz.c));
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(e) ? esz.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jn a(daf $$0, jn $$1) {
      dww $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dxo.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1 instanceof ard $$5) {
         bsl $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cnl.a($$5, $$3, true);
         }
      }

      return bsj.a;
   }

   protected awh<akv> c() {
      return awk.i.b(awk.ao);
   }

   public dua<? extends duf> d() {
      return this.a.get();
   }

   @Nullable
   public static bsc a(dko $$0, dww $$1, dgh $$2, ji $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(n).orElse(null);
   }

   @Override
   public dlt.c<? extends duf> a(dww $$0, dgh $$1, ji $$2, boolean $$3) {
      BiPredicate<dgi, ji> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dko::a;
      }

      return dlt.a(this.a.get(), dko::h, dko::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return this.a($$0, $$1, $$2, false).apply(o).orElse(null);
   }

   public static dlt.b<duf, Float2FloatFunction> a(final dve $$0) {
      return new dlt.b<duf, Float2FloatFunction>() {
         public Float2FloatFunction a(duf $$0x, duf $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(duf $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return $$0.C ? a($$2, this.d(), duf::a) : null;
   }

   public static boolean a(dgi $$0, ji $$1) {
      return a((dfm)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dfm $$0, ji $$1) {
      ji $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dgi $$0, ji $$1) {
      List<cha> $$2 = $$0.a(
         cha.class, new fau((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cha $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      dty $$4 = $$1.c_($$2);
      if ($$4 instanceof duf) {
         ((duf)$$4).k();
      }
   }
}
