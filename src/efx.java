import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface efx {
   List<alf<efo>> d_ = List.of(
      efo.T.h(),
      efo.U.h(),
      efo.V.h(),
      efo.W.h(),
      efo.X.h(),
      efo.Y.h(),
      efo.Z.h(),
      efo.aa.h(),
      efo.ab.h(),
      efo.ac.h(),
      efo.ad.h(),
      efo.ae.h(),
      efo.af.h(),
      efo.ag.h(),
      efo.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alf<efo>> f_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(efo.P.h(), 1);
      $$0.put(efo.Q.h(), 1);
      $$0.put(efo.x.h(), 1);
      $$0.put(efo.J.h(), 2);
      $$0.put(efo.A.h(), 2);
      $$0.put(efo.O.h(), 2);
      $$0.put(efo.C.h(), 3);
      $$0.put(efo.K.h(), 3);
      $$0.put(efo.B.h(), 3);
      $$0.put(efo.u.h(), 4);
      $$0.put(efo.n.h(), 4);
      $$0.put(efo.S.h(), 4);
      $$0.put(efo.q.h(), 5);
      $$0.put(efo.v.h(), 5);
      $$0.put(efo.r.h(), 6);
      $$0.put(efo.M.h(), 6);
      $$0.put(efo.s.h(), 6);
      $$0.put(efo.o.h(), 7);
      $$0.put(efo.l.h(), 8);
      $$0.put(efo.m.h(), 8);
      $$0.put(efo.j.h(), 9);
      $$0.put(efo.d.h(), 9);
      $$0.put(efo.e.h(), 9);
      $$0.put(efo.g.h(), 9);
      $$0.put(efo.k.h(), 10);
      $$0.put(efo.h.h(), 10);
      $$0.put(efo.a.h(), 10);
      $$0.put(efo.b.h(), 10);
      $$0.put(efo.I.h(), 10);
      $$0.put(efo.H.h(), 10);
      $$0.put(efo.c.h(), 11);
      $$0.put(efo.f.h(), 12);
      $$0.put(efo.y.h(), 12);
      $$0.put(efo.i.h(), 13);
      $$0.put(efo.z.h(), 13);
      $$0.put(efo.t.h(), 14);
      $$0.put(efo.G.h(), 14);
      $$0.put(efo.R.h(), 14);
      $$0.put(efo.p.h(), 15);
      $$0.put(efo.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   efx.a x();

   efx.d gt();

   static int a_(jf<efo> $$0) {
      return $$0.e().map(efx::a).orElse(0);
   }

   static int a(alf<efo> $$0) {
      return f_.applyAsInt($$0);
   }

   static alf<efo> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<efx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  efv.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  efw.a.fieldOf("selector").forGetter(efx.a::a),
                  ayu.l.fieldOf("event_delay").orElse(0).forGetter(efx.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new efx.a((efv)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      efv c;
      private int d;
      final efw e;
      private boolean f;

      private a(@Nullable efv $$0, efw $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new efw(), 0, false);
      }

      public efw a() {
         return this.e;
      }

      @Nullable
      public efv b() {
         return this.c;
      }

      public void a(@Nullable efv $$0) {
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

   public static class b implements efq {
      private final efx a;

      public b(efx $$0) {
         this.a = $$0;
      }

      @Override
      public efs a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(arq $$0, jf<efo> $$1, efo.a $$2, fex $$3) {
         efx.a $$4 = this.a.x();
         efx.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fex> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fex $$7 = $$6.get();
               if (!$$5.a($$0, iv.a((jp)$$3), $$1, $$2)) {
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

      public void b(arq $$0, jf<efo> $$1, efo.a $$2, fex $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(arq $$0, efx.a $$1, jf<efo> $$2, efo.a $$3, fex $$4, fex $$5) {
         $$1.e.a(new efv($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iv $$0, iv $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(djh $$0, fex $$1, fex $$2) {
         fex $$3 = new fex((double)azm.a($$1.d) + 0.5, (double)azm.a($$1.e) + 0.5, (double)azm.a($$1.f) + 0.5);
         fex $$4 = new fex((double)azm.a($$2.d) + 0.5, (double)azm.a($$2.e) + 0.5, (double)azm.a($$2.f) + 0.5);

         for (jb $$5 : jb.values()) {
            fex $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dip($$6, $$4, $$0x -> $$0x.a(axc.bt))).d() != fev.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(djh $$0, efx.a $$1, efx.d $$2) {
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

      private static void a(arq $$0, efx.a $$1, efx.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fex $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new me($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arq $$0, efx.a $$1, efx.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fex $$3 = $$1.c.c();
               efs $$4 = $$2.b();
               fex $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azm.d($$8, $$3.d, $$5.d);
               double $$10 = azm.d($$8, $$3.e, $$5.e);
               double $$11 = azm.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new me($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arq $$0, efx.a $$1, efx.d $$2, efv $$3) {
         iv $$4 = iv.a((jp)$$3.c());
         iv $$5 = $$2.b().a($$0).map(iv::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), efx.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(djh $$0, iv $$1) {
         dio $$2 = new dio($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dio.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      efs b();

      boolean a(arq var1, iv var2, jf<efo> var3, efo.a var4);

      void a(arq var1, iv var2, jf<efo> var3, @Nullable bwi var4, @Nullable bwi var5, float var6);

      default axr<efo> c() {
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

      default boolean a(jf<efo> $$0, efo.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwi $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.V_()) {
                  return false;
               }

               if ($$2.cc() && $$0.a(axi.d)) {
                  if (this.d() && $$2 instanceof arr $$3) {
                     aq.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bf()) {
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
