import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dog extends dlw<dyk> implements dun {
   public static final MapCodec<dog> b = b($$0 -> new dog(() -> dye.b, $$0));
   public static final ecc<jb> c = drd.e;
   public static final ecc<ebw> d = ebu.bf;
   public static final ebv e = ebu.I;
   public static final int f = 1;
   private static final fgk g = dnc.b(14.0, 0.0, 14.0);
   private static final Map<jb, fgk> h = fgh.c(dnc.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dpk.b<dyk, Optional<buk>> i = new dpk.b<dyk, Optional<buk>>() {
      public Optional<buk> a(dyk $$0, dyk $$1) {
         return Optional.of(new buj($$0, $$1));
      }

      public Optional<buk> a(dyk $$0) {
         return Optional.of($$0);
      }

      public Optional<buk> a() {
         return Optional.empty();
      }
   };
   private static final dpk.b<dyk, Optional<but>> D = new dpk.b<dyk, Optional<but>>() {
      public Optional<but> a(final dyk $$0, final dyk $$1) {
         final buk $$2 = new buj($$0, $$1);
         return Optional.of(new but() {
            @Nullable
            @Override
            public cvq createMenu(int $$0x, crw $$1x, crx $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cvz.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xa m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (xa)($$1.h_() ? $$1.m_() : xa.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<but> a(dyk $$0) {
         return Optional.of($$0);
      }

      public Optional<but> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends dog> a() {
      return b;
   }

   protected dog(Supplier<dye<? extends dyk>> $$0, ebd.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jb.c).b(d, ebw.a).b(e, Boolean.valueOf(false)));
   }

   public static dpk.a h(ebe $$0) {
      ebw $$1 = $$0.c(d);
      if ($$1 == ebw.a) {
         return dpk.a.a;
      } else {
         return $$1 == ebw.c ? dpk.a.b : dpk.a.c;
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         ebw $$8 = $$6.c(d);
         if ($$0.c(d) == ebw.a && $$8 != ebw.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, ebw.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return switch ((ebw)$$0.c(d)) {
         case a -> g;
         case b, c -> (fgk)h.get(i($$0));
      };
   }

   public static jb i(ebe $$0) {
      jb $$1 = $$0.c(c);
      return $$0.c(d) == ebw.b ? $$1.h() : $$1.i();
   }

   @Override
   public ebe a(ddr $$0) {
      ebw $$1 = ebw.a;
      jb $$2 = $$0.g().g();
      exo $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jb $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jb $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? ebw.c : ebw.b;
         }
      }

      if ($$1 == ebw.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = ebw.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = ebw.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == exp.c));
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(e) ? exp.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jb a(ddr $$0, jb $$1) {
      ebe $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == ebw.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1 instanceof ars $$5) {
         but $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cqn.a($$5, $$3, true);
         }
      }

      return bur.a;
   }

   protected aww<ali> c() {
      return awz.i.b(awz.ao);
   }

   public dye<? extends dyk> d() {
      return this.a.get();
   }

   @Nullable
   public static buk a(dog $$0, ebe $$1, djx $$2, iv $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dpk.c<? extends dyk> a(ebe $$0, djx $$1, iv $$2, boolean $$3) {
      BiPredicate<djy, iv> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = dog::a;
      }

      return dpk.a(this.a.get(), dog::h, dog::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static dpk.b<dyk, Float2FloatFunction> a(final dzj $$0) {
      return new dpk.b<dyk, Float2FloatFunction>() {
         public Float2FloatFunction a(dyk $$0x, dyk $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dyk $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? a($$2, this.d(), dyk::a) : null;
   }

   public static boolean a(djy $$0, iv $$1) {
      return a((djb)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(djb $$0, iv $$1) {
      iv $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(djy $$0, iv $$1) {
      List<cjn> $$2 = $$0.a(
         cjn.class, new ffl((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cjn $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dyc $$4 = $$1.c_($$2);
      if ($$4 instanceof dyk) {
         ((dyk)$$4).k();
      }
   }
}
