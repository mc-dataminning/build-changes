import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dzy {
   List<ald<dzp>> f_ = List.of(
      dzp.T.h(),
      dzp.U.h(),
      dzp.V.h(),
      dzp.W.h(),
      dzp.X.h(),
      dzp.Y.h(),
      dzp.Z.h(),
      dzp.aa.h(),
      dzp.ab.h(),
      dzp.ac.h(),
      dzp.ad.h(),
      dzp.ae.h(),
      dzp.af.h(),
      dzp.ag.h(),
      dzp.ah.h()
   );
   int g_ = 0;
   ToIntFunction<ald<dzp>> h_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dzp.P.h(), 1);
      $$0.put(dzp.Q.h(), 1);
      $$0.put(dzp.x.h(), 1);
      $$0.put(dzp.J.h(), 2);
      $$0.put(dzp.A.h(), 2);
      $$0.put(dzp.O.h(), 2);
      $$0.put(dzp.C.h(), 3);
      $$0.put(dzp.K.h(), 3);
      $$0.put(dzp.B.h(), 3);
      $$0.put(dzp.u.h(), 4);
      $$0.put(dzp.n.h(), 4);
      $$0.put(dzp.S.h(), 4);
      $$0.put(dzp.q.h(), 5);
      $$0.put(dzp.v.h(), 5);
      $$0.put(dzp.r.h(), 6);
      $$0.put(dzp.M.h(), 6);
      $$0.put(dzp.s.h(), 6);
      $$0.put(dzp.o.h(), 7);
      $$0.put(dzp.l.h(), 8);
      $$0.put(dzp.m.h(), 8);
      $$0.put(dzp.j.h(), 9);
      $$0.put(dzp.d.h(), 9);
      $$0.put(dzp.e.h(), 9);
      $$0.put(dzp.g.h(), 9);
      $$0.put(dzp.k.h(), 10);
      $$0.put(dzp.h.h(), 10);
      $$0.put(dzp.a.h(), 10);
      $$0.put(dzp.b.h(), 10);
      $$0.put(dzp.I.h(), 10);
      $$0.put(dzp.H.h(), 10);
      $$0.put(dzp.c.h(), 11);
      $$0.put(dzp.f.h(), 12);
      $$0.put(dzp.y.h(), 12);
      $$0.put(dzp.i.h(), 13);
      $$0.put(dzp.z.h(), 13);
      $$0.put(dzp.t.h(), 14);
      $$0.put(dzp.G.h(), 14);
      $$0.put(dzp.R.h(), 14);
      $$0.put(dzp.p.h(), 15);
      $$0.put(dzp.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dzy.a gq();

   dzy.d gr();

   static int a_(jo<dzp> $$0) {
      return $$0.e().map(dzy::a).orElse(0);
   }

   static int a(ald<dzp> $$0) {
      return h_.applyAsInt($$0);
   }

   static ald<dzp> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azf.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dzy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dzw.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dzx.a.fieldOf("selector").forGetter(dzy.a::a),
                  ayo.k.fieldOf("event_delay").orElse(0).forGetter(dzy.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dzy.a((dzw)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dzw c;
      private int d;
      final dzx e;
      private boolean f;

      private a(@Nullable dzw $$0, dzx $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dzx(), 0, false);
      }

      public dzx a() {
         return this.e;
      }

      @Nullable
      public dzw b() {
         return this.c;
      }

      public void a(@Nullable dzw $$0) {
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

   public static class b implements dzr {
      private final dzy a;

      public b(dzy $$0) {
         this.a = $$0;
      }

      @Override
      public dzt a() {
         return this.a.gr().b();
      }

      @Override
      public int b() {
         return this.a.gr().a();
      }

      @Override
      public boolean a(arj $$0, jo<dzp> $$1, dzp.a $$2, eyw $$3) {
         dzy.a $$4 = this.a.gq();
         dzy.d $$5 = this.a.gr();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eyw> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eyw $$7 = $$6.get();
               if (!$$5.a($$0, jf.a((jy)$$3), $$1, $$2)) {
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

      public void b(arj $$0, jo<dzp> $$1, dzp.a $$2, eyw $$3) {
         this.a.gr().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gq(), $$1, $$2, $$3, $$4));
      }

      private void a(arj $$0, dzy.a $$1, jo<dzp> $$2, dzp.a $$3, eyw $$4, eyw $$5) {
         $$1.e.a(new dzw($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(jf $$0, jf $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dej $$0, eyw $$1, eyw $$2) {
         eyw $$3 = new eyw((double)azf.a($$1.d) + 0.5, (double)azf.a($$1.e) + 0.5, (double)azf.a($$1.f) + 0.5);
         eyw $$4 = new eyw((double)azf.a($$2.d) + 0.5, (double)azf.a($$2.e) + 0.5, (double)azf.a($$2.f) + 0.5);

         for (jk $$5 : jk.values()) {
            eyw $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new ddq($$6, $$4, $$0x -> $$0x.a(awv.br))).d() != eyu.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dej $$0, dzy.a $$1, dzy.d $$2) {
         if ($$0 instanceof arj $$3) {
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

      private static void a(arj $$0, dzy.a $$1, dzy.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            eyw $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lt($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arj $$0, dzy.a $$1, dzy.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eyw $$3 = $$1.c.c();
               dzt $$4 = $$2.b();
               eyw $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azf.d($$8, $$3.d, $$5.d);
               double $$10 = azf.d($$8, $$3.e, $$5.e);
               double $$11 = azf.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lt($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arj $$0, dzy.a $$1, dzy.d $$2, dzw $$3) {
         jf $$4 = jf.a((jy)$$3.c());
         jf $$5 = $$2.b().a($$0).map(jf::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dzy.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dej $$0, jf $$1) {
         ddp $$2 = new ddp($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(ddp.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dzt b();

      boolean a(arj var1, jf var2, jo<dzp> var3, dzp.a var4);

      void a(arj var1, jf var2, jo<dzp> var3, @Nullable btr var4, @Nullable btr var5, float var6);

      default axl<dzp> c() {
         return axc.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azf.d($$0);
      }

      default boolean a(jo<dzp> $$0, dzp.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            btr $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Q_()) {
                  return false;
               }

               if ($$2.cb() && $$0.a(axc.d)) {
                  if (this.d() && $$2 instanceof ark $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awv.bs) : true;
         }
      }

      default void e() {
      }
   }
}
