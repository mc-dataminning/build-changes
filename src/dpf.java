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

public class dpf extends dkd {
   public static final MapCodec<dpf> b = b(dpf::new);
   private static final float a = 1.0F;
   private static final fcl d = dkd.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl e = dkd.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcl f = dkd.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcl g = dkd.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl h = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcl i = dkd.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dyf> j = dpv.h;
   private static final Map<jm, fcl> k = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, h);
      $$0.put(jm.f, g);
      $$0.put(jm.d, i);
      $$0.put(jm.e, f);
      $$0.put(jm.b, d);
      $$0.put(jm.a, e);
   });
   protected static final jm[] c = jm.values();
   private final ImmutableMap<dxo, fcl> l;
   private final boolean m;
   private final boolean n;
   private final boolean o;

   @Override
   protected MapCodec<? extends dpf> a() {
      return b;
   }

   public dpf(dxn.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.l = this.a(dpf::r);
      this.m = jm.c.a.a().allMatch(this::a);
      this.n = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.o = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<jm> o(dxo $$0) {
      if (!($$0.b() instanceof dpf)) {
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      for (jm $$1 : c) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!q($$0)) {
         return dkf.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return (fcl)this.l.get($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      boolean $$3 = false;

      for (jm $$4 : c) {
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
   protected boolean a(dxo $$0, dax $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dgz $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dge $$0, dxo $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dxo c(dxo $$0, dge $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dxo $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(etr.c)) {
            $$4 = this.m().b(dye.J, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return !this.m ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      if ($$1 == dpc.c && !this.n) {
         return $$0;
      } else {
         return $$1 == dpc.b && !this.o ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dxo a(dxo $$0, Function<jm, jm> $$1) {
      dxo $$2 = $$0;

      for (jm $$3 : c) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dxo $$0, jm $$1) {
      dyf $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dge $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      dxo $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dge $$0, jm $$1, jh $$2, dxo $$3) {
      return dkd.a($$3.h($$0, $$2), $$1.g()) || dkd.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dye.J);
   }

   private static dxo a(dxo $$0, dyf $$1) {
      dxo $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dkf.a.m();
   }

   public static dyf b(jm $$0) {
      return j.get($$0);
   }

   private static dxo a(dxp<dkd, dxo> $$0) {
      dxo $$1 = $$0.b();

      for (dyf $$2 : j.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fcl r(dxo $$0) {
      fcl $$1 = fci.a();

      for (jm $$2 : c) {
         if (a($$0, $$2)) {
            $$1 = fci.a($$1, k.get($$2));
         }
      }

      return $$1.c() ? fci.b() : $$1;
   }

   protected static boolean q(dxo $$0) {
      for (jm $$1 : c) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dxo $$0) {
      for (jm $$1 : c) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
