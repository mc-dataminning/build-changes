import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ecy {
   List<akt<ecp>> d_ = List.of(
      ecp.T.h(),
      ecp.U.h(),
      ecp.V.h(),
      ecp.W.h(),
      ecp.X.h(),
      ecp.Y.h(),
      ecp.Z.h(),
      ecp.aa.h(),
      ecp.ab.h(),
      ecp.ac.h(),
      ecp.ad.h(),
      ecp.ae.h(),
      ecp.af.h(),
      ecp.ag.h(),
      ecp.ah.h()
   );
   int e_ = 0;
   ToIntFunction<akt<ecp>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ecp.P.h(), 1);
      $$0.put(ecp.Q.h(), 1);
      $$0.put(ecp.x.h(), 1);
      $$0.put(ecp.J.h(), 2);
      $$0.put(ecp.A.h(), 2);
      $$0.put(ecp.O.h(), 2);
      $$0.put(ecp.C.h(), 3);
      $$0.put(ecp.K.h(), 3);
      $$0.put(ecp.B.h(), 3);
      $$0.put(ecp.u.h(), 4);
      $$0.put(ecp.n.h(), 4);
      $$0.put(ecp.S.h(), 4);
      $$0.put(ecp.q.h(), 5);
      $$0.put(ecp.v.h(), 5);
      $$0.put(ecp.r.h(), 6);
      $$0.put(ecp.M.h(), 6);
      $$0.put(ecp.s.h(), 6);
      $$0.put(ecp.o.h(), 7);
      $$0.put(ecp.l.h(), 8);
      $$0.put(ecp.m.h(), 8);
      $$0.put(ecp.j.h(), 9);
      $$0.put(ecp.d.h(), 9);
      $$0.put(ecp.e.h(), 9);
      $$0.put(ecp.g.h(), 9);
      $$0.put(ecp.k.h(), 10);
      $$0.put(ecp.h.h(), 10);
      $$0.put(ecp.a.h(), 10);
      $$0.put(ecp.b.h(), 10);
      $$0.put(ecp.I.h(), 10);
      $$0.put(ecp.H.h(), 10);
      $$0.put(ecp.c.h(), 11);
      $$0.put(ecp.f.h(), 12);
      $$0.put(ecp.y.h(), 12);
      $$0.put(ecp.i.h(), 13);
      $$0.put(ecp.z.h(), 13);
      $$0.put(ecp.t.h(), 14);
      $$0.put(ecp.G.h(), 14);
      $$0.put(ecp.R.h(), 14);
      $$0.put(ecp.p.h(), 15);
      $$0.put(ecp.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ecy.a x();

   ecy.d gs();

   static int a_(jr<ecp> $$0) {
      return $$0.e().map(ecy::a).orElse(0);
   }

   static int a(akt<ecp> $$0) {
      return f_.applyAsInt($$0);
   }

   static akt<ecp> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<ecy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ecw.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecx.a.fieldOf("selector").forGetter(ecy.a::a),
                  ayi.l.fieldOf("event_delay").orElse(0).forGetter(ecy.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new ecy.a((ecw)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ecw c;
      private int d;
      final ecx e;
      private boolean f;

      private a(@Nullable ecw $$0, ecx $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecx(), 0, false);
      }

      public ecx a() {
         return this.e;
      }

      @Nullable
      public ecw b() {
         return this.c;
      }

      public void a(@Nullable ecw $$0) {
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

   public static class b implements ecr {
      private final ecy a;

      public b(ecy $$0) {
         this.a = $$0;
      }

      @Override
      public ect a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(ard $$0, jr<ecp> $$1, ecp.a $$2, fbx $$3) {
         ecy.a $$4 = this.a.x();
         ecy.d $$5 = this.a.gs();
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
               if (!$$5.a($$0, ji.a((kb)$$3), $$1, $$2)) {
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

      public void b(ard $$0, jr<ecp> $$1, ecp.a $$2, fbx $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(ard $$0, ecy.a $$1, jr<ecp> $$2, ecp.a $$3, fbx $$4, fbx $$5) {
         $$1.e.a(new ecw($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(ji $$0, ji $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dgz $$0, fbx $$1, fbx $$2) {
         fbx $$3 = new fbx((double)ayz.a($$1.d) + 0.5, (double)ayz.a($$1.e) + 0.5, (double)ayz.a($$1.f) + 0.5);
         fbx $$4 = new fbx((double)ayz.a($$2.d) + 0.5, (double)ayz.a($$2.e) + 0.5, (double)ayz.a($$2.f) + 0.5);

         for (jn $$5 : jn.values()) {
            fbx $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgh($$6, $$4, $$0x -> $$0x.a(awp.bs))).d() != fbv.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dgz $$0, ecy.a $$1, ecy.d $$2) {
         if ($$0 instanceof ard $$3) {
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

      private static void a(ard $$0, ecy.a $$1, ecy.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fbx $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lz($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ard $$0, ecy.a $$1, ecy.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fbx $$3 = $$1.c.c();
               ect $$4 = $$2.b();
               fbx $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayz.d($$8, $$3.d, $$5.d);
               double $$10 = ayz.d($$8, $$3.e, $$5.e);
               double $$11 = ayz.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ard $$0, ecy.a $$1, ecy.d $$2, ecw $$3) {
         ji $$4 = ji.a((kb)$$3.c());
         ji $$5 = $$2.b().a($$0).map(ji::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ecy.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dgz $$0, ji $$1) {
         dgg $$2 = new dgg($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dgg.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ect b();

      boolean a(ard var1, ji var2, jr<ecp> var3, ecp.a var4);

      void a(ard var1, ji var2, jr<ecp> var3, @Nullable bva var4, @Nullable bva var5, float var6);

      default axf<ecp> c() {
         return aww.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayz.d($$0);
      }

      default boolean a(jr<ecp> $$0, ecp.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bva $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.U_()) {
                  return false;
               }

               if ($$2.cd() && $$0.a(aww.d)) {
                  if (this.d() && $$2 instanceof are $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awp.bt) : true;
         }
      }

      default void e() {
      }
   }
}
