import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djw {
   djn[] d_ = new djn[]{djn.T, djn.U, djn.V, djn.W, djn.X, djn.Y, djn.Z, djn.aa, djn.ab, djn.ac, djn.ad, djn.ae, djn.af, djn.ag, djn.ah};
   ToIntFunction<djn> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djn.P, 1);
      $$0.put(djn.Q, 1);
      $$0.put(djn.x, 1);
      $$0.put(djn.J, 2);
      $$0.put(djn.A, 2);
      $$0.put(djn.O, 2);
      $$0.put(djn.C, 3);
      $$0.put(djn.K, 3);
      $$0.put(djn.B, 3);
      $$0.put(djn.u, 4);
      $$0.put(djn.n, 4);
      $$0.put(djn.S, 4);
      $$0.put(djn.q, 5);
      $$0.put(djn.v, 5);
      $$0.put(djn.r, 6);
      $$0.put(djn.M, 6);
      $$0.put(djn.s, 6);
      $$0.put(djn.o, 7);
      $$0.put(djn.l, 8);
      $$0.put(djn.m, 8);
      $$0.put(djn.j, 9);
      $$0.put(djn.d, 9);
      $$0.put(djn.e, 9);
      $$0.put(djn.g, 9);
      $$0.put(djn.k, 10);
      $$0.put(djn.h, 10);
      $$0.put(djn.a, 10);
      $$0.put(djn.b, 10);
      $$0.put(djn.I, 10);
      $$0.put(djn.H, 10);
      $$0.put(djn.c, 11);
      $$0.put(djn.f, 12);
      $$0.put(djn.y, 12);
      $$0.put(djn.i, 13);
      $$0.put(djn.z, 13);
      $$0.put(djn.t, 14);
      $$0.put(djn.G, 14);
      $$0.put(djn.R, 14);
      $$0.put(djn.p, 15);
      $$0.put(djn.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   djw.a gg();

   djw.d gh();

   static int a_(djn $$0) {
      return e_.applyAsInt($$0);
   }

   static djn b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - asb.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<djw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dju.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  djv.a.fieldOf("selector").forGetter(djw.a::a),
                  arj.i.fieldOf("event_delay").orElse(0).forGetter(djw.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new djw.a((dju)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dju c;
      private int d;
      final djv e;
      private boolean f;

      private a(@Nullable dju $$0, djv $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new djv(), 0, false);
      }

      public djv a() {
         return this.e;
      }

      @Nullable
      public dju b() {
         return this.c;
      }

      public void a(@Nullable dju $$0) {
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

   public static class b implements djp {
      private final djw a;

      public b(djw $$0) {
         this.a = $$0;
      }

      @Override
      public djr a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(akt $$0, djn $$1, djn.a $$2, ehh $$3) {
         djw.a $$4 = this.a.gg();
         djw.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehh> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehh $$7 = $$6.get();
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

      public void b(akt $$0, djn $$1, djn.a $$2, ehh $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(akt $$0, djw.a $$1, djn $$2, djn.a $$3, ehh $$4, ehh $$5) {
         $$1.e.a(new dju($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gw $$0, gw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cqb $$0, ehh $$1, ehh $$2) {
         ehh $$3 = new ehh((double)asb.a($$1.c) + 0.5, (double)asb.a($$1.d) + 0.5, (double)asb.a($$1.e) + 0.5);
         ehh $$4 = new ehh((double)asb.a($$2.c) + 0.5, (double)asb.a($$2.d) + 0.5, (double)asb.a($$2.e) + 0.5);

         for (ha $$5 : ha.values()) {
            ehh $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cpj($$6, $$4, $$0x -> $$0x.a(apv.bp))).c() != ehf.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cqb $$0, djw.a $$1, djw.d $$2) {
         if ($$0 instanceof akt $$3) {
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

      private static void a(akt $$0, djw.a $$1, djw.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehh $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new iz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(akt $$0, djw.a $$1, djw.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehh $$3 = $$1.c.c();
               djr $$4 = $$2.b();
               ehh $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = asb.d($$8, $$3.c, $$5.c);
               double $$10 = asb.d($$8, $$3.d, $$5.d);
               double $$11 = asb.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new iz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(akt $$0, djw.a $$1, djw.d $$2, dju $$3) {
         gw $$4 = gw.a($$3.c());
         gw $$5 = $$2.b().a($$0).map(gw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), djw.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cqb $$0, gw $$1) {
         cpi $$2 = new cpi($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cpi.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djr b();

      boolean a(akt var1, gw var2, djn var3, djn.a var4);

      void a(akt var1, gw var2, djn var3, @Nullable biw var4, @Nullable biw var5, float var6);

      default aqk<djn> c() {
         return aqb.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return asb.d($$0);
      }

      default boolean a(djn $$0, djn.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            biw $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.M_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(aqb.d)) {
                  if (this.d() && $$2 instanceof aku $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apv.bq) : true;
         }
      }

      default void e() {
      }
   }
}
