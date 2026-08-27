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

public abstract class dja extends dea {
   private static final float a = 1.0F;
   private static final evf c = dea.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf d = dea.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final evf e = dea.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evf f = dea.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf g = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evf h = dea.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<it, dru> i = djo.h;
   private static final Map<it, evf> j = ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, g);
      $$0.put(it.f, f);
      $$0.put(it.d, h);
      $$0.put(it.e, e);
      $$0.put(it.b, c);
      $$0.put(it.a, d);
   });
   protected static final it[] b = it.values();
   private final ImmutableMap<drd, evf> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dja(drc.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dja::o);
      this.l = it.c.a.a().allMatch(this::a);
      this.m = it.c.a.a().filter(it.a.a).filter(this::a).count() % 2L == 0L;
      this.n = it.c.a.a().filter(it.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   public static Set<it> m(drd $$0) {
      if (!($$0.b() instanceof dja)) {
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
   protected void a(dre.a<dea, drd> $$0) {
      for (it $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!n($$0)) {
         return dec.a.n();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return (evf)this.k.get($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
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
   protected boolean a(drd $$0, cxb $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(daf $$0, drd $$1, io $$2, it $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         io $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public drd c(drd $$0, daf $$1, io $$2, it $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         drd $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.m() && $$0.u().a(emx.c)) {
            $$4 = this.n().a(drt.C, Boolean.valueOf(true));
         } else {
            $$4 = this.n();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      if ($$1 == dix.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dix.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private drd a(drd $$0, Function<it, it> $$1) {
      drd $$2 = $$0;

      for (it $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(drd $$0, it $$1) {
      dru $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(daf $$0, it $$1, io $$2, drd $$3) {
      return dea.a($$3.l($$0, $$2), $$1.g()) || dea.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean m() {
      return this.E.d().contains(drt.C);
   }

   private static drd a(drd $$0, dru $$1) {
      drd $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : dec.a.n();
   }

   public static dru b(it $$0) {
      return i.get($$0);
   }

   private static drd a(dre<dea, drd> $$0) {
      drd $$1 = $$0.b();

      for (dru $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static evf o(drd $$0) {
      evf $$1 = evc.a();

      for (it $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = evc.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? evc.b() : $$1;
   }

   protected static boolean n(drd $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(drd $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract djb c();
}
