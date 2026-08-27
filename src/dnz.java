import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dnz {
   dnq[] e_ = new dnq[]{dnq.T, dnq.U, dnq.V, dnq.W, dnq.X, dnq.Y, dnq.Z, dnq.aa, dnq.ab, dnq.ac, dnq.ad, dnq.ae, dnq.af, dnq.ag, dnq.ah};
   ToIntFunction<dnq> f_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dnq.P, 1);
      $$0.put(dnq.Q, 1);
      $$0.put(dnq.x, 1);
      $$0.put(dnq.J, 2);
      $$0.put(dnq.A, 2);
      $$0.put(dnq.O, 2);
      $$0.put(dnq.C, 3);
      $$0.put(dnq.K, 3);
      $$0.put(dnq.B, 3);
      $$0.put(dnq.u, 4);
      $$0.put(dnq.n, 4);
      $$0.put(dnq.S, 4);
      $$0.put(dnq.q, 5);
      $$0.put(dnq.v, 5);
      $$0.put(dnq.r, 6);
      $$0.put(dnq.M, 6);
      $$0.put(dnq.s, 6);
      $$0.put(dnq.o, 7);
      $$0.put(dnq.l, 8);
      $$0.put(dnq.m, 8);
      $$0.put(dnq.j, 9);
      $$0.put(dnq.d, 9);
      $$0.put(dnq.e, 9);
      $$0.put(dnq.g, 9);
      $$0.put(dnq.k, 10);
      $$0.put(dnq.h, 10);
      $$0.put(dnq.a, 10);
      $$0.put(dnq.b, 10);
      $$0.put(dnq.I, 10);
      $$0.put(dnq.H, 10);
      $$0.put(dnq.c, 11);
      $$0.put(dnq.f, 12);
      $$0.put(dnq.y, 12);
      $$0.put(dnq.i, 13);
      $$0.put(dnq.z, 13);
      $$0.put(dnq.t, 14);
      $$0.put(dnq.G, 14);
      $$0.put(dnq.R, 14);
      $$0.put(dnq.p, 15);
      $$0.put(dnq.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dnz.a gg();

   dnz.d gh();

   static int a_(dnq $$0) {
      return f_.applyAsInt($$0);
   }

   static dnq b(int $$0) {
      return e_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aun.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dnz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dnx.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dny.a.fieldOf("selector").forGetter(dnz.a::a),
                  atv.i.fieldOf("event_delay").orElse(0).forGetter(dnz.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dnz.a((dnx)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dnx c;
      private int d;
      final dny e;
      private boolean f;

      private a(@Nullable dnx $$0, dny $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dny(), 0, false);
      }

      public dny a() {
         return this.e;
      }

      @Nullable
      public dnx b() {
         return this.c;
      }

      public void a(@Nullable dnx $$0) {
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

   public static class b implements dns {
      private final dnz a;

      public b(dnz $$0) {
         this.a = $$0;
      }

      @Override
      public dnu a() {
         return this.a.gh().b();
      }

      @Override
      public int b() {
         return this.a.gh().a();
      }

      @Override
      public boolean a(and $$0, dnq $$1, dnq.a $$2, els $$3) {
         dnz.a $$4 = this.a.gg();
         dnz.d $$5 = this.a.gh();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<els> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               els $$7 = $$6.get();
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

      public void b(and $$0, dnq $$1, dnq.a $$2, els $$3) {
         this.a.gh().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gg(), $$1, $$2, $$3, $$4));
      }

      private void a(and $$0, dnz.a $$1, dnq $$2, dnq.a $$3, els $$4, els $$5) {
         $$1.e.a(new dnx($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hx $$0, hx $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cto $$0, els $$1, els $$2) {
         els $$3 = new els((double)aun.a($$1.c) + 0.5, (double)aun.a($$1.d) + 0.5, (double)aun.a($$1.e) + 0.5);
         els $$4 = new els((double)aun.a($$2.c) + 0.5, (double)aun.a($$2.d) + 0.5, (double)aun.a($$2.e) + 0.5);

         for (ic $$5 : ic.values()) {
            els $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new csw($$6, $$4, $$0x -> $$0x.a(asg.bp))).c() != elq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cto $$0, dnz.a $$1, dnz.d $$2) {
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

      private static void a(and $$0, dnz.a $$1, dnz.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            els $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(and $$0, dnz.a $$1, dnz.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               els $$3 = $$1.c.c();
               dnu $$4 = $$2.b();
               els $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aun.d($$8, $$3.c, $$5.c);
               double $$10 = aun.d($$8, $$3.d, $$5.d);
               double $$11 = aun.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(and $$0, dnz.a $$1, dnz.d $$2, dnx $$3) {
         hx $$4 = hx.a($$3.c());
         hx $$5 = $$2.b().a($$0).map(hx::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dnz.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cto $$0, hx $$1) {
         csv $$2 = new csv($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(csv.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dnu b();

      boolean a(and var1, hx var2, dnq var3, dnq.a var4);

      void a(and var1, hx var2, dnq var3, @Nullable blu var4, @Nullable blu var5, float var6);

      default asv<dnq> c() {
         return asm.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aun.d($$0);
      }

      default boolean a(dnq $$0, dnq.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            blu $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(asm.d)) {
                  if (this.d() && $$2 instanceof ane $$3) {
                     am.Z.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(asg.bq) : true;
         }
      }

      default void e() {
      }
   }
}
