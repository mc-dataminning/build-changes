import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dwz {
   List<ala<dwq>> e_ = List.of(
      dwq.T.h(),
      dwq.U.h(),
      dwq.V.h(),
      dwq.W.h(),
      dwq.X.h(),
      dwq.Y.h(),
      dwq.Z.h(),
      dwq.aa.h(),
      dwq.ab.h(),
      dwq.ac.h(),
      dwq.ad.h(),
      dwq.ae.h(),
      dwq.af.h(),
      dwq.ag.h(),
      dwq.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ala<dwq>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dwq.P.h(), 1);
      $$0.put(dwq.Q.h(), 1);
      $$0.put(dwq.x.h(), 1);
      $$0.put(dwq.J.h(), 2);
      $$0.put(dwq.A.h(), 2);
      $$0.put(dwq.O.h(), 2);
      $$0.put(dwq.C.h(), 3);
      $$0.put(dwq.K.h(), 3);
      $$0.put(dwq.B.h(), 3);
      $$0.put(dwq.u.h(), 4);
      $$0.put(dwq.n.h(), 4);
      $$0.put(dwq.S.h(), 4);
      $$0.put(dwq.q.h(), 5);
      $$0.put(dwq.v.h(), 5);
      $$0.put(dwq.r.h(), 6);
      $$0.put(dwq.M.h(), 6);
      $$0.put(dwq.s.h(), 6);
      $$0.put(dwq.o.h(), 7);
      $$0.put(dwq.l.h(), 8);
      $$0.put(dwq.m.h(), 8);
      $$0.put(dwq.j.h(), 9);
      $$0.put(dwq.d.h(), 9);
      $$0.put(dwq.e.h(), 9);
      $$0.put(dwq.g.h(), 9);
      $$0.put(dwq.k.h(), 10);
      $$0.put(dwq.h.h(), 10);
      $$0.put(dwq.a.h(), 10);
      $$0.put(dwq.b.h(), 10);
      $$0.put(dwq.I.h(), 10);
      $$0.put(dwq.H.h(), 10);
      $$0.put(dwq.c.h(), 11);
      $$0.put(dwq.f.h(), 12);
      $$0.put(dwq.y.h(), 12);
      $$0.put(dwq.i.h(), 13);
      $$0.put(dwq.z.h(), 13);
      $$0.put(dwq.t.h(), 14);
      $$0.put(dwq.G.h(), 14);
      $$0.put(dwq.R.h(), 14);
      $$0.put(dwq.p.h(), 15);
      $$0.put(dwq.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dwz.a gs();

   dwz.d gt();

   static int a_(ji<dwq> $$0) {
      return $$0.e().map(dwz::a).orElse(0);
   }

   static int a(ala<dwq> $$0) {
      return g_.applyAsInt($$0);
   }

   static ala<dwq> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayu.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dwz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dwx.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dwy.a.fieldOf("selector").forGetter(dwz.a::a),
                  ayc.k.fieldOf("event_delay").orElse(0).forGetter(dwz.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dwz.a((dwx)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dwx c;
      private int d;
      final dwy e;
      private boolean f;

      private a(@Nullable dwx $$0, dwy $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dwy(), 0, false);
      }

      public dwy a() {
         return this.e;
      }

      @Nullable
      public dwx b() {
         return this.c;
      }

      public void a(@Nullable dwx $$0) {
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

   public static class b implements dws {
      private final dwz a;

      public b(dwz $$0) {
         this.a = $$0;
      }

      @Override
      public dwu a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(arb $$0, ji<dwq> $$1, dwq.a $$2, evm $$3) {
         dwz.a $$4 = this.a.gs();
         dwz.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evm> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evm $$7 = $$6.get();
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

      public void b(arb $$0, ji<dwq> $$1, dwq.a $$2, evm $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gs(), $$1, $$2, $$3, $$4));
      }

      private void a(arb $$0, dwz.a $$1, ji<dwq> $$2, dwq.a $$3, evm $$4, evm $$5) {
         $$1.e.a(new dwx($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(iz $$0, iz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dbt $$0, evm $$1, evm $$2) {
         evm $$3 = new evm((double)ayu.a($$1.c) + 0.5, (double)ayu.a($$1.d) + 0.5, (double)ayu.a($$1.e) + 0.5);
         evm $$4 = new evm((double)ayu.a($$2.c) + 0.5, (double)ayu.a($$2.d) + 0.5, (double)ayu.a($$2.e) + 0.5);

         for (je $$5 : je.values()) {
            evm $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbb($$6, $$4, $$0x -> $$0x.a(awl.bq))).c() != evk.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dbt $$0, dwz.a $$1, dwz.d $$2) {
         if ($$0 instanceof arb $$3) {
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

      private static void a(arb $$0, dwz.a $$1, dwz.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evm $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ln($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arb $$0, dwz.a $$1, dwz.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evm $$3 = $$1.c.c();
               dwu $$4 = $$2.b();
               evm $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayu.d($$8, $$3.c, $$5.c);
               double $$10 = ayu.d($$8, $$3.d, $$5.d);
               double $$11 = ayu.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ln($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arb $$0, dwz.a $$1, dwz.d $$2, dwx $$3) {
         iz $$4 = iz.a($$3.c());
         iz $$5 = $$2.b().a($$0).map(iz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dwz.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dbt $$0, iz $$1) {
         dba $$2 = new dba($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dba.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dwu b();

      boolean a(arb var1, iz var2, ji<dwq> var3, dwq.a var4);

      void a(arb var1, iz var2, ji<dwq> var3, @Nullable bsp var4, @Nullable bsp var5, float var6);

      default axb<dwq> c() {
         return aws.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayu.d($$0);
      }

      default boolean a(ji<dwq> $$0, dwq.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsp $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(aws.d)) {
                  if (this.d() && $$2 instanceof arc $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awl.br) : true;
         }
      }

      default void e() {
      }
   }
}
