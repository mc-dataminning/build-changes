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

public abstract class dmj extends dhj {
   private static final float a = 1.0F;
   private static final ezm c = dhj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm d = dhj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ezm e = dhj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezm f = dhj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm g = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezm h = dhj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jj, dvf> i = dmx.h;
   private static final Map<jj, ezm> j = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, g);
      $$0.put(jj.f, f);
      $$0.put(jj.d, h);
      $$0.put(jj.e, e);
      $$0.put(jj.b, c);
      $$0.put(jj.a, d);
   });
   protected static final jj[] b = jj.values();
   private final ImmutableMap<duo, ezm> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dmj(dun.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dmj::r);
      this.l = jj.c.a.a().allMatch(this::a);
      this.m = jj.c.a.a().filter(jj.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jj.c.a.a().filter(jj.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dmj> a();

   public static Set<jj> o(duo $$0) {
      if (!($$0.b() instanceof dmj)) {
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
   protected void a(dup.a<dhj, duo> $$0) {
      for (jj $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!q($$0)) {
         return dhl.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return (ezm)this.k.get($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
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
   protected boolean a(duo $$0, czk $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      duo $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(ddl $$0, duo $$1, je $$2, jj $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         je $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public duo c(duo $$0, ddl $$1, je $$2, jj $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         duo $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.l() && $$0.y().a(eqq.c)) {
            $$4 = this.o().b(dve.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      if ($$1 == dmg.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dmg.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private duo a(duo $$0, Function<jj, jj> $$1) {
      duo $$2 = $$0;

      for (jj $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(duo $$0, jj $$1) {
      dvf $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(ddl $$0, jj $$1, je $$2, duo $$3) {
      return dhj.a($$3.h($$0, $$2), $$1.g()) || dhj.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean l() {
      return this.F.d().contains(dve.C);
   }

   private static duo a(duo $$0, dvf $$1) {
      duo $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dhl.a.o();
   }

   public static dvf b(jj $$0) {
      return i.get($$0);
   }

   private static duo a(dup<dhj, duo> $$0) {
      duo $$1 = $$0.b();

      for (dvf $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static ezm r(duo $$0) {
      ezm $$1 = ezj.a();

      for (jj $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ezj.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ezj.b() : $$1;
   }

   protected static boolean q(duo $$0) {
      for (jj $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(duo $$0) {
      for (jj $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dmk c();
}
