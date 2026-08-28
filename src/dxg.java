import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxg {
   List<ale<dwx>> e_ = List.of(
      dwx.T.h(),
      dwx.U.h(),
      dwx.V.h(),
      dwx.W.h(),
      dwx.X.h(),
      dwx.Y.h(),
      dwx.Z.h(),
      dwx.aa.h(),
      dwx.ab.h(),
      dwx.ac.h(),
      dwx.ad.h(),
      dwx.ae.h(),
      dwx.af.h(),
      dwx.ag.h(),
      dwx.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ale<dwx>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dwx.P.h(), 1);
      $$0.put(dwx.Q.h(), 1);
      $$0.put(dwx.x.h(), 1);
      $$0.put(dwx.J.h(), 2);
      $$0.put(dwx.A.h(), 2);
      $$0.put(dwx.O.h(), 2);
      $$0.put(dwx.C.h(), 3);
      $$0.put(dwx.K.h(), 3);
      $$0.put(dwx.B.h(), 3);
      $$0.put(dwx.u.h(), 4);
      $$0.put(dwx.n.h(), 4);
      $$0.put(dwx.S.h(), 4);
      $$0.put(dwx.q.h(), 5);
      $$0.put(dwx.v.h(), 5);
      $$0.put(dwx.r.h(), 6);
      $$0.put(dwx.M.h(), 6);
      $$0.put(dwx.s.h(), 6);
      $$0.put(dwx.o.h(), 7);
      $$0.put(dwx.l.h(), 8);
      $$0.put(dwx.m.h(), 8);
      $$0.put(dwx.j.h(), 9);
      $$0.put(dwx.d.h(), 9);
      $$0.put(dwx.e.h(), 9);
      $$0.put(dwx.g.h(), 9);
      $$0.put(dwx.k.h(), 10);
      $$0.put(dwx.h.h(), 10);
      $$0.put(dwx.a.h(), 10);
      $$0.put(dwx.b.h(), 10);
      $$0.put(dwx.I.h(), 10);
      $$0.put(dwx.H.h(), 10);
      $$0.put(dwx.c.h(), 11);
      $$0.put(dwx.f.h(), 12);
      $$0.put(dwx.y.h(), 12);
      $$0.put(dwx.i.h(), 13);
      $$0.put(dwx.z.h(), 13);
      $$0.put(dwx.t.h(), 14);
      $$0.put(dwx.G.h(), 14);
      $$0.put(dwx.R.h(), 14);
      $$0.put(dwx.p.h(), 15);
      $$0.put(dwx.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxg.a gs();

   dxg.d gt();

   static int a_(ji<dwx> $$0) {
      return $$0.e().map(dxg::a).orElse(0);
   }

   static int a(ale<dwx> $$0) {
      return g_.applyAsInt($$0);
   }

   static ale<dwx> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxe.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxf.a.fieldOf("selector").forGetter(dxg.a::a),
                  ayh.k.fieldOf("event_delay").orElse(0).forGetter(dxg.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxg.a((dxe)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxe c;
      private int d;
      final dxf e;
      private boolean f;

      private a(@Nullable dxe $$0, dxf $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxf(), 0, false);
      }

      public dxf a() {
         return this.e;
      }

      @Nullable
      public dxe b() {
         return this.c;
      }

      public void a(@Nullable dxe $$0) {
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

   public static class b implements dwz {
      private final dxg a;

      public b(dxg $$0) {
         this.a = $$0;
      }

      @Override
      public dxb a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(arf $$0, ji<dwx> $$1, dwx.a $$2, evt $$3) {
         dxg.a $$4 = this.a.gs();
         dxg.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evt> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evt $$7 = $$6.get();
               if (!$$5.a($$0, iz.a($$3), $$1, $$2)) {
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

      public void b(arf $$0, ji<dwx> $$1, dwx.a $$2, evt $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gs(), $$1, $$2, $$3, $$4));
      }

      private void a(arf $$0, dxg.a $$1, ji<dwx> $$2, dwx.a $$3, evt $$4, evt $$5) {
         $$1.e.a(new dxe($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(iz $$0, iz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dca $$0, evt $$1, evt $$2) {
         evt $$3 = new evt((double)ayz.a($$1.c) + 0.5, (double)ayz.a($$1.d) + 0.5, (double)ayz.a($$1.e) + 0.5);
         evt $$4 = new evt((double)ayz.a($$2.c) + 0.5, (double)ayz.a($$2.d) + 0.5, (double)ayz.a($$2.e) + 0.5);

         for (je $$5 : je.values()) {
            evt $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbi($$6, $$4, $$0x -> $$0x.a(awp.bq))).c() != evr.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dca $$0, dxg.a $$1, dxg.d $$2) {
         if ($$0 instanceof arf $$3) {
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

      private static void a(arf $$0, dxg.a $$1, dxg.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evt $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ln($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arf $$0, dxg.a $$1, dxg.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evt $$3 = $$1.c.c();
               dxb $$4 = $$2.b();
               evt $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayz.d($$8, $$3.c, $$5.c);
               double $$10 = ayz.d($$8, $$3.d, $$5.d);
               double $$11 = ayz.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ln($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arf $$0, dxg.a $$1, dxg.d $$2, dxe $$3) {
         iz $$4 = iz.a($$3.c());
         iz $$5 = $$2.b().a($$0).map(iz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxg.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dca $$0, iz $$1) {
         dbh $$2 = new dbh($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbh.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dxb b();

      boolean a(arf var1, iz var2, ji<dwx> var3, dwx.a var4);

      void a(arf var1, iz var2, ji<dwx> var3, @Nullable bsw var4, @Nullable bsw var5, float var6);

      default axf<dwx> c() {
         return aww.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayz.d($$0);
      }

      default boolean a(ji<dwx> $$0, dwx.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsw $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(aww.d)) {
                  if (this.d() && $$2 instanceof arg $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awp.br) : true;
         }
      }

      default void e() {
      }
   }
}
