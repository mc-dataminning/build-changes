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

public abstract class dni extends dij {
   private static final float a = 1.0F;
   private static final fal c = dij.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal d = dij.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fal e = dij.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fal f = dij.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal g = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fal h = dij.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dwf> i = dnw.h;
   private static final Map<jm, fal> j = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, g);
      $$0.put(jm.f, f);
      $$0.put(jm.d, h);
      $$0.put(jm.e, e);
      $$0.put(jm.b, c);
      $$0.put(jm.a, d);
   });
   protected static final jm[] b = jm.values();
   private final ImmutableMap<dvo, fal> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dni(dvn.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dni::r);
      this.l = jm.c.a.a().allMatch(this::a);
      this.m = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dni> a();

   public static Set<jm> o(dvo $$0) {
      if (!($$0.b() instanceof dni)) {
         return Set.of();
      } else {
         Set<jm> $$1 = EnumSet.noneOf(jm.class);

         for (jm $$2 : jm.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jm> a(byte $$0) {
      Set<jm> $$1 = EnumSet.noneOf(jm.class);

      for (jm $$2 : jm.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jm> $$0) {
      byte $$1 = 0;

      for (jm $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jm $$0) {
      return true;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      for (jm $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!q($$0)) {
         return dil.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return (fal)this.k.get($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      boolean $$3 = false;

      for (jm $$4 : b) {
         if (a($$0, $$4)) {
            jh $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dff $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dek $$0, dvo $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dvo c(dvo $$0, dek $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dvo $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(erp.c)) {
            $$4 = this.m().b(dwe.C, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      if ($$1 == dnf.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dnf.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dvo a(dvo $$0, Function<jm, jm> $$1) {
      dvo $$2 = $$0;

      for (jm $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dvo $$0, jm $$1) {
      dwf $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dek $$0, jm $$1, jh $$2, dvo $$3) {
      return dij.a($$3.h($$0, $$2), $$1.g()) || dij.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dwe.C);
   }

   private static dvo a(dvo $$0, dwf $$1) {
      dvo $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dil.a.m();
   }

   public static dwf b(jm $$0) {
      return i.get($$0);
   }

   private static dvo a(dvp<dij, dvo> $$0) {
      dvo $$1 = $$0.b();

      for (dwf $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fal r(dvo $$0) {
      fal $$1 = fai.a();

      for (jm $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = fai.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? fai.b() : $$1;
   }

   protected static boolean q(dvo $$0) {
      for (jm $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dvo $$0) {
      for (jm $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dnj c();
}
