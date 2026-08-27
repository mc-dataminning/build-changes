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

public abstract class dbp extends cwq {
   private static final float a = 1.0F;
   private static final emm c = cwq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm d = cwq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final emm e = cwq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emm f = cwq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm g = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emm h = cwq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, djy> i = dcd.h;
   private static final Map<ic, emm> j = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, g);
      $$0.put(ic.f, f);
      $$0.put(ic.d, h);
      $$0.put(ic.e, e);
      $$0.put(ic.b, c);
      $$0.put(ic.a, d);
   });
   protected static final ic[] b = ic.values();
   private final ImmutableMap<djh, emm> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dbp(djg.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dbp::o);
      this.l = ic.c.a.a().allMatch(this::a);
      this.m = ic.c.a.a().filter(ic.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ic.c.a.a().filter(ic.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dbp> a();

   public static Set<ic> h(djh $$0) {
      if (!($$0.b() instanceof dbp)) {
         return Set.of();
      } else {
         Set<ic> $$1 = EnumSet.noneOf(ic.class);

         for (ic $$2 : ic.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<ic> a(byte $$0) {
      Set<ic> $$1 = EnumSet.noneOf(ic.class);

      for (ic $$2 : ic.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<ic> $$0) {
      byte $$1 = 0;

      for (ic $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(ic $$0) {
      return true;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      for (ic $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!n($$0)) {
         return cws.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return (emm)this.k.get($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      boolean $$3 = false;

      for (ic $$4 : b) {
         if (a($$0, $$4)) {
            hx $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(csv $$0, djh $$1, hx $$2, ic $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         hx $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public djh c(djh $$0, csv $$1, hx $$2, ic $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         djh $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(ees.c)) {
            $$4 = this.o().a(djx.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      if ($$1 == dbm.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dbm.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private djh a(djh $$0, Function<ic, ic> $$1) {
      djh $$2 = $$0;

      for (ic $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(djh $$0, ic $$1) {
      djy $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(csv $$0, ic $$1, hx $$2, djh $$3) {
      return cwq.a($$3.l($$0, $$2), $$1.g()) || cwq.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(djx.C);
   }

   private static djh a(djh $$0, djy $$1) {
      djh $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cws.a.o();
   }

   public static djy b(ic $$0) {
      return i.get($$0);
   }

   private static djh a(dji<cwq, djh> $$0) {
      djh $$1 = $$0.b();

      for (djy $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static emm o(djh $$0) {
      emm $$1 = emj.a();

      for (ic $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = emj.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? emj.b() : $$1;
   }

   protected static boolean n(djh $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(djh $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dbq c();
}
