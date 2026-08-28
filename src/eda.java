import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eda {
   List<aly<ecr>> d_ = List.of(
      ecr.T.h(),
      ecr.U.h(),
      ecr.V.h(),
      ecr.W.h(),
      ecr.X.h(),
      ecr.Y.h(),
      ecr.Z.h(),
      ecr.aa.h(),
      ecr.ab.h(),
      ecr.ac.h(),
      ecr.ad.h(),
      ecr.ae.h(),
      ecr.af.h(),
      ecr.ag.h(),
      ecr.ah.h()
   );
   int e_ = 0;
   ToIntFunction<aly<ecr>> f_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ecr.P.h(), 1);
      $$0.put(ecr.Q.h(), 1);
      $$0.put(ecr.x.h(), 1);
      $$0.put(ecr.J.h(), 2);
      $$0.put(ecr.A.h(), 2);
      $$0.put(ecr.O.h(), 2);
      $$0.put(ecr.C.h(), 3);
      $$0.put(ecr.K.h(), 3);
      $$0.put(ecr.B.h(), 3);
      $$0.put(ecr.u.h(), 4);
      $$0.put(ecr.n.h(), 4);
      $$0.put(ecr.S.h(), 4);
      $$0.put(ecr.q.h(), 5);
      $$0.put(ecr.v.h(), 5);
      $$0.put(ecr.r.h(), 6);
      $$0.put(ecr.M.h(), 6);
      $$0.put(ecr.s.h(), 6);
      $$0.put(ecr.o.h(), 7);
      $$0.put(ecr.l.h(), 8);
      $$0.put(ecr.m.h(), 8);
      $$0.put(ecr.j.h(), 9);
      $$0.put(ecr.d.h(), 9);
      $$0.put(ecr.e.h(), 9);
      $$0.put(ecr.g.h(), 9);
      $$0.put(ecr.k.h(), 10);
      $$0.put(ecr.h.h(), 10);
      $$0.put(ecr.a.h(), 10);
      $$0.put(ecr.b.h(), 10);
      $$0.put(ecr.I.h(), 10);
      $$0.put(ecr.H.h(), 10);
      $$0.put(ecr.c.h(), 11);
      $$0.put(ecr.f.h(), 12);
      $$0.put(ecr.y.h(), 12);
      $$0.put(ecr.i.h(), 13);
      $$0.put(ecr.z.h(), 13);
      $$0.put(ecr.t.h(), 14);
      $$0.put(ecr.G.h(), 14);
      $$0.put(ecr.R.h(), 14);
      $$0.put(ecr.p.h(), 15);
      $$0.put(ecr.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eda.a gp();

   eda.d gq();

   static int a_(jq<ecr> $$0) {
      return $$0.e().map(eda::a).orElse(0);
   }

   static int a(aly<ecr> $$0) {
      return f_.applyAsInt($$0);
   }

   static aly<ecr> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - bae.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eda.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecy.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecz.a.fieldOf("selector").forGetter(eda.a::a),
                  azn.l.fieldOf("event_delay").orElse(0).forGetter(eda.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eda.a((ecy)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ecy c;
      private int d;
      final ecz e;
      private boolean f;

      private a(@Nullable ecy $$0, ecz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecz(), 0, false);
      }

      public ecz a() {
         return this.e;
      }

      @Nullable
      public ecy b() {
         return this.c;
      }

      public void a(@Nullable ecy $$0) {
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

   public static class b implements ect {
      private final eda a;

      public b(eda $$0) {
         this.a = $$0;
      }

      @Override
      public ecv a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(ash $$0, jq<ecr> $$1, ecr.a $$2, fby $$3) {
         eda.a $$4 = this.a.gp();
         eda.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fby> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fby $$7 = $$6.get();
               if (!$$5.a($$0, jh.a((ka)$$3), $$1, $$2)) {
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

      public void b(ash $$0, jq<ecr> $$1, ecr.a $$2, fby $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(ash $$0, eda.a $$1, jq<ecr> $$2, ecr.a $$3, fby $$4, fby $$5) {
         $$1.e.a(new ecy($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ac());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dhi $$0, fby $$1, fby $$2) {
         fby $$3 = new fby((double)bae.a($$1.d) + 0.5, (double)bae.a($$1.e) + 0.5, (double)bae.a($$1.f) + 0.5);
         fby $$4 = new fby((double)bae.a($$2.d) + 0.5, (double)bae.a($$2.e) + 0.5, (double)bae.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            fby $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgp($$6, $$4, $$0x -> $$0x.a(axu.bs))).d() != fbw.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dhi $$0, eda.a $$1, eda.d $$2) {
         if ($$0 instanceof ash $$3) {
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

      private static void a(ash $$0, eda.a $$1, eda.d $$2) {
         $$1.a().a($$0.ac()).ifPresent($$3 -> {
            $$1.a($$3);
            fby $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ly($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ash $$0, eda.a $$1, eda.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fby $$3 = $$1.c.c();
               ecv $$4 = $$2.b();
               fby $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = bae.d($$8, $$3.d, $$5.d);
               double $$10 = bae.d($$8, $$3.e, $$5.e);
               double $$11 = bae.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new ly($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ash $$0, eda.a $$1, eda.d $$2, ecy $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eda.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dhi $$0, jh $$1) {
         dgo $$2 = new dgo($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dgo.c($$3, $$4)) || $$0.R().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ecv b();

      boolean a(ash var1, jh var2, jq<ecr> var3, ecr.a var4);

      void a(ash var1, jh var2, jq<ecr> var3, @Nullable bvk var4, @Nullable bvk var5, float var6);

      default ayk<ecr> c() {
         return ayb.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return bae.d($$0);
      }

      default boolean a(jq<ecr> $$0, ecr.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bvk $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.aa_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(ayb.d)) {
                  if (this.d() && $$2 instanceof asi $$3) {
                     ao.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axu.bt) : true;
         }
      }

      default void e() {
      }
   }
}
