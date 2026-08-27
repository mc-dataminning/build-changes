import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dvj {
   List<akg<dva>> e_ = List.of(
      dva.T.h(),
      dva.U.h(),
      dva.V.h(),
      dva.W.h(),
      dva.X.h(),
      dva.Y.h(),
      dva.Z.h(),
      dva.aa.h(),
      dva.ab.h(),
      dva.ac.h(),
      dva.ad.h(),
      dva.ae.h(),
      dva.af.h(),
      dva.ag.h(),
      dva.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akg<dva>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dva.P.h(), 1);
      $$0.put(dva.Q.h(), 1);
      $$0.put(dva.x.h(), 1);
      $$0.put(dva.J.h(), 2);
      $$0.put(dva.A.h(), 2);
      $$0.put(dva.O.h(), 2);
      $$0.put(dva.C.h(), 3);
      $$0.put(dva.K.h(), 3);
      $$0.put(dva.B.h(), 3);
      $$0.put(dva.u.h(), 4);
      $$0.put(dva.n.h(), 4);
      $$0.put(dva.S.h(), 4);
      $$0.put(dva.q.h(), 5);
      $$0.put(dva.v.h(), 5);
      $$0.put(dva.r.h(), 6);
      $$0.put(dva.M.h(), 6);
      $$0.put(dva.s.h(), 6);
      $$0.put(dva.o.h(), 7);
      $$0.put(dva.l.h(), 8);
      $$0.put(dva.m.h(), 8);
      $$0.put(dva.j.h(), 9);
      $$0.put(dva.d.h(), 9);
      $$0.put(dva.e.h(), 9);
      $$0.put(dva.g.h(), 9);
      $$0.put(dva.k.h(), 10);
      $$0.put(dva.h.h(), 10);
      $$0.put(dva.a.h(), 10);
      $$0.put(dva.b.h(), 10);
      $$0.put(dva.I.h(), 10);
      $$0.put(dva.H.h(), 10);
      $$0.put(dva.c.h(), 11);
      $$0.put(dva.f.h(), 12);
      $$0.put(dva.y.h(), 12);
      $$0.put(dva.i.h(), 13);
      $$0.put(dva.z.h(), 13);
      $$0.put(dva.t.h(), 14);
      $$0.put(dva.G.h(), 14);
      $$0.put(dva.R.h(), 14);
      $$0.put(dva.p.h(), 15);
      $$0.put(dva.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dvj.a gr();

   dvj.d gs();

   static int a_(iw<dva> $$0) {
      return $$0.e().map(dvj::a).orElse(0);
   }

   static int a(akg<dva> $$0) {
      return g_.applyAsInt($$0);
   }

   static akg<dva> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - axz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dvj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dvh.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dvi.a.fieldOf("selector").forGetter(dvj.a::a),
                  axh.i.fieldOf("event_delay").orElse(0).forGetter(dvj.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dvj.a((dvh)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dvh c;
      private int d;
      final dvi e;
      private boolean f;

      private a(@Nullable dvh $$0, dvi $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dvi(), 0, false);
      }

      public dvi a() {
         return this.e;
      }

      @Nullable
      public dvh b() {
         return this.c;
      }

      public void a(@Nullable dvh $$0) {
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

   public static class b implements dvc {
      private final dvj a;

      public b(dvj $$0) {
         this.a = $$0;
      }

      @Override
      public dve a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(aqh $$0, iw<dva> $$1, dva.a $$2, etp $$3) {
         dvj.a $$4 = this.a.gr();
         dvj.d $$5 = this.a.gs();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<etp> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               etp $$7 = $$6.get();
               if (!$$5.a($$0, in.a($$3), $$1, $$2)) {
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

      public void b(aqh $$0, iw<dva> $$1, dva.a $$2, etp $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gr(), $$1, $$2, $$3, $$4));
      }

      private void a(aqh $$0, dvj.a $$1, iw<dva> $$2, dva.a $$3, etp $$4, etp $$5) {
         $$1.e.a(new dvh($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(in $$0, in $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dad $$0, etp $$1, etp $$2) {
         etp $$3 = new etp((double)axz.a($$1.c) + 0.5, (double)axz.a($$1.d) + 0.5, (double)axz.a($$1.e) + 0.5);
         etp $$4 = new etp((double)axz.a($$2.c) + 0.5, (double)axz.a($$2.d) + 0.5, (double)axz.a($$2.e) + 0.5);

         for (is $$5 : is.values()) {
            etp $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new czl($$6, $$4, $$0x -> $$0x.a(avr.bq))).c() != etn.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dad $$0, dvj.a $$1, dvj.d $$2) {
         if ($$0 instanceof aqh $$3) {
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

      private static void a(aqh $$0, dvj.a $$1, dvj.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            etp $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqh $$0, dvj.a $$1, dvj.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               etp $$3 = $$1.c.c();
               dve $$4 = $$2.b();
               etp $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = axz.d($$8, $$3.c, $$5.c);
               double $$10 = axz.d($$8, $$3.d, $$5.d);
               double $$11 = axz.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqh $$0, dvj.a $$1, dvj.d $$2, dvh $$3) {
         in $$4 = in.a($$3.c());
         in $$5 = $$2.b().a($$0).map(in::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dvj.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dad $$0, in $$1) {
         czk $$2 = new czk($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(czk.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dve b();

      boolean a(aqh var1, in var2, iw<dva> var3, dva.a var4);

      void a(aqh var1, in var2, iw<dva> var3, @Nullable brh var4, @Nullable brh var5, float var6);

      default awg<dva> c() {
         return avx.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return axz.d($$0);
      }

      default boolean a(iw<dva> $$0, dva.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            brh $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bU() && $$0.a(avx.d)) {
                  if (this.d() && $$2 instanceof aqi $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.ba()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avr.br) : true;
         }
      }

      default void e() {
      }
   }
}
