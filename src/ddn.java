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

public abstract class ddn extends cyo {
   private static final float a = 1.0F;
   private static final eol c = cyo.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol d = cyo.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eol e = cyo.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eol f = cyo.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol g = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eol h = cyo.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ie, dlw> i = deb.h;
   private static final Map<ie, eol> j = ac.a(Maps.newEnumMap(ie.class), $$0 -> {
      $$0.put(ie.c, g);
      $$0.put(ie.f, f);
      $$0.put(ie.d, h);
      $$0.put(ie.e, e);
      $$0.put(ie.b, c);
      $$0.put(ie.a, d);
   });
   protected static final ie[] b = ie.values();
   private final ImmutableMap<dlf, eol> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public ddn(dle.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(ddn::o);
      this.l = ie.c.a.a().allMatch(this::a);
      this.m = ie.c.a.a().filter(ie.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ie.c.a.a().filter(ie.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends ddn> a();

   public static Set<ie> m(dlf $$0) {
      if (!($$0.b() instanceof ddn)) {
         return Set.of();
      } else {
         Set<ie> $$1 = EnumSet.noneOf(ie.class);

         for (ie $$2 : ie.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ie> a(byte $$0) {
      Set<ie> $$1 = EnumSet.noneOf(ie.class);

      for (ie $$2 : ie.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ie> $$0) {
      byte $$1 = 0;

      for (ie $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ie $$0) {
      return true;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      for (ie $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!n($$0)) {
         return cyq.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return (eol)this.k.get($$0);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      boolean $$3 = false;

      for (ie $$4 : b) {
         if (a($$0, $$4)) {
            hz $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cut $$0, dlf $$1, hz $$2, ie $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         hz $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dlf c(dlf $$0, cut $$1, hz $$2, ie $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dlf $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(egq.c)) {
            $$4 = this.o().a(dlv.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      if ($$1 == ddk.c && !this.m) {
         return $$0;
      } else {
         return $$1 == ddk.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dlf a(dlf $$0, Function<ie, ie> $$1) {
      dlf $$2 = $$0;

      for (ie $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dlf $$0, ie $$1) {
      dlw $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cut $$0, ie $$1, hz $$2, dlf $$3) {
      return cyo.a($$3.l($$0, $$2), $$1.g()) || cyo.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dlv.C);
   }

   private static dlf a(dlf $$0, dlw $$1) {
      dlf $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cyq.a.o();
   }

   public static dlw b(ie $$0) {
      return i.get($$0);
   }

   private static dlf a(dlg<cyo, dlf> $$0) {
      dlf $$1 = $$0.b();

      for (dlw $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eol o(dlf $$0) {
      eol $$1 = eoi.a();

      for (ie $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eoi.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eoi.b() : $$1;
   }

   protected static boolean n(dlf $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dlf $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract ddo c();
}
