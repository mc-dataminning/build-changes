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

public abstract class day extends cvz {
   private static final float a = 1.0F;
   private static final elu c = cvz.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu d = cvz.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final elu e = cvz.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final elu f = cvz.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu g = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final elu h = cvz.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ia, djg> i = dbm.h;
   private static final Map<ia, elu> j = ac.a(Maps.newEnumMap(ia.class), $$0 -> {
      $$0.put(ia.c, g);
      $$0.put(ia.f, f);
      $$0.put(ia.d, h);
      $$0.put(ia.e, e);
      $$0.put(ia.b, c);
      $$0.put(ia.a, d);
   });
   protected static final ia[] b = ia.values();
   private final ImmutableMap<dip, elu> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public day(dio.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(day::o);
      this.l = ia.c.a.a().allMatch(this::a);
      this.m = ia.c.a.a().filter(ia.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ia.c.a.a().filter(ia.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends day> a();

   public static Set<ia> h(dip $$0) {
      if (!($$0.b() instanceof day)) {
         return Set.of();
      } else {
         Set<ia> $$1 = EnumSet.noneOf(ia.class);

         for (ia $$2 : ia.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ia> a(byte $$0) {
      Set<ia> $$1 = EnumSet.noneOf(ia.class);

      for (ia $$2 : ia.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ia> $$0) {
      byte $$1 = 0;

      for (ia $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ia $$0) {
      return true;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      for (ia $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!n($$0)) {
         return cwb.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return (elu)this.k.get($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      boolean $$3 = false;

      for (ia $$4 : b) {
         if (a($$0, $$4)) {
            hv $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(cse $$0, dip $$1, hv $$2, ia $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         hv $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dip c(dip $$0, cse $$1, hv $$2, ia $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dip $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(eea.c)) {
            $$4 = this.o().a(djf.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      if ($$1 == dav.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dav.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dip a(dip $$0, Function<ia, ia> $$1) {
      dip $$2 = $$0;

      for (ia $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dip $$0, ia $$1) {
      djg $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(cse $$0, ia $$1, hv $$2, dip $$3) {
      return cvz.a($$3.l($$0, $$2), $$1.g()) || cvz.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(djf.C);
   }

   private static dip a(dip $$0, djg $$1) {
      dip $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cwb.a.o();
   }

   public static djg b(ia $$0) {
      return i.get($$0);
   }

   private static dip a(diq<cvz, dip> $$0) {
      dip $$1 = $$0.b();

      for (djg $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static elu o(dip $$0) {
      elu $$1 = elr.a();

      for (ia $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = elr.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? elr.b() : $$1;
   }

   protected static boolean n(dip $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(dip $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract daz c();
}
