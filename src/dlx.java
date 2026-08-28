import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dlx extends djo<dvt> implements dsb {
   public static final MapCodec<dlx> b = b($$0 -> new dlx(() -> dvn.b, $$0));
   public static final dzk<jo> c = dot.e;
   public static final dzk<dze> d = dzc.bf;
   public static final dzd e = dzc.I;
   public static final int f = 1;
   private static final fdo g = dku.b(14.0, 0.0, 14.0);
   private static final Map<jo, fdo> h = fdl.c(dku.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dnc.b<dvt, Optional<btj>> i = new dnc.b<dvt, Optional<btj>>() {
      public Optional<btj> a(dvt $$0, dvt $$1) {
         return Optional.of(new bti($$0, $$1));
      }

      public Optional<btj> a(dvt $$0) {
         return Optional.of($$0);
      }

      public Optional<btj> a() {
         return Optional.empty();
      }
   };
   private static final dnc.b<dvt, Optional<bts>> C = new dnc.b<dvt, Optional<bts>>() {
      public Optional<bts> a(final dvt $$0, final dvt $$1) {
         final btj $$2 = new bti($$0, $$1);
         return Optional.of(new bts() {
            @Nullable
            @Override
            public ctn createMenu(int $$0x, cqh $$1x, cqi $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctw.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wv m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (wv)($$1.h_() ? $$1.m_() : wv.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bts> a(dvt $$0) {
         return Optional.of($$0);
      }

      public Optional<bts> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dlx> a() {
      return b;
   }

   protected dlx(Supplier<dvn<? extends dvt>> $$0, dyl.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(c, jo.c).b(d, dze.a).b(e, Boolean.valueOf(false)));
   }

   public static dnc.a h(dym $$0) {
      dze $$1 = $$0.c(d);
      if ($$1 == dze.a) {
         return dnc.a.a;
      } else {
         return $$1 == dze.c ? dnc.a.b : dnc.a.c;
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dze $$8 = $$6.c(d);
         if ($$0.c(d) == dze.a && $$8 != dze.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dze.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return switch ((dze)$$0.c(d)) {
         case a -> g;
         case b, c -> (fdo)h.get(i($$0));
      };
   }

   public static jo i(dym $$0) {
      jo $$1 = $$0.c(c);
      return $$0.c(d) == dze.b ? $$1.h() : $$1.i();
   }

   @Override
   public dym a(dbn $$0) {
      dze $$1 = dze.a;
      jo $$2 = $$0.g().g();
      eut $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jo $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jo $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dze.c : dze.b;
         }
      }

      if ($$1 == dze.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dze.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dze.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == euu.c));
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(e) ? euu.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jo a(dbn $$0, jo $$1) {
      dym $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dze.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1 instanceof arn $$5) {
         bts $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            coy.a($$5, $$3, true);
         }
      }

      return btq.a;
   }

   protected awr<ald> c() {
      return awu.i.b(awu.ao);
   }

   public dvn<? extends dvt> d() {
      return this.a.get();
   }

   @Nullable
   public static btj a(dlx $$0, dym $$1, dhp $$2, jj $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dnc.c<? extends dvt> a(dym $$0, dhp $$1, jj $$2, boolean $$3) {
      BiPredicate<dhq, jj> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dlx::a;
      }

      return dnc.a(this.a.get(), dlx::h, dlx::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return this.a($$0, $$1, $$2, false).apply(C).orElse(null);
   }

   public static dnc.b<dvt, Float2FloatFunction> a(final dws $$0) {
      return new dnc.b<dvt, Float2FloatFunction>() {
         public Float2FloatFunction a(dvt $$0x, dvt $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dvt $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? a($$2, this.d(), dvt::a) : null;
   }

   public static boolean a(dhq $$0, jj $$1) {
      return a((dgv)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dgv $$0, jj $$1) {
      jj $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dhq $$0, jj $$1) {
      List<cij> $$2 = $$0.a(
         cij.class, new fcp((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cij $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return ctn.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dvl $$4 = $$1.c_($$2);
      if ($$4 instanceof dvt) {
         ((dvt)$$4).k();
      }
   }
}
