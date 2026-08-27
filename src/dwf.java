import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dwf {
   List<akm<dvw>> e_ = List.of(
      dvw.T.h(),
      dvw.U.h(),
      dvw.V.h(),
      dvw.W.h(),
      dvw.X.h(),
      dvw.Y.h(),
      dvw.Z.h(),
      dvw.aa.h(),
      dvw.ab.h(),
      dvw.ac.h(),
      dvw.ad.h(),
      dvw.ae.h(),
      dvw.af.h(),
      dvw.ag.h(),
      dvw.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akm<dvw>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dvw.P.h(), 1);
      $$0.put(dvw.Q.h(), 1);
      $$0.put(dvw.x.h(), 1);
      $$0.put(dvw.J.h(), 2);
      $$0.put(dvw.A.h(), 2);
      $$0.put(dvw.O.h(), 2);
      $$0.put(dvw.C.h(), 3);
      $$0.put(dvw.K.h(), 3);
      $$0.put(dvw.B.h(), 3);
      $$0.put(dvw.u.h(), 4);
      $$0.put(dvw.n.h(), 4);
      $$0.put(dvw.S.h(), 4);
      $$0.put(dvw.q.h(), 5);
      $$0.put(dvw.v.h(), 5);
      $$0.put(dvw.r.h(), 6);
      $$0.put(dvw.M.h(), 6);
      $$0.put(dvw.s.h(), 6);
      $$0.put(dvw.o.h(), 7);
      $$0.put(dvw.l.h(), 8);
      $$0.put(dvw.m.h(), 8);
      $$0.put(dvw.j.h(), 9);
      $$0.put(dvw.d.h(), 9);
      $$0.put(dvw.e.h(), 9);
      $$0.put(dvw.g.h(), 9);
      $$0.put(dvw.k.h(), 10);
      $$0.put(dvw.h.h(), 10);
      $$0.put(dvw.a.h(), 10);
      $$0.put(dvw.b.h(), 10);
      $$0.put(dvw.I.h(), 10);
      $$0.put(dvw.H.h(), 10);
      $$0.put(dvw.c.h(), 11);
      $$0.put(dvw.f.h(), 12);
      $$0.put(dvw.y.h(), 12);
      $$0.put(dvw.i.h(), 13);
      $$0.put(dvw.z.h(), 13);
      $$0.put(dvw.t.h(), 14);
      $$0.put(dvw.G.h(), 14);
      $$0.put(dvw.R.h(), 14);
      $$0.put(dvw.p.h(), 15);
      $$0.put(dvw.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dwf.a gr();

   dwf.d gs();

   static int a_(ix<dvw> $$0) {
      return $$0.e().map(dwf::a).orElse(0);
   }

   static int a(akm<dvw> $$0) {
      return g_.applyAsInt($$0);
   }

   static akm<dvw> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayf.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dwf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dwd.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dwe.a.fieldOf("selector").forGetter(dwf.a::a),
                  axn.i.fieldOf("event_delay").orElse(0).forGetter(dwf.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dwf.a((dwd)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dwd c;
      private int d;
      final dwe e;
      private boolean f;

      private a(@Nullable dwd $$0, dwe $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dwe(), 0, false);
      }

      public dwe a() {
         return this.e;
      }

      @Nullable
      public dwd b() {
         return this.c;
      }

      public void a(@Nullable dwd $$0) {
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

   public static class b implements dvy {
      private final dwf a;

      public b(dwf $$0) {
         this.a = $$0;
      }

      @Override
      public dwa a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(aqn $$0, ix<dvw> $$1, dvw.a $$2, eum $$3) {
         dwf.a $$4 = this.a.gr();
         dwf.d $$5 = this.a.gs();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eum> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eum $$7 = $$6.get();
               if (!$$5.a($$0, io.a($$3), $$1, $$2)) {
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

      public void b(aqn $$0, ix<dvw> $$1, dvw.a $$2, eum $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gr(), $$1, $$2, $$3, $$4));
      }

      private void a(aqn $$0, dwf.a $$1, ix<dvw> $$2, dvw.a $$3, eum $$4, eum $$5) {
         $$1.e.a(new dwd($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(io $$0, io $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(daz $$0, eum $$1, eum $$2) {
         eum $$3 = new eum((double)ayf.a($$1.c) + 0.5, (double)ayf.a($$1.d) + 0.5, (double)ayf.a($$1.e) + 0.5);
         eum $$4 = new eum((double)ayf.a($$2.c) + 0.5, (double)ayf.a($$2.d) + 0.5, (double)ayf.a($$2.e) + 0.5);

         for (it $$5 : it.values()) {
            eum $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dah($$6, $$4, $$0x -> $$0x.a(avx.bq))).c() != euk.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(daz $$0, dwf.a $$1, dwf.d $$2) {
         if ($$0 instanceof aqn $$3) {
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

      private static void a(aqn $$0, dwf.a $$1, dwf.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            eum $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lc($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqn $$0, dwf.a $$1, dwf.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eum $$3 = $$1.c.c();
               dwa $$4 = $$2.b();
               eum $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayf.d($$8, $$3.c, $$5.c);
               double $$10 = ayf.d($$8, $$3.d, $$5.d);
               double $$11 = ayf.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lc($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqn $$0, dwf.a $$1, dwf.d $$2, dwd $$3) {
         io $$4 = io.a($$3.c());
         io $$5 = $$2.b().a($$0).map(io::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dwf.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(daz $$0, io $$1) {
         dag $$2 = new dag($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dag.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dwa b();

      boolean a(aqn var1, io var2, ix<dvw> var3, dvw.a var4);

      void a(aqn var1, io var2, ix<dvw> var3, @Nullable brw var4, @Nullable brw var5, float var6);

      default awm<dvw> c() {
         return awd.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayf.d($$0);
      }

      default boolean a(ix<dvw> $$0, dvw.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            brw $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(awd.d)) {
                  if (this.d() && $$2 instanceof aqo $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avx.br) : true;
         }
      }

      default void e() {
      }
   }
}
