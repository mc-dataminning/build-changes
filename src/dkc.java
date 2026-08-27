import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dkc {
   djt[] d_ = new djt[]{djt.T, djt.U, djt.V, djt.W, djt.X, djt.Y, djt.Z, djt.aa, djt.ab, djt.ac, djt.ad, djt.ae, djt.af, djt.ag, djt.ah};
   ToIntFunction<djt> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djt.P, 1);
      $$0.put(djt.Q, 1);
      $$0.put(djt.x, 1);
      $$0.put(djt.J, 2);
      $$0.put(djt.A, 2);
      $$0.put(djt.O, 2);
      $$0.put(djt.C, 3);
      $$0.put(djt.K, 3);
      $$0.put(djt.B, 3);
      $$0.put(djt.u, 4);
      $$0.put(djt.n, 4);
      $$0.put(djt.S, 4);
      $$0.put(djt.q, 5);
      $$0.put(djt.v, 5);
      $$0.put(djt.r, 6);
      $$0.put(djt.M, 6);
      $$0.put(djt.s, 6);
      $$0.put(djt.o, 7);
      $$0.put(djt.l, 8);
      $$0.put(djt.m, 8);
      $$0.put(djt.j, 9);
      $$0.put(djt.d, 9);
      $$0.put(djt.e, 9);
      $$0.put(djt.g, 9);
      $$0.put(djt.k, 10);
      $$0.put(djt.h, 10);
      $$0.put(djt.a, 10);
      $$0.put(djt.b, 10);
      $$0.put(djt.I, 10);
      $$0.put(djt.H, 10);
      $$0.put(djt.c, 11);
      $$0.put(djt.f, 12);
      $$0.put(djt.y, 12);
      $$0.put(djt.i, 13);
      $$0.put(djt.z, 13);
      $$0.put(djt.t, 14);
      $$0.put(djt.G, 14);
      $$0.put(djt.R, 14);
      $$0.put(djt.p, 15);
      $$0.put(djt.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dkc.a gf();

   dkc.d gg();

   static int a_(djt $$0) {
      return e_.applyAsInt($$0);
   }

   static djt b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - arx.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dkc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dka.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dkb.a.fieldOf("selector").forGetter(dkc.a::a),
                  arg.i.fieldOf("event_delay").orElse(0).forGetter(dkc.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dkc.a((dka)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dka c;
      private int d;
      final dkb e;
      private boolean f;

      private a(@Nullable dka $$0, dkb $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dkb(), 0, false);
      }

      public dkb a() {
         return this.e;
      }

      @Nullable
      public dka b() {
         return this.c;
      }

      public void a(@Nullable dka $$0) {
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

   public static class b implements djv {
      private final dkc a;

      public b(dkc $$0) {
         this.a = $$0;
      }

      @Override
      public djx a() {
         return this.a.gg().b();
      }

      @Override
      public int b() {
         return this.a.gg().a();
      }

      @Override
      public boolean a(akr $$0, djt $$1, djt.a $$2, ehn $$3) {
         dkc.a $$4 = this.a.gf();
         dkc.d $$5 = this.a.gg();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehn> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehn $$7 = $$6.get();
               if (!$$5.a($$0, gw.a($$3), $$1, $$2)) {
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

      public void b(akr $$0, djt $$1, djt.a $$2, ehn $$3) {
         this.a.gg().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gf(), $$1, $$2, $$3, $$4));
      }

      private void a(akr $$0, dkc.a $$1, djt $$2, djt.a $$3, ehn $$4, ehn $$5) {
         $$1.e.a(new dka($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gw $$0, gw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpv $$0, ehn $$1, ehn $$2) {
         ehn $$3 = new ehn((double)arx.a($$1.c) + 0.5, (double)arx.a($$1.d) + 0.5, (double)arx.a($$1.e) + 0.5);
         ehn $$4 = new ehn((double)arx.a($$2.c) + 0.5, (double)arx.a($$2.d) + 0.5, (double)arx.a($$2.e) + 0.5);

         for (hc $$5 : hc.values()) {
            ehn $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cpd($$6, $$4, $$0x -> $$0x.a(apt.bp))).c() != ehl.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpv $$0, dkc.a $$1, dkc.d $$2) {
         if ($$0 instanceof akr $$3) {
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

      private static void a(akr $$0, dkc.a $$1, dkc.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehn $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(akr $$0, dkc.a $$1, dkc.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehn $$3 = $$1.c.c();
               djx $$4 = $$2.b();
               ehn $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = arx.d($$8, $$3.c, $$5.c);
               double $$10 = arx.d($$8, $$3.d, $$5.d);
               double $$11 = arx.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(akr $$0, dkc.a $$1, dkc.d $$2, dka $$3) {
         gw $$4 = gw.a($$3.c());
         gw $$5 = $$2.b().a($$0).map(gw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dkc.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpv $$0, gw $$1) {
         cpc $$2 = new cpc($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cpc.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djx b();

      boolean a(akr var1, gw var2, djt var3, djt.a var4);

      void a(akr var1, gw var2, djt var3, @Nullable biq var4, @Nullable biq var5, float var6);

      default aqi<djt> c() {
         return apz.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return arx.d($$0);
      }

      default boolean a(djt $$0, djt.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            biq $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.M_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(apz.d)) {
                  if (this.d() && $$2 instanceof aks $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aW()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apt.bq) : true;
         }
      }

      default void e() {
      }
   }
}
