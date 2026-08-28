import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxd {
   List<ald<dwu>> e_ = List.of(
      dwu.T.h(),
      dwu.U.h(),
      dwu.V.h(),
      dwu.W.h(),
      dwu.X.h(),
      dwu.Y.h(),
      dwu.Z.h(),
      dwu.aa.h(),
      dwu.ab.h(),
      dwu.ac.h(),
      dwu.ad.h(),
      dwu.ae.h(),
      dwu.af.h(),
      dwu.ag.h(),
      dwu.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ald<dwu>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dwu.P.h(), 1);
      $$0.put(dwu.Q.h(), 1);
      $$0.put(dwu.x.h(), 1);
      $$0.put(dwu.J.h(), 2);
      $$0.put(dwu.A.h(), 2);
      $$0.put(dwu.O.h(), 2);
      $$0.put(dwu.C.h(), 3);
      $$0.put(dwu.K.h(), 3);
      $$0.put(dwu.B.h(), 3);
      $$0.put(dwu.u.h(), 4);
      $$0.put(dwu.n.h(), 4);
      $$0.put(dwu.S.h(), 4);
      $$0.put(dwu.q.h(), 5);
      $$0.put(dwu.v.h(), 5);
      $$0.put(dwu.r.h(), 6);
      $$0.put(dwu.M.h(), 6);
      $$0.put(dwu.s.h(), 6);
      $$0.put(dwu.o.h(), 7);
      $$0.put(dwu.l.h(), 8);
      $$0.put(dwu.m.h(), 8);
      $$0.put(dwu.j.h(), 9);
      $$0.put(dwu.d.h(), 9);
      $$0.put(dwu.e.h(), 9);
      $$0.put(dwu.g.h(), 9);
      $$0.put(dwu.k.h(), 10);
      $$0.put(dwu.h.h(), 10);
      $$0.put(dwu.a.h(), 10);
      $$0.put(dwu.b.h(), 10);
      $$0.put(dwu.I.h(), 10);
      $$0.put(dwu.H.h(), 10);
      $$0.put(dwu.c.h(), 11);
      $$0.put(dwu.f.h(), 12);
      $$0.put(dwu.y.h(), 12);
      $$0.put(dwu.i.h(), 13);
      $$0.put(dwu.z.h(), 13);
      $$0.put(dwu.t.h(), 14);
      $$0.put(dwu.G.h(), 14);
      $$0.put(dwu.R.h(), 14);
      $$0.put(dwu.p.h(), 15);
      $$0.put(dwu.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxd.a gs();

   dxd.d gt();

   static int a_(ji<dwu> $$0) {
      return $$0.e().map(dxd::a).orElse(0);
   }

   static int a(ald<dwu> $$0) {
      return g_.applyAsInt($$0);
   }

   static ald<dwu> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayy.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxb.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxc.a.fieldOf("selector").forGetter(dxd.a::a),
                  ayg.k.fieldOf("event_delay").orElse(0).forGetter(dxd.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxd.a((dxb)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxb c;
      private int d;
      final dxc e;
      private boolean f;

      private a(@Nullable dxb $$0, dxc $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxc(), 0, false);
      }

      public dxc a() {
         return this.e;
      }

      @Nullable
      public dxb b() {
         return this.c;
      }

      public void a(@Nullable dxb $$0) {
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

   public static class b implements dww {
      private final dxd a;

      public b(dxd $$0) {
         this.a = $$0;
      }

      @Override
      public dwy a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(are $$0, ji<dwu> $$1, dwu.a $$2, evq $$3) {
         dxd.a $$4 = this.a.gs();
         dxd.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evq> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evq $$7 = $$6.get();
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

      public void b(are $$0, ji<dwu> $$1, dwu.a $$2, evq $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gs(), $$1, $$2, $$3, $$4));
      }

      private void a(are $$0, dxd.a $$1, ji<dwu> $$2, dwu.a $$3, evq $$4, evq $$5) {
         $$1.e.a(new dxb($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(iz $$0, iz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dbx $$0, evq $$1, evq $$2) {
         evq $$3 = new evq((double)ayy.a($$1.c) + 0.5, (double)ayy.a($$1.d) + 0.5, (double)ayy.a($$1.e) + 0.5);
         evq $$4 = new evq((double)ayy.a($$2.c) + 0.5, (double)ayy.a($$2.d) + 0.5, (double)ayy.a($$2.e) + 0.5);

         for (je $$5 : je.values()) {
            evq $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbf($$6, $$4, $$0x -> $$0x.a(awo.bq))).c() != evo.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dbx $$0, dxd.a $$1, dxd.d $$2) {
         if ($$0 instanceof are $$3) {
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

      private static void a(are $$0, dxd.a $$1, dxd.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evq $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ln($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(are $$0, dxd.a $$1, dxd.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evq $$3 = $$1.c.c();
               dwy $$4 = $$2.b();
               evq $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayy.d($$8, $$3.c, $$5.c);
               double $$10 = ayy.d($$8, $$3.d, $$5.d);
               double $$11 = ayy.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ln($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(are $$0, dxd.a $$1, dxd.d $$2, dxb $$3) {
         iz $$4 = iz.a($$3.c());
         iz $$5 = $$2.b().a($$0).map(iz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxd.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dbx $$0, iz $$1) {
         dbe $$2 = new dbe($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbe.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dwy b();

      boolean a(are var1, iz var2, ji<dwu> var3, dwu.a var4);

      void a(are var1, iz var2, ji<dwu> var3, @Nullable bst var4, @Nullable bst var5, float var6);

      default axe<dwu> c() {
         return awv.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayy.d($$0);
      }

      default boolean a(ji<dwu> $$0, dwu.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bst $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(awv.d)) {
                  if (this.d() && $$2 instanceof arf $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awo.br) : true;
         }
      }

      default void e() {
      }
   }
}
