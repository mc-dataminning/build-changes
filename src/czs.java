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

public abstract class czs extends cut {
   private static final float a = 1.0F;
   private static final ekb c = cut.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb d = cut.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ekb e = cut.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekb f = cut.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb g = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekb h = cut.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, dhn> i = dag.h;
   private static final Map<hx, ekb> j = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, g);
      $$0.put(hx.f, f);
      $$0.put(hx.d, h);
      $$0.put(hx.e, e);
      $$0.put(hx.b, c);
      $$0.put(hx.a, d);
   });
   protected static final hx[] b = hx.values();
   private final ImmutableMap<dgw, ekb> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public czs(dgv.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(czs::o);
      this.l = hx.c.a.a().allMatch(this::a);
      this.m = hx.c.a.a().filter(hx.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hx.c.a.a().filter(hx.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends czs> a();

   public static Set<hx> h(dgw $$0) {
      if (!($$0.b() instanceof czs)) {
         return Set.of();
      } else {
         Set<hx> $$1 = EnumSet.noneOf(hx.class);

         for (hx $$2 : hx.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<hx> a(byte $$0) {
      Set<hx> $$1 = EnumSet.noneOf(hx.class);

      for (hx $$2 : hx.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<hx> $$0) {
      byte $$1 = 0;

      for (hx $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(hx $$0) {
      return true;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      for (hx $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!n($$0)) {
         return cuv.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return (ekb)this.k.get($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      boolean $$3 = false;

      for (hx $$4 : b) {
         if (a($$0, $$4)) {
            ht $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cqy $$0, dgw $$1, ht $$2, hx $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ht $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dgw c(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dgw $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ech.c)) {
            $$4 = this.o().a(dhm.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      if ($$1 == czp.c && !this.m) {
         return $$0;
      } else {
         return $$1 == czp.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dgw a(dgw $$0, Function<hx, hx> $$1) {
      dgw $$2 = $$0;

      for (hx $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dgw $$0, hx $$1) {
      dhn $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cqy $$0, hx $$1, ht $$2, dgw $$3) {
      return cut.a($$3.l($$0, $$2), $$1.g()) || cut.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dhm.C);
   }

   private static dgw a(dgw $$0, dhn $$1) {
      dgw $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cuv.a.o();
   }

   public static dhn b(hx $$0) {
      return i.get($$0);
   }

   private static dgw a(dgx<cut, dgw> $$0) {
      dgw $$1 = $$0.b();

      for (dhn $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ekb o(dgw $$0) {
      ekb $$1 = ejy.a();

      for (hx $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ejy.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ejy.b() : $$1;
   }

   protected static boolean n(dgw $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dgw $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract czt c();
}
