import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxj {
   List<akj<dxa>> e_ = List.of(
      dxa.T.h(),
      dxa.U.h(),
      dxa.V.h(),
      dxa.W.h(),
      dxa.X.h(),
      dxa.Y.h(),
      dxa.Z.h(),
      dxa.aa.h(),
      dxa.ab.h(),
      dxa.ac.h(),
      dxa.ad.h(),
      dxa.ae.h(),
      dxa.af.h(),
      dxa.ag.h(),
      dxa.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akj<dxa>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxa.P.h(), 1);
      $$0.put(dxa.Q.h(), 1);
      $$0.put(dxa.x.h(), 1);
      $$0.put(dxa.J.h(), 2);
      $$0.put(dxa.A.h(), 2);
      $$0.put(dxa.O.h(), 2);
      $$0.put(dxa.C.h(), 3);
      $$0.put(dxa.K.h(), 3);
      $$0.put(dxa.B.h(), 3);
      $$0.put(dxa.u.h(), 4);
      $$0.put(dxa.n.h(), 4);
      $$0.put(dxa.S.h(), 4);
      $$0.put(dxa.q.h(), 5);
      $$0.put(dxa.v.h(), 5);
      $$0.put(dxa.r.h(), 6);
      $$0.put(dxa.M.h(), 6);
      $$0.put(dxa.s.h(), 6);
      $$0.put(dxa.o.h(), 7);
      $$0.put(dxa.l.h(), 8);
      $$0.put(dxa.m.h(), 8);
      $$0.put(dxa.j.h(), 9);
      $$0.put(dxa.d.h(), 9);
      $$0.put(dxa.e.h(), 9);
      $$0.put(dxa.g.h(), 9);
      $$0.put(dxa.k.h(), 10);
      $$0.put(dxa.h.h(), 10);
      $$0.put(dxa.a.h(), 10);
      $$0.put(dxa.b.h(), 10);
      $$0.put(dxa.I.h(), 10);
      $$0.put(dxa.H.h(), 10);
      $$0.put(dxa.c.h(), 11);
      $$0.put(dxa.f.h(), 12);
      $$0.put(dxa.y.h(), 12);
      $$0.put(dxa.i.h(), 13);
      $$0.put(dxa.z.h(), 13);
      $$0.put(dxa.t.h(), 14);
      $$0.put(dxa.G.h(), 14);
      $$0.put(dxa.R.h(), 14);
      $$0.put(dxa.p.h(), 15);
      $$0.put(dxa.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxj.a gp();

   dxj.d gq();

   static int a_(jj<dxa> $$0) {
      return $$0.e().map(dxj::a).orElse(0);
   }

   static int a(akj<dxa> $$0) {
      return g_.applyAsInt($$0);
   }

   static akj<dxa> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aye.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxh.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxi.a.fieldOf("selector").forGetter(dxj.a::a),
                  axm.k.fieldOf("event_delay").orElse(0).forGetter(dxj.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxj.a((dxh)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxh c;
      private int d;
      final dxi e;
      private boolean f;

      private a(@Nullable dxh $$0, dxi $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxi(), 0, false);
      }

      public dxi a() {
         return this.e;
      }

      @Nullable
      public dxh b() {
         return this.c;
      }

      public void a(@Nullable dxh $$0) {
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

   public static class b implements dxc {
      private final dxj a;

      public b(dxj $$0) {
         this.a = $$0;
      }

      @Override
      public dxe a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(aqk $$0, jj<dxa> $$1, dxa.a $$2, evz $$3) {
         dxj.a $$4 = this.a.gp();
         dxj.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evz> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evz $$7 = $$6.get();
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

      public void b(aqk $$0, jj<dxa> $$1, dxa.a $$2, evz $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(aqk $$0, dxj.a $$1, jj<dxa> $$2, dxa.a $$3, evz $$4, evz $$5) {
         $$1.e.a(new dxh($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(ja $$0, ja $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dcd $$0, evz $$1, evz $$2) {
         evz $$3 = new evz((double)aye.a($$1.c) + 0.5, (double)aye.a($$1.d) + 0.5, (double)aye.a($$1.e) + 0.5);
         evz $$4 = new evz((double)aye.a($$2.c) + 0.5, (double)aye.a($$2.d) + 0.5, (double)aye.a($$2.e) + 0.5);

         for (jf $$5 : jf.values()) {
            evz $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbl($$6, $$4, $$0x -> $$0x.a(avu.bq))).c() != evx.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dcd $$0, dxj.a $$1, dxj.d $$2) {
         if ($$0 instanceof aqk $$3) {
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

      private static void a(aqk $$0, dxj.a $$1, dxj.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evz $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lo($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqk $$0, dxj.a $$1, dxj.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evz $$3 = $$1.c.c();
               dxe $$4 = $$2.b();
               evz $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aye.d($$8, $$3.c, $$5.c);
               double $$10 = aye.d($$8, $$3.d, $$5.d);
               double $$11 = aye.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lo($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqk $$0, dxj.a $$1, dxj.d $$2, dxh $$3) {
         ja $$4 = ja.a($$3.c());
         ja $$5 = $$2.b().a($$0).map(ja::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxj.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dcd $$0, ja $$1) {
         dbk $$2 = new dbk($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbk.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dxe b();

      boolean a(aqk var1, ja var2, jj<dxa> var3, dxa.a var4);

      void a(aqk var1, ja var2, jj<dxa> var3, @Nullable bsd var4, @Nullable bsd var5, float var6);

      default awk<dxa> c() {
         return awb.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aye.d($$0);
      }

      default boolean a(jj<dxa> $$0, dxa.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsd $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(awb.d)) {
                  if (this.d() && $$2 instanceof aql $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avu.br) : true;
         }
      }

      default void e() {
      }
   }
}
