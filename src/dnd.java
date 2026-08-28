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

public abstract class dnd extends die {
   private static final float a = 1.0F;
   private static final fah c = die.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah d = die.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fah e = die.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fah f = die.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah g = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fah h = die.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dwa> i = dnr.h;
   private static final Map<jm, fah> j = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, g);
      $$0.put(jm.f, f);
      $$0.put(jm.d, h);
      $$0.put(jm.e, e);
      $$0.put(jm.b, c);
      $$0.put(jm.a, d);
   });
   protected static final jm[] b = jm.values();
   private final ImmutableMap<dvj, fah> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dnd(dvi.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dnd::r);
      this.l = jm.c.a.a().allMatch(this::a);
      this.m = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dnd> a();

   public static Set<jm> o(dvj $$0) {
      if (!($$0.b() instanceof dnd)) {
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
   protected void a(dvk.a<die, dvj> $$0) {
      for (jm $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!q($$0)) {
         return dig.a.m();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return (fah)this.k.get($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
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
   protected boolean a(dvj $$0, czs $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      dfb $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(deg $$0, dvj $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dvj c(dvj $$0, deg $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dvj $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(erl.c)) {
            $$4 = this.m().b(dvz.C, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      if ($$1 == dna.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dna.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dvj a(dvj $$0, Function<jm, jm> $$1) {
      dvj $$2 = $$0;

      for (jm $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dvj $$0, jm $$1) {
      dwa $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(deg $$0, jm $$1, jh $$2, dvj $$3) {
      return die.a($$3.h($$0, $$2), $$1.g()) || die.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dvz.C);
   }

   private static dvj a(dvj $$0, dwa $$1) {
      dvj $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dig.a.m();
   }

   public static dwa b(jm $$0) {
      return i.get($$0);
   }

   private static dvj a(dvk<die, dvj> $$0) {
      dvj $$1 = $$0.b();

      for (dwa $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fah r(dvj $$0) {
      fah $$1 = fae.a();

      for (jm $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = fae.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? fae.b() : $$1;
   }

   protected static boolean q(dvj $$0) {
      for (jm $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dvj $$0) {
      for (jm $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dne c();
}
