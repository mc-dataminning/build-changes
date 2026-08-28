import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxe {
   List<ale<dwv>> e_ = List.of(
      dwv.T.h(),
      dwv.U.h(),
      dwv.V.h(),
      dwv.W.h(),
      dwv.X.h(),
      dwv.Y.h(),
      dwv.Z.h(),
      dwv.aa.h(),
      dwv.ab.h(),
      dwv.ac.h(),
      dwv.ad.h(),
      dwv.ae.h(),
      dwv.af.h(),
      dwv.ag.h(),
      dwv.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ale<dwv>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dwv.P.h(), 1);
      $$0.put(dwv.Q.h(), 1);
      $$0.put(dwv.x.h(), 1);
      $$0.put(dwv.J.h(), 2);
      $$0.put(dwv.A.h(), 2);
      $$0.put(dwv.O.h(), 2);
      $$0.put(dwv.C.h(), 3);
      $$0.put(dwv.K.h(), 3);
      $$0.put(dwv.B.h(), 3);
      $$0.put(dwv.u.h(), 4);
      $$0.put(dwv.n.h(), 4);
      $$0.put(dwv.S.h(), 4);
      $$0.put(dwv.q.h(), 5);
      $$0.put(dwv.v.h(), 5);
      $$0.put(dwv.r.h(), 6);
      $$0.put(dwv.M.h(), 6);
      $$0.put(dwv.s.h(), 6);
      $$0.put(dwv.o.h(), 7);
      $$0.put(dwv.l.h(), 8);
      $$0.put(dwv.m.h(), 8);
      $$0.put(dwv.j.h(), 9);
      $$0.put(dwv.d.h(), 9);
      $$0.put(dwv.e.h(), 9);
      $$0.put(dwv.g.h(), 9);
      $$0.put(dwv.k.h(), 10);
      $$0.put(dwv.h.h(), 10);
      $$0.put(dwv.a.h(), 10);
      $$0.put(dwv.b.h(), 10);
      $$0.put(dwv.I.h(), 10);
      $$0.put(dwv.H.h(), 10);
      $$0.put(dwv.c.h(), 11);
      $$0.put(dwv.f.h(), 12);
      $$0.put(dwv.y.h(), 12);
      $$0.put(dwv.i.h(), 13);
      $$0.put(dwv.z.h(), 13);
      $$0.put(dwv.t.h(), 14);
      $$0.put(dwv.G.h(), 14);
      $$0.put(dwv.R.h(), 14);
      $$0.put(dwv.p.h(), 15);
      $$0.put(dwv.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxe.a gs();

   dxe.d gt();

   static int a_(ji<dwv> $$0) {
      return $$0.e().map(dxe::a).orElse(0);
   }

   static int a(ale<dwv> $$0) {
      return g_.applyAsInt($$0);
   }

   static ale<dwv> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxc.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxd.a.fieldOf("selector").forGetter(dxe.a::a),
                  ayh.k.fieldOf("event_delay").orElse(0).forGetter(dxe.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxe.a((dxc)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxc c;
      private int d;
      final dxd e;
      private boolean f;

      private a(@Nullable dxc $$0, dxd $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxd(), 0, false);
      }

      public dxd a() {
         return this.e;
      }

      @Nullable
      public dxc b() {
         return this.c;
      }

      public void a(@Nullable dxc $$0) {
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

   public static class b implements dwx {
      private final dxe a;

      public b(dxe $$0) {
         this.a = $$0;
      }

      @Override
      public dwz a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(arf $$0, ji<dwv> $$1, dwv.a $$2, evr $$3) {
         dxe.a $$4 = this.a.gs();
         dxe.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evr> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evr $$7 = $$6.get();
               if (!$$5.a($$0, iz.a($$3), $$1, $$2)) {
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

      public void b(arf $$0, ji<dwv> $$1, dwv.a $$2, evr $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gs(), $$1, $$2, $$3, $$4));
      }

      private void a(arf $$0, dxe.a $$1, ji<dwv> $$2, dwv.a $$3, evr $$4, evr $$5) {
         $$1.e.a(new dxc($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(iz $$0, iz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dby $$0, evr $$1, evr $$2) {
         evr $$3 = new evr((double)ayz.a($$1.c) + 0.5, (double)ayz.a($$1.d) + 0.5, (double)ayz.a($$1.e) + 0.5);
         evr $$4 = new evr((double)ayz.a($$2.c) + 0.5, (double)ayz.a($$2.d) + 0.5, (double)ayz.a($$2.e) + 0.5);

         for (je $$5 : je.values()) {
            evr $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbg($$6, $$4, $$0x -> $$0x.a(awp.bq))).c() != evp.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dby $$0, dxe.a $$1, dxe.d $$2) {
         if ($$0 instanceof arf $$3) {
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

      private static void a(arf $$0, dxe.a $$1, dxe.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evr $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ln($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arf $$0, dxe.a $$1, dxe.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evr $$3 = $$1.c.c();
               dwz $$4 = $$2.b();
               evr $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayz.d($$8, $$3.c, $$5.c);
               double $$10 = ayz.d($$8, $$3.d, $$5.d);
               double $$11 = ayz.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ln($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arf $$0, dxe.a $$1, dxe.d $$2, dxc $$3) {
         iz $$4 = iz.a($$3.c());
         iz $$5 = $$2.b().a($$0).map(iz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxe.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dby $$0, iz $$1) {
         dbf $$2 = new dbf($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbf.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dwz b();

      boolean a(arf var1, iz var2, ji<dwv> var3, dwv.a var4);

      void a(arf var1, iz var2, ji<dwv> var3, @Nullable bsu var4, @Nullable bsu var5, float var6);

      default axf<dwv> c() {
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

      default boolean a(ji<dwv> $$0, dwv.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bsu $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(aww.d)) {
                  if (this.d() && $$2 instanceof arg $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awp.br) : true;
         }
      }

      default void e() {
      }
   }
}
