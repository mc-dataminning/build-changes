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

public class don extends djl implements dqr {
   public static final MapCodec<don> b = b(don::new);
   public static final dxn c = dxm.J;
   private static final float a = 1.0F;
   private static final fbt e = djl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt f = djl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbt g = djl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbt h = djl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt i = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbt j = djl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, dxn> k = dpd.h;
   private static final Map<jn, fbt> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, i);
      $$0.put(jn.f, h);
      $$0.put(jn.d, j);
      $$0.put(jn.e, g);
      $$0.put(jn.b, e);
      $$0.put(jn.a, f);
   });
   protected static final jn[] d = jn.values();
   private final ImmutableMap<dww, fbt> m;
   private final boolean n;
   private final boolean o;
   private final boolean G;

   @Override
   protected MapCodec<? extends don> a() {
      return b;
   }

   public don(dwv.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.m = this.a(don::r);
      this.n = jn.c.a.a().allMatch(this::a);
      this.o = jn.c.a.a().filter(jn.a.a).filter(this::a).count() % 2L == 0L;
      this.G = jn.c.a.a().filter(jn.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<jn> o(dww $$0) {
      if (!($$0.b() instanceof don)) {
         return Set.of();
      } else {
         Set<jn> $$1 = EnumSet.noneOf(jn.class);

         for (jn $$2 : jn.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jn> a(byte $$0) {
      Set<jn> $$1 = EnumSet.noneOf(jn.class);

      for (jn $$2 : jn.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jn> $$0) {
      byte $$1 = 0;

      for (jn $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jn $$0) {
      return true;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      for (jn $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      if (!q($$0)) {
         return this.b_($$0).g();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return (fbt)this.m.get($$0);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      boolean $$3 = false;

      for (jn $$4 : d) {
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
   protected boolean a(dww $$0, daf $$1) {
      return !$$1.n().a(this.j()) || s($$0);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dfm $$0, dww $$1, ji $$2, jn $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ji $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dww c(dww $$0, dfm $$1, ji $$2, jn $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dww $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(esz.c)) {
            $$4 = this.m().b(dxm.J, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return !this.n ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      if ($$1 == dok.c && !this.o) {
         return $$0;
      } else {
         return $$1 == dok.b && !this.G ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dww a(dww $$0, Function<jn, jn> $$1) {
      dww $$2 = $$0;

      for (jn $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dww $$0, jn $$1) {
      dxn $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dfm $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dww $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dfm $$0, jn $$1, ji $$2, dww $$3) {
      return djl.a($$3.h($$0, $$2), $$1.g()) || djl.a($$3.g($$0, $$2), $$1.g());
   }

   private static dww a(dww $$0, dxn $$1) {
      dww $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : $$0.y().g();
   }

   public static dxn b(jn $$0) {
      return k.get($$0);
   }

   private static dww a(dwx<djl, dww> $$0) {
      dww $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (dxn $$2 : k.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fbt r(dww $$0) {
      fbt $$1 = fbq.a();

      for (jn $$2 : d) {
         if (a($$0, $$2)) {
            $$1 = fbq.a($$1, l.get($$2));
         }
      }

      return $$1.c() ? fbq.b() : $$1;
   }

   protected static boolean q(dww $$0) {
      for (jn $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dww $$0) {
      for (jn $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
