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

public abstract class dlv extends dgv {
   private static final float a = 1.0F;
   private static final eyx c = dgv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx d = dgv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eyx e = dgv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eyx f = dgv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx g = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eyx h = dgv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jj, dur> i = dmj.h;
   private static final Map<jj, eyx> j = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, g);
      $$0.put(jj.f, f);
      $$0.put(jj.d, h);
      $$0.put(jj.e, e);
      $$0.put(jj.b, c);
      $$0.put(jj.a, d);
   });
   protected static final jj[] b = jj.values();
   private final ImmutableMap<dua, eyx> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dlv(dtz.d $$0) {
      super($$0);
      this.l(a(this.E));
      this.k = this.a(dlv::r);
      this.l = jj.c.a.a().allMatch(this::a);
      this.m = jj.c.a.a().filter(jj.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jj.c.a.a().filter(jj.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dlv> a();

   public static Set<jj> o(dua $$0) {
      if (!($$0.b() instanceof dlv)) {
         return Set.of();
      } else {
         Set<jj> $$1 = EnumSet.noneOf(jj.class);

         for (jj $$2 : jj.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jj> a(byte $$0) {
      Set<jj> $$1 = EnumSet.noneOf(jj.class);

      for (jj $$2 : jj.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jj> $$0) {
      byte $$1 = 0;

      for (jj $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jj $$0) {
      return true;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      for (jj $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!q($$0)) {
         return dgx.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return (eyx)this.k.get($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      boolean $$3 = false;

      for (jj $$4 : b) {
         if (a($$0, $$4)) {
            je $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      dua $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dcx $$0, dua $$1, je $$2, jj $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         je $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dua c(dua $$0, dcx $$1, je $$2, jj $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dua $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.y().a(eqc.c)) {
            $$4 = this.o().b(duq.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      if ($$1 == dls.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dls.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dua a(dua $$0, Function<jj, jj> $$1) {
      dua $$2 = $$0;

      for (jj $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dua $$0, jj $$1) {
      dur $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dcx $$0, jj $$1, je $$2, dua $$3) {
      return dgv.a($$3.h($$0, $$2), $$1.g()) || dgv.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(duq.C);
   }

   private static dua a(dua $$0, dur $$1) {
      dua $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dgx.a.o();
   }

   public static dur b(jj $$0) {
      return i.get($$0);
   }

   private static dua a(dub<dgv, dua> $$0) {
      dua $$1 = $$0.b();

      for (dur $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static eyx r(dua $$0) {
      eyx $$1 = eyu.a();

      for (jj $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eyu.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eyu.b() : $$1;
   }

   protected static boolean q(dua $$0) {
      for (jj $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dua $$0) {
      for (jj $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dlw c();
}
