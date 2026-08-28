import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ecs {
   List<aly<ecj>> d_ = List.of(
      ecj.T.h(),
      ecj.U.h(),
      ecj.V.h(),
      ecj.W.h(),
      ecj.X.h(),
      ecj.Y.h(),
      ecj.Z.h(),
      ecj.aa.h(),
      ecj.ab.h(),
      ecj.ac.h(),
      ecj.ad.h(),
      ecj.ae.h(),
      ecj.af.h(),
      ecj.ag.h(),
      ecj.ah.h()
   );
   int e_ = 0;
   ToIntFunction<aly<ecj>> f_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ecj.P.h(), 1);
      $$0.put(ecj.Q.h(), 1);
      $$0.put(ecj.x.h(), 1);
      $$0.put(ecj.J.h(), 2);
      $$0.put(ecj.A.h(), 2);
      $$0.put(ecj.O.h(), 2);
      $$0.put(ecj.C.h(), 3);
      $$0.put(ecj.K.h(), 3);
      $$0.put(ecj.B.h(), 3);
      $$0.put(ecj.u.h(), 4);
      $$0.put(ecj.n.h(), 4);
      $$0.put(ecj.S.h(), 4);
      $$0.put(ecj.q.h(), 5);
      $$0.put(ecj.v.h(), 5);
      $$0.put(ecj.r.h(), 6);
      $$0.put(ecj.M.h(), 6);
      $$0.put(ecj.s.h(), 6);
      $$0.put(ecj.o.h(), 7);
      $$0.put(ecj.l.h(), 8);
      $$0.put(ecj.m.h(), 8);
      $$0.put(ecj.j.h(), 9);
      $$0.put(ecj.d.h(), 9);
      $$0.put(ecj.e.h(), 9);
      $$0.put(ecj.g.h(), 9);
      $$0.put(ecj.k.h(), 10);
      $$0.put(ecj.h.h(), 10);
      $$0.put(ecj.a.h(), 10);
      $$0.put(ecj.b.h(), 10);
      $$0.put(ecj.I.h(), 10);
      $$0.put(ecj.H.h(), 10);
      $$0.put(ecj.c.h(), 11);
      $$0.put(ecj.f.h(), 12);
      $$0.put(ecj.y.h(), 12);
      $$0.put(ecj.i.h(), 13);
      $$0.put(ecj.z.h(), 13);
      $$0.put(ecj.t.h(), 14);
      $$0.put(ecj.G.h(), 14);
      $$0.put(ecj.R.h(), 14);
      $$0.put(ecj.p.h(), 15);
      $$0.put(ecj.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ecs.a gn();

   ecs.d go();

   static int a_(jq<ecj> $$0) {
      return $$0.e().map(ecs::a).orElse(0);
   }

   static int a(aly<ecj> $$0) {
      return f_.applyAsInt($$0);
   }

   static aly<ecj> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - bae.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<ecs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecq.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecr.a.fieldOf("selector").forGetter(ecs.a::a),
                  azn.l.fieldOf("event_delay").orElse(0).forGetter(ecs.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new ecs.a((ecq)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ecq c;
      private int d;
      final ecr e;
      private boolean f;

      private a(@Nullable ecq $$0, ecr $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecr(), 0, false);
      }

      public ecr a() {
         return this.e;
      }

      @Nullable
      public ecq b() {
         return this.c;
      }

      public void a(@Nullable ecq $$0) {
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

   public static class b implements ecl {
      private final ecs a;

      public b(ecs $$0) {
         this.a = $$0;
      }

      @Override
      public ecn a() {
         return this.a.go().b();
      }

      @Override
      public int b() {
         return this.a.go().a();
      }

      @Override
      public boolean a(ash $$0, jq<ecj> $$1, ecj.a $$2, fbs $$3) {
         ecs.a $$4 = this.a.gn();
         ecs.d $$5 = this.a.go();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fbs> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fbs $$7 = $$6.get();
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

      public void b(ash $$0, jq<ecj> $$1, ecj.a $$2, fbs $$3) {
         this.a.go().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gn(), $$1, $$2, $$3, $$4));
      }

      private void a(ash $$0, ecs.a $$1, jq<ecj> $$2, ecj.a $$3, fbs $$4, fbs $$5) {
         $$1.e.a(new ecq($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ac());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dha $$0, fbs $$1, fbs $$2) {
         fbs $$3 = new fbs((double)bae.a($$1.d) + 0.5, (double)bae.a($$1.e) + 0.5, (double)bae.a($$1.f) + 0.5);
         fbs $$4 = new fbs((double)bae.a($$2.d) + 0.5, (double)bae.a($$2.e) + 0.5, (double)bae.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            fbs $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgh($$6, $$4, $$0x -> $$0x.a(axu.bs))).d() != fbq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dha $$0, ecs.a $$1, ecs.d $$2) {
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

      private static void a(ash $$0, ecs.a $$1, ecs.d $$2) {
         $$1.a().a($$0.ac()).ifPresent($$3 -> {
            $$1.a($$3);
            fbs $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ly($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ash $$0, ecs.a $$1, ecs.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fbs $$3 = $$1.c.c();
               ecn $$4 = $$2.b();
               fbs $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(ash $$0, ecs.a $$1, ecs.d $$2, ecq $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ecs.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dha $$0, jh $$1) {
         dgg $$2 = new dgg($$1);

         for (int $$3 = $$2.g - 1; $$3 <= $$2.g + 1; $$3++) {
            for (int $$4 = $$2.h - 1; $$4 <= $$2.h + 1; $$4++) {
               if (!$$0.a(dgg.c($$3, $$4)) || $$0.R().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ecn b();

      boolean a(ash var1, jh var2, jq<ecj> var3, ecj.a var4);

      void a(ash var1, jh var2, jq<ecj> var3, @Nullable bvf var4, @Nullable bvf var5, float var6);

      default ayk<ecj> c() {
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

      default boolean a(jq<ecj> $$0, ecj.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bvf $$2 = $$1.a();
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
