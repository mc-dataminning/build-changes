import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dry {
   List<ajg<drp>> e_ = List.of(
      drp.T.h(),
      drp.U.h(),
      drp.V.h(),
      drp.W.h(),
      drp.X.h(),
      drp.Y.h(),
      drp.Z.h(),
      drp.aa.h(),
      drp.ab.h(),
      drp.ac.h(),
      drp.ad.h(),
      drp.ae.h(),
      drp.af.h(),
      drp.ag.h(),
      drp.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ajg<drp>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(drp.P.h(), 1);
      $$0.put(drp.Q.h(), 1);
      $$0.put(drp.x.h(), 1);
      $$0.put(drp.J.h(), 2);
      $$0.put(drp.A.h(), 2);
      $$0.put(drp.O.h(), 2);
      $$0.put(drp.C.h(), 3);
      $$0.put(drp.K.h(), 3);
      $$0.put(drp.B.h(), 3);
      $$0.put(drp.u.h(), 4);
      $$0.put(drp.n.h(), 4);
      $$0.put(drp.S.h(), 4);
      $$0.put(drp.q.h(), 5);
      $$0.put(drp.v.h(), 5);
      $$0.put(drp.r.h(), 6);
      $$0.put(drp.M.h(), 6);
      $$0.put(drp.s.h(), 6);
      $$0.put(drp.o.h(), 7);
      $$0.put(drp.l.h(), 8);
      $$0.put(drp.m.h(), 8);
      $$0.put(drp.j.h(), 9);
      $$0.put(drp.d.h(), 9);
      $$0.put(drp.e.h(), 9);
      $$0.put(drp.g.h(), 9);
      $$0.put(drp.k.h(), 10);
      $$0.put(drp.h.h(), 10);
      $$0.put(drp.a.h(), 10);
      $$0.put(drp.b.h(), 10);
      $$0.put(drp.I.h(), 10);
      $$0.put(drp.H.h(), 10);
      $$0.put(drp.c.h(), 11);
      $$0.put(drp.f.h(), 12);
      $$0.put(drp.y.h(), 12);
      $$0.put(drp.i.h(), 13);
      $$0.put(drp.z.h(), 13);
      $$0.put(drp.t.h(), 14);
      $$0.put(drp.G.h(), 14);
      $$0.put(drp.R.h(), 14);
      $$0.put(drp.p.h(), 15);
      $$0.put(drp.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dry.a gp();

   dry.d gq();

   static int a_(il<drp> $$0) {
      return $$0.e().map(dry::a).orElse(0);
   }

   static int a(ajg<drp> $$0) {
      return g_.applyAsInt($$0);
   }

   static ajg<drp> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aww.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dry.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  drw.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  drx.a.fieldOf("selector").forGetter(dry.a::a),
                  awe.j.fieldOf("event_delay").orElse(0).forGetter(dry.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dry.a((drw)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      drw c;
      private int d;
      final drx e;
      private boolean f;

      private a(@Nullable drw $$0, drx $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new drx(), 0, false);
      }

      public drx a() {
         return this.e;
      }

      @Nullable
      public drw b() {
         return this.c;
      }

      public void a(@Nullable drw $$0) {
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

   public static class b implements drr {
      private final dry a;

      public b(dry $$0) {
         this.a = $$0;
      }

      @Override
      public drt a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(apf $$0, il<drp> $$1, drp.a $$2, ept $$3) {
         dry.a $$4 = this.a.gp();
         dry.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ept> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ept $$7 = $$6.get();
               if (!$$5.a($$0, ib.a($$3), $$1, $$2)) {
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

      public void b(apf $$0, il<drp> $$1, drp.a $$2, ept $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(apf $$0, dry.a $$1, il<drp> $$2, drp.a $$3, ept $$4, ept $$5) {
         $$1.e.a(new drw($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(ib $$0, ib $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cxb $$0, ept $$1, ept $$2) {
         ept $$3 = new ept((double)aww.a($$1.c) + 0.5, (double)aww.a($$1.d) + 0.5, (double)aww.a($$1.e) + 0.5);
         ept $$4 = new ept((double)aww.a($$2.c) + 0.5, (double)aww.a($$2.d) + 0.5, (double)aww.a($$2.e) + 0.5);

         for (ih $$5 : ih.values()) {
            ept $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cwj($$6, $$4, $$0x -> $$0x.a(aun.bq))).c() != epr.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cxb $$0, dry.a $$1, dry.d $$2) {
         if ($$0 instanceof apf $$3) {
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

      private static void a(apf $$0, dry.a $$1, dry.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            ept $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kg($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(apf $$0, dry.a $$1, dry.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ept $$3 = $$1.c.c();
               drt $$4 = $$2.b();
               ept $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aww.d($$8, $$3.c, $$5.c);
               double $$10 = aww.d($$8, $$3.d, $$5.d);
               double $$11 = aww.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kg($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(apf $$0, dry.a $$1, dry.d $$2, drw $$3) {
         ib $$4 = ib.a($$3.c());
         ib $$5 = $$2.b().a($$0).map(ib::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dry.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cxb $$0, ib $$1) {
         cwi $$2 = new cwi($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cwi.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      drt b();

      boolean a(apf var1, ib var2, il<drp> var3, drp.a var4);

      void a(apf var1, ib var2, il<drp> var3, @Nullable box var4, @Nullable box var5, float var6);

      default avd<drp> c() {
         return aut.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aww.d($$0);
      }

      default boolean a(il<drp> $$0, drp.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            box $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(aut.d)) {
                  if (this.d() && $$2 instanceof apg $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.ba()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(aun.br) : true;
         }
      }

      default void e() {
      }
   }
}
