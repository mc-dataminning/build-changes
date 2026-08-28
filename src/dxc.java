import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dxc {
   List<ald<dwt>> e_ = List.of(
      dwt.T.h(),
      dwt.U.h(),
      dwt.V.h(),
      dwt.W.h(),
      dwt.X.h(),
      dwt.Y.h(),
      dwt.Z.h(),
      dwt.aa.h(),
      dwt.ab.h(),
      dwt.ac.h(),
      dwt.ad.h(),
      dwt.ae.h(),
      dwt.af.h(),
      dwt.ag.h(),
      dwt.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ald<dwt>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dwt.P.h(), 1);
      $$0.put(dwt.Q.h(), 1);
      $$0.put(dwt.x.h(), 1);
      $$0.put(dwt.J.h(), 2);
      $$0.put(dwt.A.h(), 2);
      $$0.put(dwt.O.h(), 2);
      $$0.put(dwt.C.h(), 3);
      $$0.put(dwt.K.h(), 3);
      $$0.put(dwt.B.h(), 3);
      $$0.put(dwt.u.h(), 4);
      $$0.put(dwt.n.h(), 4);
      $$0.put(dwt.S.h(), 4);
      $$0.put(dwt.q.h(), 5);
      $$0.put(dwt.v.h(), 5);
      $$0.put(dwt.r.h(), 6);
      $$0.put(dwt.M.h(), 6);
      $$0.put(dwt.s.h(), 6);
      $$0.put(dwt.o.h(), 7);
      $$0.put(dwt.l.h(), 8);
      $$0.put(dwt.m.h(), 8);
      $$0.put(dwt.j.h(), 9);
      $$0.put(dwt.d.h(), 9);
      $$0.put(dwt.e.h(), 9);
      $$0.put(dwt.g.h(), 9);
      $$0.put(dwt.k.h(), 10);
      $$0.put(dwt.h.h(), 10);
      $$0.put(dwt.a.h(), 10);
      $$0.put(dwt.b.h(), 10);
      $$0.put(dwt.I.h(), 10);
      $$0.put(dwt.H.h(), 10);
      $$0.put(dwt.c.h(), 11);
      $$0.put(dwt.f.h(), 12);
      $$0.put(dwt.y.h(), 12);
      $$0.put(dwt.i.h(), 13);
      $$0.put(dwt.z.h(), 13);
      $$0.put(dwt.t.h(), 14);
      $$0.put(dwt.G.h(), 14);
      $$0.put(dwt.R.h(), 14);
      $$0.put(dwt.p.h(), 15);
      $$0.put(dwt.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dxc.a gs();

   dxc.d gt();

   static int a_(ji<dwt> $$0) {
      return $$0.e().map(dxc::a).orElse(0);
   }

   static int a(ald<dwt> $$0) {
      return g_.applyAsInt($$0);
   }

   static ald<dwt> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayx.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dxc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dxa.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dxb.a.fieldOf("selector").forGetter(dxc.a::a),
                  ayf.k.fieldOf("event_delay").orElse(0).forGetter(dxc.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dxc.a((dxa)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dxa c;
      private int d;
      final dxb e;
      private boolean f;

      private a(@Nullable dxa $$0, dxb $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dxb(), 0, false);
      }

      public dxb a() {
         return this.e;
      }

      @Nullable
      public dxa b() {
         return this.c;
      }

      public void a(@Nullable dxa $$0) {
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

   public static class b implements dwv {
      private final dxc a;

      public b(dxc $$0) {
         this.a = $$0;
      }

      @Override
      public dwx a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(are $$0, ji<dwt> $$1, dwt.a $$2, evp $$3) {
         dxc.a $$4 = this.a.gs();
         dxc.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<evp> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               evp $$7 = $$6.get();
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

      public void b(are $$0, ji<dwt> $$1, dwt.a $$2, evp $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gs(), $$1, $$2, $$3, $$4));
      }

      private void a(are $$0, dxc.a $$1, ji<dwt> $$2, dwt.a $$3, evp $$4, evp $$5) {
         $$1.e.a(new dxa($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Z());
      }

      public static float a(iz $$0, iz $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dbw $$0, evp $$1, evp $$2) {
         evp $$3 = new evp((double)ayx.a($$1.c) + 0.5, (double)ayx.a($$1.d) + 0.5, (double)ayx.a($$1.e) + 0.5);
         evp $$4 = new evp((double)ayx.a($$2.c) + 0.5, (double)ayx.a($$2.d) + 0.5, (double)ayx.a($$2.e) + 0.5);

         for (je $$5 : je.values()) {
            evp $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dbe($$6, $$4, $$0x -> $$0x.a(awo.bq))).c() != evn.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dbw $$0, dxc.a $$1, dxc.d $$2) {
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

      private static void a(are $$0, dxc.a $$1, dxc.d $$2) {
         $$1.a().a($$0.Z()).ifPresent($$3 -> {
            $$1.a($$3);
            evp $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ln($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(are $$0, dxc.a $$1, dxc.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               evp $$3 = $$1.c.c();
               dwx $$4 = $$2.b();
               evp $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayx.d($$8, $$3.c, $$5.c);
               double $$10 = ayx.d($$8, $$3.d, $$5.d);
               double $$11 = ayx.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new ln($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(are $$0, dxc.a $$1, dxc.d $$2, dxa $$3) {
         iz $$4 = iz.a($$3.c());
         iz $$5 = $$2.b().a($$0).map(iz::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dxc.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dbw $$0, iz $$1) {
         dbd $$2 = new dbd($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dbd.c($$3, $$4)) || $$0.N().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dwx b();

      boolean a(are var1, iz var2, ji<dwt> var3, dwt.a var4);

      void a(are var1, iz var2, ji<dwt> var3, @Nullable bss var4, @Nullable bss var5, float var6);

      default axe<dwt> c() {
         return awv.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayx.d($$0);
      }

      default boolean a(ji<dwt> $$0, dwt.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bss $$2 = $$1.a();
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
