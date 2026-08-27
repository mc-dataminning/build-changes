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

public abstract class dez extends daa {
   private static final float a = 1.0F;
   private static final eqk c = daa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk d = daa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eqk e = daa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqk f = daa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk g = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqk h = daa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ih, dnq> i = dfn.h;
   private static final Map<ih, eqk> j = ac.a(Maps.newEnumMap(ih.class), $$0 -> {
      $$0.put(ih.c, g);
      $$0.put(ih.f, f);
      $$0.put(ih.d, h);
      $$0.put(ih.e, e);
      $$0.put(ih.b, c);
      $$0.put(ih.a, d);
   });
   protected static final ih[] b = ih.values();
   private final ImmutableMap<dmz, eqk> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dez(dmy.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dez::o);
      this.l = ih.c.a.a().allMatch(this::a);
      this.m = ih.c.a.a().filter(ih.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ih.c.a.a().filter(ih.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dez> a();

   public static Set<ih> m(dmz $$0) {
      if (!($$0.b() instanceof dez)) {
         return Set.of();
      } else {
         Set<ih> $$1 = EnumSet.noneOf(ih.class);

         for (ih $$2 : ih.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ih> a(byte $$0) {
      Set<ih> $$1 = EnumSet.noneOf(ih.class);

      for (ih $$2 : ih.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ih> $$0) {
      byte $$1 = 0;

      for (ih $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ih $$0) {
      return true;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      for (ih $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!n($$0)) {
         return dac.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return (eqk)this.k.get($$0);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      boolean $$3 = false;

      for (ih $$4 : b) {
         if (a($$0, $$4)) {
            ib $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      cwz $$1 = $$0.q();
      ib $$2 = $$0.a();
      dmz $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cwf $$0, dmz $$1, ib $$2, ih $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ib $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dmz c(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dmz $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.i() && $$0.u().a(eio.c)) {
            $$4 = this.o().a(dnp.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      if ($$1 == dew.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dew.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dmz a(dmz $$0, Function<ih, ih> $$1) {
      dmz $$2 = $$0;

      for (ih $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dmz $$0, ih $$1) {
      dnq $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cwf $$0, ih $$1, ib $$2, dmz $$3) {
      return daa.a($$3.l($$0, $$2), $$1.g()) || daa.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean i() {
      return this.E.d().contains(dnp.C);
   }

   private static dmz a(dmz $$0, dnq $$1) {
      dmz $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dac.a.o();
   }

   public static dnq b(ih $$0) {
      return i.get($$0);
   }

   private static dmz a(dna<daa, dmz> $$0) {
      dmz $$1 = $$0.b();

      for (dnq $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eqk o(dmz $$0) {
      eqk $$1 = eqh.a();

      for (ih $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eqh.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eqh.b() : $$1;
   }

   protected static boolean n(dmz $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dmz $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dfa c();
}
