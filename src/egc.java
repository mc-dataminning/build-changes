import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface egc {
   List<alf<eft>> d_ = List.of(
      eft.T.h(),
      eft.U.h(),
      eft.V.h(),
      eft.W.h(),
      eft.X.h(),
      eft.Y.h(),
      eft.Z.h(),
      eft.aa.h(),
      eft.ab.h(),
      eft.ac.h(),
      eft.ad.h(),
      eft.ae.h(),
      eft.af.h(),
      eft.ag.h(),
      eft.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alf<eft>> f_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eft.P.h(), 1);
      $$0.put(eft.Q.h(), 1);
      $$0.put(eft.x.h(), 1);
      $$0.put(eft.J.h(), 2);
      $$0.put(eft.A.h(), 2);
      $$0.put(eft.O.h(), 2);
      $$0.put(eft.C.h(), 3);
      $$0.put(eft.K.h(), 3);
      $$0.put(eft.B.h(), 3);
      $$0.put(eft.u.h(), 4);
      $$0.put(eft.n.h(), 4);
      $$0.put(eft.S.h(), 4);
      $$0.put(eft.q.h(), 5);
      $$0.put(eft.v.h(), 5);
      $$0.put(eft.r.h(), 6);
      $$0.put(eft.M.h(), 6);
      $$0.put(eft.s.h(), 6);
      $$0.put(eft.o.h(), 7);
      $$0.put(eft.l.h(), 8);
      $$0.put(eft.m.h(), 8);
      $$0.put(eft.j.h(), 9);
      $$0.put(eft.d.h(), 9);
      $$0.put(eft.e.h(), 9);
      $$0.put(eft.g.h(), 9);
      $$0.put(eft.k.h(), 10);
      $$0.put(eft.h.h(), 10);
      $$0.put(eft.a.h(), 10);
      $$0.put(eft.b.h(), 10);
      $$0.put(eft.I.h(), 10);
      $$0.put(eft.H.h(), 10);
      $$0.put(eft.c.h(), 11);
      $$0.put(eft.f.h(), 12);
      $$0.put(eft.y.h(), 12);
      $$0.put(eft.i.h(), 13);
      $$0.put(eft.z.h(), 13);
      $$0.put(eft.t.h(), 14);
      $$0.put(eft.G.h(), 14);
      $$0.put(eft.R.h(), 14);
      $$0.put(eft.p.h(), 15);
      $$0.put(eft.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   egc.a x();

   egc.d gt();

   static int a_(jf<eft> $$0) {
      return $$0.e().map(egc::a).orElse(0);
   }

   static int a(alf<eft> $$0) {
      return f_.applyAsInt($$0);
   }

   static alf<eft> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<egc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ega.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  egb.a.fieldOf("selector").forGetter(egc.a::a),
                  ayu.l.fieldOf("event_delay").orElse(0).forGetter(egc.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new egc.a((ega)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ega c;
      private int d;
      final egb e;
      private boolean f;

      private a(@Nullable ega $$0, egb $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new egb(), 0, false);
      }

      public egb a() {
         return this.e;
      }

      @Nullable
      public ega b() {
         return this.c;
      }

      public void a(@Nullable ega $$0) {
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

   public static class b implements efv {
      private final egc a;

      public b(egc $$0) {
         this.a = $$0;
      }

      @Override
      public efx a() {
         return this.a.gt().b();
      }

      @Override
      public int b() {
         return this.a.gt().a();
      }

      @Override
      public boolean a(arq $$0, jf<eft> $$1, eft.a $$2, ffc $$3) {
         egc.a $$4 = this.a.x();
         egc.d $$5 = this.a.gt();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ffc> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ffc $$7 = $$6.get();
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

      public void b(arq $$0, jf<eft> $$1, eft.a $$2, ffc $$3) {
         this.a.gt().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(arq $$0, egc.a $$1, jf<eft> $$2, eft.a $$3, ffc $$4, ffc $$5) {
         $$1.e.a(new ega($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iv $$0, iv $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(djm $$0, ffc $$1, ffc $$2) {
         ffc $$3 = new ffc((double)azm.a($$1.d) + 0.5, (double)azm.a($$1.e) + 0.5, (double)azm.a($$1.f) + 0.5);
         ffc $$4 = new ffc((double)azm.a($$2.d) + 0.5, (double)azm.a($$2.e) + 0.5, (double)azm.a($$2.f) + 0.5);

         for (jb $$5 : jb.values()) {
            ffc $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dis($$6, $$4, $$0x -> $$0x.a(axc.bt))).d() != ffa.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(djm $$0, egc.a $$1, egc.d $$2) {
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

      private static void a(arq $$0, egc.a $$1, egc.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            ffc $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new me($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arq $$0, egc.a $$1, egc.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ffc $$3 = $$1.c.c();
               efx $$4 = $$2.b();
               ffc $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(arq $$0, egc.a $$1, egc.d $$2, ega $$3) {
         iv $$4 = iv.a((jp)$$3.c());
         iv $$5 = $$2.b().a($$0).map(iv::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), egc.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(djm $$0, iv $$1) {
         dir $$2 = new dir($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dir.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      efx b();

      boolean a(arq var1, iv var2, jf<eft> var3, eft.a var4);

      void a(arq var1, iv var2, jf<eft> var3, @Nullable bwi var4, @Nullable bwi var5, float var6);

      default axr<eft> c() {
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

      default boolean a(jf<eft> $$0, eft.a $$1) {
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
