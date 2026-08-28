import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ect {
   List<alo<eck>> d_ = List.of(
      eck.T.h(),
      eck.U.h(),
      eck.V.h(),
      eck.W.h(),
      eck.X.h(),
      eck.Y.h(),
      eck.Z.h(),
      eck.aa.h(),
      eck.ab.h(),
      eck.ac.h(),
      eck.ad.h(),
      eck.ae.h(),
      eck.af.h(),
      eck.ag.h(),
      eck.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alo<eck>> f_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eck.P.h(), 1);
      $$0.put(eck.Q.h(), 1);
      $$0.put(eck.x.h(), 1);
      $$0.put(eck.J.h(), 2);
      $$0.put(eck.A.h(), 2);
      $$0.put(eck.O.h(), 2);
      $$0.put(eck.C.h(), 3);
      $$0.put(eck.K.h(), 3);
      $$0.put(eck.B.h(), 3);
      $$0.put(eck.u.h(), 4);
      $$0.put(eck.n.h(), 4);
      $$0.put(eck.S.h(), 4);
      $$0.put(eck.q.h(), 5);
      $$0.put(eck.v.h(), 5);
      $$0.put(eck.r.h(), 6);
      $$0.put(eck.M.h(), 6);
      $$0.put(eck.s.h(), 6);
      $$0.put(eck.o.h(), 7);
      $$0.put(eck.l.h(), 8);
      $$0.put(eck.m.h(), 8);
      $$0.put(eck.j.h(), 9);
      $$0.put(eck.d.h(), 9);
      $$0.put(eck.e.h(), 9);
      $$0.put(eck.g.h(), 9);
      $$0.put(eck.k.h(), 10);
      $$0.put(eck.h.h(), 10);
      $$0.put(eck.a.h(), 10);
      $$0.put(eck.b.h(), 10);
      $$0.put(eck.I.h(), 10);
      $$0.put(eck.H.h(), 10);
      $$0.put(eck.c.h(), 11);
      $$0.put(eck.f.h(), 12);
      $$0.put(eck.y.h(), 12);
      $$0.put(eck.i.h(), 13);
      $$0.put(eck.z.h(), 13);
      $$0.put(eck.t.h(), 14);
      $$0.put(eck.G.h(), 14);
      $$0.put(eck.R.h(), 14);
      $$0.put(eck.p.h(), 15);
      $$0.put(eck.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ect.a gp();

   ect.d gq();

   static int a_(jq<eck> $$0) {
      return $$0.e().map(ect::a).orElse(0);
   }

   static int a(alo<eck> $$0) {
      return f_.applyAsInt($$0);
   }

   static alo<eck> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azu.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<ect.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecr.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecs.a.fieldOf("selector").forGetter(ect.a::a),
                  azd.l.fieldOf("event_delay").orElse(0).forGetter(ect.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new ect.a((ecr)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ecr c;
      private int d;
      final ecs e;
      private boolean f;

      private a(@Nullable ecr $$0, ecs $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecs(), 0, false);
      }

      public ecs a() {
         return this.e;
      }

      @Nullable
      public ecr b() {
         return this.c;
      }

      public void a(@Nullable ecr $$0) {
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

   public static class b implements ecm {
      private final ect a;

      public b(ect $$0) {
         this.a = $$0;
      }

      @Override
      public eco a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(arx $$0, jq<eck> $$1, eck.a $$2, fbr $$3) {
         ect.a $$4 = this.a.gp();
         ect.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fbr> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fbr $$7 = $$6.get();
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

      public void b(arx $$0, jq<eck> $$1, eck.a $$2, fbr $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(arx $$0, ect.a $$1, jq<eck> $$2, eck.a $$3, fbr $$4, fbr $$5) {
         $$1.e.a(new ecr($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ad());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dgz $$0, fbr $$1, fbr $$2) {
         fbr $$3 = new fbr((double)azu.a($$1.d) + 0.5, (double)azu.a($$1.e) + 0.5, (double)azu.a($$1.f) + 0.5);
         fbr $$4 = new fbr((double)azu.a($$2.d) + 0.5, (double)azu.a($$2.e) + 0.5, (double)azu.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            fbr $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgg($$6, $$4, $$0x -> $$0x.a(axk.bs))).d() != fbp.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dgz $$0, ect.a $$1, ect.d $$2) {
         if ($$0 instanceof arx $$3) {
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

      private static void a(arx $$0, ect.a $$1, ect.d $$2) {
         $$1.a().a($$0.ad()).ifPresent($$3 -> {
            $$1.a($$3);
            fbr $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ly($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arx $$0, ect.a $$1, ect.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fbr $$3 = $$1.c.c();
               eco $$4 = $$2.b();
               fbr $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azu.d($$8, $$3.d, $$5.d);
               double $$10 = azu.d($$8, $$3.e, $$5.e);
               double $$11 = azu.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new ly($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arx $$0, ect.a $$1, ect.d $$2, ecr $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ect.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dgz $$0, jh $$1) {
         dgf $$2 = new dgf($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dgf.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      eco b();

      boolean a(arx var1, jh var2, jq<eck> var3, eck.a var4);

      void a(arx var1, jh var2, jq<eck> var3, @Nullable bvb var4, @Nullable bvb var5, float var6);

      default aya<eck> c() {
         return axr.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azu.d($$0);
      }

      default boolean a(jq<eck> $$0, eck.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bvb $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.aa_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axr.d)) {
                  if (this.d() && $$2 instanceof ary $$3) {
                     ao.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axk.bt) : true;
         }
      }

      default void e() {
      }
   }
}
