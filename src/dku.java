import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dku {
   dkl[] d_ = new dkl[]{dkl.T, dkl.U, dkl.V, dkl.W, dkl.X, dkl.Y, dkl.Z, dkl.aa, dkl.ab, dkl.ac, dkl.ad, dkl.ae, dkl.af, dkl.ag, dkl.ah};
   ToIntFunction<dkl> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dkl.P, 1);
      $$0.put(dkl.Q, 1);
      $$0.put(dkl.x, 1);
      $$0.put(dkl.J, 2);
      $$0.put(dkl.A, 2);
      $$0.put(dkl.O, 2);
      $$0.put(dkl.C, 3);
      $$0.put(dkl.K, 3);
      $$0.put(dkl.B, 3);
      $$0.put(dkl.u, 4);
      $$0.put(dkl.n, 4);
      $$0.put(dkl.S, 4);
      $$0.put(dkl.q, 5);
      $$0.put(dkl.v, 5);
      $$0.put(dkl.r, 6);
      $$0.put(dkl.M, 6);
      $$0.put(dkl.s, 6);
      $$0.put(dkl.o, 7);
      $$0.put(dkl.l, 8);
      $$0.put(dkl.m, 8);
      $$0.put(dkl.j, 9);
      $$0.put(dkl.d, 9);
      $$0.put(dkl.e, 9);
      $$0.put(dkl.g, 9);
      $$0.put(dkl.k, 10);
      $$0.put(dkl.h, 10);
      $$0.put(dkl.a, 10);
      $$0.put(dkl.b, 10);
      $$0.put(dkl.I, 10);
      $$0.put(dkl.H, 10);
      $$0.put(dkl.c, 11);
      $$0.put(dkl.f, 12);
      $$0.put(dkl.y, 12);
      $$0.put(dkl.i, 13);
      $$0.put(dkl.z, 13);
      $$0.put(dkl.t, 14);
      $$0.put(dkl.G, 14);
      $$0.put(dkl.R, 14);
      $$0.put(dkl.p, 15);
      $$0.put(dkl.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dku.a gg();

   dku.d gh();

   static int a_(dkl $$0) {
      return e_.applyAsInt($$0);
   }

   static dkl b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - asy.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dku.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dks.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dkt.a.fieldOf("selector").forGetter(dku.a::a),
                  asg.i.fieldOf("event_delay").orElse(0).forGetter(dku.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dku.a((dks)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dks c;
      private int d;
      final dkt e;
      private boolean f;

      private a(@Nullable dks $$0, dkt $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dkt(), 0, false);
      }

      public dkt a() {
         return this.e;
      }

      @Nullable
      public dks b() {
         return this.c;
      }

      public void a(@Nullable dks $$0) {
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

   public static class b implements dkn {
      private final dku a;

      public b(dku $$0) {
         this.a = $$0;
      }

      @Override
      public dkp a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(alq $$0, dkl $$1, dkl.a $$2, eif $$3) {
         dku.a $$4 = this.a.gg();
         dku.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eif> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eif $$7 = $$6.get();
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

      public void b(alq $$0, dkl $$1, dkl.a $$2, eif $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(alq $$0, dku.a $$1, dkl $$2, dkl.a $$3, eif $$4, eif $$5) {
         $$1.e.a(new dks($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(ht $$0, ht $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cqz $$0, eif $$1, eif $$2) {
         eif $$3 = new eif((double)asy.a($$1.c) + 0.5, (double)asy.a($$1.d) + 0.5, (double)asy.a($$1.e) + 0.5);
         eif $$4 = new eif((double)asy.a($$2.c) + 0.5, (double)asy.a($$2.d) + 0.5, (double)asy.a($$2.e) + 0.5);

         for (hx $$5 : hx.values()) {
            eif $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cqh($$6, $$4, $$0x -> $$0x.a(aqs.bp))).c() != eid.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cqz $$0, dku.a $$1, dku.d $$2) {
         if ($$0 instanceof alq $$3) {
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

      private static void a(alq $$0, dku.a $$1, dku.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            eif $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jw($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(alq $$0, dku.a $$1, dku.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eif $$3 = $$1.c.c();
               dkp $$4 = $$2.b();
               eif $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = asy.d($$8, $$3.c, $$5.c);
               double $$10 = asy.d($$8, $$3.d, $$5.d);
               double $$11 = asy.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jw($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(alq $$0, dku.a $$1, dku.d $$2, dks $$3) {
         ht $$4 = ht.a($$3.c());
         ht $$5 = $$2.b().a($$0).map(ht::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dku.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cqz $$0, ht $$1) {
         cqg $$2 = new cqg($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cqg.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dkp b();

      boolean a(alq var1, ht var2, dkl var3, dkl.a var4);

      void a(alq var1, ht var2, dkl var3, @Nullable bjt var4, @Nullable bjt var5, float var6);

      default arh<dkl> c() {
         return aqy.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return asy.d($$0);
      }

      default boolean a(dkl $$0, dkl.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bjt $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(aqy.d)) {
                  if (this.d() && $$2 instanceof alr $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(aqs.bq) : true;
         }
      }

      default void e() {
      }
   }
}
