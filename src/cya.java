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

public abstract class cya extends ctc {
   private static final float a = 1.0F;
   private static final eia c = ctc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia d = ctc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eia e = ctc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eia f = ctc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia g = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eia h = ctc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ha, dfu> i = cyo.h;
   private static final Map<ha, eia> j = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, g);
      $$0.put(ha.f, f);
      $$0.put(ha.d, h);
      $$0.put(ha.e, e);
      $$0.put(ha.b, c);
      $$0.put(ha.a, d);
   });
   protected static final ha[] b = ha.values();
   private final ImmutableMap<dfd, eia> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cya(dfc.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(cya::o);
      this.l = ha.c.a.a().allMatch(this::a);
      this.m = ha.c.a.a().filter(ha.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ha.c.a.a().filter(ha.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends cya> a();

   public static Set<ha> h(dfd $$0) {
      if (!($$0.b() instanceof cya)) {
         return Set.of();
      } else {
         Set<ha> $$1 = EnumSet.noneOf(ha.class);

         for (ha $$2 : ha.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ha> a(byte $$0) {
      Set<ha> $$1 = EnumSet.noneOf(ha.class);

      for (ha $$2 : ha.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ha> $$0) {
      byte $$1 = 0;

      for (ha $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ha $$0) {
      return true;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      for (ha $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!n($$0)) {
         return cte.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return (eia)this.k.get($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      boolean $$3 = false;

      for (ha $$4 : b) {
         if (a($$0, $$4)) {
            gw $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cph $$0, dfd $$1, gw $$2, ha $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         gw $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dfd c(dfd $$0, cph $$1, gw $$2, ha $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dfd $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(eah.c)) {
            $$4 = this.o().a(dft.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      if ($$1 == cxx.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cxx.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dfd a(dfd $$0, Function<ha, ha> $$1) {
      dfd $$2 = $$0;

      for (ha $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dfd $$0, ha $$1) {
      dfu $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cph $$0, ha $$1, gw $$2, dfd $$3) {
      return ctc.a($$3.l($$0, $$2), $$1.g()) || ctc.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dft.C);
   }

   private static dfd a(dfd $$0, dfu $$1) {
      dfd $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cte.a.o();
   }

   public static dfu b(ha $$0) {
      return i.get($$0);
   }

   private static dfd a(dfe<ctc, dfd> $$0) {
      dfd $$1 = $$0.b();

      for (dfu $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eia o(dfd $$0) {
      eia $$1 = ehx.a();

      for (ha $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ehx.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ehx.b() : $$1;
   }

   protected static boolean n(dfd $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dfd $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cyb c();
}
