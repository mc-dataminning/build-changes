import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eat {
   List<alk<eak>> f_ = List.of(
      eak.T.h(),
      eak.U.h(),
      eak.V.h(),
      eak.W.h(),
      eak.X.h(),
      eak.Y.h(),
      eak.Z.h(),
      eak.aa.h(),
      eak.ab.h(),
      eak.ac.h(),
      eak.ad.h(),
      eak.ae.h(),
      eak.af.h(),
      eak.ag.h(),
      eak.ah.h()
   );
   int g_ = 0;
   ToIntFunction<alk<eak>> h_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eak.P.h(), 1);
      $$0.put(eak.Q.h(), 1);
      $$0.put(eak.x.h(), 1);
      $$0.put(eak.J.h(), 2);
      $$0.put(eak.A.h(), 2);
      $$0.put(eak.O.h(), 2);
      $$0.put(eak.C.h(), 3);
      $$0.put(eak.K.h(), 3);
      $$0.put(eak.B.h(), 3);
      $$0.put(eak.u.h(), 4);
      $$0.put(eak.n.h(), 4);
      $$0.put(eak.S.h(), 4);
      $$0.put(eak.q.h(), 5);
      $$0.put(eak.v.h(), 5);
      $$0.put(eak.r.h(), 6);
      $$0.put(eak.M.h(), 6);
      $$0.put(eak.s.h(), 6);
      $$0.put(eak.o.h(), 7);
      $$0.put(eak.l.h(), 8);
      $$0.put(eak.m.h(), 8);
      $$0.put(eak.j.h(), 9);
      $$0.put(eak.d.h(), 9);
      $$0.put(eak.e.h(), 9);
      $$0.put(eak.g.h(), 9);
      $$0.put(eak.k.h(), 10);
      $$0.put(eak.h.h(), 10);
      $$0.put(eak.a.h(), 10);
      $$0.put(eak.b.h(), 10);
      $$0.put(eak.I.h(), 10);
      $$0.put(eak.H.h(), 10);
      $$0.put(eak.c.h(), 11);
      $$0.put(eak.f.h(), 12);
      $$0.put(eak.y.h(), 12);
      $$0.put(eak.i.h(), 13);
      $$0.put(eak.z.h(), 13);
      $$0.put(eak.t.h(), 14);
      $$0.put(eak.G.h(), 14);
      $$0.put(eak.R.h(), 14);
      $$0.put(eak.p.h(), 15);
      $$0.put(eak.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eat.a gx();

   eat.d gy();

   static int a_(jq<eak> $$0) {
      return $$0.e().map(eat::a).orElse(0);
   }

   static int a(alk<eak> $$0) {
      return h_.applyAsInt($$0);
   }

   static alk<eak> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azn.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eat.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ear.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  eas.a.fieldOf("selector").forGetter(eat.a::a),
                  ayw.l.fieldOf("event_delay").orElse(0).forGetter(eat.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eat.a((ear)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ear c;
      private int d;
      final eas e;
      private boolean f;

      private a(@Nullable ear $$0, eas $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new eas(), 0, false);
      }

      public eas a() {
         return this.e;
      }

      @Nullable
      public ear b() {
         return this.c;
      }

      public void a(@Nullable ear $$0) {
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

   public static class b implements eam {
      private final eat a;

      public b(eat $$0) {
         this.a = $$0;
      }

      @Override
      public eao a() {
         return this.a.gy().b();
      }

      @Override
      public int b() {
         return this.a.gy().a();
      }

      @Override
      public boolean a(arq $$0, jq<eak> $$1, eak.a $$2, ezr $$3) {
         eat.a $$4 = this.a.gx();
         eat.d $$5 = this.a.gy();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ezr> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ezr $$7 = $$6.get();
               if (!$$5.a($$0, jh.a((ka)$$3), $$1, $$2)) {
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

      public void b(arq $$0, jq<eak> $$1, eak.a $$2, ezr $$3) {
         this.a.gy().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gx(), $$1, $$2, $$3, $$4));
      }

      private void a(arq $$0, eat.a $$1, jq<eak> $$2, eak.a $$3, ezr $$4, ezr $$5) {
         $$1.e.a(new ear($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dff $$0, ezr $$1, ezr $$2) {
         ezr $$3 = new ezr((double)azn.a($$1.d) + 0.5, (double)azn.a($$1.e) + 0.5, (double)azn.a($$1.f) + 0.5);
         ezr $$4 = new ezr((double)azn.a($$2.d) + 0.5, (double)azn.a($$2.e) + 0.5, (double)azn.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            ezr $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dem($$6, $$4, $$0x -> $$0x.a(axd.br))).d() != ezp.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dff $$0, eat.a $$1, eat.d $$2) {
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

      private static void a(arq $$0, eat.a $$1, eat.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            ezr $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lx($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arq $$0, eat.a $$1, eat.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ezr $$3 = $$1.c.c();
               eao $$4 = $$2.b();
               ezr $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azn.d($$8, $$3.d, $$5.d);
               double $$10 = azn.d($$8, $$3.e, $$5.e);
               double $$11 = azn.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lx($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arq $$0, eat.a $$1, eat.d $$2, ear $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eat.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dff $$0, jh $$1) {
         del $$2 = new del($$1);

         for (int $$3 = $$2.g - 1; $$3 <= $$2.g + 1; $$3++) {
            for (int $$4 = $$2.h - 1; $$4 <= $$2.h + 1; $$4++) {
               if (!$$0.a(del.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      eao b();

      boolean a(arq var1, jh var2, jq<eak> var3, eak.a var4);

      void a(arq var1, jh var2, jq<eak> var3, @Nullable bui var4, @Nullable bui var5, float var6);

      default axt<eak> c() {
         return axk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azn.d($$0);
      }

      default boolean a(jq<eak> $$0, eak.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bui $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.R_()) {
                  return false;
               }

               if ($$2.cg() && $$0.a(axk.d)) {
                  if (this.d() && $$2 instanceof arr $$3) {
                     ao.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bj()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axd.bs) : true;
         }
      }

      default void e() {
      }
   }
}
