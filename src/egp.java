import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface egp {
   List<alj<egg>> c_ = List.of(
      egg.T.h(),
      egg.U.h(),
      egg.V.h(),
      egg.W.h(),
      egg.X.h(),
      egg.Y.h(),
      egg.Z.h(),
      egg.aa.h(),
      egg.ab.h(),
      egg.ac.h(),
      egg.ad.h(),
      egg.ae.h(),
      egg.af.h(),
      egg.ag.h(),
      egg.ah.h()
   );
   int d_ = 0;
   ToIntFunction<alj<egg>> e_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(egg.P.h(), 1);
      $$0.put(egg.Q.h(), 1);
      $$0.put(egg.x.h(), 1);
      $$0.put(egg.J.h(), 2);
      $$0.put(egg.A.h(), 2);
      $$0.put(egg.O.h(), 2);
      $$0.put(egg.C.h(), 3);
      $$0.put(egg.K.h(), 3);
      $$0.put(egg.B.h(), 3);
      $$0.put(egg.u.h(), 4);
      $$0.put(egg.n.h(), 4);
      $$0.put(egg.S.h(), 4);
      $$0.put(egg.q.h(), 5);
      $$0.put(egg.v.h(), 5);
      $$0.put(egg.r.h(), 6);
      $$0.put(egg.M.h(), 6);
      $$0.put(egg.s.h(), 6);
      $$0.put(egg.o.h(), 7);
      $$0.put(egg.l.h(), 8);
      $$0.put(egg.m.h(), 8);
      $$0.put(egg.j.h(), 9);
      $$0.put(egg.d.h(), 9);
      $$0.put(egg.e.h(), 9);
      $$0.put(egg.g.h(), 9);
      $$0.put(egg.k.h(), 10);
      $$0.put(egg.h.h(), 10);
      $$0.put(egg.a.h(), 10);
      $$0.put(egg.b.h(), 10);
      $$0.put(egg.I.h(), 10);
      $$0.put(egg.H.h(), 10);
      $$0.put(egg.c.h(), 11);
      $$0.put(egg.f.h(), 12);
      $$0.put(egg.y.h(), 12);
      $$0.put(egg.i.h(), 13);
      $$0.put(egg.z.h(), 13);
      $$0.put(egg.t.h(), 14);
      $$0.put(egg.G.h(), 14);
      $$0.put(egg.R.h(), 14);
      $$0.put(egg.p.h(), 15);
      $$0.put(egg.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   egp.a x();

   egp.d gu();

   static int a_(jg<egg> $$0) {
      return $$0.e().map(egp::a).orElse(0);
   }

   static int a(alj<egg> $$0) {
      return e_.applyAsInt($$0);
   }

   static alj<egg> b(int $$0) {
      return c_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azq.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<egp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  egn.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  ego.a.fieldOf("selector").forGetter(egp.a::a),
                  ayy.l.fieldOf("event_delay").orElse(0).forGetter(egp.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new egp.a((egn)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      egn c;
      private int d;
      final ego e;
      private boolean f;

      private a(@Nullable egn $$0, ego $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ego(), 0, false);
      }

      public ego a() {
         return this.e;
      }

      @Nullable
      public egn b() {
         return this.c;
      }

      public void a(@Nullable egn $$0) {
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

   public static class b implements egi {
      private final egp a;

      public b(egp $$0) {
         this.a = $$0;
      }

      @Override
      public egk a() {
         return this.a.gu().b();
      }

      @Override
      public int b() {
         return this.a.gu().a();
      }

      @Override
      public boolean a(aru $$0, jg<egg> $$1, egg.a $$2, ffs $$3) {
         egp.a $$4 = this.a.x();
         egp.d $$5 = this.a.gu();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ffs> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ffs $$7 = $$6.get();
               if (!$$5.a($$0, iw.a((jq)$$3), $$1, $$2)) {
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

      public void b(aru $$0, jg<egg> $$1, egg.a $$2, ffs $$3) {
         this.a.gu().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(aru $$0, egp.a $$1, jg<egg> $$2, egg.a $$3, ffs $$4, ffs $$5) {
         $$1.e.a(new egn($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iw $$0, iw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(djz $$0, ffs $$1, ffs $$2) {
         ffs $$3 = new ffs((double)azq.a($$1.d) + 0.5, (double)azq.a($$1.e) + 0.5, (double)azq.a($$1.f) + 0.5);
         ffs $$4 = new ffs((double)azq.a($$2.d) + 0.5, (double)azq.a($$2.e) + 0.5, (double)azq.a($$2.f) + 0.5);

         for (jc $$5 : jc.values()) {
            ffs $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new djf($$6, $$4, $$0x -> $$0x.a(axg.bt))).d() != ffq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(djz $$0, egp.a $$1, egp.d $$2) {
         if ($$0 instanceof aru $$3) {
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

      private static void a(aru $$0, egp.a $$1, egp.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            ffs $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new mf($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aru $$0, egp.a $$1, egp.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ffs $$3 = $$1.c.c();
               egk $$4 = $$2.b();
               ffs $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azq.d($$8, $$3.d, $$5.d);
               double $$10 = azq.d($$8, $$3.e, $$5.e);
               double $$11 = azq.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new mf($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aru $$0, egp.a $$1, egp.d $$2, egn $$3) {
         iw $$4 = iw.a((jq)$$3.c());
         iw $$5 = $$2.b().a($$0).map(iw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), egp.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(djz $$0, iw $$1) {
         dje $$2 = new dje($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dje.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      egk b();

      boolean a(aru var1, iw var2, jg<egg> var3, egg.a var4);

      void a(aru var1, iw var2, jg<egg> var3, @Nullable bwv var4, @Nullable bwv var5, float var6);

      default axv<egg> c() {
         return axm.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azq.d($$0);
      }

      default boolean a(jg<egg> $$0, egg.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwv $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Z_()) {
                  return false;
               }

               if ($$2.cd() && $$0.a(axm.d)) {
                  if (this.d() && $$2 instanceof arv $$3) {
                     aq.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axg.bu) : true;
         }
      }

      default void e() {
      }
   }
}
