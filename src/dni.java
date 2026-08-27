import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dni {
   dmz[] d_ = new dmz[]{dmz.T, dmz.U, dmz.V, dmz.W, dmz.X, dmz.Y, dmz.Z, dmz.aa, dmz.ab, dmz.ac, dmz.ad, dmz.ae, dmz.af, dmz.ag, dmz.ah};
   ToIntFunction<dmz> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dmz.P, 1);
      $$0.put(dmz.Q, 1);
      $$0.put(dmz.x, 1);
      $$0.put(dmz.J, 2);
      $$0.put(dmz.A, 2);
      $$0.put(dmz.O, 2);
      $$0.put(dmz.C, 3);
      $$0.put(dmz.K, 3);
      $$0.put(dmz.B, 3);
      $$0.put(dmz.u, 4);
      $$0.put(dmz.n, 4);
      $$0.put(dmz.S, 4);
      $$0.put(dmz.q, 5);
      $$0.put(dmz.v, 5);
      $$0.put(dmz.r, 6);
      $$0.put(dmz.M, 6);
      $$0.put(dmz.s, 6);
      $$0.put(dmz.o, 7);
      $$0.put(dmz.l, 8);
      $$0.put(dmz.m, 8);
      $$0.put(dmz.j, 9);
      $$0.put(dmz.d, 9);
      $$0.put(dmz.e, 9);
      $$0.put(dmz.g, 9);
      $$0.put(dmz.k, 10);
      $$0.put(dmz.h, 10);
      $$0.put(dmz.a, 10);
      $$0.put(dmz.b, 10);
      $$0.put(dmz.I, 10);
      $$0.put(dmz.H, 10);
      $$0.put(dmz.c, 11);
      $$0.put(dmz.f, 12);
      $$0.put(dmz.y, 12);
      $$0.put(dmz.i, 13);
      $$0.put(dmz.z, 13);
      $$0.put(dmz.t, 14);
      $$0.put(dmz.G, 14);
      $$0.put(dmz.R, 14);
      $$0.put(dmz.p, 15);
      $$0.put(dmz.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dni.a gg();

   dni.d gh();

   static int a_(dmz $$0) {
      return e_.applyAsInt($$0);
   }

   static dmz b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aty.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dni.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dng.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dnh.a.fieldOf("selector").forGetter(dni.a::a),
                  atg.i.fieldOf("event_delay").orElse(0).forGetter(dni.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dni.a((dng)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dng c;
      private int d;
      final dnh e;
      private boolean f;

      private a(@Nullable dng $$0, dnh $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dnh(), 0, false);
      }

      public dnh a() {
         return this.e;
      }

      @Nullable
      public dng b() {
         return this.c;
      }

      public void a(@Nullable dng $$0) {
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

   public static class b implements dnb {
      private final dni a;

      public b(dni $$0) {
         this.a = $$0;
      }

      @Override
      public dnd a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(amp $$0, dmz $$1, dmz.a $$2, elb $$3) {
         dni.a $$4 = this.a.gg();
         dni.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<elb> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               elb $$7 = $$6.get();
               if (!$$5.a($$0, hv.a($$3), $$1, $$2)) {
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

      public void b(amp $$0, dmz $$1, dmz.a $$2, elb $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(amp $$0, dni.a $$1, dmz $$2, dmz.a $$3, elb $$4, elb $$5) {
         $$1.e.a(new dng($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.W());
      }

      public static float a(hv $$0, hv $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(csy $$0, elb $$1, elb $$2) {
         elb $$3 = new elb((double)aty.a($$1.c) + 0.5, (double)aty.a($$1.d) + 0.5, (double)aty.a($$1.e) + 0.5);
         elb $$4 = new elb((double)aty.a($$2.c) + 0.5, (double)aty.a($$2.d) + 0.5, (double)aty.a($$2.e) + 0.5);

         for (ia $$5 : ia.values()) {
            elb $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new csg($$6, $$4, $$0x -> $$0x.a(arr.bp))).c() != ekz.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(csy $$0, dni.a $$1, dni.d $$2) {
         if ($$0 instanceof amp $$3) {
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

      private static void a(amp $$0, dni.a $$1, dni.d $$2) {
         $$1.a().a($$0.W()).ifPresent($$3 -> {
            $$1.a($$3);
            elb $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(amp $$0, dni.a $$1, dni.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               elb $$3 = $$1.c.c();
               dnd $$4 = $$2.b();
               elb $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aty.d($$8, $$3.c, $$5.c);
               double $$10 = aty.d($$8, $$3.d, $$5.d);
               double $$11 = aty.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(amp $$0, dni.a $$1, dni.d $$2, dng $$3) {
         hv $$4 = hv.a($$3.c());
         hv $$5 = $$2.b().a($$0).map(hv::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dni.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(csy $$0, hv $$1) {
         csf $$2 = new csf($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(csf.c($$3, $$4)) || $$0.K().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dnd b();

      boolean a(amp var1, hv var2, dmz var3, dmz.a var4);

      void a(amp var1, hv var2, dmz var3, @Nullable blf var4, @Nullable blf var5, float var6);

      default asg<dmz> c() {
         return arx.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aty.d($$0);
      }

      default boolean a(dmz $$0, dmz.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            blf $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(arx.d)) {
                  if (this.d() && $$2 instanceof amq $$3) {
                     am.Z.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(arr.bq) : true;
         }
      }

      default void e() {
      }
   }
}
