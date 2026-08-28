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

public abstract class dkb extends dfb {
   private static final float a = 1.0F;
   private static final ewm c = dfb.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm d = dfb.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ewm e = dfb.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewm f = dfb.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm g = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewm h = dfb.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<je, dsv> i = dkp.h;
   private static final Map<je, ewm> j = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.c, g);
      $$0.put(je.f, f);
      $$0.put(je.d, h);
      $$0.put(je.e, e);
      $$0.put(je.b, c);
      $$0.put(je.a, d);
   });
   protected static final je[] b = je.values();
   private final ImmutableMap<dse, ewm> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dkb(dsd.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dkb::o);
      this.l = je.c.a.a().allMatch(this::a);
      this.m = je.c.a.a().filter(je.a.a).filter(this::a).count() % 2L == 0L;
      this.n = je.c.a.a().filter(je.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dkb> a();

   public static Set<je> m(dse $$0) {
      if (!($$0.b() instanceof dkb)) {
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
   protected void a(dsf.a<dfb, dse> $$0) {
      for (je $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if (!n($$0)) {
         return dfd.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return (ewm)this.k.get($$0);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
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
   protected boolean a(dse $$0, cyc $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dbg $$0, dse $$1, iz $$2, je $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iz $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dse c(dse $$0, dbg $$1, iz $$2, je $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dse $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(eny.c)) {
            $$4 = this.o().a(dsu.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      if ($$1 == djy.c && !this.m) {
         return $$0;
      } else {
         return $$1 == djy.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dse a(dse $$0, Function<je, je> $$1) {
      dse $$2 = $$0;

      for (je $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dse $$0, je $$1) {
      dsv $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dbg $$0, je $$1, iz $$2, dse $$3) {
      return dfb.a($$3.l($$0, $$2), $$1.g()) || dfb.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(dsu.C);
   }

   private static dse a(dse $$0, dsv $$1) {
      dse $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dfd.a.o();
   }

   public static dsv b(je $$0) {
      return i.get($$0);
   }

   private static dse a(dsf<dfb, dse> $$0) {
      dse $$1 = $$0.b();

      for (dsv $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ewm o(dse $$0) {
      ewm $$1 = ewj.a();

      for (je $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ewj.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ewj.b() : $$1;
   }

   protected static boolean n(dse $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dse $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dkc c();
}
