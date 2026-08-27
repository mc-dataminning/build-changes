import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dye {
   List<aks<dxv>> e_ = List.of(
      dxv.T.h(),
      dxv.U.h(),
      dxv.V.h(),
      dxv.W.h(),
      dxv.X.h(),
      dxv.Y.h(),
      dxv.Z.h(),
      dxv.aa.h(),
      dxv.ab.h(),
      dxv.ac.h(),
      dxv.ad.h(),
      dxv.ae.h(),
      dxv.af.h(),
      dxv.ag.h(),
      dxv.ah.h()
   );
   int f_ = 0;
   ToIntFunction<aks<dxv>> g_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dxv.P.h(), 1);
      $$0.put(dxv.Q.h(), 1);
      $$0.put(dxv.x.h(), 1);
      $$0.put(dxv.J.h(), 2);
      $$0.put(dxv.A.h(), 2);
      $$0.put(dxv.O.h(), 2);
      $$0.put(dxv.C.h(), 3);
      $$0.put(dxv.K.h(), 3);
      $$0.put(dxv.B.h(), 3);
      $$0.put(dxv.u.h(), 4);
      $$0.put(dxv.n.h(), 4);
      $$0.put(dxv.S.h(), 4);
      $$0.put(dxv.q.h(), 5);
      $$0.put(dxv.v.h(), 5);
      $$0.put(dxv.r.h(), 6);
      $$0.put(dxv.M.h(), 6);
      $$0.put(dxv.s.h(), 6);
      $$0.put(dxv.o.h(), 7);
      $$0.put(dxv.l.h(), 8);
      $$0.put(dxv.m.h(), 8);
      $$0.put(dxv.j.h(), 9);
      $$0.put(dxv.d.h(), 9);
      $$0.put(dxv.e.h(), 9);
      $$0.put(dxv.g.h(), 9);
      $$0.put(dxv.k.h(), 10);
      $$0.put(dxv.h.h(), 10);
      $$0.put(dxv.a.h(), 10);
      $$0.put(dxv.b.h(), 10);
      $$0.put(dxv.I.h(), 10);
      $$0.put(dxv.H.h(), 10);
      $$0.put(dxv.c.h(), 11);
      $$0.put(dxv.f.h(), 12);
      $$0.put(dxv.y.h(), 12);
      $$0.put(dxv.i.h(), 13);
      $$0.put(dxv.z.h(), 13);
      $$0.put(dxv.t.h(), 14);
      $$0.put(dxv.G.h(), 14);
      $$0.put(dxv.R.h(), 14);
      $$0.put(dxv.p.h(), 15);
      $$0.put(dxv.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dye.a gA();

   dye.d gB();

   static int a_(ja<dxv> $$0) {
      return $$0.e().map(dye::a).orElse(0);
   }

   static int a(aks<dxv> $$0) {
      return g_.applyAsInt($$0);
   }

   static aks<dxv> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aym.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dye.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dyc.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dyd.a.fieldOf("selector").forGetter(dye.a::a),
                  axu.i.fieldOf("event_delay").orElse(0).forGetter(dye.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dye.a((dyc)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dyc c;
      private int d;
      final dyd e;
      private boolean f;

      private a(@Nullable dyc $$0, dyd $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dyd(), 0, false);
      }

      public dyd a() {
         return this.e;
      }

      @Nullable
      public dyc b() {
         return this.c;
      }

      public void a(@Nullable dyc $$0) {
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

   public static class b implements dxx {
      private final dye a;

      public b(dye $$0) {
         this.a = $$0;
      }

      @Override
      public dxz a() {
         return this.a.gB().b();
      }

      @Override
      public int b() {
         return this.a.gB().a();
      }

      @Override
      public boolean a(aqt $$0, ja<dxv> $$1, dxv.a $$2, ewu $$3) {
         dye.a $$4 = this.a.gA();
         dye.d $$5 = this.a.gB();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ewu> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ewu $$7 = $$6.get();
               if (!$$5.a($$0, ir.a($$3), $$1, $$2)) {
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

      public void b(aqt $$0, ja<dxv> $$1, dxv.a $$2, ewu $$3) {
         this.a.gB().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gA(), $$1, $$2, $$3, $$4));
      }

      private void a(aqt $$0, dye.a $$1, ja<dxv> $$2, dxv.a $$3, ewu $$4, ewu $$5) {
         $$1.e.a(new dyc($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(ir $$0, ir $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dca $$0, ewu $$1, ewu $$2) {
         ewu $$3 = new ewu((double)aym.a($$1.c) + 0.5, (double)aym.a($$1.d) + 0.5, (double)aym.a($$1.e) + 0.5);
         ewu $$4 = new ewu((double)aym.a($$2.c) + 0.5, (double)aym.a($$2.d) + 0.5, (double)aym.a($$2.e) + 0.5);

         for (iw $$5 : iw.values()) {
            ewu $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbi($$6, $$4, $$0x -> $$0x.a(awe.bs))).c() != ews.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dca $$0, dye.a $$1, dye.d $$2) {
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

      private static void a(aqt $$0, dye.a $$1, dye.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            ewu $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lf($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqt $$0, dye.a $$1, dye.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ewu $$3 = $$1.c.c();
               dxz $$4 = $$2.b();
               ewu $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aym.d($$8, $$3.c, $$5.c);
               double $$10 = aym.d($$8, $$3.d, $$5.d);
               double $$11 = aym.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lf($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqt $$0, dye.a $$1, dye.d $$2, dyc $$3) {
         ir $$4 = ir.a($$3.c());
         ir $$5 = $$2.b().a($$0).map(ir::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dye.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dca $$0, ir $$1) {
         dbh $$2 = new dbh($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbh.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dxz b();

      boolean a(aqt var1, ir var2, ja<dxv> var3, dxv.a var4);

      void a(aqt var1, ir var2, ja<dxv> var3, @Nullable brv var4, @Nullable brv var5, float var6);

      default awt<dxv> c() {
         return awk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aym.d($$0);
      }

      default boolean a(ja<dxv> $$0, dxv.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            brv $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.O_()) {
                  return false;
               }

               if ($$2.cb() && $$0.a(awk.d)) {
                  if (this.d() && $$2 instanceof aqu $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awe.bt) : true;
         }
      }

      default void e() {
      }
   }
}
