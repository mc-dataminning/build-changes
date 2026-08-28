import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxp {
   List<akj<dxg>> e_ = List.of(
      dxg.T.h(),
      dxg.U.h(),
      dxg.V.h(),
      dxg.W.h(),
      dxg.X.h(),
      dxg.Y.h(),
      dxg.Z.h(),
      dxg.aa.h(),
      dxg.ab.h(),
      dxg.ac.h(),
      dxg.ad.h(),
      dxg.ae.h(),
      dxg.af.h(),
      dxg.ag.h(),
      dxg.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akj<dxg>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxg.P.h(), 1);
      $$0.put(dxg.Q.h(), 1);
      $$0.put(dxg.x.h(), 1);
      $$0.put(dxg.J.h(), 2);
      $$0.put(dxg.A.h(), 2);
      $$0.put(dxg.O.h(), 2);
      $$0.put(dxg.C.h(), 3);
      $$0.put(dxg.K.h(), 3);
      $$0.put(dxg.B.h(), 3);
      $$0.put(dxg.u.h(), 4);
      $$0.put(dxg.n.h(), 4);
      $$0.put(dxg.S.h(), 4);
      $$0.put(dxg.q.h(), 5);
      $$0.put(dxg.v.h(), 5);
      $$0.put(dxg.r.h(), 6);
      $$0.put(dxg.M.h(), 6);
      $$0.put(dxg.s.h(), 6);
      $$0.put(dxg.o.h(), 7);
      $$0.put(dxg.l.h(), 8);
      $$0.put(dxg.m.h(), 8);
      $$0.put(dxg.j.h(), 9);
      $$0.put(dxg.d.h(), 9);
      $$0.put(dxg.e.h(), 9);
      $$0.put(dxg.g.h(), 9);
      $$0.put(dxg.k.h(), 10);
      $$0.put(dxg.h.h(), 10);
      $$0.put(dxg.a.h(), 10);
      $$0.put(dxg.b.h(), 10);
      $$0.put(dxg.I.h(), 10);
      $$0.put(dxg.H.h(), 10);
      $$0.put(dxg.c.h(), 11);
      $$0.put(dxg.f.h(), 12);
      $$0.put(dxg.y.h(), 12);
      $$0.put(dxg.i.h(), 13);
      $$0.put(dxg.z.h(), 13);
      $$0.put(dxg.t.h(), 14);
      $$0.put(dxg.G.h(), 14);
      $$0.put(dxg.R.h(), 14);
      $$0.put(dxg.p.h(), 15);
      $$0.put(dxg.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxp.a gq();

   dxp.d gr();

   static int a_(jj<dxg> $$0) {
      return $$0.e().map(dxp::a).orElse(0);
   }

   static int a(akj<dxg> $$0) {
      return g_.applyAsInt($$0);
   }

   static akj<dxg> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayg.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxn.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxo.a.fieldOf("selector").forGetter(dxp.a::a),
                  axo.k.fieldOf("event_delay").orElse(0).forGetter(dxp.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxp.a((dxn)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxn c;
      private int d;
      final dxo e;
      private boolean f;

      private a(@Nullable dxn $$0, dxo $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxo(), 0, false);
      }

      public dxo a() {
         return this.e;
      }

      @Nullable
      public dxn b() {
         return this.c;
      }

      public void a(@Nullable dxn $$0) {
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

   public static class b implements dxi {
      private final dxp a;

      public b(dxp $$0) {
         this.a = $$0;
      }

      @Override
      public dxk a() {
         return this.a.gr().b();
      }

      @Override
      public int b() {
         return this.a.gr().a();
      }

      @Override
      public boolean a(aqm $$0, jj<dxg> $$1, dxg.a $$2, ewf $$3) {
         dxp.a $$4 = this.a.gq();
         dxp.d $$5 = this.a.gr();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ewf> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ewf $$7 = $$6.get();
               if (!$$5.a($$0, ja.a($$3), $$1, $$2)) {
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

      public void b(aqm $$0, jj<dxg> $$1, dxg.a $$2, ewf $$3) {
         this.a.gr().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gq(), $$1, $$2, $$3, $$4));
      }

      private void a(aqm $$0, dxp.a $$1, jj<dxg> $$2, dxg.a $$3, ewf $$4, ewf $$5) {
         $$1.e.a(new dxn($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(ja $$0, ja $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dcf $$0, ewf $$1, ewf $$2) {
         ewf $$3 = new ewf((double)ayg.a($$1.c) + 0.5, (double)ayg.a($$1.d) + 0.5, (double)ayg.a($$1.e) + 0.5);
         ewf $$4 = new ewf((double)ayg.a($$2.c) + 0.5, (double)ayg.a($$2.d) + 0.5, (double)ayg.a($$2.e) + 0.5);

         for (jf $$5 : jf.values()) {
            ewf $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbn($$6, $$4, $$0x -> $$0x.a(avw.bq))).c() != ewd.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dcf $$0, dxp.a $$1, dxp.d $$2) {
         if ($$0 instanceof aqm $$3) {
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

      private static void a(aqm $$0, dxp.a $$1, dxp.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            ewf $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lo($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqm $$0, dxp.a $$1, dxp.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ewf $$3 = $$1.c.c();
               dxk $$4 = $$2.b();
               ewf $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayg.d($$8, $$3.c, $$5.c);
               double $$10 = ayg.d($$8, $$3.d, $$5.d);
               double $$11 = ayg.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lo($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqm $$0, dxp.a $$1, dxp.d $$2, dxn $$3) {
         ja $$4 = ja.a($$3.c());
         ja $$5 = $$2.b().a($$0).map(ja::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxp.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dcf $$0, ja $$1) {
         dbm $$2 = new dbm($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbm.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dxk b();

      boolean a(aqm var1, ja var2, jj<dxg> var3, dxg.a var4);

      void a(aqm var1, ja var2, jj<dxg> var3, @Nullable bsg var4, @Nullable bsg var5, float var6);

      default awm<dxg> c() {
         return awd.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayg.d($$0);
      }

      default boolean a(jj<dxg> $$0, dxg.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsg $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bX() && $$0.a(awd.d)) {
                  if (this.d() && $$2 instanceof aqn $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bd()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avw.br) : true;
         }
      }

      default void e() {
      }
   }
}
