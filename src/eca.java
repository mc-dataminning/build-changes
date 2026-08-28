import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eca {
   List<akt<ebr>> d_ = List.of(
      ebr.T.h(),
      ebr.U.h(),
      ebr.V.h(),
      ebr.W.h(),
      ebr.X.h(),
      ebr.Y.h(),
      ebr.Z.h(),
      ebr.aa.h(),
      ebr.ab.h(),
      ebr.ac.h(),
      ebr.ad.h(),
      ebr.ae.h(),
      ebr.af.h(),
      ebr.ag.h(),
      ebr.ah.h()
   );
   int e_ = 0;
   ToIntFunction<akt<ebr>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ebr.P.h(), 1);
      $$0.put(ebr.Q.h(), 1);
      $$0.put(ebr.x.h(), 1);
      $$0.put(ebr.J.h(), 2);
      $$0.put(ebr.A.h(), 2);
      $$0.put(ebr.O.h(), 2);
      $$0.put(ebr.C.h(), 3);
      $$0.put(ebr.K.h(), 3);
      $$0.put(ebr.B.h(), 3);
      $$0.put(ebr.u.h(), 4);
      $$0.put(ebr.n.h(), 4);
      $$0.put(ebr.S.h(), 4);
      $$0.put(ebr.q.h(), 5);
      $$0.put(ebr.v.h(), 5);
      $$0.put(ebr.r.h(), 6);
      $$0.put(ebr.M.h(), 6);
      $$0.put(ebr.s.h(), 6);
      $$0.put(ebr.o.h(), 7);
      $$0.put(ebr.l.h(), 8);
      $$0.put(ebr.m.h(), 8);
      $$0.put(ebr.j.h(), 9);
      $$0.put(ebr.d.h(), 9);
      $$0.put(ebr.e.h(), 9);
      $$0.put(ebr.g.h(), 9);
      $$0.put(ebr.k.h(), 10);
      $$0.put(ebr.h.h(), 10);
      $$0.put(ebr.a.h(), 10);
      $$0.put(ebr.b.h(), 10);
      $$0.put(ebr.I.h(), 10);
      $$0.put(ebr.H.h(), 10);
      $$0.put(ebr.c.h(), 11);
      $$0.put(ebr.f.h(), 12);
      $$0.put(ebr.y.h(), 12);
      $$0.put(ebr.i.h(), 13);
      $$0.put(ebr.z.h(), 13);
      $$0.put(ebr.t.h(), 14);
      $$0.put(ebr.G.h(), 14);
      $$0.put(ebr.R.h(), 14);
      $$0.put(ebr.p.h(), 15);
      $$0.put(ebr.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eca.a gq();

   eca.d gr();

   static int a_(jr<ebr> $$0) {
      return $$0.e().map(eca::a).orElse(0);
   }

   static int a(akt<ebr> $$0) {
      return f_.applyAsInt($$0);
   }

   static akt<ebr> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayy.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eby.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ebz.a.fieldOf("selector").forGetter(eca.a::a),
                  ayh.l.fieldOf("event_delay").orElse(0).forGetter(eca.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eca.a((eby)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eby c;
      private int d;
      final ebz e;
      private boolean f;

      private a(@Nullable eby $$0, ebz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ebz(), 0, false);
      }

      public ebz a() {
         return this.e;
      }

      @Nullable
      public eby b() {
         return this.c;
      }

      public void a(@Nullable eby $$0) {
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

   public static class b implements ebt {
      private final eca a;

      public b(eca $$0) {
         this.a = $$0;
      }

      @Override
      public ebv a() {
         return this.a.gr().b();
      }

      @Override
      public int b() {
         return this.a.gr().a();
      }

      @Override
      public boolean a(arc $$0, jr<ebr> $$1, ebr.a $$2, fay $$3) {
         eca.a $$4 = this.a.gq();
         eca.d $$5 = this.a.gr();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fay> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fay $$7 = $$6.get();
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

      public void b(arc $$0, jr<ebr> $$1, ebr.a $$2, fay $$3) {
         this.a.gr().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gq(), $$1, $$2, $$3, $$4));
      }

      private void a(arc $$0, eca.a $$1, jr<ebr> $$2, ebr.a $$3, fay $$4, fay $$5) {
         $$1.e.a(new eby($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ad());
      }

      public static float a(ji $$0, ji $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dgg $$0, fay $$1, fay $$2) {
         fay $$3 = new fay((double)ayy.a($$1.d) + 0.5, (double)ayy.a($$1.e) + 0.5, (double)ayy.a($$1.f) + 0.5);
         fay $$4 = new fay((double)ayy.a($$2.d) + 0.5, (double)ayy.a($$2.e) + 0.5, (double)ayy.a($$2.f) + 0.5);

         for (jn $$5 : jn.values()) {
            fay $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dfn($$6, $$4, $$0x -> $$0x.a(awo.bs))).d() != faw.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dgg $$0, eca.a $$1, eca.d $$2) {
         if ($$0 instanceof arc $$3) {
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

      private static void a(arc $$0, eca.a $$1, eca.d $$2) {
         $$1.a().a($$0.ad()).ifPresent($$3 -> {
            $$1.a($$3);
            fay $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lz($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arc $$0, eca.a $$1, eca.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fay $$3 = $$1.c.c();
               ebv $$4 = $$2.b();
               fay $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayy.d($$8, $$3.d, $$5.d);
               double $$10 = ayy.d($$8, $$3.e, $$5.e);
               double $$11 = ayy.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arc $$0, eca.a $$1, eca.d $$2, eby $$3) {
         ji $$4 = ji.a((kb)$$3.c());
         ji $$5 = $$2.b().a($$0).map(ji::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eca.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dgg $$0, ji $$1) {
         dfm $$2 = new dfm($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dfm.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ebv b();

      boolean a(arc var1, ji var2, jr<ebr> var3, ebr.a var4);

      void a(arc var1, ji var2, jr<ebr> var3, @Nullable buj var4, @Nullable buj var5, float var6);

      default axe<ebr> c() {
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

      default boolean a(jr<ebr> $$0, ebr.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            buj $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Z_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(awv.d)) {
                  if (this.d() && $$2 instanceof ard $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awo.bt) : true;
         }
      }

      default void e() {
      }
   }
}
