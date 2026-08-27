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

public abstract class diy extends ddy {
   private static final float a = 1.0F;
   private static final evd c = ddy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd d = ddy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final evd e = ddy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evd f = ddy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd g = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evd h = ddy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<it, drs> i = djm.h;
   private static final Map<it, evd> j = ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, g);
      $$0.put(it.f, f);
      $$0.put(it.d, h);
      $$0.put(it.e, e);
      $$0.put(it.b, c);
      $$0.put(it.a, d);
   });
   protected static final it[] b = it.values();
   private final ImmutableMap<drb, evd> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public diy(dra.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(diy::o);
      this.l = it.c.a.a().allMatch(this::a);
      this.m = it.c.a.a().filter(it.a.a).filter(this::a).count() % 2L == 0L;
      this.n = it.c.a.a().filter(it.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends diy> a();

   public static Set<it> m(drb $$0) {
      if (!($$0.b() instanceof diy)) {
         return Set.of();
      } else {
         Set<it> $$1 = EnumSet.noneOf(it.class);

         for (it $$2 : it.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<it> a(byte $$0) {
      Set<it> $$1 = EnumSet.noneOf(it.class);

      for (it $$2 : it.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<it> $$0) {
      byte $$1 = 0;

      for (it $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(it $$0) {
      return true;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      for (it $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if (!n($$0)) {
         return dea.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return (evd)this.k.get($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      boolean $$3 = false;

      for (it $$4 : b) {
         if (a($$0, $$4)) {
            io $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dad $$0, drb $$1, io $$2, it $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         io $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public drb c(drb $$0, dad $$1, io $$2, it $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         drb $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.l() && $$0.u().a(emv.c)) {
            $$4 = this.n().a(drr.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      if ($$1 == div.c && !this.m) {
         return $$0;
      } else {
         return $$1 == div.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private drb a(drb $$0, Function<it, it> $$1) {
      drb $$2 = $$0;

      for (it $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(drb $$0, it $$1) {
      drs $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(dad $$0, it $$1, io $$2, drb $$3) {
      return ddy.a($$3.l($$0, $$2), $$1.g()) || ddy.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean l() {
      return this.E.d().contains(drr.C);
   }

   private static drb a(drb $$0, drs $$1) {
      drb $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dea.a.n();
   }

   public static drs b(it $$0) {
      return i.get($$0);
   }

   private static drb a(drc<ddy, drb> $$0) {
      drb $$1 = $$0.b();

      for (drs $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static evd o(drb $$0) {
      evd $$1 = eva.a();

      for (it $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = eva.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? eva.b() : $$1;
   }

   protected static boolean n(drb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(drb $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract diz c();
}
