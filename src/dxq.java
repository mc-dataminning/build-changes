import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxq {
   List<akj<dxh>> e_ = List.of(
      dxh.T.h(),
      dxh.U.h(),
      dxh.V.h(),
      dxh.W.h(),
      dxh.X.h(),
      dxh.Y.h(),
      dxh.Z.h(),
      dxh.aa.h(),
      dxh.ab.h(),
      dxh.ac.h(),
      dxh.ad.h(),
      dxh.ae.h(),
      dxh.af.h(),
      dxh.ag.h(),
      dxh.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akj<dxh>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxh.P.h(), 1);
      $$0.put(dxh.Q.h(), 1);
      $$0.put(dxh.x.h(), 1);
      $$0.put(dxh.J.h(), 2);
      $$0.put(dxh.A.h(), 2);
      $$0.put(dxh.O.h(), 2);
      $$0.put(dxh.C.h(), 3);
      $$0.put(dxh.K.h(), 3);
      $$0.put(dxh.B.h(), 3);
      $$0.put(dxh.u.h(), 4);
      $$0.put(dxh.n.h(), 4);
      $$0.put(dxh.S.h(), 4);
      $$0.put(dxh.q.h(), 5);
      $$0.put(dxh.v.h(), 5);
      $$0.put(dxh.r.h(), 6);
      $$0.put(dxh.M.h(), 6);
      $$0.put(dxh.s.h(), 6);
      $$0.put(dxh.o.h(), 7);
      $$0.put(dxh.l.h(), 8);
      $$0.put(dxh.m.h(), 8);
      $$0.put(dxh.j.h(), 9);
      $$0.put(dxh.d.h(), 9);
      $$0.put(dxh.e.h(), 9);
      $$0.put(dxh.g.h(), 9);
      $$0.put(dxh.k.h(), 10);
      $$0.put(dxh.h.h(), 10);
      $$0.put(dxh.a.h(), 10);
      $$0.put(dxh.b.h(), 10);
      $$0.put(dxh.I.h(), 10);
      $$0.put(dxh.H.h(), 10);
      $$0.put(dxh.c.h(), 11);
      $$0.put(dxh.f.h(), 12);
      $$0.put(dxh.y.h(), 12);
      $$0.put(dxh.i.h(), 13);
      $$0.put(dxh.z.h(), 13);
      $$0.put(dxh.t.h(), 14);
      $$0.put(dxh.G.h(), 14);
      $$0.put(dxh.R.h(), 14);
      $$0.put(dxh.p.h(), 15);
      $$0.put(dxh.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxq.a gp();

   dxq.d gq();

   static int a_(jj<dxh> $$0) {
      return $$0.e().map(dxq::a).orElse(0);
   }

   static int a(akj<dxh> $$0) {
      return g_.applyAsInt($$0);
   }

   static akj<dxh> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayg.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxo.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxp.a.fieldOf("selector").forGetter(dxq.a::a),
                  axo.k.fieldOf("event_delay").orElse(0).forGetter(dxq.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxq.a((dxo)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxo c;
      private int d;
      final dxp e;
      private boolean f;

      private a(@Nullable dxo $$0, dxp $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxp(), 0, false);
      }

      public dxp a() {
         return this.e;
      }

      @Nullable
      public dxo b() {
         return this.c;
      }

      public void a(@Nullable dxo $$0) {
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

   public static class b implements dxj {
      private final dxq a;

      public b(dxq $$0) {
         this.a = $$0;
      }

      @Override
      public dxl a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(aqm $$0, jj<dxh> $$1, dxh.a $$2, ewh $$3) {
         dxq.a $$4 = this.a.gp();
         dxq.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ewh> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ewh $$7 = $$6.get();
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

      public void b(aqm $$0, jj<dxh> $$1, dxh.a $$2, ewh $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(aqm $$0, dxq.a $$1, jj<dxh> $$2, dxh.a $$3, ewh $$4, ewh $$5) {
         $$1.e.a(new dxo($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(ja $$0, ja $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dcg $$0, ewh $$1, ewh $$2) {
         ewh $$3 = new ewh((double)ayg.a($$1.c) + 0.5, (double)ayg.a($$1.d) + 0.5, (double)ayg.a($$1.e) + 0.5);
         ewh $$4 = new ewh((double)ayg.a($$2.c) + 0.5, (double)ayg.a($$2.d) + 0.5, (double)ayg.a($$2.e) + 0.5);

         for (jf $$5 : jf.values()) {
            ewh $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbo($$6, $$4, $$0x -> $$0x.a(avw.bq))).c() != ewf.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dcg $$0, dxq.a $$1, dxq.d $$2) {
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

      private static void a(aqm $$0, dxq.a $$1, dxq.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            ewh $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lo($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqm $$0, dxq.a $$1, dxq.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ewh $$3 = $$1.c.c();
               dxl $$4 = $$2.b();
               ewh $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(aqm $$0, dxq.a $$1, dxq.d $$2, dxo $$3) {
         ja $$4 = ja.a($$3.c());
         ja $$5 = $$2.b().a($$0).map(ja::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxq.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dcg $$0, ja $$1) {
         dbn $$2 = new dbn($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbn.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dxl b();

      boolean a(aqm var1, ja var2, jj<dxh> var3, dxh.a var4);

      void a(aqm var1, ja var2, jj<dxh> var3, @Nullable bsh var4, @Nullable bsh var5, float var6);

      default awm<dxh> c() {
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

      default boolean a(jj<dxh> $$0, dxh.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsh $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bY() && $$0.a(awd.d)) {
                  if (this.d() && $$2 instanceof aqn $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.be()) {
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
