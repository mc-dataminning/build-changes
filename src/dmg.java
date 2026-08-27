import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dmg {
   dlx[] d_ = new dlx[]{dlx.T, dlx.U, dlx.V, dlx.W, dlx.X, dlx.Y, dlx.Z, dlx.aa, dlx.ab, dlx.ac, dlx.ad, dlx.ae, dlx.af, dlx.ag, dlx.ah};
   ToIntFunction<dlx> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dlx.P, 1);
      $$0.put(dlx.Q, 1);
      $$0.put(dlx.x, 1);
      $$0.put(dlx.J, 2);
      $$0.put(dlx.A, 2);
      $$0.put(dlx.O, 2);
      $$0.put(dlx.C, 3);
      $$0.put(dlx.K, 3);
      $$0.put(dlx.B, 3);
      $$0.put(dlx.u, 4);
      $$0.put(dlx.n, 4);
      $$0.put(dlx.S, 4);
      $$0.put(dlx.q, 5);
      $$0.put(dlx.v, 5);
      $$0.put(dlx.r, 6);
      $$0.put(dlx.M, 6);
      $$0.put(dlx.s, 6);
      $$0.put(dlx.o, 7);
      $$0.put(dlx.l, 8);
      $$0.put(dlx.m, 8);
      $$0.put(dlx.j, 9);
      $$0.put(dlx.d, 9);
      $$0.put(dlx.e, 9);
      $$0.put(dlx.g, 9);
      $$0.put(dlx.k, 10);
      $$0.put(dlx.h, 10);
      $$0.put(dlx.a, 10);
      $$0.put(dlx.b, 10);
      $$0.put(dlx.I, 10);
      $$0.put(dlx.H, 10);
      $$0.put(dlx.c, 11);
      $$0.put(dlx.f, 12);
      $$0.put(dlx.y, 12);
      $$0.put(dlx.i, 13);
      $$0.put(dlx.z, 13);
      $$0.put(dlx.t, 14);
      $$0.put(dlx.G, 14);
      $$0.put(dlx.R, 14);
      $$0.put(dlx.p, 15);
      $$0.put(dlx.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dmg.a gh();

   dmg.d gi();

   static int a_(dlx $$0) {
      return e_.applyAsInt($$0);
   }

   static dlx b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - atq.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dmg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dme.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dmf.a.fieldOf("selector").forGetter(dmg.a::a),
                  asy.i.fieldOf("event_delay").orElse(0).forGetter(dmg.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dmg.a((dme)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dme c;
      private int d;
      final dmf e;
      private boolean f;

      private a(@Nullable dme $$0, dmf $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dmf(), 0, false);
      }

      public dmf a() {
         return this.e;
      }

      @Nullable
      public dme b() {
         return this.c;
      }

      public void a(@Nullable dme $$0) {
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

   public static class b implements dlz {
      private final dmg a;

      public b(dmg $$0) {
         this.a = $$0;
      }

      @Override
      public dmb a() {
         return this.a.gi().b();
      }

      @Override
      public int b() {
         return this.a.gi().a();
      }

      @Override
      public boolean a(ami $$0, dlx $$1, dlx.a $$2, ejz $$3) {
         dmg.a $$4 = this.a.gh();
         dmg.d $$5 = this.a.gi();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ejz> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ejz $$7 = $$6.get();
               if (!$$5.a($$0, hx.a($$3), $$1, $$2)) {
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

      public void b(ami $$0, dlx $$1, dlx.a $$2, ejz $$3) {
         this.a.gi().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gh(), $$1, $$2, $$3, $$4));
      }

      private void a(ami $$0, dmg.a $$1, dlx $$2, dlx.a $$3, ejz $$4, ejz $$5) {
         $$1.e.a(new dme($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.W());
      }

      public static float a(hx $$0, hx $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(csf $$0, ejz $$1, ejz $$2) {
         ejz $$3 = new ejz((double)atq.a($$1.c) + 0.5, (double)atq.a($$1.d) + 0.5, (double)atq.a($$1.e) + 0.5);
         ejz $$4 = new ejz((double)atq.a($$2.c) + 0.5, (double)atq.a($$2.d) + 0.5, (double)atq.a($$2.e) + 0.5);

         for (ib $$5 : ib.values()) {
            ejz $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new crn($$6, $$4, $$0x -> $$0x.a(ark.bp))).c() != ejx.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(csf $$0, dmg.a $$1, dmg.d $$2) {
         if ($$0 instanceof ami $$3) {
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

      private static void a(ami $$0, dmg.a $$1, dmg.d $$2) {
         $$1.a().a($$0.W()).ifPresent($$3 -> {
            $$1.a($$3);
            ejz $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ka($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ami $$0, dmg.a $$1, dmg.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ejz $$3 = $$1.c.c();
               dmb $$4 = $$2.b();
               ejz $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = atq.d($$8, $$3.c, $$5.c);
               double $$10 = atq.d($$8, $$3.d, $$5.d);
               double $$11 = atq.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ka($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ami $$0, dmg.a $$1, dmg.d $$2, dme $$3) {
         hx $$4 = hx.a($$3.c());
         hx $$5 = $$2.b().a($$0).map(hx::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dmg.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(csf $$0, hx $$1) {
         crm $$2 = new crm($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(crm.c($$3, $$4)) || $$0.K().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dmb b();

      boolean a(ami var1, hx var2, dlx var3, dlx.a var4);

      void a(ami var1, hx var2, dlx var3, @Nullable bkv var4, @Nullable bkv var5, float var6);

      default arz<dlx> c() {
         return arq.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return atq.d($$0);
      }

      default boolean a(dlx $$0, dlx.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bkv $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(arq.d)) {
                  if (this.d() && $$2 instanceof amj $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(ark.bq) : true;
         }
      }

      default void e() {
      }
   }
}
