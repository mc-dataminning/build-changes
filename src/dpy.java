import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dpy {
   List<aix<dpp>> e_ = List.of(
      dpp.T.h(),
      dpp.U.h(),
      dpp.V.h(),
      dpp.W.h(),
      dpp.X.h(),
      dpp.Y.h(),
      dpp.Z.h(),
      dpp.aa.h(),
      dpp.ab.h(),
      dpp.ac.h(),
      dpp.ad.h(),
      dpp.ae.h(),
      dpp.af.h(),
      dpp.ag.h(),
      dpp.ah.h()
   );
   int f_ = 0;
   ToIntFunction<aix<dpp>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dpp.P.h(), 1);
      $$0.put(dpp.Q.h(), 1);
      $$0.put(dpp.x.h(), 1);
      $$0.put(dpp.J.h(), 2);
      $$0.put(dpp.A.h(), 2);
      $$0.put(dpp.O.h(), 2);
      $$0.put(dpp.C.h(), 3);
      $$0.put(dpp.K.h(), 3);
      $$0.put(dpp.B.h(), 3);
      $$0.put(dpp.u.h(), 4);
      $$0.put(dpp.n.h(), 4);
      $$0.put(dpp.S.h(), 4);
      $$0.put(dpp.q.h(), 5);
      $$0.put(dpp.v.h(), 5);
      $$0.put(dpp.r.h(), 6);
      $$0.put(dpp.M.h(), 6);
      $$0.put(dpp.s.h(), 6);
      $$0.put(dpp.o.h(), 7);
      $$0.put(dpp.l.h(), 8);
      $$0.put(dpp.m.h(), 8);
      $$0.put(dpp.j.h(), 9);
      $$0.put(dpp.d.h(), 9);
      $$0.put(dpp.e.h(), 9);
      $$0.put(dpp.g.h(), 9);
      $$0.put(dpp.k.h(), 10);
      $$0.put(dpp.h.h(), 10);
      $$0.put(dpp.a.h(), 10);
      $$0.put(dpp.b.h(), 10);
      $$0.put(dpp.I.h(), 10);
      $$0.put(dpp.H.h(), 10);
      $$0.put(dpp.c.h(), 11);
      $$0.put(dpp.f.h(), 12);
      $$0.put(dpp.y.h(), 12);
      $$0.put(dpp.i.h(), 13);
      $$0.put(dpp.z.h(), 13);
      $$0.put(dpp.t.h(), 14);
      $$0.put(dpp.G.h(), 14);
      $$0.put(dpp.R.h(), 14);
      $$0.put(dpp.p.h(), 15);
      $$0.put(dpp.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dpy.a gi();

   dpy.d gj();

   static int a_(ij<dpp> $$0) {
      return $$0.e().map(dpy::a).orElse(0);
   }

   static int a(aix<dpp> $$0) {
      return g_.applyAsInt($$0);
   }

   static aix<dpp> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - awh.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dpy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dpw.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dpx.a.fieldOf("selector").forGetter(dpy.a::a),
                  avp.i.fieldOf("event_delay").orElse(0).forGetter(dpy.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dpy.a((dpw)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dpw c;
      private int d;
      final dpx e;
      private boolean f;

      private a(@Nullable dpw $$0, dpx $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dpx(), 0, false);
      }

      public dpx a() {
         return this.e;
      }

      @Nullable
      public dpw b() {
         return this.c;
      }

      public void a(@Nullable dpw $$0) {
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

   public static class b implements dpr {
      private final dpy a;

      public b(dpy $$0) {
         this.a = $$0;
      }

      @Override
      public dpt a() {
         return this.a.gj().b();
      }

      @Override
      public int b() {
         return this.a.gj().a();
      }

      @Override
      public boolean a(aov $$0, ij<dpp> $$1, dpp.a $$2, ens $$3) {
         dpy.a $$4 = this.a.gi();
         dpy.d $$5 = this.a.gj();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ens> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ens $$7 = $$6.get();
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

      public void b(aov $$0, ij<dpp> $$1, dpp.a $$2, ens $$3) {
         this.a.gj().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gi(), $$1, $$2, $$3, $$4));
      }

      private void a(aov $$0, dpy.a $$1, ij<dpp> $$2, dpp.a $$3, ens $$4, ens $$5) {
         $$1.e.a(new dpw($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hz $$0, hz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cvn $$0, ens $$1, ens $$2) {
         ens $$3 = new ens((double)awh.a($$1.c) + 0.5, (double)awh.a($$1.d) + 0.5, (double)awh.a($$1.e) + 0.5);
         ens $$4 = new ens((double)awh.a($$2.c) + 0.5, (double)awh.a($$2.d) + 0.5, (double)awh.a($$2.e) + 0.5);

         for (ie $$5 : ie.values()) {
            ens $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cuv($$6, $$4, $$0x -> $$0x.a(atz.bp))).c() != enq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cvn $$0, dpy.a $$1, dpy.d $$2) {
         if ($$0 instanceof aov $$3) {
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

      private static void a(aov $$0, dpy.a $$1, dpy.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            ens $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kd($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aov $$0, dpy.a $$1, dpy.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ens $$3 = $$1.c.c();
               dpt $$4 = $$2.b();
               ens $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = awh.d($$8, $$3.c, $$5.c);
               double $$10 = awh.d($$8, $$3.d, $$5.d);
               double $$11 = awh.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kd($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aov $$0, dpy.a $$1, dpy.d $$2, dpw $$3) {
         hz $$4 = hz.a($$3.c());
         hz $$5 = $$2.b().a($$0).map(hz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dpy.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cvn $$0, hz $$1) {
         cuu $$2 = new cuu($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cuu.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dpt b();

      boolean a(aov var1, hz var2, ij<dpp> var3, dpp.a var4);

      void a(aov var1, hz var2, ij<dpp> var3, @Nullable bno var4, @Nullable bno var5, float var6);

      default auo<dpp> c() {
         return auf.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return awh.d($$0);
      }

      default boolean a(ij<dpp> $$0, dpp.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bno $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(auf.d)) {
                  if (this.d() && $$2 instanceof aow $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(atz.bq) : true;
         }
      }

      default void e() {
      }
   }
}
