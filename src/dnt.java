import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dnt {
   dnk[] e_ = new dnk[]{dnk.T, dnk.U, dnk.V, dnk.W, dnk.X, dnk.Y, dnk.Z, dnk.aa, dnk.ab, dnk.ac, dnk.ad, dnk.ae, dnk.af, dnk.ag, dnk.ah};
   ToIntFunction<dnk> f_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dnk.P, 1);
      $$0.put(dnk.Q, 1);
      $$0.put(dnk.x, 1);
      $$0.put(dnk.J, 2);
      $$0.put(dnk.A, 2);
      $$0.put(dnk.O, 2);
      $$0.put(dnk.C, 3);
      $$0.put(dnk.K, 3);
      $$0.put(dnk.B, 3);
      $$0.put(dnk.u, 4);
      $$0.put(dnk.n, 4);
      $$0.put(dnk.S, 4);
      $$0.put(dnk.q, 5);
      $$0.put(dnk.v, 5);
      $$0.put(dnk.r, 6);
      $$0.put(dnk.M, 6);
      $$0.put(dnk.s, 6);
      $$0.put(dnk.o, 7);
      $$0.put(dnk.l, 8);
      $$0.put(dnk.m, 8);
      $$0.put(dnk.j, 9);
      $$0.put(dnk.d, 9);
      $$0.put(dnk.e, 9);
      $$0.put(dnk.g, 9);
      $$0.put(dnk.k, 10);
      $$0.put(dnk.h, 10);
      $$0.put(dnk.a, 10);
      $$0.put(dnk.b, 10);
      $$0.put(dnk.I, 10);
      $$0.put(dnk.H, 10);
      $$0.put(dnk.c, 11);
      $$0.put(dnk.f, 12);
      $$0.put(dnk.y, 12);
      $$0.put(dnk.i, 13);
      $$0.put(dnk.z, 13);
      $$0.put(dnk.t, 14);
      $$0.put(dnk.G, 14);
      $$0.put(dnk.R, 14);
      $$0.put(dnk.p, 15);
      $$0.put(dnk.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dnt.a gg();

   dnt.d gh();

   static int a_(dnk $$0) {
      return f_.applyAsInt($$0);
   }

   static dnk b(int $$0) {
      return e_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aui.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dnt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dnr.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dns.a.fieldOf("selector").forGetter(dnt.a::a),
                  atq.i.fieldOf("event_delay").orElse(0).forGetter(dnt.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dnt.a((dnr)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dnr c;
      private int d;
      final dns e;
      private boolean f;

      private a(@Nullable dnr $$0, dns $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dns(), 0, false);
      }

      public dns a() {
         return this.e;
      }

      @Nullable
      public dnr b() {
         return this.c;
      }

      public void a(@Nullable dnr $$0) {
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

   public static class b implements dnm {
      private final dnt a;

      public b(dnt $$0) {
         this.a = $$0;
      }

      @Override
      public dno a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(amz $$0, dnk $$1, dnk.a $$2, elm $$3) {
         dnt.a $$4 = this.a.gg();
         dnt.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<elm> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               elm $$7 = $$6.get();
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

      public void b(amz $$0, dnk $$1, dnk.a $$2, elm $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(amz $$0, dnt.a $$1, dnk $$2, dnk.a $$3, elm $$4, elm $$5) {
         $$1.e.a(new dnr($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hx $$0, hx $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cti $$0, elm $$1, elm $$2) {
         elm $$3 = new elm((double)aui.a($$1.c) + 0.5, (double)aui.a($$1.d) + 0.5, (double)aui.a($$1.e) + 0.5);
         elm $$4 = new elm((double)aui.a($$2.c) + 0.5, (double)aui.a($$2.d) + 0.5, (double)aui.a($$2.e) + 0.5);

         for (ic $$5 : ic.values()) {
            elm $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new csq($$6, $$4, $$0x -> $$0x.a(asb.bp))).c() != elk.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cti $$0, dnt.a $$1, dnt.d $$2) {
         if ($$0 instanceof amz $$3) {
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

      private static void a(amz $$0, dnt.a $$1, dnt.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            elm $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(amz $$0, dnt.a $$1, dnt.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               elm $$3 = $$1.c.c();
               dno $$4 = $$2.b();
               elm $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aui.d($$8, $$3.c, $$5.c);
               double $$10 = aui.d($$8, $$3.d, $$5.d);
               double $$11 = aui.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(amz $$0, dnt.a $$1, dnt.d $$2, dnr $$3) {
         hx $$4 = hx.a($$3.c());
         hx $$5 = $$2.b().a($$0).map(hx::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dnt.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cti $$0, hx $$1) {
         csp $$2 = new csp($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(csp.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dno b();

      boolean a(amz var1, hx var2, dnk var3, dnk.a var4);

      void a(amz var1, hx var2, dnk var3, @Nullable blp var4, @Nullable blp var5, float var6);

      default asq<dnk> c() {
         return ash.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aui.d($$0);
      }

      default boolean a(dnk $$0, dnk.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            blp $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(ash.d)) {
                  if (this.d() && $$2 instanceof ana $$3) {
                     am.Z.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(asb.bq) : true;
         }
      }

      default void e() {
      }
   }
}
