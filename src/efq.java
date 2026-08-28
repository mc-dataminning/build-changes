import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface efq {
   List<alf<efh>> d_ = List.of(
      efh.T.h(),
      efh.U.h(),
      efh.V.h(),
      efh.W.h(),
      efh.X.h(),
      efh.Y.h(),
      efh.Z.h(),
      efh.aa.h(),
      efh.ab.h(),
      efh.ac.h(),
      efh.ad.h(),
      efh.ae.h(),
      efh.af.h(),
      efh.ag.h(),
      efh.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alf<efh>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(efh.P.h(), 1);
      $$0.put(efh.Q.h(), 1);
      $$0.put(efh.x.h(), 1);
      $$0.put(efh.J.h(), 2);
      $$0.put(efh.A.h(), 2);
      $$0.put(efh.O.h(), 2);
      $$0.put(efh.C.h(), 3);
      $$0.put(efh.K.h(), 3);
      $$0.put(efh.B.h(), 3);
      $$0.put(efh.u.h(), 4);
      $$0.put(efh.n.h(), 4);
      $$0.put(efh.S.h(), 4);
      $$0.put(efh.q.h(), 5);
      $$0.put(efh.v.h(), 5);
      $$0.put(efh.r.h(), 6);
      $$0.put(efh.M.h(), 6);
      $$0.put(efh.s.h(), 6);
      $$0.put(efh.o.h(), 7);
      $$0.put(efh.l.h(), 8);
      $$0.put(efh.m.h(), 8);
      $$0.put(efh.j.h(), 9);
      $$0.put(efh.d.h(), 9);
      $$0.put(efh.e.h(), 9);
      $$0.put(efh.g.h(), 9);
      $$0.put(efh.k.h(), 10);
      $$0.put(efh.h.h(), 10);
      $$0.put(efh.a.h(), 10);
      $$0.put(efh.b.h(), 10);
      $$0.put(efh.I.h(), 10);
      $$0.put(efh.H.h(), 10);
      $$0.put(efh.c.h(), 11);
      $$0.put(efh.f.h(), 12);
      $$0.put(efh.y.h(), 12);
      $$0.put(efh.i.h(), 13);
      $$0.put(efh.z.h(), 13);
      $$0.put(efh.t.h(), 14);
      $$0.put(efh.G.h(), 14);
      $$0.put(efh.R.h(), 14);
      $$0.put(efh.p.h(), 15);
      $$0.put(efh.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   efq.a x();

   efq.d gr();

   static int a_(je<efh> $$0) {
      return $$0.e().map(efq::a).orElse(0);
   }

   static int a(alf<efh> $$0) {
      return f_.applyAsInt($$0);
   }

   static alf<efh> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<efq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  efo.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  efp.a.fieldOf("selector").forGetter(efq.a::a),
                  ayu.l.fieldOf("event_delay").orElse(0).forGetter(efq.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new efq.a((efo)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      efo c;
      private int d;
      final efp e;
      private boolean f;

      private a(@Nullable efo $$0, efp $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new efp(), 0, false);
      }

      public efp a() {
         return this.e;
      }

      @Nullable
      public efo b() {
         return this.c;
      }

      public void a(@Nullable efo $$0) {
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

   public static class b implements efj {
      private final efq a;

      public b(efq $$0) {
         this.a = $$0;
      }

      @Override
      public efl a() {
         return this.a.gr().b();
      }

      @Override
      public int b() {
         return this.a.gr().a();
      }

      @Override
      public boolean a(arq $$0, je<efh> $$1, efh.a $$2, feq $$3) {
         efq.a $$4 = this.a.x();
         efq.d $$5 = this.a.gr();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<feq> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               feq $$7 = $$6.get();
               if (!$$5.a($$0, iu.a((jo)$$3), $$1, $$2)) {
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

      public void b(arq $$0, je<efh> $$1, efh.a $$2, feq $$3) {
         this.a.gr().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(arq $$0, efq.a $$1, je<efh> $$2, efh.a $$3, feq $$4, feq $$5) {
         $$1.e.a(new efo($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iu $$0, iu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dja $$0, feq $$1, feq $$2) {
         feq $$3 = new feq((double)azm.a($$1.d) + 0.5, (double)azm.a($$1.e) + 0.5, (double)azm.a($$1.f) + 0.5);
         feq $$4 = new feq((double)azm.a($$2.d) + 0.5, (double)azm.a($$2.e) + 0.5, (double)azm.a($$2.f) + 0.5);

         for (ja $$5 : ja.values()) {
            feq $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dii($$6, $$4, $$0x -> $$0x.a(axc.bt))).d() != feo.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dja $$0, efq.a $$1, efq.d $$2) {
         if ($$0 instanceof arq $$3) {
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

      private static void a(arq $$0, efq.a $$1, efq.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            feq $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new md($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arq $$0, efq.a $$1, efq.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               feq $$3 = $$1.c.c();
               efl $$4 = $$2.b();
               feq $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azm.d($$8, $$3.d, $$5.d);
               double $$10 = azm.d($$8, $$3.e, $$5.e);
               double $$11 = azm.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new md($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arq $$0, efq.a $$1, efq.d $$2, efo $$3) {
         iu $$4 = iu.a((jo)$$3.c());
         iu $$5 = $$2.b().a($$0).map(iu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), efq.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dja $$0, iu $$1) {
         dih $$2 = new dih($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dih.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      efl b();

      boolean a(arq var1, iu var2, je<efh> var3, efh.a var4);

      void a(arq var1, iu var2, je<efh> var3, @Nullable bwf var4, @Nullable bwf var5, float var6);

      default axr<efh> c() {
         return axi.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azm.d($$0);
      }

      default boolean a(je<efh> $$0, efh.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwf $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.V_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axi.d)) {
                  if (this.d() && $$2 instanceof arr $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axc.bu) : true;
         }
      }

      default void e() {
      }
   }
}
