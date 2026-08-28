import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface egn {
   List<alh<ege>> c_ = List.of(
      ege.T.h(),
      ege.U.h(),
      ege.V.h(),
      ege.W.h(),
      ege.X.h(),
      ege.Y.h(),
      ege.Z.h(),
      ege.aa.h(),
      ege.ab.h(),
      ege.ac.h(),
      ege.ad.h(),
      ege.ae.h(),
      ege.af.h(),
      ege.ag.h(),
      ege.ah.h()
   );
   int d_ = 0;
   ToIntFunction<alh<ege>> e_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ege.P.h(), 1);
      $$0.put(ege.Q.h(), 1);
      $$0.put(ege.x.h(), 1);
      $$0.put(ege.J.h(), 2);
      $$0.put(ege.A.h(), 2);
      $$0.put(ege.O.h(), 2);
      $$0.put(ege.C.h(), 3);
      $$0.put(ege.K.h(), 3);
      $$0.put(ege.B.h(), 3);
      $$0.put(ege.u.h(), 4);
      $$0.put(ege.n.h(), 4);
      $$0.put(ege.S.h(), 4);
      $$0.put(ege.q.h(), 5);
      $$0.put(ege.v.h(), 5);
      $$0.put(ege.r.h(), 6);
      $$0.put(ege.M.h(), 6);
      $$0.put(ege.s.h(), 6);
      $$0.put(ege.o.h(), 7);
      $$0.put(ege.l.h(), 8);
      $$0.put(ege.m.h(), 8);
      $$0.put(ege.j.h(), 9);
      $$0.put(ege.d.h(), 9);
      $$0.put(ege.e.h(), 9);
      $$0.put(ege.g.h(), 9);
      $$0.put(ege.k.h(), 10);
      $$0.put(ege.h.h(), 10);
      $$0.put(ege.a.h(), 10);
      $$0.put(ege.b.h(), 10);
      $$0.put(ege.I.h(), 10);
      $$0.put(ege.H.h(), 10);
      $$0.put(ege.c.h(), 11);
      $$0.put(ege.f.h(), 12);
      $$0.put(ege.y.h(), 12);
      $$0.put(ege.i.h(), 13);
      $$0.put(ege.z.h(), 13);
      $$0.put(ege.t.h(), 14);
      $$0.put(ege.G.h(), 14);
      $$0.put(ege.R.h(), 14);
      $$0.put(ege.p.h(), 15);
      $$0.put(ege.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   egn.a x();

   egn.d gu();

   static int a_(jf<ege> $$0) {
      return $$0.e().map(egn::a).orElse(0);
   }

   static int a(alh<ege> $$0) {
      return e_.applyAsInt($$0);
   }

   static alh<ege> b(int $$0) {
      return c_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azo.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<egn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  egl.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  egm.a.fieldOf("selector").forGetter(egn.a::a),
                  ayw.l.fieldOf("event_delay").orElse(0).forGetter(egn.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new egn.a((egl)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      egl c;
      private int d;
      final egm e;
      private boolean f;

      private a(@Nullable egl $$0, egm $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new egm(), 0, false);
      }

      public egm a() {
         return this.e;
      }

      @Nullable
      public egl b() {
         return this.c;
      }

      public void a(@Nullable egl $$0) {
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

   public static class b implements egg {
      private final egn a;

      public b(egn $$0) {
         this.a = $$0;
      }

      @Override
      public egi a() {
         return this.a.gu().b();
      }

      @Override
      public int b() {
         return this.a.gu().a();
      }

      @Override
      public boolean a(ars $$0, jf<ege> $$1, ege.a $$2, ffq $$3) {
         egn.a $$4 = this.a.x();
         egn.d $$5 = this.a.gu();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ffq> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ffq $$7 = $$6.get();
               if (!$$5.a($$0, iv.a((jp)$$3), $$1, $$2)) {
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

      public void b(ars $$0, jf<ege> $$1, ege.a $$2, ffq $$3) {
         this.a.gu().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(ars $$0, egn.a $$1, jf<ege> $$2, ege.a $$3, ffq $$4, ffq $$5) {
         $$1.e.a(new egl($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iv $$0, iv $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(djx $$0, ffq $$1, ffq $$2) {
         ffq $$3 = new ffq((double)azo.a($$1.d) + 0.5, (double)azo.a($$1.e) + 0.5, (double)azo.a($$1.f) + 0.5);
         ffq $$4 = new ffq((double)azo.a($$2.d) + 0.5, (double)azo.a($$2.e) + 0.5, (double)azo.a($$2.f) + 0.5);

         for (jb $$5 : jb.values()) {
            ffq $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new djd($$6, $$4, $$0x -> $$0x.a(axe.bt))).d() != ffo.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(djx $$0, egn.a $$1, egn.d $$2) {
         if ($$0 instanceof ars $$3) {
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

      private static void a(ars $$0, egn.a $$1, egn.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            ffq $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new me($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ars $$0, egn.a $$1, egn.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ffq $$3 = $$1.c.c();
               egi $$4 = $$2.b();
               ffq $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azo.d($$8, $$3.d, $$5.d);
               double $$10 = azo.d($$8, $$3.e, $$5.e);
               double $$11 = azo.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new me($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ars $$0, egn.a $$1, egn.d $$2, egl $$3) {
         iv $$4 = iv.a((jp)$$3.c());
         iv $$5 = $$2.b().a($$0).map(iv::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), egn.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(djx $$0, iv $$1) {
         djc $$2 = new djc($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(djc.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      egi b();

      boolean a(ars var1, iv var2, jf<ege> var3, ege.a var4);

      void a(ars var1, iv var2, jf<ege> var3, @Nullable bwt var4, @Nullable bwt var5, float var6);

      default axt<ege> c() {
         return axk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azo.d($$0);
      }

      default boolean a(jf<ege> $$0, ege.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwt $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Z_()) {
                  return false;
               }

               if ($$2.cd() && $$0.a(axk.d)) {
                  if (this.d() && $$2 instanceof art $$3) {
                     aq.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axe.bu) : true;
         }
      }

      default void e() {
      }
   }
}
