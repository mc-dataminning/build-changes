import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dub {
   List<ajs<dts>> e_ = List.of(
      dts.T.h(),
      dts.U.h(),
      dts.V.h(),
      dts.W.h(),
      dts.X.h(),
      dts.Y.h(),
      dts.Z.h(),
      dts.aa.h(),
      dts.ab.h(),
      dts.ac.h(),
      dts.ad.h(),
      dts.ae.h(),
      dts.af.h(),
      dts.ag.h(),
      dts.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ajs<dts>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dts.P.h(), 1);
      $$0.put(dts.Q.h(), 1);
      $$0.put(dts.x.h(), 1);
      $$0.put(dts.J.h(), 2);
      $$0.put(dts.A.h(), 2);
      $$0.put(dts.O.h(), 2);
      $$0.put(dts.C.h(), 3);
      $$0.put(dts.K.h(), 3);
      $$0.put(dts.B.h(), 3);
      $$0.put(dts.u.h(), 4);
      $$0.put(dts.n.h(), 4);
      $$0.put(dts.S.h(), 4);
      $$0.put(dts.q.h(), 5);
      $$0.put(dts.v.h(), 5);
      $$0.put(dts.r.h(), 6);
      $$0.put(dts.M.h(), 6);
      $$0.put(dts.s.h(), 6);
      $$0.put(dts.o.h(), 7);
      $$0.put(dts.l.h(), 8);
      $$0.put(dts.m.h(), 8);
      $$0.put(dts.j.h(), 9);
      $$0.put(dts.d.h(), 9);
      $$0.put(dts.e.h(), 9);
      $$0.put(dts.g.h(), 9);
      $$0.put(dts.k.h(), 10);
      $$0.put(dts.h.h(), 10);
      $$0.put(dts.a.h(), 10);
      $$0.put(dts.b.h(), 10);
      $$0.put(dts.I.h(), 10);
      $$0.put(dts.H.h(), 10);
      $$0.put(dts.c.h(), 11);
      $$0.put(dts.f.h(), 12);
      $$0.put(dts.y.h(), 12);
      $$0.put(dts.i.h(), 13);
      $$0.put(dts.z.h(), 13);
      $$0.put(dts.t.h(), 14);
      $$0.put(dts.G.h(), 14);
      $$0.put(dts.R.h(), 14);
      $$0.put(dts.p.h(), 15);
      $$0.put(dts.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dub.a gp();

   dub.d gq();

   static int a_(il<dts> $$0) {
      return $$0.e().map(dub::a).orElse(0);
   }

   static int a(ajs<dts> $$0) {
      return g_.applyAsInt($$0);
   }

   static ajs<dts> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - axk.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dub.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dtz.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dua.a.fieldOf("selector").forGetter(dub.a::a),
                  aws.i.fieldOf("event_delay").orElse(0).forGetter(dub.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dub.a((dtz)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dtz c;
      private int d;
      final dua e;
      private boolean f;

      private a(@Nullable dtz $$0, dua $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dua(), 0, false);
      }

      public dua a() {
         return this.e;
      }

      @Nullable
      public dtz b() {
         return this.c;
      }

      public void a(@Nullable dtz $$0) {
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

   public static class b implements dtu {
      private final dub a;

      public b(dub $$0) {
         this.a = $$0;
      }

      @Override
      public dtw a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(aps $$0, il<dts> $$1, dts.a $$2, esa $$3) {
         dub.a $$4 = this.a.gp();
         dub.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<esa> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               esa $$7 = $$6.get();
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

      public void b(aps $$0, il<dts> $$1, dts.a $$2, esa $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(aps $$0, dub.a $$1, il<dts> $$2, dts.a $$3, esa $$4, esa $$5) {
         $$1.e.a(new dtz($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(ib $$0, ib $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cyx $$0, esa $$1, esa $$2) {
         esa $$3 = new esa((double)axk.a($$1.c) + 0.5, (double)axk.a($$1.d) + 0.5, (double)axk.a($$1.e) + 0.5);
         esa $$4 = new esa((double)axk.a($$2.c) + 0.5, (double)axk.a($$2.d) + 0.5, (double)axk.a($$2.e) + 0.5);

         for (ih $$5 : ih.values()) {
            esa $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cyf($$6, $$4, $$0x -> $$0x.a(avc.bq))).c() != ery.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cyx $$0, dub.a $$1, dub.d $$2) {
         if ($$0 instanceof aps $$3) {
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

      private static void a(aps $$0, dub.a $$1, dub.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            esa $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kp($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aps $$0, dub.a $$1, dub.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               esa $$3 = $$1.c.c();
               dtw $$4 = $$2.b();
               esa $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = axk.d($$8, $$3.c, $$5.c);
               double $$10 = axk.d($$8, $$3.d, $$5.d);
               double $$11 = axk.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kp($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aps $$0, dub.a $$1, dub.d $$2, dtz $$3) {
         ib $$4 = ib.a($$3.c());
         ib $$5 = $$2.b().a($$0).map(ib::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dub.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cyx $$0, ib $$1) {
         cye $$2 = new cye($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cye.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dtw b();

      boolean a(aps var1, ib var2, il<dts> var3, dts.a var4);

      void a(aps var1, ib var2, il<dts> var3, @Nullable bpv var4, @Nullable bpv var5, float var6);

      default avr<dts> c() {
         return avi.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return axk.d($$0);
      }

      default boolean a(il<dts> $$0, dts.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bpv $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(avi.d)) {
                  if (this.d() && $$2 instanceof apt $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.ba()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avc.br) : true;
         }
      }

      default void e() {
      }
   }
}
