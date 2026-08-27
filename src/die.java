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

public abstract class die extends dde {
   private static final float a = 1.0F;
   private static final eui c = dde.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui d = dde.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eui e = dde.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eui f = dde.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui g = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eui h = dde.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<is, dqy> i = dis.h;
   private static final Map<is, eui> j = ac.a(Maps.newEnumMap(is.class), $$0 -> {
      $$0.put(is.c, g);
      $$0.put(is.f, f);
      $$0.put(is.d, h);
      $$0.put(is.e, e);
      $$0.put(is.b, c);
      $$0.put(is.a, d);
   });
   protected static final is[] b = is.values();
   private final ImmutableMap<dqh, eui> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public die(dqg.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(die::o);
      this.l = is.c.a.a().allMatch(this::a);
      this.m = is.c.a.a().filter(is.a.a).filter(this::a).count() % 2L == 0L;
      this.n = is.c.a.a().filter(is.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends die> a();

   public static Set<is> m(dqh $$0) {
      if (!($$0.b() instanceof die)) {
         return Set.of();
      } else {
         Set<is> $$1 = EnumSet.noneOf(is.class);

         for (is $$2 : is.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<is> a(byte $$0) {
      Set<is> $$1 = EnumSet.noneOf(is.class);

      for (is $$2 : is.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<is> $$0) {
      byte $$1 = 0;

      for (is $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(is $$0) {
      return true;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      for (is $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!n($$0)) {
         return ddg.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return (eui)this.k.get($$0);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      boolean $$3 = false;

      for (is $$4 : b) {
         if (a($$0, $$4)) {
            in $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(czj $$0, dqh $$1, in $$2, is $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         in $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dqh c(dqh $$0, czj $$1, in $$2, is $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dqh $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.k() && $$0.u().a(emb.c)) {
            $$4 = this.n().a(dqx.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      if ($$1 == dib.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dib.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dqh a(dqh $$0, Function<is, is> $$1) {
      dqh $$2 = $$0;

      for (is $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dqh $$0, is $$1) {
      dqy $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(czj $$0, is $$1, in $$2, dqh $$3) {
      return dde.a($$3.l($$0, $$2), $$1.g()) || dde.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean k() {
      return this.E.d().contains(dqx.C);
   }

   private static dqh a(dqh $$0, dqy $$1) {
      dqh $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : ddg.a.n();
   }

   public static dqy b(is $$0) {
      return i.get($$0);
   }

   private static dqh a(dqi<dde, dqh> $$0) {
      dqh $$1 = $$0.b();

      for (dqy $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eui o(dqh $$0) {
      eui $$1 = euf.a();

      for (is $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = euf.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? euf.b() : $$1;
   }

   protected static boolean n(dqh $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dqh $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dif c();
}
