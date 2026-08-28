import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drx extends dmr implements duc {
   public static final MapCodec<drx> b = b(drx::new);
   public static final ebk c = ebj.I;
   private static final Map<jb, ebk> a = dsl.h;
   protected static final jb[] d = jb.values();
   private final Function<eat, ffw> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends drx> a() {
      return b;
   }

   public drx(eas.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jb.c.a.a().allMatch(this::a);
      this.g = jb.c.a.a().filter(jb.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jb.c.a.a().filter(jb.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<eat, ffw> q() {
      Map<jb, ffw> $$0 = fft.d(dmr.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffw $$2 = fft.a();

         for (jb $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fft.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fft.b() : $$2;
      }, new ebw[]{c});
   }

   public static Set<jb> o(eat $$0) {
      if (!($$0.b() instanceof drx)) {
         return Set.of();
      } else {
         Set<jb> $$1 = EnumSet.noneOf(jb.class);

         for (jb $$2 : jb.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jb> a(byte $$0) {
      Set<jb> $$1 = EnumSet.noneOf(jb.class);

      for (jb $$2 : jb.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jb> $$0) {
      byte $$1 = 0;

      for (jb $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jb $$0) {
      return true;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      for (jb $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      if (!q($$0)) {
         return dmt.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(c) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      boolean $$3 = false;

      for (jb $$4 : d) {
         if (a($$0, $$4)) {
            if (!a($$1, $$2, $$4)) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      eat $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(diq $$0, eat $$1, iv $$2, jb $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iv $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public eat c(eat $$0, diq $$1, iv $$2, jb $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         eat $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(exb.c)) {
            $$4 = this.m().b(ebj.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      if ($$1 == dru.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dru.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private eat a(eat $$0, Function<jb, jb> $$1) {
      eat $$2 = $$0;

      for (jb $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(eat $$0, jb $$1) {
      ebk $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(diq $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      eat $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(diq $$0, jb $$1, iv $$2, eat $$3) {
      return dmr.a($$3.h($$0, $$2), $$1.g()) || dmr.a($$3.g($$0, $$2), $$1.g());
   }

   private static eat a(eat $$0, ebk $$1) {
      eat $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dmt.a.m();
   }

   public static ebk b(jb $$0) {
      return a.get($$0);
   }

   private static eat a(eau<dmr, eat> $$0) {
      eat $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (ebk $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(eat $$0) {
      for (jb $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(eat $$0) {
      for (jb $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
