import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djx {
   djo[] d_ = new djo[]{djo.T, djo.U, djo.V, djo.W, djo.X, djo.Y, djo.Z, djo.aa, djo.ab, djo.ac, djo.ad, djo.ae, djo.af, djo.ag, djo.ah};
   ToIntFunction<djo> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djo.P, 1);
      $$0.put(djo.Q, 1);
      $$0.put(djo.x, 1);
      $$0.put(djo.J, 2);
      $$0.put(djo.A, 2);
      $$0.put(djo.O, 2);
      $$0.put(djo.C, 3);
      $$0.put(djo.K, 3);
      $$0.put(djo.B, 3);
      $$0.put(djo.u, 4);
      $$0.put(djo.n, 4);
      $$0.put(djo.S, 4);
      $$0.put(djo.q, 5);
      $$0.put(djo.v, 5);
      $$0.put(djo.r, 6);
      $$0.put(djo.M, 6);
      $$0.put(djo.s, 6);
      $$0.put(djo.o, 7);
      $$0.put(djo.l, 8);
      $$0.put(djo.m, 8);
      $$0.put(djo.j, 9);
      $$0.put(djo.d, 9);
      $$0.put(djo.e, 9);
      $$0.put(djo.g, 9);
      $$0.put(djo.k, 10);
      $$0.put(djo.h, 10);
      $$0.put(djo.a, 10);
      $$0.put(djo.b, 10);
      $$0.put(djo.I, 10);
      $$0.put(djo.H, 10);
      $$0.put(djo.c, 11);
      $$0.put(djo.f, 12);
      $$0.put(djo.y, 12);
      $$0.put(djo.i, 13);
      $$0.put(djo.z, 13);
      $$0.put(djo.t, 14);
      $$0.put(djo.G, 14);
      $$0.put(djo.R, 14);
      $$0.put(djo.p, 15);
      $$0.put(djo.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   djx.a gc();

   djx.d gd();

   static int a_(djo $$0) {
      return e_.applyAsInt($$0);
   }

   static djo b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ars.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<djx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djv.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  djw.a.fieldOf("selector").forGetter(djx.a::a),
                  arb.i.fieldOf("event_delay").orElse(0).forGetter(djx.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new djx.a((djv)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      djv c;
      private int d;
      final djw e;
      private boolean f;

      private a(@Nullable djv $$0, djw $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new djw(), 0, false);
      }

      public djw a() {
         return this.e;
      }

      @Nullable
      public djv b() {
         return this.c;
      }

      public void a(@Nullable djv $$0) {
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

   public static class b implements djq {
      private final djx a;

      public b(djx $$0) {
         this.a = $$0;
      }

      @Override
      public djs a() {
         return this.a.gd().b();
      }

      @Override
      public int b() {
         return this.a.gd().a();
      }

      @Override
      public boolean a(akn $$0, djo $$1, djo.a $$2, ehi $$3) {
         djx.a $$4 = this.a.gc();
         djx.d $$5 = this.a.gd();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehi> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehi $$7 = $$6.get();
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

      public void b(akn $$0, djo $$1, djo.a $$2, ehi $$3) {
         this.a.gd().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gc(), $$1, $$2, $$3, $$4));
      }

      private void a(akn $$0, djx.a $$1, djo $$2, djo.a $$3, ehi $$4, ehi $$5) {
         $$1.e.a(new djv($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gw $$0, gw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpq $$0, ehi $$1, ehi $$2) {
         ehi $$3 = new ehi((double)ars.a($$1.c) + 0.5, (double)ars.a($$1.d) + 0.5, (double)ars.a($$1.e) + 0.5);
         ehi $$4 = new ehi((double)ars.a($$2.c) + 0.5, (double)ars.a($$2.d) + 0.5, (double)ars.a($$2.e) + 0.5);

         for (hc $$5 : hc.values()) {
            ehi $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new coy($$6, $$4, $$0x -> $$0x.a(apo.bp))).c() != ehg.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpq $$0, djx.a $$1, djx.d $$2) {
         if ($$0 instanceof akn $$3) {
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

      private static void a(akn $$0, djx.a $$1, djx.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehi $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(akn $$0, djx.a $$1, djx.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehi $$3 = $$1.c.c();
               djs $$4 = $$2.b();
               ehi $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ars.d($$8, $$3.c, $$5.c);
               double $$10 = ars.d($$8, $$3.d, $$5.d);
               double $$11 = ars.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(akn $$0, djx.a $$1, djx.d $$2, djv $$3) {
         gw $$4 = gw.a($$3.c());
         gw $$5 = $$2.b().a($$0).map(gw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), djx.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpq $$0, gw $$1) {
         cox $$2 = new cox($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cox.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djs b();

      boolean a(akn var1, gw var2, djo var3, djo.a var4);

      void a(akn var1, gw var2, djo var3, @Nullable bil var4, @Nullable bil var5, float var6);

      default aqd<djo> c() {
         return apu.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ars.d($$0);
      }

      default boolean a(djo $$0, djo.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bil $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.G_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(apu.d)) {
                  if (this.d() && $$2 instanceof ako $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apo.bq) : true;
         }
      }

      default void e() {
      }
   }
}
