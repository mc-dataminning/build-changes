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

public class doo extends djm implements dqs {
   public static final MapCodec<doo> b = b(doo::new);
   public static final dxo c = dxn.J;
   private static final float a = 1.0F;
   private static final fbu e = djm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu f = djm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbu g = djm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbu h = djm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu i = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbu j = djm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jn, dxo> k = dpe.h;
   private static final Map<jn, fbu> l = af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, i);
      $$0.put(jn.f, h);
      $$0.put(jn.d, j);
      $$0.put(jn.e, g);
      $$0.put(jn.b, e);
      $$0.put(jn.a, f);
   });
   protected static final jn[] d = jn.values();
   private final ImmutableMap<dwx, fbu> m;
   private final boolean n;
   private final boolean o;
   private final boolean G;

   @Override
   protected MapCodec<? extends doo> a() {
      return b;
   }

   public doo(dww.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.m = this.a(doo::r);
      this.n = jn.c.a.a().allMatch(this::a);
      this.o = jn.c.a.a().filter(jn.a.a).filter(this::a).count() % 2L == 0L;
      this.G = jn.c.a.a().filter(jn.a.c).filter(this::a).count() % 2L == 0L;
   }

   public static Set<jn> o(dwx $$0) {
      if (!($$0.b() instanceof doo)) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      for (jn $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      if (!q($$0)) {
         return this.b_($$0).g();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(c) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return (fbu)this.m.get($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
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
   protected boolean a(dwx $$0, dag $$1) {
      return !$$1.n().a(this.j()) || s($$0);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwx $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dfn $$0, dwx $$1, ji $$2, jn $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ji $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dwx c(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dwx $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(eta.c)) {
            $$4 = this.m().b(dxn.J, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return !this.n ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      if ($$1 == dol.c && !this.o) {
         return $$0;
      } else {
         return $$1 == dol.b && !this.G ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dwx a(dwx $$0, Function<jn, jn> $$1) {
      dwx $$2 = $$0;

      for (jn $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dwx $$0, jn $$1) {
      dxo $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dfn $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      dwx $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dfn $$0, jn $$1, ji $$2, dwx $$3) {
      return djm.a($$3.h($$0, $$2), $$1.g()) || djm.a($$3.g($$0, $$2), $$1.g());
   }

   private static dwx a(dwx $$0, dxo $$1) {
      dwx $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : $$0.y().g();
   }

   public static dxo b(jn $$0) {
      return k.get($$0);
   }

   private static dwx a(dwy<djm, dwx> $$0) {
      dwx $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (dxo $$2 : k.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fbu r(dwx $$0) {
      fbu $$1 = fbr.a();

      for (jn $$2 : d) {
         if (a($$0, $$2)) {
            $$1 = fbr.a($$1, l.get($$2));
         }
      }

      return $$1.c() ? fbr.b() : $$1;
   }

   protected static boolean q(dwx $$0) {
      for (jn $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dwx $$0) {
      for (jn $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
