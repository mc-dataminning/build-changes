import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dwd {
   List<akl<dvu>> e_ = List.of(
      dvu.T.h(),
      dvu.U.h(),
      dvu.V.h(),
      dvu.W.h(),
      dvu.X.h(),
      dvu.Y.h(),
      dvu.Z.h(),
      dvu.aa.h(),
      dvu.ab.h(),
      dvu.ac.h(),
      dvu.ad.h(),
      dvu.ae.h(),
      dvu.af.h(),
      dvu.ag.h(),
      dvu.ah.h()
   );
   int f_ = 0;
   ToIntFunction<akl<dvu>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dvu.P.h(), 1);
      $$0.put(dvu.Q.h(), 1);
      $$0.put(dvu.x.h(), 1);
      $$0.put(dvu.J.h(), 2);
      $$0.put(dvu.A.h(), 2);
      $$0.put(dvu.O.h(), 2);
      $$0.put(dvu.C.h(), 3);
      $$0.put(dvu.K.h(), 3);
      $$0.put(dvu.B.h(), 3);
      $$0.put(dvu.u.h(), 4);
      $$0.put(dvu.n.h(), 4);
      $$0.put(dvu.S.h(), 4);
      $$0.put(dvu.q.h(), 5);
      $$0.put(dvu.v.h(), 5);
      $$0.put(dvu.r.h(), 6);
      $$0.put(dvu.M.h(), 6);
      $$0.put(dvu.s.h(), 6);
      $$0.put(dvu.o.h(), 7);
      $$0.put(dvu.l.h(), 8);
      $$0.put(dvu.m.h(), 8);
      $$0.put(dvu.j.h(), 9);
      $$0.put(dvu.d.h(), 9);
      $$0.put(dvu.e.h(), 9);
      $$0.put(dvu.g.h(), 9);
      $$0.put(dvu.k.h(), 10);
      $$0.put(dvu.h.h(), 10);
      $$0.put(dvu.a.h(), 10);
      $$0.put(dvu.b.h(), 10);
      $$0.put(dvu.I.h(), 10);
      $$0.put(dvu.H.h(), 10);
      $$0.put(dvu.c.h(), 11);
      $$0.put(dvu.f.h(), 12);
      $$0.put(dvu.y.h(), 12);
      $$0.put(dvu.i.h(), 13);
      $$0.put(dvu.z.h(), 13);
      $$0.put(dvu.t.h(), 14);
      $$0.put(dvu.G.h(), 14);
      $$0.put(dvu.R.h(), 14);
      $$0.put(dvu.p.h(), 15);
      $$0.put(dvu.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dwd.a gr();

   dwd.d gs();

   static int a_(ix<dvu> $$0) {
      return $$0.e().map(dwd::a).orElse(0);
   }

   static int a(akl<dvu> $$0) {
      return g_.applyAsInt($$0);
   }

   static akl<dvu> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - ayd.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dwd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dwb.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dwc.a.fieldOf("selector").forGetter(dwd.a::a),
                  axm.i.fieldOf("event_delay").orElse(0).forGetter(dwd.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dwd.a((dwb)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dwb c;
      private int d;
      final dwc e;
      private boolean f;

      private a(@Nullable dwb $$0, dwc $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dwc(), 0, false);
      }

      public dwc a() {
         return this.e;
      }

      @Nullable
      public dwb b() {
         return this.c;
      }

      public void a(@Nullable dwb $$0) {
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

   public static class b implements dvw {
      private final dwd a;

      public b(dwd $$0) {
         this.a = $$0;
      }

      @Override
      public dvy a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(aqm $$0, ix<dvu> $$1, dvu.a $$2, euk $$3) {
         dwd.a $$4 = this.a.gr();
         dwd.d $$5 = this.a.gs();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<euk> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               euk $$7 = $$6.get();
               if (!$$5.a($$0, io.a($$3), $$1, $$2)) {
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

      public void b(aqm $$0, ix<dvu> $$1, dvu.a $$2, euk $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gr(), $$1, $$2, $$3, $$4));
      }

      private void a(aqm $$0, dwd.a $$1, ix<dvu> $$2, dvu.a $$3, euk $$4, euk $$5) {
         $$1.e.a(new dwb($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(io $$0, io $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dax $$0, euk $$1, euk $$2) {
         euk $$3 = new euk((double)ayd.a($$1.c) + 0.5, (double)ayd.a($$1.d) + 0.5, (double)ayd.a($$1.e) + 0.5);
         euk $$4 = new euk((double)ayd.a($$2.c) + 0.5, (double)ayd.a($$2.d) + 0.5, (double)ayd.a($$2.e) + 0.5);

         for (it $$5 : it.values()) {
            euk $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new daf($$6, $$4, $$0x -> $$0x.a(avw.bq))).c() != eui.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dax $$0, dwd.a $$1, dwd.d $$2) {
         if ($$0 instanceof aqm $$3) {
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

      private static void a(aqm $$0, dwd.a $$1, dwd.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            euk $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lc($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqm $$0, dwd.a $$1, dwd.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               euk $$3 = $$1.c.c();
               dvy $$4 = $$2.b();
               euk $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = ayd.d($$8, $$3.c, $$5.c);
               double $$10 = ayd.d($$8, $$3.d, $$5.d);
               double $$11 = ayd.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new lc($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqm $$0, dwd.a $$1, dwd.d $$2, dwb $$3) {
         io $$4 = io.a($$3.c());
         io $$5 = $$2.b().a($$0).map(io::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dwd.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dax $$0, io $$1) {
         dae $$2 = new dae($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dae.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dvy b();

      boolean a(aqm var1, io var2, ix<dvu> var3, dvu.a var4);

      void a(aqm var1, io var2, ix<dvu> var3, @Nullable bru var4, @Nullable bru var5, float var6);

      default awl<dvu> c() {
         return awc.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return ayd.d($$0);
      }

      default boolean a(ix<dvu> $$0, dvu.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bru $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bW() && $$0.a(awc.d)) {
                  if (this.d() && $$2 instanceof aqn $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bc()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avw.br) : true;
         }
      }

      default void e() {
      }
   }
}
