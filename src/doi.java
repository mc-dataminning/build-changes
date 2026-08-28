import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class doi extends dly<dym> implements dup {
   public static final MapCodec<doi> b = b($$0 -> new doi(() -> dyg.b, $$0));
   public static final ece<jc> c = drf.e;
   public static final ece<eby> d = ebw.bf;
   public static final ebx e = ebw.I;
   public static final int f = 1;
   private static final fgm g = dne.b(14.0, 0.0, 14.0);
   private static final Map<jc, fgm> h = fgj.c(dne.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dpm.b<dym, Optional<bum>> i = new dpm.b<dym, Optional<bum>>() {
      public Optional<bum> a(dym $$0, dym $$1) {
         return Optional.of(new bul($$0, $$1));
      }

      public Optional<bum> a(dym $$0) {
         return Optional.of($$0);
      }

      public Optional<bum> a() {
         return Optional.empty();
      }
   };
   private static final dpm.b<dym, Optional<buv>> D = new dpm.b<dym, Optional<buv>>() {
      public Optional<buv> a(final dym $$0, final dym $$1) {
         final bum $$2 = new bul($$0, $$1);
         return Optional.of(new buv() {
            @Nullable
            @Override
            public cvs createMenu(int $$0x, cry $$1x, crz $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.d_($$1.h);
                  $$1.d_($$1.h);
                  return cwb.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xc m_() {
               if ($$0.h_()) {
                  return $$0.m_();
               } else {
                  return (xc)($$1.h_() ? $$1.m_() : xc.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<buv> a(dym $$0) {
         return Optional.of($$0);
      }

      public Optional<buv> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends doi> a() {
      return b;
   }

   protected doi(Supplier<dyg<? extends dym>> $$0, ebf.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jc.c).b(d, eby.a).b(e, Boolean.valueOf(false)));
   }

   public static dpm.a h(ebg $$0) {
      eby $$1 = $$0.c(d);
      if ($$1 == eby.a) {
         return dpm.a.a;
      } else {
         return $$1 == eby.c ? dpm.a.b : dpm.a.c;
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         eby $$8 = $$6.c(d);
         if ($$0.c(d) == eby.a && $$8 != eby.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, eby.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return switch ((eby)$$0.c(d)) {
         case a -> g;
         case b, c -> (fgm)h.get(i($$0));
      };
   }

   public static jc i(ebg $$0) {
      jc $$1 = $$0.c(c);
      return $$0.c(d) == eby.b ? $$1.h() : $$1.i();
   }

   @Override
   public ebg a(ddt $$0) {
      eby $$1 = eby.a;
      jc $$2 = $$0.g().g();
      exq $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jc $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jc $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? eby.c : eby.b;
         }
      }

      if ($$1 == eby.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = eby.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = eby.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, Boolean.valueOf($$3.a() == exr.c));
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(e) ? exr.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jc a(ddt $$0, jc $$1) {
      ebg $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == eby.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1 instanceof aru $$5) {
         buv $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            cqp.a($$5, $$3, true);
         }
      }

      return but.a;
   }

   protected awy<alk> c() {
      return axb.i.b(axb.ao);
   }

   public dyg<? extends dym> d() {
      return this.a.get();
   }

   @Nullable
   public static bum a(doi $$0, ebg $$1, djz $$2, iw $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dpm.c<? extends dym> a(ebg $$0, djz $$1, iw $$2, boolean $$3) {
      BiPredicate<dka, iw> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = doi::a;
      }

      return dpm.a(this.a.get(), doi::h, doi::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static dpm.b<dym, Float2FloatFunction> a(final dzl $$0) {
      return new dpm.b<dym, Float2FloatFunction>() {
         public Float2FloatFunction a(dym $$0x, dym $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(dym $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dym($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? a($$2, this.d(), dym::a) : null;
   }

   public static boolean a(dka $$0, iw $$1) {
      return a((djd)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(djd $$0, iw $$1) {
      iw $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dka $$0, iw $$1) {
      List<cjp> $$2 = $$0.a(
         cjp.class, new ffn((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 2), (double)($$1.w() + 1))
      );
      if (!$$2.isEmpty()) {
         for (cjp $$3 : $$2) {
            if ($$3.x()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dye $$4 = $$1.c_($$2);
      if ($$4 instanceof dym) {
         ((dym)$$4).k();
      }
   }
}
