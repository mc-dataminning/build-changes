import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dra {
   List<ajb<dqr>> e_ = List.of(
      dqr.T.h(),
      dqr.U.h(),
      dqr.V.h(),
      dqr.W.h(),
      dqr.X.h(),
      dqr.Y.h(),
      dqr.Z.h(),
      dqr.aa.h(),
      dqr.ab.h(),
      dqr.ac.h(),
      dqr.ad.h(),
      dqr.ae.h(),
      dqr.af.h(),
      dqr.ag.h(),
      dqr.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ajb<dqr>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dqr.P.h(), 1);
      $$0.put(dqr.Q.h(), 1);
      $$0.put(dqr.x.h(), 1);
      $$0.put(dqr.J.h(), 2);
      $$0.put(dqr.A.h(), 2);
      $$0.put(dqr.O.h(), 2);
      $$0.put(dqr.C.h(), 3);
      $$0.put(dqr.K.h(), 3);
      $$0.put(dqr.B.h(), 3);
      $$0.put(dqr.u.h(), 4);
      $$0.put(dqr.n.h(), 4);
      $$0.put(dqr.S.h(), 4);
      $$0.put(dqr.q.h(), 5);
      $$0.put(dqr.v.h(), 5);
      $$0.put(dqr.r.h(), 6);
      $$0.put(dqr.M.h(), 6);
      $$0.put(dqr.s.h(), 6);
      $$0.put(dqr.o.h(), 7);
      $$0.put(dqr.l.h(), 8);
      $$0.put(dqr.m.h(), 8);
      $$0.put(dqr.j.h(), 9);
      $$0.put(dqr.d.h(), 9);
      $$0.put(dqr.e.h(), 9);
      $$0.put(dqr.g.h(), 9);
      $$0.put(dqr.k.h(), 10);
      $$0.put(dqr.h.h(), 10);
      $$0.put(dqr.a.h(), 10);
      $$0.put(dqr.b.h(), 10);
      $$0.put(dqr.I.h(), 10);
      $$0.put(dqr.H.h(), 10);
      $$0.put(dqr.c.h(), 11);
      $$0.put(dqr.f.h(), 12);
      $$0.put(dqr.y.h(), 12);
      $$0.put(dqr.i.h(), 13);
      $$0.put(dqr.z.h(), 13);
      $$0.put(dqr.t.h(), 14);
      $$0.put(dqr.G.h(), 14);
      $$0.put(dqr.R.h(), 14);
      $$0.put(dqr.p.h(), 15);
      $$0.put(dqr.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dra.a gn();

   dra.d go();

   static int a_(il<dqr> $$0) {
      return $$0.e().map(dra::a).orElse(0);
   }

   static int a(ajb<dqr> $$0) {
      return g_.applyAsInt($$0);
   }

   static ajb<dqr> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - awm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dra.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dqy.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dqz.a.fieldOf("selector").forGetter(dra.a::a),
                  avu.i.fieldOf("event_delay").orElse(0).forGetter(dra.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dra.a((dqy)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dqy c;
      private int d;
      final dqz e;
      private boolean f;

      private a(@Nullable dqy $$0, dqz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dqz(), 0, false);
      }

      public dqz a() {
         return this.e;
      }

      @Nullable
      public dqy b() {
         return this.c;
      }

      public void a(@Nullable dqy $$0) {
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

   public static class b implements dqt {
      private final dra a;

      public b(dra $$0) {
         this.a = $$0;
      }

      @Override
      public dqv a() {
         return this.a.go().b();
      }

      @Override
      public int b() {
         return this.a.go().a();
      }

      @Override
      public boolean a(apa $$0, il<dqr> $$1, dqr.a $$2, eov $$3) {
         dra.a $$4 = this.a.gn();
         dra.d $$5 = this.a.go();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eov> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eov $$7 = $$6.get();
               if (!$$5.a($$0, ib.a($$3), $$1, $$2)) {
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

      public void b(apa $$0, il<dqr> $$1, dqr.a $$2, eov $$3) {
         this.a.go().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gn(), $$1, $$2, $$3, $$4));
      }

      private void a(apa $$0, dra.a $$1, il<dqr> $$2, dqr.a $$3, eov $$4, eov $$5) {
         $$1.e.a(new dqy($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(ib $$0, ib $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cwe $$0, eov $$1, eov $$2) {
         eov $$3 = new eov((double)awm.a($$1.c) + 0.5, (double)awm.a($$1.d) + 0.5, (double)awm.a($$1.e) + 0.5);
         eov $$4 = new eov((double)awm.a($$2.c) + 0.5, (double)awm.a($$2.d) + 0.5, (double)awm.a($$2.e) + 0.5);

         for (ih $$5 : ih.values()) {
            eov $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cvm($$6, $$4, $$0x -> $$0x.a(aue.bp))).c() != eot.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cwe $$0, dra.a $$1, dra.d $$2) {
         if ($$0 instanceof apa $$3) {
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

      private static void a(apa $$0, dra.a $$1, dra.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            eov $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kf($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(apa $$0, dra.a $$1, dra.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eov $$3 = $$1.c.c();
               dqv $$4 = $$2.b();
               eov $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = awm.d($$8, $$3.c, $$5.c);
               double $$10 = awm.d($$8, $$3.d, $$5.d);
               double $$11 = awm.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kf($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(apa $$0, dra.a $$1, dra.d $$2, dqy $$3) {
         ib $$4 = ib.a($$3.c());
         ib $$5 = $$2.b().a($$0).map(ib::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dra.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cwe $$0, ib $$1) {
         cvl $$2 = new cvl($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cvl.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dqv b();

      boolean a(apa var1, ib var2, il<dqr> var3, dqr.a var4);

      void a(apa var1, ib var2, il<dqr> var3, @Nullable bof var4, @Nullable bof var5, float var6);

      default aut<dqr> c() {
         return auk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return awm.d($$0);
      }

      default boolean a(il<dqr> $$0, dqr.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bof $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bQ() && $$0.a(auk.d)) {
                  if (this.d() && $$2 instanceof apb $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(aue.bq) : true;
         }
      }

      default void e() {
      }
   }
}
