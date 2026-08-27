import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface doa {
   dnr[] e_ = new dnr[]{dnr.T, dnr.U, dnr.V, dnr.W, dnr.X, dnr.Y, dnr.Z, dnr.aa, dnr.ab, dnr.ac, dnr.ad, dnr.ae, dnr.af, dnr.ag, dnr.ah};
   ToIntFunction<dnr> f_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dnr.P, 1);
      $$0.put(dnr.Q, 1);
      $$0.put(dnr.x, 1);
      $$0.put(dnr.J, 2);
      $$0.put(dnr.A, 2);
      $$0.put(dnr.O, 2);
      $$0.put(dnr.C, 3);
      $$0.put(dnr.K, 3);
      $$0.put(dnr.B, 3);
      $$0.put(dnr.u, 4);
      $$0.put(dnr.n, 4);
      $$0.put(dnr.S, 4);
      $$0.put(dnr.q, 5);
      $$0.put(dnr.v, 5);
      $$0.put(dnr.r, 6);
      $$0.put(dnr.M, 6);
      $$0.put(dnr.s, 6);
      $$0.put(dnr.o, 7);
      $$0.put(dnr.l, 8);
      $$0.put(dnr.m, 8);
      $$0.put(dnr.j, 9);
      $$0.put(dnr.d, 9);
      $$0.put(dnr.e, 9);
      $$0.put(dnr.g, 9);
      $$0.put(dnr.k, 10);
      $$0.put(dnr.h, 10);
      $$0.put(dnr.a, 10);
      $$0.put(dnr.b, 10);
      $$0.put(dnr.I, 10);
      $$0.put(dnr.H, 10);
      $$0.put(dnr.c, 11);
      $$0.put(dnr.f, 12);
      $$0.put(dnr.y, 12);
      $$0.put(dnr.i, 13);
      $$0.put(dnr.z, 13);
      $$0.put(dnr.t, 14);
      $$0.put(dnr.G, 14);
      $$0.put(dnr.R, 14);
      $$0.put(dnr.p, 15);
      $$0.put(dnr.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   doa.a gg();

   doa.d gh();

   static int a_(dnr $$0) {
      return f_.applyAsInt($$0);
   }

   static dnr b(int $$0) {
      return e_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - auo.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<doa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dny.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dnz.a.fieldOf("selector").forGetter(doa.a::a),
                  atw.i.fieldOf("event_delay").orElse(0).forGetter(doa.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new doa.a((dny)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dny c;
      private int d;
      final dnz e;
      private boolean f;

      private a(@Nullable dny $$0, dnz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dnz(), 0, false);
      }

      public dnz a() {
         return this.e;
      }

      @Nullable
      public dny b() {
         return this.c;
      }

      public void a(@Nullable dny $$0) {
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

   public static class b implements dnt {
      private final doa a;

      public b(doa $$0) {
         this.a = $$0;
      }

      @Override
      public dnv a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(and $$0, dnr $$1, dnr.a $$2, elt $$3) {
         doa.a $$4 = this.a.gg();
         doa.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<elt> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               elt $$7 = $$6.get();
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

      public void b(and $$0, dnr $$1, dnr.a $$2, elt $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(and $$0, doa.a $$1, dnr $$2, dnr.a $$3, elt $$4, elt $$5) {
         $$1.e.a(new dny($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hx $$0, hx $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(ctp $$0, elt $$1, elt $$2) {
         elt $$3 = new elt((double)auo.a($$1.c) + 0.5, (double)auo.a($$1.d) + 0.5, (double)auo.a($$1.e) + 0.5);
         elt $$4 = new elt((double)auo.a($$2.c) + 0.5, (double)auo.a($$2.d) + 0.5, (double)auo.a($$2.e) + 0.5);

         for (ic $$5 : ic.values()) {
            elt $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new csx($$6, $$4, $$0x -> $$0x.a(ash.bp))).c() != elr.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(ctp $$0, doa.a $$1, doa.d $$2) {
         if ($$0 instanceof and $$3) {
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

      private static void a(and $$0, doa.a $$1, doa.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            elt $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(and $$0, doa.a $$1, doa.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               elt $$3 = $$1.c.c();
               dnv $$4 = $$2.b();
               elt $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = auo.d($$8, $$3.c, $$5.c);
               double $$10 = auo.d($$8, $$3.d, $$5.d);
               double $$11 = auo.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(and $$0, doa.a $$1, doa.d $$2, dny $$3) {
         hx $$4 = hx.a($$3.c());
         hx $$5 = $$2.b().a($$0).map(hx::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), doa.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(ctp $$0, hx $$1) {
         csw $$2 = new csw($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(csw.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dnv b();

      boolean a(and var1, hx var2, dnr var3, dnr.a var4);

      void a(and var1, hx var2, dnr var3, @Nullable blv var4, @Nullable blv var5, float var6);

      default asw<dnr> c() {
         return asn.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return auo.d($$0);
      }

      default boolean a(dnr $$0, dnr.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            blv $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(asn.d)) {
                  if (this.d() && $$2 instanceof ane $$3) {
                     am.Z.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(ash.bq) : true;
         }
      }

      default void e() {
      }
   }
}
