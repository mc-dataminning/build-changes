import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dzg {
   List<ala<dyx>> f_ = List.of(
      dyx.T.h(),
      dyx.U.h(),
      dyx.V.h(),
      dyx.W.h(),
      dyx.X.h(),
      dyx.Y.h(),
      dyx.Z.h(),
      dyx.aa.h(),
      dyx.ab.h(),
      dyx.ac.h(),
      dyx.ad.h(),
      dyx.ae.h(),
      dyx.af.h(),
      dyx.ag.h(),
      dyx.ah.h()
   );
   int g_ = 0;
   ToIntFunction<ala<dyx>> h_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dyx.P.h(), 1);
      $$0.put(dyx.Q.h(), 1);
      $$0.put(dyx.x.h(), 1);
      $$0.put(dyx.J.h(), 2);
      $$0.put(dyx.A.h(), 2);
      $$0.put(dyx.O.h(), 2);
      $$0.put(dyx.C.h(), 3);
      $$0.put(dyx.K.h(), 3);
      $$0.put(dyx.B.h(), 3);
      $$0.put(dyx.u.h(), 4);
      $$0.put(dyx.n.h(), 4);
      $$0.put(dyx.S.h(), 4);
      $$0.put(dyx.q.h(), 5);
      $$0.put(dyx.v.h(), 5);
      $$0.put(dyx.r.h(), 6);
      $$0.put(dyx.M.h(), 6);
      $$0.put(dyx.s.h(), 6);
      $$0.put(dyx.o.h(), 7);
      $$0.put(dyx.l.h(), 8);
      $$0.put(dyx.m.h(), 8);
      $$0.put(dyx.j.h(), 9);
      $$0.put(dyx.d.h(), 9);
      $$0.put(dyx.e.h(), 9);
      $$0.put(dyx.g.h(), 9);
      $$0.put(dyx.k.h(), 10);
      $$0.put(dyx.h.h(), 10);
      $$0.put(dyx.a.h(), 10);
      $$0.put(dyx.b.h(), 10);
      $$0.put(dyx.I.h(), 10);
      $$0.put(dyx.H.h(), 10);
      $$0.put(dyx.c.h(), 11);
      $$0.put(dyx.f.h(), 12);
      $$0.put(dyx.y.h(), 12);
      $$0.put(dyx.i.h(), 13);
      $$0.put(dyx.z.h(), 13);
      $$0.put(dyx.t.h(), 14);
      $$0.put(dyx.G.h(), 14);
      $$0.put(dyx.R.h(), 14);
      $$0.put(dyx.p.h(), 15);
      $$0.put(dyx.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dzg.a gq();

   dzg.d gr();

   static int a_(jn<dyx> $$0) {
      return $$0.e().map(dzg::a).orElse(0);
   }

   static int a(ala<dyx> $$0) {
      return h_.applyAsInt($$0);
   }

   static ala<dyx> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azc.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dzg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dze.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dzf.a.fieldOf("selector").forGetter(dzg.a::a),
                  ayl.k.fieldOf("event_delay").orElse(0).forGetter(dzg.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dzg.a((dze)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dze c;
      private int d;
      final dzf e;
      private boolean f;

      private a(@Nullable dze $$0, dzf $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dzf(), 0, false);
      }

      public dzf a() {
         return this.e;
      }

      @Nullable
      public dze b() {
         return this.c;
      }

      public void a(@Nullable dze $$0) {
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

   public static class b implements dyz {
      private final dzg a;

      public b(dzg $$0) {
         this.a = $$0;
      }

      @Override
      public dzb a() {
         return this.a.gr().b();
      }

      @Override
      public int b() {
         return this.a.gr().a();
      }

      @Override
      public boolean a(arg $$0, jn<dyx> $$1, dyx.a $$2, eye $$3) {
         dzg.a $$4 = this.a.gq();
         dzg.d $$5 = this.a.gr();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eye> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eye $$7 = $$6.get();
               if (!$$5.a($$0, je.a((jx)$$3), $$1, $$2)) {
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

      public void b(arg $$0, jn<dyx> $$1, dyx.a $$2, eye $$3) {
         this.a.gr().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gq(), $$1, $$2, $$3, $$4));
      }

      private void a(arg $$0, dzg.a $$1, jn<dyx> $$2, dyx.a $$3, eye $$4, eye $$5) {
         $$1.e.a(new dze($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(je $$0, je $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dds $$0, eye $$1, eye $$2) {
         eye $$3 = new eye((double)azc.a($$1.d) + 0.5, (double)azc.a($$1.e) + 0.5, (double)azc.a($$1.f) + 0.5);
         eye $$4 = new eye((double)azc.a($$2.d) + 0.5, (double)azc.a($$2.e) + 0.5, (double)azc.a($$2.f) + 0.5);

         for (jj $$5 : jj.values()) {
            eye $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dcz($$6, $$4, $$0x -> $$0x.a(aws.br))).c() != eyc.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dds $$0, dzg.a $$1, dzg.d $$2) {
         if ($$0 instanceof arg $$3) {
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

      private static void a(arg $$0, dzg.a $$1, dzg.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            eye $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new ls($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arg $$0, dzg.a $$1, dzg.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eye $$3 = $$1.c.c();
               dzb $$4 = $$2.b();
               eye $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azc.d($$8, $$3.d, $$5.d);
               double $$10 = azc.d($$8, $$3.e, $$5.e);
               double $$11 = azc.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new ls($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arg $$0, dzg.a $$1, dzg.d $$2, dze $$3) {
         je $$4 = je.a((jx)$$3.c());
         je $$5 = $$2.b().a($$0).map(je::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dzg.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dds $$0, je $$1) {
         dcy $$2 = new dcy($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(dcy.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dzb b();

      boolean a(arg var1, je var2, jn<dyx> var3, dyx.a var4);

      void a(arg var1, je var2, jn<dyx> var3, @Nullable btj var4, @Nullable btj var5, float var6);

      default axi<dyx> c() {
         return awz.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azc.d($$0);
      }

      default boolean a(jn<dyx> $$0, dyx.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            btj $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.cb() && $$0.a(awz.d)) {
                  if (this.d() && $$2 instanceof arh $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(aws.bs) : true;
         }
      }

      default void e() {
      }
   }
}
