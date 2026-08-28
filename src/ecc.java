import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ecc {
   List<aku<ebt>> d_ = List.of(
      ebt.T.h(),
      ebt.U.h(),
      ebt.V.h(),
      ebt.W.h(),
      ebt.X.h(),
      ebt.Y.h(),
      ebt.Z.h(),
      ebt.aa.h(),
      ebt.ab.h(),
      ebt.ac.h(),
      ebt.ad.h(),
      ebt.ae.h(),
      ebt.af.h(),
      ebt.ag.h(),
      ebt.ah.h()
   );
   int e_ = 0;
   ToIntFunction<aku<ebt>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ebt.P.h(), 1);
      $$0.put(ebt.Q.h(), 1);
      $$0.put(ebt.x.h(), 1);
      $$0.put(ebt.J.h(), 2);
      $$0.put(ebt.A.h(), 2);
      $$0.put(ebt.O.h(), 2);
      $$0.put(ebt.C.h(), 3);
      $$0.put(ebt.K.h(), 3);
      $$0.put(ebt.B.h(), 3);
      $$0.put(ebt.u.h(), 4);
      $$0.put(ebt.n.h(), 4);
      $$0.put(ebt.S.h(), 4);
      $$0.put(ebt.q.h(), 5);
      $$0.put(ebt.v.h(), 5);
      $$0.put(ebt.r.h(), 6);
      $$0.put(ebt.M.h(), 6);
      $$0.put(ebt.s.h(), 6);
      $$0.put(ebt.o.h(), 7);
      $$0.put(ebt.l.h(), 8);
      $$0.put(ebt.m.h(), 8);
      $$0.put(ebt.j.h(), 9);
      $$0.put(ebt.d.h(), 9);
      $$0.put(ebt.e.h(), 9);
      $$0.put(ebt.g.h(), 9);
      $$0.put(ebt.k.h(), 10);
      $$0.put(ebt.h.h(), 10);
      $$0.put(ebt.a.h(), 10);
      $$0.put(ebt.b.h(), 10);
      $$0.put(ebt.I.h(), 10);
      $$0.put(ebt.H.h(), 10);
      $$0.put(ebt.c.h(), 11);
      $$0.put(ebt.f.h(), 12);
      $$0.put(ebt.y.h(), 12);
      $$0.put(ebt.i.h(), 13);
      $$0.put(ebt.z.h(), 13);
      $$0.put(ebt.t.h(), 14);
      $$0.put(ebt.G.h(), 14);
      $$0.put(ebt.R.h(), 14);
      $$0.put(ebt.p.h(), 15);
      $$0.put(ebt.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ecc.a gt();

   ecc.d gu();

   static int a_(jr<ebt> $$0) {
      return $$0.e().map(ecc::a).orElse(0);
   }

   static int a(aku<ebt> $$0) {
      return f_.applyAsInt($$0);
   }

   static aku<ebt> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<ecc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eca.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ecb.a.fieldOf("selector").forGetter(ecc.a::a),
                  ayi.l.fieldOf("event_delay").orElse(0).forGetter(ecc.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new ecc.a((eca)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eca c;
      private int d;
      final ecb e;
      private boolean f;

      private a(@Nullable eca $$0, ecb $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ecb(), 0, false);
      }

      public ecb a() {
         return this.e;
      }

      @Nullable
      public eca b() {
         return this.c;
      }

      public void a(@Nullable eca $$0) {
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

   public static class b implements ebv {
      private final ecc a;

      public b(ecc $$0) {
         this.a = $$0;
      }

      @Override
      public ebx a() {
         return this.a.gu().b();
      }

      @Override
      public int b() {
         return this.a.gu().a();
      }

      @Override
      public boolean a(ard $$0, jr<ebt> $$1, ebt.a $$2, fba $$3) {
         ecc.a $$4 = this.a.gt();
         ecc.d $$5 = this.a.gu();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fba> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fba $$7 = $$6.get();
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

      public void b(ard $$0, jr<ebt> $$1, ebt.a $$2, fba $$3) {
         this.a.gu().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gt(), $$1, $$2, $$3, $$4));
      }

      private void a(ard $$0, ecc.a $$1, jr<ebt> $$2, ebt.a $$3, fba $$4, fba $$5) {
         $$1.e.a(new eca($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ad());
      }

      public static float a(ji $$0, ji $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dgi $$0, fba $$1, fba $$2) {
         fba $$3 = new fba((double)ayz.a($$1.d) + 0.5, (double)ayz.a($$1.e) + 0.5, (double)ayz.a($$1.f) + 0.5);
         fba $$4 = new fba((double)ayz.a($$2.d) + 0.5, (double)ayz.a($$2.e) + 0.5, (double)ayz.a($$2.f) + 0.5);

         for (jn $$5 : jn.values()) {
            fba $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dfp($$6, $$4, $$0x -> $$0x.a(awp.bs))).d() != fay.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dgi $$0, ecc.a $$1, ecc.d $$2) {
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

      private static void a(ard $$0, ecc.a $$1, ecc.d $$2) {
         $$1.a().a($$0.ad()).ifPresent($$3 -> {
            $$1.a($$3);
            fba $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lz($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ard $$0, ecc.a $$1, ecc.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fba $$3 = $$1.c.c();
               ebx $$4 = $$2.b();
               fba $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(ard $$0, ecc.a $$1, ecc.d $$2, eca $$3) {
         ji $$4 = ji.a((kb)$$3.c());
         ji $$5 = $$2.b().a($$0).map(ji::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ecc.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dgi $$0, ji $$1) {
         dfo $$2 = new dfo($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dfo.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ebx b();

      boolean a(ard var1, ji var2, jr<ebt> var3, ebt.a var4);

      void a(ard var1, ji var2, jr<ebt> var3, @Nullable bul var4, @Nullable bul var5, float var6);

      default axf<ebt> c() {
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

      default boolean a(jr<ebt> $$0, ebt.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bul $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Z_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(aww.d)) {
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
