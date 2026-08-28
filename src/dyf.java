import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dyf {
   List<akp<dxw>> e_ = List.of(
      dxw.T.h(),
      dxw.U.h(),
      dxw.V.h(),
      dxw.W.h(),
      dxw.X.h(),
      dxw.Y.h(),
      dxw.Z.h(),
      dxw.aa.h(),
      dxw.ab.h(),
      dxw.ac.h(),
      dxw.ad.h(),
      dxw.ae.h(),
      dxw.af.h(),
      dxw.ag.h(),
      dxw.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akp<dxw>> g_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxw.P.h(), 1);
      $$0.put(dxw.Q.h(), 1);
      $$0.put(dxw.x.h(), 1);
      $$0.put(dxw.J.h(), 2);
      $$0.put(dxw.A.h(), 2);
      $$0.put(dxw.O.h(), 2);
      $$0.put(dxw.C.h(), 3);
      $$0.put(dxw.K.h(), 3);
      $$0.put(dxw.B.h(), 3);
      $$0.put(dxw.u.h(), 4);
      $$0.put(dxw.n.h(), 4);
      $$0.put(dxw.S.h(), 4);
      $$0.put(dxw.q.h(), 5);
      $$0.put(dxw.v.h(), 5);
      $$0.put(dxw.r.h(), 6);
      $$0.put(dxw.M.h(), 6);
      $$0.put(dxw.s.h(), 6);
      $$0.put(dxw.o.h(), 7);
      $$0.put(dxw.l.h(), 8);
      $$0.put(dxw.m.h(), 8);
      $$0.put(dxw.j.h(), 9);
      $$0.put(dxw.d.h(), 9);
      $$0.put(dxw.e.h(), 9);
      $$0.put(dxw.g.h(), 9);
      $$0.put(dxw.k.h(), 10);
      $$0.put(dxw.h.h(), 10);
      $$0.put(dxw.a.h(), 10);
      $$0.put(dxw.b.h(), 10);
      $$0.put(dxw.I.h(), 10);
      $$0.put(dxw.H.h(), 10);
      $$0.put(dxw.c.h(), 11);
      $$0.put(dxw.f.h(), 12);
      $$0.put(dxw.y.h(), 12);
      $$0.put(dxw.i.h(), 13);
      $$0.put(dxw.z.h(), 13);
      $$0.put(dxw.t.h(), 14);
      $$0.put(dxw.G.h(), 14);
      $$0.put(dxw.R.h(), 14);
      $$0.put(dxw.p.h(), 15);
      $$0.put(dxw.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dyf.a go();

   dyf.d gp();

   static int a_(jm<dxw> $$0) {
      return $$0.e().map(dyf::a).orElse(0);
   }

   static int a(akp<dxw> $$0) {
      return g_.applyAsInt($$0);
   }

   static akp<dxw> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayn.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dyf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dyd.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dye.a.fieldOf("selector").forGetter(dyf.a::a),
                  axv.k.fieldOf("event_delay").orElse(0).forGetter(dyf.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dyf.a((dyd)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dyd c;
      private int d;
      final dye e;
      private boolean f;

      private a(@Nullable dyd $$0, dye $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dye(), 0, false);
      }

      public dye a() {
         return this.e;
      }

      @Nullable
      public dyd b() {
         return this.c;
      }

      public void a(@Nullable dyd $$0) {
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

   public static class b implements dxy {
      private final dyf a;

      public b(dyf $$0) {
         this.a = $$0;
      }

      @Override
      public dya a() {
         return this.a.gp().b();
      }

      @Override
      public int b() {
         return this.a.gp().a();
      }

      @Override
      public boolean a(aqt $$0, jm<dxw> $$1, dxw.a $$2, eww $$3) {
         dyf.a $$4 = this.a.go();
         dyf.d $$5 = this.a.gp();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eww> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eww $$7 = $$6.get();
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

      public void b(aqt $$0, jm<dxw> $$1, dxw.a $$2, eww $$3) {
         this.a.gp().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.go(), $$1, $$2, $$3, $$4));
      }

      private void a(aqt $$0, dyf.a $$1, jm<dxw> $$2, dxw.a $$3, eww $$4, eww $$5) {
         $$1.e.a(new dyd($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(jd $$0, jd $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dcu $$0, eww $$1, eww $$2) {
         eww $$3 = new eww((double)ayn.a($$1.c) + 0.5, (double)ayn.a($$1.d) + 0.5, (double)ayn.a($$1.e) + 0.5);
         eww $$4 = new eww((double)ayn.a($$2.c) + 0.5, (double)ayn.a($$2.d) + 0.5, (double)ayn.a($$2.e) + 0.5);

         for (ji $$5 : ji.values()) {
            eww $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dcc($$6, $$4, $$0x -> $$0x.a(awd.bq))).c() != ewu.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dcu $$0, dyf.a $$1, dyf.d $$2) {
         if ($$0 instanceof aqt $$3) {
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

      private static void a(aqt $$0, dyf.a $$1, dyf.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            eww $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lr($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqt $$0, dyf.a $$1, dyf.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eww $$3 = $$1.c.c();
               dya $$4 = $$2.b();
               eww $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayn.d($$8, $$3.c, $$5.c);
               double $$10 = ayn.d($$8, $$3.d, $$5.d);
               double $$11 = ayn.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lr($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqt $$0, dyf.a $$1, dyf.d $$2, dyd $$3) {
         jd $$4 = jd.a((jw)$$3.c());
         jd $$5 = $$2.b().a($$0).map(jd::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dyf.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dcu $$0, jd $$1) {
         dcb $$2 = new dcb($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dcb.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dya b();

      boolean a(aqt var1, jd var2, jm<dxw> var3, dxw.a var4);

      void a(aqt var1, jd var2, jm<dxw> var3, @Nullable bsq var4, @Nullable bsq var5, float var6);

      default awt<dxw> c() {
         return awk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayn.d($$0);
      }

      default boolean a(jm<dxw> $$0, dxw.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsq $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bX() && $$0.a(awk.d)) {
                  if (this.d() && $$2 instanceof aqu $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bd()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awd.br) : true;
         }
      }

      default void e() {
      }
   }
}
