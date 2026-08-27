import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public abstract class dhg extends dch {
   private static final float a = 1.0F;
   private static final etc c = dch.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc d = dch.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final etc e = dch.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final etc f = dch.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc g = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final etc h = dch.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ij, dpz> i = dhu.h;
   private static final Map<ij, etc> j = ac.a(Maps.newEnumMap(ij.class), $$0 -> {
      $$0.put(ij.c, g);
      $$0.put(ij.f, f);
      $$0.put(ij.d, h);
      $$0.put(ij.e, e);
      $$0.put(ij.b, c);
      $$0.put(ij.a, d);
   });
   protected static final ij[] b = ij.values();
   private final ImmutableMap<dpi, etc> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dhg(dph.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dhg::o);
      this.l = ij.c.a.a().allMatch(this::a);
      this.m = ij.c.a.a().filter(ij.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ij.c.a.a().filter(ij.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dhg> a();

   public static Set<ij> m(dpi $$0) {
      if (!($$0.b() instanceof dhg)) {
         return Set.of();
      } else {
         Set<ij> $$1 = EnumSet.noneOf(ij.class);

         for (ij $$2 : ij.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ij> a(byte $$0) {
      Set<ij> $$1 = EnumSet.noneOf(ij.class);

      for (ij $$2 : ij.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ij> $$0) {
      byte $$1 = 0;

      for (ij $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ij $$0) {
      return true;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      for (ij $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (!n($$0)) {
         return dcj.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return (etc)this.k.get($$0);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      boolean $$3 = false;

      for (ij $$4 : b) {
         if (a($$0, $$4)) {
            id $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dpi $$0, cux $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cym $$0, dpi $$1, id $$2, ij $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         id $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dpi c(dpi $$0, cym $$1, id $$2, ij $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dpi $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.k() && $$0.u().a(elc.c)) {
            $$4 = this.n().a(dpy.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      if ($$1 == dhd.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dhd.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dpi a(dpi $$0, Function<ij, ij> $$1) {
      dpi $$2 = $$0;

      for (ij $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dpi $$0, ij $$1) {
      dpz $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cym $$0, ij $$1, id $$2, dpi $$3) {
      return dch.a($$3.l($$0, $$2), $$1.g()) || dch.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean k() {
      return this.E.d().contains(dpy.C);
   }

   private static dpi a(dpi $$0, dpz $$1) {
      dpi $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dcj.a.n();
   }

   public static dpz b(ij $$0) {
      return i.get($$0);
   }

   private static dpi a(dpj<dch, dpi> $$0) {
      dpi $$1 = $$0.b();

      for (dpz $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static etc o(dpi $$0) {
      etc $$1 = esz.a();

      for (ij $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = esz.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? esz.b() : $$1;
   }

   protected static boolean n(dpi $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dpi $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dhh c();
}
