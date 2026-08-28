import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dlh extends diy<duz> implements drl {
   public static final MapCodec<dlh> b = b($$0 -> new dlh(() -> duu.b, $$0));
   public static final dyo<jn> c = dod.e;
   public static final dyo<dyi> d = dyg.bf;
   public static final dyh e = dyg.I;
   public static final int f = 1;
   private static final fcr g = dke.b(14.0, 0.0, 14.0);
   private static final Map<jn, fcr> h = fco.c(dke.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dmm.b<duz, Optional<bsr>> i = new dmm.b<duz, Optional<bsr>>() {
      public Optional<bsr> a(duz $$0, duz $$1) {
         return Optional.of(new bsq($$0, $$1));
      }

      public Optional<bsr> a(duz $$0) {
         return Optional.of($$0);
      }

      public Optional<bsr> a() {
         return Optional.empty();
      }
   };
   private static final dmm.b<duz, Optional<bta>> C = new dmm.b<duz, Optional<bta>>() {
      public Optional<bta> a(final duz $$0, final duz $$1) {
         final bsr $$2 = new bsq($$0, $$1);
         return Optional.of(new bta() {
            @Nullable
            @Override
            public csw createMenu(int $$0x, cpq $$1x, cpr $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.k);
                  $$1.d_($$1.k);
                  return ctf.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public wp m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (wp)($$1.h_() ? $$1.m_() : wp.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bta> a(duz $$0) {
         return Optional.of($$0);
      }

      public Optional<bta> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dlh> a() {
      return b;
   }

   protected dlh(Supplier<duu<? extends duz>> $$0, dxp.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(c, jn.c).b(d, dyi.a).b(e, Boolean.valueOf(false)));
   }

   public static dmm.a h(dxq $$0) {
      dyi $$1 = $$0.c(d);
      if ($$1 == dyi.a) {
         return dmm.a.a;
      } else {
         return $$1 == dyi.c ? dmm.a.b : dmm.a.c;
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         dyi $$8 = $$6.c(d);
         if ($$0.c(d) == dyi.a && $$8 != dyi.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, dyi.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return switch ((dyi)$$0.c(d)) {
         case a -> g;
         case b, c -> (fcr)h.get(i($$0));
      };
   }

   public static jn i(dxq $$0) {
      jn $$1 = $$0.c(c);
      return $$0.c(d) == dyi.b ? $$1.h() : $$1.i();
   }

   @Override
   public dxq a(dax $$0) {
      dyi $$1 = dyi.a;
      jn $$2 = $$0.g().g();
      etw $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jn $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jn $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? dyi.c : dyi.b;
         }
      }

      if ($$1 == dyi.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = dyi.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = dyi.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == etx.c));
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jn a(dax $$0, jn $$1) {
      dxq $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == dyi.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1 instanceof ard $$5) {
         bta $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cog.a($$5, $$3, true);
         }
      }

      return bsy.a;
   }

   protected awh<aku> c() {
      return awk.i.b(awk.ao);
   }

   public duu<? extends duz> d() {
      return this.a.get();
   }

   @Nullable
   public static bsr a(dlh $$0, dxq $$1, dgz $$2, ji $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dmm.c<? extends duz> a(dxq $$0, dgz $$1, ji $$2, boolean $$3) {
      BiPredicate<dha, ji> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dlh::a;
      }

      return dmm.a(this.a.get(), dlh::h, dlh::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return this.a($$0, $$1, $$2, false).apply(C).orElse(null);
   }

   public static dmm.b<duz, Float2FloatFunction> a(final dvy $$0) {
      return new dmm.b<duz, Float2FloatFunction>() {
         public Float2FloatFunction a(duz $$0x, duz $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(duz $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? a($$2, this.d(), duz::a) : null;
   }

   public static boolean a(dha $$0, ji $$1) {
      return a((dgf)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dgf $$0, ji $$1) {
      ji $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dha $$0, ji $$1) {
      List<chs> $$2 = $$0.a(
         chs.class, new fbs((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (chs $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      dus $$4 = $$1.c_($$2);
      if ($$4 instanceof duz) {
         ((duz)$$4).k();
      }
   }
}
