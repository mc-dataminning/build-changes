import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dqf {
   List<aix<dpw>> e_ = List.of(
      dpw.T.h(),
      dpw.U.h(),
      dpw.V.h(),
      dpw.W.h(),
      dpw.X.h(),
      dpw.Y.h(),
      dpw.Z.h(),
      dpw.aa.h(),
      dpw.ab.h(),
      dpw.ac.h(),
      dpw.ad.h(),
      dpw.ae.h(),
      dpw.af.h(),
      dpw.ag.h(),
      dpw.ah.h()
   );
   int f_ = 0;
   ToIntFunction<aix<dpw>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dpw.P.h(), 1);
      $$0.put(dpw.Q.h(), 1);
      $$0.put(dpw.x.h(), 1);
      $$0.put(dpw.J.h(), 2);
      $$0.put(dpw.A.h(), 2);
      $$0.put(dpw.O.h(), 2);
      $$0.put(dpw.C.h(), 3);
      $$0.put(dpw.K.h(), 3);
      $$0.put(dpw.B.h(), 3);
      $$0.put(dpw.u.h(), 4);
      $$0.put(dpw.n.h(), 4);
      $$0.put(dpw.S.h(), 4);
      $$0.put(dpw.q.h(), 5);
      $$0.put(dpw.v.h(), 5);
      $$0.put(dpw.r.h(), 6);
      $$0.put(dpw.M.h(), 6);
      $$0.put(dpw.s.h(), 6);
      $$0.put(dpw.o.h(), 7);
      $$0.put(dpw.l.h(), 8);
      $$0.put(dpw.m.h(), 8);
      $$0.put(dpw.j.h(), 9);
      $$0.put(dpw.d.h(), 9);
      $$0.put(dpw.e.h(), 9);
      $$0.put(dpw.g.h(), 9);
      $$0.put(dpw.k.h(), 10);
      $$0.put(dpw.h.h(), 10);
      $$0.put(dpw.a.h(), 10);
      $$0.put(dpw.b.h(), 10);
      $$0.put(dpw.I.h(), 10);
      $$0.put(dpw.H.h(), 10);
      $$0.put(dpw.c.h(), 11);
      $$0.put(dpw.f.h(), 12);
      $$0.put(dpw.y.h(), 12);
      $$0.put(dpw.i.h(), 13);
      $$0.put(dpw.z.h(), 13);
      $$0.put(dpw.t.h(), 14);
      $$0.put(dpw.G.h(), 14);
      $$0.put(dpw.R.h(), 14);
      $$0.put(dpw.p.h(), 15);
      $$0.put(dpw.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dqf.a gi();

   dqf.d gj();

   static int a_(ij<dpw> $$0) {
      return $$0.e().map(dqf::a).orElse(0);
   }

   static int a(aix<dpw> $$0) {
      return g_.applyAsInt($$0);
   }

   static aix<dpw> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - awi.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dqf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dqd.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dqe.a.fieldOf("selector").forGetter(dqf.a::a),
                  avq.i.fieldOf("event_delay").orElse(0).forGetter(dqf.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dqf.a((dqd)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dqd c;
      private int d;
      final dqe e;
      private boolean f;

      private a(@Nullable dqd $$0, dqe $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dqe(), 0, false);
      }

      public dqe a() {
         return this.e;
      }

      @Nullable
      public dqd b() {
         return this.c;
      }

      public void a(@Nullable dqd $$0) {
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

   public static class b implements dpy {
      private final dqf a;

      public b(dqf $$0) {
         this.a = $$0;
      }

      @Override
      public dqa a() {
         return this.a.gj().b();
      }

      @Override
      public int b() {
         return this.a.gj().a();
      }

      @Override
      public boolean a(aow $$0, ij<dpw> $$1, dpw.a $$2, enz $$3) {
         dqf.a $$4 = this.a.gi();
         dqf.d $$5 = this.a.gj();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<enz> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               enz $$7 = $$6.get();
               if (!$$5.a($$0, hz.a($$3), $$1, $$2)) {
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

      public void b(aow $$0, ij<dpw> $$1, dpw.a $$2, enz $$3) {
         this.a.gj().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gi(), $$1, $$2, $$3, $$4));
      }

      private void a(aow $$0, dqf.a $$1, ij<dpw> $$2, dpw.a $$3, enz $$4, enz $$5) {
         $$1.e.a(new dqd($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hz $$0, hz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cvr $$0, enz $$1, enz $$2) {
         enz $$3 = new enz((double)awi.a($$1.c) + 0.5, (double)awi.a($$1.d) + 0.5, (double)awi.a($$1.e) + 0.5);
         enz $$4 = new enz((double)awi.a($$2.c) + 0.5, (double)awi.a($$2.d) + 0.5, (double)awi.a($$2.e) + 0.5);

         for (ie $$5 : ie.values()) {
            enz $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cuz($$6, $$4, $$0x -> $$0x.a(aua.bp))).c() != enx.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cvr $$0, dqf.a $$1, dqf.d $$2) {
         if ($$0 instanceof aow $$3) {
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

      private static void a(aow $$0, dqf.a $$1, dqf.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            enz $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kd($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aow $$0, dqf.a $$1, dqf.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               enz $$3 = $$1.c.c();
               dqa $$4 = $$2.b();
               enz $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = awi.d($$8, $$3.c, $$5.c);
               double $$10 = awi.d($$8, $$3.d, $$5.d);
               double $$11 = awi.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kd($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aow $$0, dqf.a $$1, dqf.d $$2, dqd $$3) {
         hz $$4 = hz.a($$3.c());
         hz $$5 = $$2.b().a($$0).map(hz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dqf.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cvr $$0, hz $$1) {
         cuy $$2 = new cuy($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cuy.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dqa b();

      boolean a(aow var1, hz var2, ij<dpw> var3, dpw.a var4);

      void a(aow var1, hz var2, ij<dpw> var3, @Nullable bnq var4, @Nullable bnq var5, float var6);

      default aup<dpw> c() {
         return aug.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return awi.d($$0);
      }

      default boolean a(ij<dpw> $$0, dpw.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bnq $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(aug.d)) {
                  if (this.d() && $$2 instanceof aox $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(aua.bq) : true;
         }
      }

      default void e() {
      }
   }
}
