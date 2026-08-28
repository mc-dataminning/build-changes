import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsi extends dnc implements dun {
   public static final MapCodec<dsi> b = b(dsi::new);
   public static final ebv c = ebu.I;
   private static final Map<jb, ebv> a = dsw.h;
   protected static final jb[] d = jb.values();
   private final Function<ebe, fgk> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dsi> a() {
      return b;
   }

   public dsi(ebd.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jb.c.a.a().allMatch(this::a);
      this.g = jb.c.a.a().filter(jb.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jb.c.a.a().filter(jb.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<ebe, fgk> q() {
      Map<jb, fgk> $$0 = fgh.d(dnc.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgk $$2 = fgh.a();

         for (jb $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fgh.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fgh.b() : $$2;
      }, new ech[]{c});
   }

   public static Set<jb> o(ebe $$0) {
      if (!($$0.b() instanceof dsi)) {
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
   protected void a(ebf.a<dnc, ebe> $$0) {
      for (jb $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      if (!q($$0)) {
         return dne.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
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
   protected boolean a(ebe $$0, ddr $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(djb $$0, ebe $$1, iv $$2, jb $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iv $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public ebe c(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         ebe $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(exp.c)) {
            $$4 = this.m().b(ebu.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      if ($$1 == dsf.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dsf.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private ebe a(ebe $$0, Function<jb, jb> $$1) {
      ebe $$2 = $$0;

      for (jb $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(ebe $$0, jb $$1) {
      ebv $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(djb $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      ebe $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(djb $$0, jb $$1, iv $$2, ebe $$3) {
      return dnc.a($$3.h($$0, $$2), $$1.g()) || dnc.a($$3.g($$0, $$2), $$1.g());
   }

   private static ebe a(ebe $$0, ebv $$1) {
      ebe $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dne.a.m();
   }

   public static ebv b(jb $$0) {
      return a.get($$0);
   }

   private static ebe a(ebf<dnc, ebe> $$0) {
      ebe $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (ebv $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(ebe $$0) {
      for (jb $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(ebe $$0) {
      for (jb $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
