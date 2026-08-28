import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsu extends dno implements duz {
   public static final MapCodec<dsu> b = b(dsu::new);
   public static final ech c = ecg.I;
   private static final Map<jc, ech> a = dti.h;
   protected static final jc[] d = jc.values();
   private final Function<ebq, fgw> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dsu> a() {
      return b;
   }

   public dsu(ebp.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jc.c.a.a().allMatch(this::a);
      this.g = jc.c.a.a().filter(jc.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jc.c.a.a().filter(jc.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<ebq, fgw> q() {
      Map<jc, fgw> $$0 = fgt.d(dno.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgw $$2 = fgt.a();

         for (jc $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fgt.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fgt.b() : $$2;
      }, new ect[]{c});
   }

   public static Set<jc> o(ebq $$0) {
      if (!($$0.b() instanceof dsu)) {
         return Set.of();
      } else {
         Set<jc> $$1 = EnumSet.noneOf(jc.class);

         for (jc $$2 : jc.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jc> a(byte $$0) {
      Set<jc> $$1 = EnumSet.noneOf(jc.class);

      for (jc $$2 : jc.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jc> $$0) {
      byte $$1 = 0;

      for (jc $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jc $$0) {
      return true;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      for (jc $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      if (!q($$0)) {
         return dnq.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      boolean $$3 = false;

      for (jc $$4 : d) {
         if (a($$0, $$4)) {
            if (!a($$1, $$2, $$4)) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(djn $$0, ebq $$1, iw $$2, jc $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         iw $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public ebq c(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         ebq $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(eyb.c)) {
            $$4 = this.m().b(ecg.I, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      if ($$1 == dsr.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dsr.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private ebq a(ebq $$0, Function<jc, jc> $$1) {
      ebq $$2 = $$0;

      for (jc $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(ebq $$0, jc $$1) {
      ech $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(djn $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      ebq $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(djn $$0, jc $$1, iw $$2, ebq $$3) {
      return dno.a($$3.h($$0, $$2), $$1.g()) || dno.a($$3.g($$0, $$2), $$1.g());
   }

   private static ebq a(ebq $$0, ech $$1) {
      ebq $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dnq.a.m();
   }

   public static ech b(jc $$0) {
      return a.get($$0);
   }

   private static ebq a(ebr<dno, ebq> $$0) {
      ebq $$1 = $$0.b().b(c, Boolean.valueOf(false));

      for (ech $$2 : a.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   protected static boolean q(ebq $$0) {
      for (jc $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(ebq $$0) {
      for (jc $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
