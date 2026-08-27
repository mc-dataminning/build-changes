import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djr {
   dji[] d_ = new dji[]{dji.S, dji.T, dji.U, dji.V, dji.W, dji.X, dji.Y, dji.Z, dji.aa, dji.ab, dji.ac, dji.ad, dji.ae, dji.af, dji.ag};
   ToIntFunction<dji> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dji.P, 1);
      $$0.put(dji.Q, 1);
      $$0.put(dji.x, 1);
      $$0.put(dji.J, 2);
      $$0.put(dji.A, 2);
      $$0.put(dji.O, 2);
      $$0.put(dji.C, 3);
      $$0.put(dji.K, 3);
      $$0.put(dji.B, 3);
      $$0.put(dji.u, 4);
      $$0.put(dji.n, 4);
      $$0.put(dji.q, 5);
      $$0.put(dji.v, 5);
      $$0.put(dji.r, 6);
      $$0.put(dji.M, 6);
      $$0.put(dji.s, 6);
      $$0.put(dji.o, 7);
      $$0.put(dji.l, 8);
      $$0.put(dji.m, 8);
      $$0.put(dji.j, 9);
      $$0.put(dji.d, 9);
      $$0.put(dji.e, 9);
      $$0.put(dji.g, 9);
      $$0.put(dji.k, 10);
      $$0.put(dji.h, 10);
      $$0.put(dji.a, 10);
      $$0.put(dji.b, 10);
      $$0.put(dji.I, 10);
      $$0.put(dji.H, 10);
      $$0.put(dji.c, 11);
      $$0.put(dji.f, 12);
      $$0.put(dji.y, 12);
      $$0.put(dji.i, 13);
      $$0.put(dji.z, 13);
      $$0.put(dji.t, 14);
      $$0.put(dji.G, 14);
      $$0.put(dji.R, 14);
      $$0.put(dji.p, 15);
      $$0.put(dji.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   djr.a gb();

   djr.d gc();

   static int a_(dji $$0) {
      return e_.applyAsInt($$0);
   }

   static dji b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aro.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<djr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djp.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  djq.a.fieldOf("selector").forGetter(djr.a::a),
                  aqw.i.fieldOf("event_delay").orElse(0).forGetter(djr.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new djr.a((djp)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      djp c;
      private int d;
      final djq e;
      private boolean f;

      private a(@Nullable djp $$0, djq $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new djq(), 0, false);
      }

      public djq a() {
         return this.e;
      }

      @Nullable
      public djp b() {
         return this.c;
      }

      public void a(@Nullable djp $$0) {
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

   public static class b implements djk {
      private final djr a;

      public b(djr $$0) {
         this.a = $$0;
      }

      @Override
      public djm a() {
         return this.a.gc().b();
      }

      @Override
      public int b() {
         return this.a.gc().a();
      }

      @Override
      public boolean a(aki $$0, dji $$1, dji.a $$2, ehf $$3) {
         djr.a $$4 = this.a.gb();
         djr.d $$5 = this.a.gc();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehf> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehf $$7 = $$6.get();
               if (!$$5.a($$0, gv.a($$3), $$1, $$2)) {
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

      public void b(aki $$0, dji $$1, dji.a $$2, ehf $$3) {
         this.a.gc().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gb(), $$1, $$2, $$3, $$4));
      }

      private void a(aki $$0, djr.a $$1, dji $$2, dji.a $$3, ehf $$4, ehf $$5) {
         $$1.e.a(new djp($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gv $$0, gv $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpk $$0, ehf $$1, ehf $$2) {
         ehf $$3 = new ehf((double)aro.a($$1.c) + 0.5, (double)aro.a($$1.d) + 0.5, (double)aro.a($$1.e) + 0.5);
         ehf $$4 = new ehf((double)aro.a($$2.c) + 0.5, (double)aro.a($$2.d) + 0.5, (double)aro.a($$2.e) + 0.5);

         for (hb $$5 : hb.values()) {
            ehf $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cos($$6, $$4, $$0x -> $$0x.a(apj.bp))).c() != ehd.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpk $$0, djr.a $$1, djr.d $$2) {
         if ($$0 instanceof aki $$3) {
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

      private static void a(aki $$0, djr.a $$1, djr.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehf $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ja($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aki $$0, djr.a $$1, djr.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehf $$3 = $$1.c.c();
               djm $$4 = $$2.b();
               ehf $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aro.d($$8, $$3.c, $$5.c);
               double $$10 = aro.d($$8, $$3.d, $$5.d);
               double $$11 = aro.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ja($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aki $$0, djr.a $$1, djr.d $$2, djp $$3) {
         gv $$4 = gv.a($$3.c());
         gv $$5 = $$2.b().a($$0).map(gv::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), djr.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpk $$0, gv $$1) {
         cor $$2 = new cor($$1);

         for (int $$3 = $$2.e - 1; $$3 < $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 < $$2.f + 1; $$4++) {
               dgu $$5 = $$0.J().a($$3, $$4);
               if ($$5 == null || !$$0.a($$5.f().a())) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djm b();

      boolean a(aki var1, gv var2, dji var3, dji.a var4);

      void a(aki var1, gv var2, dji var3, @Nullable big var4, @Nullable big var5, float var6);

      default apy<dji> c() {
         return app.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aro.d($$0);
      }

      default boolean a(dji $$0, dji.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            big $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.G_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(app.d)) {
                  if (this.d() && $$2 instanceof akj $$3) {
                     ai.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apj.bq) : true;
         }
      }

      default void e() {
      }
   }
}
