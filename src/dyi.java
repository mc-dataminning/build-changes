import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dyi {
   List<akq<dxz>> f_ = List.of(
      dxz.T.h(),
      dxz.U.h(),
      dxz.V.h(),
      dxz.W.h(),
      dxz.X.h(),
      dxz.Y.h(),
      dxz.Z.h(),
      dxz.aa.h(),
      dxz.ab.h(),
      dxz.ac.h(),
      dxz.ad.h(),
      dxz.ae.h(),
      dxz.af.h(),
      dxz.ag.h(),
      dxz.ah.h()
   );
   int g_ = 0;
   ToIntFunction<akq<dxz>> h_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxz.P.h(), 1);
      $$0.put(dxz.Q.h(), 1);
      $$0.put(dxz.x.h(), 1);
      $$0.put(dxz.J.h(), 2);
      $$0.put(dxz.A.h(), 2);
      $$0.put(dxz.O.h(), 2);
      $$0.put(dxz.C.h(), 3);
      $$0.put(dxz.K.h(), 3);
      $$0.put(dxz.B.h(), 3);
      $$0.put(dxz.u.h(), 4);
      $$0.put(dxz.n.h(), 4);
      $$0.put(dxz.S.h(), 4);
      $$0.put(dxz.q.h(), 5);
      $$0.put(dxz.v.h(), 5);
      $$0.put(dxz.r.h(), 6);
      $$0.put(dxz.M.h(), 6);
      $$0.put(dxz.s.h(), 6);
      $$0.put(dxz.o.h(), 7);
      $$0.put(dxz.l.h(), 8);
      $$0.put(dxz.m.h(), 8);
      $$0.put(dxz.j.h(), 9);
      $$0.put(dxz.d.h(), 9);
      $$0.put(dxz.e.h(), 9);
      $$0.put(dxz.g.h(), 9);
      $$0.put(dxz.k.h(), 10);
      $$0.put(dxz.h.h(), 10);
      $$0.put(dxz.a.h(), 10);
      $$0.put(dxz.b.h(), 10);
      $$0.put(dxz.I.h(), 10);
      $$0.put(dxz.H.h(), 10);
      $$0.put(dxz.c.h(), 11);
      $$0.put(dxz.f.h(), 12);
      $$0.put(dxz.y.h(), 12);
      $$0.put(dxz.i.h(), 13);
      $$0.put(dxz.z.h(), 13);
      $$0.put(dxz.t.h(), 14);
      $$0.put(dxz.G.h(), 14);
      $$0.put(dxz.R.h(), 14);
      $$0.put(dxz.p.h(), 15);
      $$0.put(dxz.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dyi.a gm();

   dyi.d gn();

   static int a_(jm<dxz> $$0) {
      return $$0.e().map(dyi::a).orElse(0);
   }

   static int a(akq<dxz> $$0) {
      return h_.applyAsInt($$0);
   }

   static akq<dxz> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayo.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dyi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dyg.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dyh.a.fieldOf("selector").forGetter(dyi.a::a),
                  axw.k.fieldOf("event_delay").orElse(0).forGetter(dyi.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dyi.a((dyg)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dyg c;
      private int d;
      final dyh e;
      private boolean f;

      private a(@Nullable dyg $$0, dyh $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dyh(), 0, false);
      }

      public dyh a() {
         return this.e;
      }

      @Nullable
      public dyg b() {
         return this.c;
      }

      public void a(@Nullable dyg $$0) {
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

   public static class b implements dyb {
      private final dyi a;

      public b(dyi $$0) {
         this.a = $$0;
      }

      @Override
      public dyd a() {
         return this.a.gn().b();
      }

      @Override
      public int b() {
         return this.a.gn().a();
      }

      @Override
      public boolean a(aqu $$0, jm<dxz> $$1, dxz.a $$2, exc $$3) {
         dyi.a $$4 = this.a.gm();
         dyi.d $$5 = this.a.gn();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<exc> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               exc $$7 = $$6.get();
               if (!$$5.a($$0, jd.a((jw)$$3), $$1, $$2)) {
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

      public void b(aqu $$0, jm<dxz> $$1, dxz.a $$2, exc $$3) {
         this.a.gn().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gm(), $$1, $$2, $$3, $$4));
      }

      private void a(aqu $$0, dyi.a $$1, jm<dxz> $$2, dxz.a $$3, exc $$4, exc $$5) {
         $$1.e.a(new dyg($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(jd $$0, jd $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dcw $$0, exc $$1, exc $$2) {
         exc $$3 = new exc((double)ayo.a($$1.c) + 0.5, (double)ayo.a($$1.d) + 0.5, (double)ayo.a($$1.e) + 0.5);
         exc $$4 = new exc((double)ayo.a($$2.c) + 0.5, (double)ayo.a($$2.d) + 0.5, (double)ayo.a($$2.e) + 0.5);

         for (ji $$5 : ji.values()) {
            exc $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dce($$6, $$4, $$0x -> $$0x.a(awe.br))).c() != exa.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dcw $$0, dyi.a $$1, dyi.d $$2) {
         if ($$0 instanceof aqu $$3) {
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

      private static void a(aqu $$0, dyi.a $$1, dyi.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            exc $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lr($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqu $$0, dyi.a $$1, dyi.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               exc $$3 = $$1.c.c();
               dyd $$4 = $$2.b();
               exc $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayo.d($$8, $$3.c, $$5.c);
               double $$10 = ayo.d($$8, $$3.d, $$5.d);
               double $$11 = ayo.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lr($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqu $$0, dyi.a $$1, dyi.d $$2, dyg $$3) {
         jd $$4 = jd.a((jw)$$3.c());
         jd $$5 = $$2.b().a($$0).map(jd::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dyi.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dcw $$0, jd $$1) {
         dcd $$2 = new dcd($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dcd.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dyd b();

      boolean a(aqu var1, jd var2, jm<dxz> var3, dxz.a var4);

      void a(aqu var1, jd var2, jm<dxz> var3, @Nullable bsr var4, @Nullable bsr var5, float var6);

      default awu<dxz> c() {
         return awl.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayo.d($$0);
      }

      default boolean a(jm<dxz> $$0, dxz.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsr $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.R_()) {
                  return false;
               }

               if ($$2.bX() && $$0.a(awl.d)) {
                  if (this.d() && $$2 instanceof aqv $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bd()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awe.bs) : true;
         }
      }

      default void e() {
      }
   }
}
