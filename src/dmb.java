import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dmb {
   dls[] d_ = new dls[]{dls.T, dls.U, dls.V, dls.W, dls.X, dls.Y, dls.Z, dls.aa, dls.ab, dls.ac, dls.ad, dls.ae, dls.af, dls.ag, dls.ah};
   ToIntFunction<dls> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dls.P, 1);
      $$0.put(dls.Q, 1);
      $$0.put(dls.x, 1);
      $$0.put(dls.J, 2);
      $$0.put(dls.A, 2);
      $$0.put(dls.O, 2);
      $$0.put(dls.C, 3);
      $$0.put(dls.K, 3);
      $$0.put(dls.B, 3);
      $$0.put(dls.u, 4);
      $$0.put(dls.n, 4);
      $$0.put(dls.S, 4);
      $$0.put(dls.q, 5);
      $$0.put(dls.v, 5);
      $$0.put(dls.r, 6);
      $$0.put(dls.M, 6);
      $$0.put(dls.s, 6);
      $$0.put(dls.o, 7);
      $$0.put(dls.l, 8);
      $$0.put(dls.m, 8);
      $$0.put(dls.j, 9);
      $$0.put(dls.d, 9);
      $$0.put(dls.e, 9);
      $$0.put(dls.g, 9);
      $$0.put(dls.k, 10);
      $$0.put(dls.h, 10);
      $$0.put(dls.a, 10);
      $$0.put(dls.b, 10);
      $$0.put(dls.I, 10);
      $$0.put(dls.H, 10);
      $$0.put(dls.c, 11);
      $$0.put(dls.f, 12);
      $$0.put(dls.y, 12);
      $$0.put(dls.i, 13);
      $$0.put(dls.z, 13);
      $$0.put(dls.t, 14);
      $$0.put(dls.G, 14);
      $$0.put(dls.R, 14);
      $$0.put(dls.p, 15);
      $$0.put(dls.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dmb.a gh();

   dmb.d gi();

   static int a_(dls $$0) {
      return e_.applyAsInt($$0);
   }

   static dls b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - atm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dmb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dlz.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dma.a.fieldOf("selector").forGetter(dmb.a::a),
                  asu.i.fieldOf("event_delay").orElse(0).forGetter(dmb.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dmb.a((dlz)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dlz c;
      private int d;
      final dma e;
      private boolean f;

      private a(@Nullable dlz $$0, dma $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dma(), 0, false);
      }

      public dma a() {
         return this.e;
      }

      @Nullable
      public dlz b() {
         return this.c;
      }

      public void a(@Nullable dlz $$0) {
         this.c = $$0;
      }

      public int c() {
         return this.d;
      }

      public void a(int $$0) {
         this.d = $$0;
      }

      public void d() {
         this.d = Math.max(0, this.d - 1);
      }

      public boolean e() {
         return this.f;
      }

      public void a(boolean $$0) {
         this.f = $$0;
      }
   }

   public static class b implements dlu {
      private final dmb a;

      public b(dmb $$0) {
         this.a = $$0;
      }

      @Override
      public dlw a() {
         return this.a.gi().b();
      }

      @Override
      public int b() {
         return this.a.gi().a();
      }

      @Override
      public boolean a(ame $$0, dls $$1, dls.a $$2, eju $$3) {
         dmb.a $$4 = this.a.gh();
         dmb.d $$5 = this.a.gi();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eju> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eju $$7 = $$6.get();
               if (!$$5.a($$0, ht.a($$3), $$1, $$2)) {
                  return false;
               } else if (a($$0, $$3, $$7)) {
                  return false;
               } else {
                  this.a($$0, $$4, $$1, $$2, $$3, $$7);
                  return true;
               }
            }
         }
      }

      public void b(ame $$0, dls $$1, dls.a $$2, eju $$3) {
         this.a.gi().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gh(), $$1, $$2, $$3, $$4));
      }

      private void a(ame $$0, dmb.a $$1, dls $$2, dls.a $$3, eju $$4, eju $$5) {
         $$1.e.a(new dlz($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.W());
      }

      public static float a(ht $$0, ht $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(csa $$0, eju $$1, eju $$2) {
         eju $$3 = new eju((double)atm.a($$1.c) + 0.5, (double)atm.a($$1.d) + 0.5, (double)atm.a($$1.e) + 0.5);
         eju $$4 = new eju((double)atm.a($$2.c) + 0.5, (double)atm.a($$2.d) + 0.5, (double)atm.a($$2.e) + 0.5);

         for (hx $$5 : hx.values()) {
            eju $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cri($$6, $$4, $$0x -> $$0x.a(arg.bp))).c() != ejs.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(csa $$0, dmb.a $$1, dmb.d $$2) {
         if ($$0 instanceof ame $$3) {
            if ($$1.c == null) {
               a($$3, $$1, $$2);
            }

            if ($$1.c != null) {
               boolean $$5 = $$1.c() > 0;
               b($$3, $$1, $$2);
               $$1.d();
               if ($$1.c() <= 0) {
                  $$5 = a($$3, $$1, $$2, $$1.c);
               }

               if ($$5) {
                  $$2.e();
               }
            }
         }
      }

      private static void a(ame $$0, dmb.a $$1, dmb.d $$2) {
         $$1.a().a($$0.W()).ifPresent($$3 -> {
            $$1.a($$3);
            eju $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jw($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ame $$0, dmb.a $$1, dmb.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eju $$3 = $$1.c.c();
               dlw $$4 = $$2.b();
               eju $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = atm.d($$8, $$3.c, $$5.c);
               double $$10 = atm.d($$8, $$3.d, $$5.d);
               double $$11 = atm.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jw($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ame $$0, dmb.a $$1, dmb.d $$2, dlz $$3) {
         ht $$4 = ht.a($$3.c());
         ht $$5 = $$2.b().a($$0).map(ht::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dmb.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(csa $$0, ht $$1) {
         crh $$2 = new crh($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(crh.c($$3, $$4)) || $$0.K().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dlw b();

      boolean a(ame var1, ht var2, dls var3, dls.a var4);

      void a(ame var1, ht var2, dls var3, @Nullable bkq var4, @Nullable bkq var5, float var6);

      default arv<dls> c() {
         return arm.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return atm.d($$0);
      }

      default boolean a(dls $$0, dls.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bkq $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.O_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(arm.d)) {
                  if (this.d() && $$2 instanceof amf $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(arg.bq) : true;
         }
      }

      default void e() {
      }
   }
}
