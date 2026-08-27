import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dke {
   djv[] d_ = new djv[]{djv.T, djv.U, djv.V, djv.W, djv.X, djv.Y, djv.Z, djv.aa, djv.ab, djv.ac, djv.ad, djv.ae, djv.af, djv.ag, djv.ah};
   ToIntFunction<djv> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djv.P, 1);
      $$0.put(djv.Q, 1);
      $$0.put(djv.x, 1);
      $$0.put(djv.J, 2);
      $$0.put(djv.A, 2);
      $$0.put(djv.O, 2);
      $$0.put(djv.C, 3);
      $$0.put(djv.K, 3);
      $$0.put(djv.B, 3);
      $$0.put(djv.u, 4);
      $$0.put(djv.n, 4);
      $$0.put(djv.S, 4);
      $$0.put(djv.q, 5);
      $$0.put(djv.v, 5);
      $$0.put(djv.r, 6);
      $$0.put(djv.M, 6);
      $$0.put(djv.s, 6);
      $$0.put(djv.o, 7);
      $$0.put(djv.l, 8);
      $$0.put(djv.m, 8);
      $$0.put(djv.j, 9);
      $$0.put(djv.d, 9);
      $$0.put(djv.e, 9);
      $$0.put(djv.g, 9);
      $$0.put(djv.k, 10);
      $$0.put(djv.h, 10);
      $$0.put(djv.a, 10);
      $$0.put(djv.b, 10);
      $$0.put(djv.I, 10);
      $$0.put(djv.H, 10);
      $$0.put(djv.c, 11);
      $$0.put(djv.f, 12);
      $$0.put(djv.y, 12);
      $$0.put(djv.i, 13);
      $$0.put(djv.z, 13);
      $$0.put(djv.t, 14);
      $$0.put(djv.G, 14);
      $$0.put(djv.R, 14);
      $$0.put(djv.p, 15);
      $$0.put(djv.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dke.a gf();

   dke.d gg();

   static int a_(djv $$0) {
      return e_.applyAsInt($$0);
   }

   static djv b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ary.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dke.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dkc.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dkd.a.fieldOf("selector").forGetter(dke.a::a),
                  arh.i.fieldOf("event_delay").orElse(0).forGetter(dke.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dke.a((dkc)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dkc c;
      private int d;
      final dkd e;
      private boolean f;

      private a(@Nullable dkc $$0, dkd $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dkd(), 0, false);
      }

      public dkd a() {
         return this.e;
      }

      @Nullable
      public dkc b() {
         return this.c;
      }

      public void a(@Nullable dkc $$0) {
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

   public static class b implements djx {
      private final dke a;

      public b(dke $$0) {
         this.a = $$0;
      }

      @Override
      public djz a() {
         return this.a.gg().b();
      }

      @Override
      public int b() {
         return this.a.gg().a();
      }

      @Override
      public boolean a(aks $$0, djv $$1, djv.a $$2, ehp $$3) {
         dke.a $$4 = this.a.gf();
         dke.d $$5 = this.a.gg();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehp> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehp $$7 = $$6.get();
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

      public void b(aks $$0, djv $$1, djv.a $$2, ehp $$3) {
         this.a.gg().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gf(), $$1, $$2, $$3, $$4));
      }

      private void a(aks $$0, dke.a $$1, djv $$2, djv.a $$3, ehp $$4, ehp $$5) {
         $$1.e.a(new dkc($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gw $$0, gw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpx $$0, ehp $$1, ehp $$2) {
         ehp $$3 = new ehp((double)ary.a($$1.c) + 0.5, (double)ary.a($$1.d) + 0.5, (double)ary.a($$1.e) + 0.5);
         ehp $$4 = new ehp((double)ary.a($$2.c) + 0.5, (double)ary.a($$2.d) + 0.5, (double)ary.a($$2.e) + 0.5);

         for (hc $$5 : hc.values()) {
            ehp $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cpf($$6, $$4, $$0x -> $$0x.a(apu.bp))).c() != ehn.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpx $$0, dke.a $$1, dke.d $$2) {
         if ($$0 instanceof aks $$3) {
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

      private static void a(aks $$0, dke.a $$1, dke.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehp $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new jb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aks $$0, dke.a $$1, dke.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehp $$3 = $$1.c.c();
               djz $$4 = $$2.b();
               ehp $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ary.d($$8, $$3.c, $$5.c);
               double $$10 = ary.d($$8, $$3.d, $$5.d);
               double $$11 = ary.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new jb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aks $$0, dke.a $$1, dke.d $$2, dkc $$3) {
         gw $$4 = gw.a($$3.c());
         gw $$5 = $$2.b().a($$0).map(gw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dke.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpx $$0, gw $$1) {
         cpe $$2 = new cpe($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cpe.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djz b();

      boolean a(aks var1, gw var2, djv var3, djv.a var4);

      void a(aks var1, gw var2, djv var3, @Nullable bis var4, @Nullable bis var5, float var6);

      default aqj<djv> c() {
         return aqa.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ary.d($$0);
      }

      default boolean a(djv $$0, djv.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bis $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.M_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(aqa.d)) {
                  if (this.d() && $$2 instanceof akt $$3) {
                     al.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apu.bq) : true;
         }
      }

      default void e() {
      }
   }
}
