import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dlp {
   dlg[] d_ = new dlg[]{dlg.T, dlg.U, dlg.V, dlg.W, dlg.X, dlg.Y, dlg.Z, dlg.aa, dlg.ab, dlg.ac, dlg.ad, dlg.ae, dlg.af, dlg.ag, dlg.ah};
   ToIntFunction<dlg> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dlg.P, 1);
      $$0.put(dlg.Q, 1);
      $$0.put(dlg.x, 1);
      $$0.put(dlg.J, 2);
      $$0.put(dlg.A, 2);
      $$0.put(dlg.O, 2);
      $$0.put(dlg.C, 3);
      $$0.put(dlg.K, 3);
      $$0.put(dlg.B, 3);
      $$0.put(dlg.u, 4);
      $$0.put(dlg.n, 4);
      $$0.put(dlg.S, 4);
      $$0.put(dlg.q, 5);
      $$0.put(dlg.v, 5);
      $$0.put(dlg.r, 6);
      $$0.put(dlg.M, 6);
      $$0.put(dlg.s, 6);
      $$0.put(dlg.o, 7);
      $$0.put(dlg.l, 8);
      $$0.put(dlg.m, 8);
      $$0.put(dlg.j, 9);
      $$0.put(dlg.d, 9);
      $$0.put(dlg.e, 9);
      $$0.put(dlg.g, 9);
      $$0.put(dlg.k, 10);
      $$0.put(dlg.h, 10);
      $$0.put(dlg.a, 10);
      $$0.put(dlg.b, 10);
      $$0.put(dlg.I, 10);
      $$0.put(dlg.H, 10);
      $$0.put(dlg.c, 11);
      $$0.put(dlg.f, 12);
      $$0.put(dlg.y, 12);
      $$0.put(dlg.i, 13);
      $$0.put(dlg.z, 13);
      $$0.put(dlg.t, 14);
      $$0.put(dlg.G, 14);
      $$0.put(dlg.R, 14);
      $$0.put(dlg.p, 15);
      $$0.put(dlg.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dlp.a gg();

   dlp.d gh();

   static int a_(dlg $$0) {
      return e_.applyAsInt($$0);
   }

   static dlg b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ati.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dlp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dln.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dlo.a.fieldOf("selector").forGetter(dlp.a::a),
                  asq.i.fieldOf("event_delay").orElse(0).forGetter(dlp.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dlp.a((dln)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dln c;
      private int d;
      final dlo e;
      private boolean f;

      private a(@Nullable dln $$0, dlo $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dlo(), 0, false);
      }

      public dlo a() {
         return this.e;
      }

      @Nullable
      public dln b() {
         return this.c;
      }

      public void a(@Nullable dln $$0) {
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

   public static class b implements dli {
      private final dlp a;

      public b(dlp $$0) {
         this.a = $$0;
      }

      @Override
      public dlk a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(ama $$0, dlg $$1, dlg.a $$2, eji $$3) {
         dlp.a $$4 = this.a.gg();
         dlp.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eji> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eji $$7 = $$6.get();
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

      public void b(ama $$0, dlg $$1, dlg.a $$2, eji $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(ama $$0, dlp.a $$1, dlg $$2, dlg.a $$3, eji $$4, eji $$5) {
         $$1.e.a(new dln($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(ht $$0, ht $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(crs $$0, eji $$1, eji $$2) {
         eji $$3 = new eji((double)ati.a($$1.c) + 0.5, (double)ati.a($$1.d) + 0.5, (double)ati.a($$1.e) + 0.5);
         eji $$4 = new eji((double)ati.a($$2.c) + 0.5, (double)ati.a($$2.d) + 0.5, (double)ati.a($$2.e) + 0.5);

         for (hx $$5 : hx.values()) {
            eji $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cra($$6, $$4, $$0x -> $$0x.a(arc.bp))).c() != ejg.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(crs $$0, dlp.a $$1, dlp.d $$2) {
         if ($$0 instanceof ama $$3) {
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

      private static void a(ama $$0, dlp.a $$1, dlp.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            eji $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jw($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ama $$0, dlp.a $$1, dlp.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eji $$3 = $$1.c.c();
               dlk $$4 = $$2.b();
               eji $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ati.d($$8, $$3.c, $$5.c);
               double $$10 = ati.d($$8, $$3.d, $$5.d);
               double $$11 = ati.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jw($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ama $$0, dlp.a $$1, dlp.d $$2, dln $$3) {
         ht $$4 = ht.a($$3.c());
         ht $$5 = $$2.b().a($$0).map(ht::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dlp.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(crs $$0, ht $$1) {
         cqz $$2 = new cqz($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cqz.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dlk b();

      boolean a(ama var1, ht var2, dlg var3, dlg.a var4);

      void a(ama var1, ht var2, dlg var3, @Nullable bki var4, @Nullable bki var5, float var6);

      default arr<dlg> c() {
         return ari.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ati.d($$0);
      }

      default boolean a(dlg $$0, dlg.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bki $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(ari.d)) {
                  if (this.d() && $$2 instanceof amb $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(arc.bq) : true;
         }
      }

      default void e() {
      }
   }
}
