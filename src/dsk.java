import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsk extends dne implements dup {
   public static final MapCodec<dsk> b = b(dsk::new);
   public static final ebx c = ebw.I;
   private static final Map<jc, ebx> a = dsy.h;
   protected static final jc[] d = jc.values();
   private final Function<ebg, fgm> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dsk> a() {
      return b;
   }

   public dsk(ebf.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jc.c.a.a().allMatch(this::a);
      this.g = jc.c.a.a().filter(jc.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jc.c.a.a().filter(jc.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<ebg, fgm> q() {
      Map<jc, fgm> $$0 = fgj.d(dne.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgm $$2 = fgj.a();

         for (jc $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fgj.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fgj.b() : $$2;
      }, new ecj[]{c});
   }

   public static Set<jc> o(ebg $$0) {
      if (!($$0.b() instanceof dsk)) {
         return Set.of();
      } else {
         Set<jc> $$1 = EnumSet.noneOf(jc.class);

         for (jc $$2 : jc.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jc> a(byte $$0) {
      Set<jc> $$1 = EnumSet.noneOf(jc.class);

      for (jc $$2 : jc.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jc> $$0) {
      byte $$1 = 0;

      for (jc $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jc $$0) {
      return true;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      for (jc $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      if (!q($$0)) {
         return dng.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      boolean $$3 = false;

      for (jc $$4 : d) {
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
   protected boolean a(ebg $$0, ddt $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(djd $$0, ebg $$1, iw $$2, jc $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iw $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public ebg c(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         ebg $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(exr.c)) {
            $$4 = this.m().b(ebw.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      if ($$1 == dsh.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dsh.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private ebg a(ebg $$0, Function<jc, jc> $$1) {
      ebg $$2 = $$0;

      for (jc $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(ebg $$0, jc $$1) {
      ebx $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(djd $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      ebg $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(djd $$0, jc $$1, iw $$2, ebg $$3) {
      return dne.a($$3.h($$0, $$2), $$1.g()) || dne.a($$3.g($$0, $$2), $$1.g());
   }

   private static ebg a(ebg $$0, ebx $$1) {
      ebg $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dng.a.m();
   }

   public static ebx b(jc $$0) {
      return a.get($$0);
   }

   private static ebg a(ebh<dne, ebg> $$0) {
      ebg $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (ebx $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(ebg $$0) {
      for (jc $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(ebg $$0) {
      for (jc $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
