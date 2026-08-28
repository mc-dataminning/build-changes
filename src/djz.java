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

public abstract class djz extends dez {
   private static final float a = 1.0F;
   private static final ewk c = dez.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk d = dez.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewk e = dez.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewk f = dez.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk g = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewk h = dez.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, dst> i = dkn.h;
   private static final Map<je, ewk> j = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, g);
      $$0.put(je.f, f);
      $$0.put(je.d, h);
      $$0.put(je.e, e);
      $$0.put(je.b, c);
      $$0.put(je.a, d);
   });
   protected static final je[] b = je.values();
   private final ImmutableMap<dsc, ewk> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public djz(dsb.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(djz::o);
      this.l = je.c.a.a().allMatch(this::a);
      this.m = je.c.a.a().filter(je.a.a).filter(this::a).count() % 2L == 0L;
      this.n = je.c.a.a().filter(je.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends djz> a();

   public static Set<je> m(dsc $$0) {
      if (!($$0.b() instanceof djz)) {
         return Set.of();
      } else {
         Set<je> $$1 = EnumSet.noneOf(je.class);

         for (je $$2 : je.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<je> a(byte $$0) {
      Set<je> $$1 = EnumSet.noneOf(je.class);

      for (je $$2 : je.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<je> $$0) {
      byte $$1 = 0;

      for (je $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(je $$0) {
      return true;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      for (je $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!n($$0)) {
         return dfb.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return (ewk)this.k.get($$0);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      boolean $$3 = false;

      for (je $$4 : b) {
         if (a($$0, $$4)) {
            iz $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dby $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsc $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dbe $$0, dsc $$1, iz $$2, je $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iz $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dsc c(dsc $$0, dbe $$1, iz $$2, je $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dsc $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(enw.c)) {
            $$4 = this.o().a(dss.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      if ($$1 == djw.c && !this.m) {
         return $$0;
      } else {
         return $$1 == djw.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dsc a(dsc $$0, Function<je, je> $$1) {
      dsc $$2 = $$0;

      for (je $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dsc $$0, je $$1) {
      dst $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dbe $$0, je $$1, iz $$2, dsc $$3) {
      return dez.a($$3.l($$0, $$2), $$1.g()) || dez.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(dss.C);
   }

   private static dsc a(dsc $$0, dst $$1) {
      dsc $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfb.a.o();
   }

   public static dst b(je $$0) {
      return i.get($$0);
   }

   private static dsc a(dsd<dez, dsc> $$0) {
      dsc $$1 = $$0.b();

      for (dst $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ewk o(dsc $$0) {
      ewk $$1 = ewh.a();

      for (je $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ewh.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ewh.b() : $$1;
   }

   protected static boolean n(dsc $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dsc $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dka c();
}
