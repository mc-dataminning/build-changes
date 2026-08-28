import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dos extends dmi<dyw> implements duz {
   public static final MapCodec<dos> b = b($$0 -> new dos(() -> dyq.b, $$0));
   public static final eco<jc> c = drp.e;
   public static final eco<eci> d = ecg.bf;
   public static final ech e = ecg.I;
   public static final int f = 1;
   private static final fgw g = dno.b(14.0, 0.0, 14.0);
   private static final Map<jc, fgw> h = fgt.c(dno.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dpw.b<dyw, Optional<buv>> i = new dpw.b<dyw, Optional<buv>>() {
      public Optional<buv> a(dyw $$0, dyw $$1) {
         return Optional.of(new buu($$0, $$1));
      }

      public Optional<buv> a(dyw $$0) {
         return Optional.of($$0);
      }

      public Optional<buv> a() {
         return Optional.empty();
      }
   };
   private static final dpw.b<dyw, Optional<bve>> D = new dpw.b<dyw, Optional<bve>>() {
      public Optional<bve> a(final dyw $$0, final dyw $$1) {
         final buv $$2 = new buu($$0, $$1);
         return Optional.of(new bve() {
            @Nullable
            @Override
            public cwb createMenu(int $$0x, csh $$1x, csi $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cwk.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xg m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (xg)($$1.h_() ? $$1.m_() : xg.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bve> a(dyw $$0) {
         return Optional.of($$0);
      }

      public Optional<bve> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dos> a() {
      return b;
   }

   protected dos(Supplier<dyq<? extends dyw>> $$0, ebp.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jc.c).b(d, eci.a).b(e, Boolean.valueOf(false)));
   }

   public static dpw.a h(ebq $$0) {
      eci $$1 = $$0.c(d);
      if ($$1 == eci.a) {
         return dpw.a.a;
      } else {
         return $$1 == eci.c ? dpw.a.b : dpw.a.c;
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         eci $$8 = $$6.c(d);
         if ($$0.c(d) == eci.a && $$8 != eci.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, eci.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return switch ((eci)$$0.c(d)) {
         case a -> g;
         case b, c -> (fgw)h.get(i($$0));
      };
   }

   public static jc i(ebq $$0) {
      jc $$1 = $$0.c(c);
      return $$0.c(d) == eci.b ? $$1.h() : $$1.i();
   }

   @Override
   public ebq a(ded $$0) {
      eci $$1 = eci.a;
      jc $$2 = $$0.g().g();
      eya $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jc $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jc $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? eci.c : eci.b;
         }
      }

      if ($$1 == eci.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = eci.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = eci.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == eyb.c));
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(e) ? eyb.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jc a(ded $$0, jc $$1) {
      ebq $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == eci.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1 instanceof asb $$5) {
         bve $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cqy.a($$5, $$3, true);
         }
      }

      return bvc.a;
   }

   protected axf<alr> c() {
      return axi.i.b(axi.ao);
   }

   public dyq<? extends dyw> d() {
      return this.a.get();
   }

   @Nullable
   public static buv a(dos $$0, ebq $$1, dkj $$2, iw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dpw.c<? extends dyw> a(ebq $$0, dkj $$1, iw $$2, boolean $$3) {
      BiPredicate<dkk, iw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dos::a;
      }

      return dpw.a(this.a.get(), dos::h, dos::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static dpw.b<dyw, Float2FloatFunction> a(final dzv $$0) {
      return new dpw.b<dyw, Float2FloatFunction>() {
         public Float2FloatFunction a(dyw $$0x, dyw $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dyw $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? a($$2, this.d(), dyw::a) : null;
   }

   public static boolean a(dkk $$0, iw $$1) {
      return a((djn)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(djn $$0, iw $$1) {
      iw $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dkk $$0, iw $$1) {
      List<cjy> $$2 = $$0.a(
         cjy.class, new ffx((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cjy $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      dyo $$4 = $$1.c_($$2);
      if ($$4 instanceof dyw) {
         ((dyw)$$4).k();
      }
   }
}
