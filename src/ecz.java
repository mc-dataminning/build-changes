import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ecz {
   List<aly<ecq>> d_ = List.of(
      ecq.T.h(),
      ecq.U.h(),
      ecq.V.h(),
      ecq.W.h(),
      ecq.X.h(),
      ecq.Y.h(),
      ecq.Z.h(),
      ecq.aa.h(),
      ecq.ab.h(),
      ecq.ac.h(),
      ecq.ad.h(),
      ecq.ae.h(),
      ecq.af.h(),
      ecq.ag.h(),
      ecq.ah.h()
   );
   int e_ = 0;
   ToIntFunction<aly<ecq>> f_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ecq.P.h(), 1);
      $$0.put(ecq.Q.h(), 1);
      $$0.put(ecq.x.h(), 1);
      $$0.put(ecq.J.h(), 2);
      $$0.put(ecq.A.h(), 2);
      $$0.put(ecq.O.h(), 2);
      $$0.put(ecq.C.h(), 3);
      $$0.put(ecq.K.h(), 3);
      $$0.put(ecq.B.h(), 3);
      $$0.put(ecq.u.h(), 4);
      $$0.put(ecq.n.h(), 4);
      $$0.put(ecq.S.h(), 4);
      $$0.put(ecq.q.h(), 5);
      $$0.put(ecq.v.h(), 5);
      $$0.put(ecq.r.h(), 6);
      $$0.put(ecq.M.h(), 6);
      $$0.put(ecq.s.h(), 6);
      $$0.put(ecq.o.h(), 7);
      $$0.put(ecq.l.h(), 8);
      $$0.put(ecq.m.h(), 8);
      $$0.put(ecq.j.h(), 9);
      $$0.put(ecq.d.h(), 9);
      $$0.put(ecq.e.h(), 9);
      $$0.put(ecq.g.h(), 9);
      $$0.put(ecq.k.h(), 10);
      $$0.put(ecq.h.h(), 10);
      $$0.put(ecq.a.h(), 10);
      $$0.put(ecq.b.h(), 10);
      $$0.put(ecq.I.h(), 10);
      $$0.put(ecq.H.h(), 10);
      $$0.put(ecq.c.h(), 11);
      $$0.put(ecq.f.h(), 12);
      $$0.put(ecq.y.h(), 12);
      $$0.put(ecq.i.h(), 13);
      $$0.put(ecq.z.h(), 13);
      $$0.put(ecq.t.h(), 14);
      $$0.put(ecq.G.h(), 14);
      $$0.put(ecq.R.h(), 14);
      $$0.put(ecq.p.h(), 15);
      $$0.put(ecq.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ecz.a gn();

   ecz.d go();

   static int a_(jq<ecq> $$0) {
      return $$0.e().map(ecz::a).orElse(0);
   }

   static int a(aly<ecq> $$0) {
      return f_.applyAsInt($$0);
   }

   static aly<ecq> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - bae.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<ecz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecx.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecy.a.fieldOf("selector").forGetter(ecz.a::a),
                  azn.l.fieldOf("event_delay").orElse(0).forGetter(ecz.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new ecz.a((ecx)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ecx c;
      private int d;
      final ecy e;
      private boolean f;

      private a(@Nullable ecx $$0, ecy $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecy(), 0, false);
      }

      public ecy a() {
         return this.e;
      }

      @Nullable
      public ecx b() {
         return this.c;
      }

      public void a(@Nullable ecx $$0) {
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

   public static class b implements ecs {
      private final ecz a;

      public b(ecz $$0) {
         this.a = $$0;
      }

      @Override
      public ecu a() {
         return this.a.go().b();
      }

      @Override
      public int b() {
         return this.a.go().a();
      }

      @Override
      public boolean a(ash $$0, jq<ecq> $$1, ecq.a $$2, fbx $$3) {
         ecz.a $$4 = this.a.gn();
         ecz.d $$5 = this.a.go();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fbx> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fbx $$7 = $$6.get();
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

      public void b(ash $$0, jq<ecq> $$1, ecq.a $$2, fbx $$3) {
         this.a.go().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gn(), $$1, $$2, $$3, $$4));
      }

      private void a(ash $$0, ecz.a $$1, jq<ecq> $$2, ecq.a $$3, fbx $$4, fbx $$5) {
         $$1.e.a(new ecx($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ac());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dhh $$0, fbx $$1, fbx $$2) {
         fbx $$3 = new fbx((double)bae.a($$1.d) + 0.5, (double)bae.a($$1.e) + 0.5, (double)bae.a($$1.f) + 0.5);
         fbx $$4 = new fbx((double)bae.a($$2.d) + 0.5, (double)bae.a($$2.e) + 0.5, (double)bae.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            fbx $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgo($$6, $$4, $$0x -> $$0x.a(axu.bs))).d() != fbv.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dhh $$0, ecz.a $$1, ecz.d $$2) {
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

      private static void a(ash $$0, ecz.a $$1, ecz.d $$2) {
         $$1.a().a($$0.ac()).ifPresent($$3 -> {
            $$1.a($$3);
            fbx $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ly($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ash $$0, ecz.a $$1, ecz.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fbx $$3 = $$1.c.c();
               ecu $$4 = $$2.b();
               fbx $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(ash $$0, ecz.a $$1, ecz.d $$2, ecx $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ecz.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dhh $$0, jh $$1) {
         dgn $$2 = new dgn($$1);

         for (int $$3 = $$2.g - 1; $$3 <= $$2.g + 1; $$3++) {
            for (int $$4 = $$2.h - 1; $$4 <= $$2.h + 1; $$4++) {
               if (!$$0.a(dgn.c($$3, $$4)) || $$0.R().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ecu b();

      boolean a(ash var1, jh var2, jq<ecq> var3, ecq.a var4);

      void a(ash var1, jh var2, jq<ecq> var3, @Nullable bvj var4, @Nullable bvj var5, float var6);

      default ayk<ecq> c() {
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

      default boolean a(jq<ecq> $$0, ecq.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bvj $$2 = $$1.a();
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
