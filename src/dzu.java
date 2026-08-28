import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dzu {
   List<alb<dzl>> f_ = List.of(
      dzl.T.h(),
      dzl.U.h(),
      dzl.V.h(),
      dzl.W.h(),
      dzl.X.h(),
      dzl.Y.h(),
      dzl.Z.h(),
      dzl.aa.h(),
      dzl.ab.h(),
      dzl.ac.h(),
      dzl.ad.h(),
      dzl.ae.h(),
      dzl.af.h(),
      dzl.ag.h(),
      dzl.ah.h()
   );
   int g_ = 0;
   ToIntFunction<alb<dzl>> h_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dzl.P.h(), 1);
      $$0.put(dzl.Q.h(), 1);
      $$0.put(dzl.x.h(), 1);
      $$0.put(dzl.J.h(), 2);
      $$0.put(dzl.A.h(), 2);
      $$0.put(dzl.O.h(), 2);
      $$0.put(dzl.C.h(), 3);
      $$0.put(dzl.K.h(), 3);
      $$0.put(dzl.B.h(), 3);
      $$0.put(dzl.u.h(), 4);
      $$0.put(dzl.n.h(), 4);
      $$0.put(dzl.S.h(), 4);
      $$0.put(dzl.q.h(), 5);
      $$0.put(dzl.v.h(), 5);
      $$0.put(dzl.r.h(), 6);
      $$0.put(dzl.M.h(), 6);
      $$0.put(dzl.s.h(), 6);
      $$0.put(dzl.o.h(), 7);
      $$0.put(dzl.l.h(), 8);
      $$0.put(dzl.m.h(), 8);
      $$0.put(dzl.j.h(), 9);
      $$0.put(dzl.d.h(), 9);
      $$0.put(dzl.e.h(), 9);
      $$0.put(dzl.g.h(), 9);
      $$0.put(dzl.k.h(), 10);
      $$0.put(dzl.h.h(), 10);
      $$0.put(dzl.a.h(), 10);
      $$0.put(dzl.b.h(), 10);
      $$0.put(dzl.I.h(), 10);
      $$0.put(dzl.H.h(), 10);
      $$0.put(dzl.c.h(), 11);
      $$0.put(dzl.f.h(), 12);
      $$0.put(dzl.y.h(), 12);
      $$0.put(dzl.i.h(), 13);
      $$0.put(dzl.z.h(), 13);
      $$0.put(dzl.t.h(), 14);
      $$0.put(dzl.G.h(), 14);
      $$0.put(dzl.R.h(), 14);
      $$0.put(dzl.p.h(), 15);
      $$0.put(dzl.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dzu.a gr();

   dzu.d gs();

   static int a_(jn<dzl> $$0) {
      return $$0.e().map(dzu::a).orElse(0);
   }

   static int a(alb<dzl> $$0) {
      return h_.applyAsInt($$0);
   }

   static alb<dzl> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azd.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dzu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dzs.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dzt.a.fieldOf("selector").forGetter(dzu.a::a),
                  aym.k.fieldOf("event_delay").orElse(0).forGetter(dzu.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dzu.a((dzs)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dzs c;
      private int d;
      final dzt e;
      private boolean f;

      private a(@Nullable dzs $$0, dzt $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dzt(), 0, false);
      }

      public dzt a() {
         return this.e;
      }

      @Nullable
      public dzs b() {
         return this.c;
      }

      public void a(@Nullable dzs $$0) {
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

   public static class b implements dzn {
      private final dzu a;

      public b(dzu $$0) {
         this.a = $$0;
      }

      @Override
      public dzp a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(arh $$0, jn<dzl> $$1, dzl.a $$2, eys $$3) {
         dzu.a $$4 = this.a.gr();
         dzu.d $$5 = this.a.gs();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eys> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eys $$7 = $$6.get();
               if (!$$5.a($$0, je.a((jx)$$3), $$1, $$2)) {
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

      public void b(arh $$0, jn<dzl> $$1, dzl.a $$2, eys $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gr(), $$1, $$2, $$3, $$4));
      }

      private void a(arh $$0, dzu.a $$1, jn<dzl> $$2, dzl.a $$3, eys $$4, eys $$5) {
         $$1.e.a(new dzs($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(je $$0, je $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(deg $$0, eys $$1, eys $$2) {
         eys $$3 = new eys((double)azd.a($$1.d) + 0.5, (double)azd.a($$1.e) + 0.5, (double)azd.a($$1.f) + 0.5);
         eys $$4 = new eys((double)azd.a($$2.d) + 0.5, (double)azd.a($$2.e) + 0.5, (double)azd.a($$2.f) + 0.5);

         for (jj $$5 : jj.values()) {
            eys $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new ddn($$6, $$4, $$0x -> $$0x.a(awt.br))).d() != eyq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(deg $$0, dzu.a $$1, dzu.d $$2) {
         if ($$0 instanceof arh $$3) {
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

      private static void a(arh $$0, dzu.a $$1, dzu.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            eys $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ls($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arh $$0, dzu.a $$1, dzu.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eys $$3 = $$1.c.c();
               dzp $$4 = $$2.b();
               eys $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azd.d($$8, $$3.d, $$5.d);
               double $$10 = azd.d($$8, $$3.e, $$5.e);
               double $$11 = azd.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new ls($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arh $$0, dzu.a $$1, dzu.d $$2, dzs $$3) {
         je $$4 = je.a((jx)$$3.c());
         je $$5 = $$2.b().a($$0).map(je::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dzu.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(deg $$0, je $$1) {
         ddm $$2 = new ddm($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(ddm.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dzp b();

      boolean a(arh var1, je var2, jn<dzl> var3, dzl.a var4);

      void a(arh var1, je var2, jn<dzl> var3, @Nullable bto var4, @Nullable bto var5, float var6);

      default axj<dzl> c() {
         return axa.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azd.d($$0);
      }

      default boolean a(jn<dzl> $$0, dzl.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bto $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.cb() && $$0.a(axa.d)) {
                  if (this.d() && $$2 instanceof ari $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awt.bs) : true;
         }
      }

      default void e() {
      }
   }
}
