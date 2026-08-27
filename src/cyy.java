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

public abstract class cyy extends cua {
   private static final float a = 1.0F;
   private static final eiy c = cua.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy d = cua.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eiy e = cua.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eiy f = cua.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy g = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eiy h = cua.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hx, dgs> i = czm.h;
   private static final Map<hx, eiy> j = ac.a(Maps.newEnumMap(hx.class), $$0 -> {
      $$0.put(hx.c, g);
      $$0.put(hx.f, f);
      $$0.put(hx.d, h);
      $$0.put(hx.e, e);
      $$0.put(hx.b, c);
      $$0.put(hx.a, d);
   });
   protected static final hx[] b = hx.values();
   private final ImmutableMap<dgb, eiy> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public cyy(dga.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(cyy::o);
      this.l = hx.c.a.a().allMatch(this::a);
      this.m = hx.c.a.a().filter(hx.a.a).filter(this::a).count() % 2L == 0L;
      this.n = hx.c.a.a().filter(hx.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends cyy> a();

   public static Set<hx> h(dgb $$0) {
      if (!($$0.b() instanceof cyy)) {
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
   protected void a(dgc.a<cua, dgb> $$0) {
      for (hx $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!n($$0)) {
         return cuc.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return (eiy)this.k.get($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
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
   public boolean a(dgb $$0, cmr $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cqf $$0, dgb $$1, ht $$2, hx $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         ht $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dgb c(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dgb $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ebf.c)) {
            $$4 = this.o().a(dgr.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      if ($$1 == cyv.c && !this.m) {
         return $$0;
      } else {
         return $$1 == cyv.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dgb a(dgb $$0, Function<hx, hx> $$1) {
      dgb $$2 = $$0;

      for (hx $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dgb $$0, hx $$1) {
      dgs $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cqf $$0, hx $$1, ht $$2, dgb $$3) {
      return cua.a($$3.l($$0, $$2), $$1.g()) || cua.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dgr.C);
   }

   private static dgb a(dgb $$0, dgs $$1) {
      dgb $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cuc.a.o();
   }

   public static dgs b(hx $$0) {
      return i.get($$0);
   }

   private static dgb a(dgc<cua, dgb> $$0) {
      dgb $$1 = $$0.b();

      for (dgs $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static eiy o(dgb $$0) {
      eiy $$1 = eiv.a();

      for (hx $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eiv.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eiv.b() : $$1;
   }

   protected static boolean n(dgb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dgb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract cyz c();
}
