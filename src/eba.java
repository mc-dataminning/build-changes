import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eba {
   List<ali<ear>> d_ = List.of(
      ear.T.h(),
      ear.U.h(),
      ear.V.h(),
      ear.W.h(),
      ear.X.h(),
      ear.Y.h(),
      ear.Z.h(),
      ear.aa.h(),
      ear.ab.h(),
      ear.ac.h(),
      ear.ad.h(),
      ear.ae.h(),
      ear.af.h(),
      ear.ag.h(),
      ear.ah.h()
   );
   int e_ = 0;
   ToIntFunction<ali<ear>> f_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ear.P.h(), 1);
      $$0.put(ear.Q.h(), 1);
      $$0.put(ear.x.h(), 1);
      $$0.put(ear.J.h(), 2);
      $$0.put(ear.A.h(), 2);
      $$0.put(ear.O.h(), 2);
      $$0.put(ear.C.h(), 3);
      $$0.put(ear.K.h(), 3);
      $$0.put(ear.B.h(), 3);
      $$0.put(ear.u.h(), 4);
      $$0.put(ear.n.h(), 4);
      $$0.put(ear.S.h(), 4);
      $$0.put(ear.q.h(), 5);
      $$0.put(ear.v.h(), 5);
      $$0.put(ear.r.h(), 6);
      $$0.put(ear.M.h(), 6);
      $$0.put(ear.s.h(), 6);
      $$0.put(ear.o.h(), 7);
      $$0.put(ear.l.h(), 8);
      $$0.put(ear.m.h(), 8);
      $$0.put(ear.j.h(), 9);
      $$0.put(ear.d.h(), 9);
      $$0.put(ear.e.h(), 9);
      $$0.put(ear.g.h(), 9);
      $$0.put(ear.k.h(), 10);
      $$0.put(ear.h.h(), 10);
      $$0.put(ear.a.h(), 10);
      $$0.put(ear.b.h(), 10);
      $$0.put(ear.I.h(), 10);
      $$0.put(ear.H.h(), 10);
      $$0.put(ear.c.h(), 11);
      $$0.put(ear.f.h(), 12);
      $$0.put(ear.y.h(), 12);
      $$0.put(ear.i.h(), 13);
      $$0.put(ear.z.h(), 13);
      $$0.put(ear.t.h(), 14);
      $$0.put(ear.G.h(), 14);
      $$0.put(ear.R.h(), 14);
      $$0.put(ear.p.h(), 15);
      $$0.put(ear.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eba.a go();

   eba.d gp();

   static int a_(jq<ear> $$0) {
      return $$0.e().map(eba::a).orElse(0);
   }

   static int a(ali<ear> $$0) {
      return f_.applyAsInt($$0);
   }

   static ali<ear> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eay.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  eaz.a.fieldOf("selector").forGetter(eba.a::a),
                  ayv.l.fieldOf("event_delay").orElse(0).forGetter(eba.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eba.a((eay)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eay c;
      private int d;
      final eaz e;
      private boolean f;

      private a(@Nullable eay $$0, eaz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new eaz(), 0, false);
      }

      public eaz a() {
         return this.e;
      }

      @Nullable
      public eay b() {
         return this.c;
      }

      public void a(@Nullable eay $$0) {
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

   public static class b implements eat {
      private final eba a;

      public b(eba $$0) {
         this.a = $$0;
      }

      @Override
      public eav a() {
         return this.a.gp().b();
      }

      @Override
      public int b() {
         return this.a.gp().a();
      }

      @Override
      public boolean a(arp $$0, jq<ear> $$1, ear.a $$2, ezy $$3) {
         eba.a $$4 = this.a.go();
         eba.d $$5 = this.a.gp();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ezy> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ezy $$7 = $$6.get();
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

      public void b(arp $$0, jq<ear> $$1, ear.a $$2, ezy $$3) {
         this.a.gp().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.go(), $$1, $$2, $$3, $$4));
      }

      private void a(arp $$0, eba.a $$1, jq<ear> $$2, ear.a $$3, ezy $$4, ezy $$5) {
         $$1.e.a(new eay($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ab());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dfm $$0, ezy $$1, ezy $$2) {
         ezy $$3 = new ezy((double)azm.a($$1.d) + 0.5, (double)azm.a($$1.e) + 0.5, (double)azm.a($$1.f) + 0.5);
         ezy $$4 = new ezy((double)azm.a($$2.d) + 0.5, (double)azm.a($$2.e) + 0.5, (double)azm.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            ezy $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new det($$6, $$4, $$0x -> $$0x.a(axc.br))).d() != ezw.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dfm $$0, eba.a $$1, eba.d $$2) {
         if ($$0 instanceof arp $$3) {
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

      private static void a(arp $$0, eba.a $$1, eba.d $$2) {
         $$1.a().a($$0.ab()).ifPresent($$3 -> {
            $$1.a($$3);
            ezy $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lx($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arp $$0, eba.a $$1, eba.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ezy $$3 = $$1.c.c();
               eav $$4 = $$2.b();
               ezy $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azm.d($$8, $$3.d, $$5.d);
               double $$10 = azm.d($$8, $$3.e, $$5.e);
               double $$11 = azm.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lx($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arp $$0, eba.a $$1, eba.d $$2, eay $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eba.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dfm $$0, jh $$1) {
         des $$2 = new des($$1);

         for (int $$3 = $$2.g - 1; $$3 <= $$2.g + 1; $$3++) {
            for (int $$4 = $$2.h - 1; $$4 <= $$2.h + 1; $$4++) {
               if (!$$0.a(des.c($$3, $$4)) || $$0.Q().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      eav b();

      boolean a(arp var1, jh var2, jq<ear> var3, ear.a var4);

      void a(arp var1, jh var2, jq<ear> var3, @Nullable bul var4, @Nullable bul var5, float var6);

      default axs<ear> c() {
         return axj.a;
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

      default boolean a(jq<ear> $$0, ear.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bul $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.Y_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axj.d)) {
                  if (this.d() && $$2 instanceof arq $$3) {
                     ao.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axc.bs) : true;
         }
      }

      default void e() {
      }
   }
}
