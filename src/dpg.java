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

public abstract class dpg extends dke {
   private static final float a = 1.0F;
   private static final fcm c = dke.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm d = dke.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fcm e = dke.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcm f = dke.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm g = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcm h = dke.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<jm, dye> i = dpu.h;
   private static final Map<jm, fcm> j = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, g);
      $$0.put(jm.f, f);
      $$0.put(jm.d, h);
      $$0.put(jm.e, e);
      $$0.put(jm.b, c);
      $$0.put(jm.a, d);
   });
   protected static final jm[] b = jm.values();
   private final ImmutableMap<dxn, fcm> k;
   private final boolean l;
   private final boolean m;
   private final boolean n;

   public dpg(dxm.d $$0) {
      super($$0);
      this.l(a(this.F));
      this.k = this.a(dpg::r);
      this.l = jm.c.a.a().allMatch(this::a);
      this.m = jm.c.a.a().filter(jm.a.a).filter(this::a).count() % 2L == 0L;
      this.n = jm.c.a.a().filter(jm.a.c).filter(this::a).count() % 2L == 0L;
   }

   @Override
   protected abstract MapCodec<? extends dpg> a();

   public static Set<jm> o(dxn $$0) {
      if (!($$0.b() instanceof dpg)) {
         return Set.of();
      } else {
         Set<jm> $$1 = EnumSet.noneOf(jm.class);

         for (jm $$2 : jm.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jm> a(byte $$0) {
      Set<jm> $$1 = EnumSet.noneOf(jm.class);

      for (jm $$2 : jm.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jm> $$0) {
      byte $$1 = 0;

      for (jm $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jm $$0) {
      return true;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      for (jm $$1 : b) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!q($$0)) {
         return dkg.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return (fcm)this.k.get($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      boolean $$3 = false;

      for (jm $$4 : b) {
         if (a($$0, $$4)) {
            jh $$5 = $$2.a($$4);
            if (!a($$1, $$4, $$5, $$1.a_($$5))) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      return s($$0);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dha $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dgf $$0, dxn $$1, jh $$2, jm $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jh $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public dxn c(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         dxn $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if (this.q() && $$0.y().a(etq.c)) {
            $$4 = this.m().b(dyd.D, Boolean.valueOf(true));
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), Boolean.valueOf(true));
      }
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return !this.l ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      if ($$1 == dpd.c && !this.m) {
         return $$0;
      } else {
         return $$1 == dpd.b && !this.n ? $$0 : this.a($$0, $$1::b);
      }
   }

   private dxn a(dxn $$0, Function<jm, jm> $$1) {
      dxn $$2 = $$0;

      for (jm $$3 : b) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(dxn $$0, jm $$1) {
      dye $$2 = b($$1);
      return $$0.a($$2, Boolean.valueOf(false));
   }

   public static boolean a(dgf $$0, jm $$1, jh $$2, dxn $$3) {
      return dke.a($$3.h($$0, $$2), $$1.g()) || dke.a($$3.g($$0, $$2), $$1.g());
   }

   private boolean q() {
      return this.F.d().contains(dyd.D);
   }

   private static dxn a(dxn $$0, dye $$1) {
      dxn $$2 = $$0.b($$1, Boolean.valueOf(false));
      return q($$2) ? $$2 : dkg.a.m();
   }

   public static dye b(jm $$0) {
      return i.get($$0);
   }

   private static dxn a(dxo<dke, dxn> $$0) {
      dxn $$1 = $$0.b();

      for (dye $$2 : i.values()) {
         $$1 = $$1.c($$2, Boolean.valueOf(false));
      }

      return $$1;
   }

   private static fcm r(dxn $$0) {
      fcm $$1 = fcj.a();

      for (jm $$2 : b) {
         if (a($$0, $$2)) {
            $$1 = fcj.a($$1, j.get($$2));
         }
      }

      return $$1.c() ? fcj.b() : $$1;
   }

   protected static boolean q(dxn $$0) {
      for (jm $$1 : b) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean s(dxn $$0) {
      for (jm $$1 : b) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   public abstract dph c();
}
