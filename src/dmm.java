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

public abstract class dmm extends dhm {
   private static final float a = 1.0F;
   private static final ezq c = dhm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq d = dhm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ezq e = dhm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezq f = dhm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq g = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezq h = dhm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jk, dvj> i = dna.h;
   private static final Map<jk, ezq> j = ad.a(Maps.newEnumMap(jk.class), $$0 -> {
      $$0.put(jk.c, g);
      $$0.put(jk.f, f);
      $$0.put(jk.d, h);
      $$0.put(jk.e, e);
      $$0.put(jk.b, c);
      $$0.put(jk.a, d);
   });
   protected static final jk[] b = jk.values();
   private final ImmutableMap<dus, ezq> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dmm(dur.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dmm::r);
      this.l = jk.c.a.a().allMatch(this::a);
      this.m = jk.c.a.a().filter(jk.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jk.c.a.a().filter(jk.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dmm> a();

   public static Set<jk> o(dus $$0) {
      if (!($$0.b() instanceof dmm)) {
         return Set.of();
      } else {
         Set<jk> $$1 = EnumSet.noneOf(jk.class);

         for (jk $$2 : jk.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jk> a(byte $$0) {
      Set<jk> $$1 = EnumSet.noneOf(jk.class);

      for (jk $$2 : jk.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jk> $$0) {
      byte $$1 = 0;

      for (jk $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jk $$0) {
      return true;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      for (jk $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!q($$0)) {
         return dho.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return (ezq)this.k.get($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      boolean $$3 = false;

      for (jk $$4 : b) {
         if (a($$0, $$4)) {
            jf $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(ddo $$0, dus $$1, jf $$2, jk $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jf $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dus c(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dus $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.l() && $$0.y().a(equ.c)) {
            $$4 = this.n().b(dvi.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      if ($$1 == dmj.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dmj.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dus a(dus $$0, Function<jk, jk> $$1) {
      dus $$2 = $$0;

      for (jk $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dus $$0, jk $$1) {
      dvj $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(ddo $$0, jk $$1, jf $$2, dus $$3) {
      return dhm.a($$3.h($$0, $$2), $$1.g()) || dhm.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean l() {
      return this.F.d().contains(dvi.C);
   }

   private static dus a(dus $$0, dvj $$1) {
      dus $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dho.a.n();
   }

   public static dvj b(jk $$0) {
      return i.get($$0);
   }

   private static dus a(dut<dhm, dus> $$0) {
      dus $$1 = $$0.b();

      for (dvj $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static ezq r(dus $$0) {
      ezq $$1 = ezn.a();

      for (jk $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ezn.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ezn.b() : $$1;
   }

   protected static boolean q(dus $$0) {
      for (jk $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dus $$0) {
      for (jk $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dmn c();
}
