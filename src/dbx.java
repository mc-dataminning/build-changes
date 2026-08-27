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

public abstract class dbx extends cwy {
   private static final float a = 1.0F;
   private static final emv c = cwy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv d = cwy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final emv e = cwy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emv f = cwy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv g = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emv h = cwy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ic, dkg> i = dcl.h;
   private static final Map<ic, emv> j = ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, g);
      $$0.put(ic.f, f);
      $$0.put(ic.d, h);
      $$0.put(ic.e, e);
      $$0.put(ic.b, c);
      $$0.put(ic.a, d);
   });
   protected static final ic[] b = ic.values();
   private final ImmutableMap<djp, emv> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dbx(djo.d $$0) {
      super($$0);
      this.k(a(this.E));
      this.k = this.a(dbx::o);
      this.l = ic.c.a.a().allMatch(this::a);
      this.m = ic.c.a.a().filter(ic.a.a).filter(this::a).count() % 2L == 0L;
      this.n = ic.c.a.a().filter(ic.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dbx> a();

   public static Set<ic> h(djp $$0) {
      if (!($$0.b() instanceof dbx)) {
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
   protected void a(djq.a<cwy, djp> $$0) {
      for (ic $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!n($$0)) {
         return cxa.a.o();
      } else {
         return a($$0, $$1) && !a($$3, $$1, $$5, $$2) ? a($$0, b($$1)) : $$0;
      }
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return (emv)this.k.get($$0);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
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
   public boolean a(djp $$0, cpp $$1) {
      return p($$0);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      ctx $$1 = $$0.q();
      hx $$2 = $$0.a();
      djp $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(ctd $$0, djp $$1, hx $$2, ic $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         hx $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public djp c(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         djp $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.g() && $$0.u().a(efa.c)) {
            $$4 = this.o().a(dkf.C, Boolean.valueOf(true));
         } else {
            $$4 = this.o();
         }

         return $$4.a(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      if ($$1 == dbu.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dbu.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private djp a(djp $$0, Function<ic, ic> $$1) {
      djp $$2 = $$0;

      for (ic $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.a(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(djp $$0, ic $$1) {
      dkg $$2 = b($$1);
      return $$0.b($$2) && $$0.c($$2);
   }

   public static boolean a(ctd $$0, ic $$1, hx $$2, djp $$3) {
      return cwy.a($$3.l($$0, $$2), $$1.g()) || cwy.a($$3.k($$0, $$2), $$1.g());
   }

   private boolean g() {
      return this.E.d().contains(dkf.C);
   }

   private static djp a(djp $$0, dkg $$1) {
      djp $$2 = $$0.a($$1, Boolean.valueOf(false));
      return n($$2) ? $$2 : cxa.a.o();
   }

   public static dkg b(ic $$0) {
      return i.get($$0);
   }

   private static djp a(djq<cwy, djp> $$0) {
      djp $$1 = $$0.b();

      for (dkg $$2 : i.values()) {
         if ($$1.b($$2)) {
            $$1 = $$1.a($$2, Boolean.valueOf(false));
         }
      }

      return $$1;
   }

   private static emv o(djp $$0) {
      emv $$1 = ems.a();

      for (ic $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = ems.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? ems.b() : $$1;
   }

   protected static boolean n(djp $$0) {
      return Arrays.stream(b).anyMatch($$1 -> a($$0, $$1));
   }

   private static boolean p(djp $$0) {
      return Arrays.stream(b).anyMatch($$1 -> !a($$0, $$1));
   }

   public abstract dby c();
}
