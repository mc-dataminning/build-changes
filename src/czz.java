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

public abstract class czz extends cva {
   private static final float a = 1.0F;
   private static final ekn c = cva.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn d = cva.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ekn e = cva.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekn f = cva.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn g = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekn h = cva.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, dhz> i = dan.h;
   private static final Map<hx, ekn> j = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, g);
      $$0.put(hx.f, f);
      $$0.put(hx.d, h);
      $$0.put(hx.e, e);
      $$0.put(hx.b, c);
      $$0.put(hx.a, d);
   });
   protected static final hx[] b = hx.values();
   private final ImmutableMap<dhi, ekn> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public czz(dhh.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(czz::o);
      this.l = hx.c.a.a().allMatch(this::a);
      this.m = hx.c.a.a().filter(hx.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hx.c.a.a().filter(hx.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends czz> a();

   public static Set<hx> h(dhi $$0) {
      if (!($$0.b() instanceof czz)) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      for (hx $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!n($$0)) {
         return cvc.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return (ekn)this.k.get($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
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
   public boolean a(dhi $$0, cnr $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(crg $$0, dhi $$1, ht $$2, hx $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ht $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dhi c(dhi $$0, crg $$1, ht $$2, hx $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dhi $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ect.c)) {
            $$4 = this.o().a(dhy.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      if ($$1 == czw.c && !this.m) {
         return $$0;
      } else {
         return $$1 == czw.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dhi a(dhi $$0, Function<hx, hx> $$1) {
      dhi $$2 = $$0;

      for (hx $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dhi $$0, hx $$1) {
      dhz $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(crg $$0, hx $$1, ht $$2, dhi $$3) {
      return cva.a($$3.l($$0, $$2), $$1.g()) || cva.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dhy.C);
   }

   private static dhi a(dhi $$0, dhz $$1) {
      dhi $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cvc.a.o();
   }

   public static dhz b(hx $$0) {
      return i.get($$0);
   }

   private static dhi a(dhj<cva, dhi> $$0) {
      dhi $$1 = $$0.b();

      for (dhz $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static ekn o(dhi $$0) {
      ekn $$1 = ekk.a();

      for (hx $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ekk.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ekk.b() : $$1;
   }

   protected static boolean n(dhi $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dhi $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract daa c();
}
