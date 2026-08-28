import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eap {
   List<alh<eag>> f_ = List.of(
      eag.T.h(),
      eag.U.h(),
      eag.V.h(),
      eag.W.h(),
      eag.X.h(),
      eag.Y.h(),
      eag.Z.h(),
      eag.aa.h(),
      eag.ab.h(),
      eag.ac.h(),
      eag.ad.h(),
      eag.ae.h(),
      eag.af.h(),
      eag.ag.h(),
      eag.ah.h()
   );
   int g_ = 0;
   ToIntFunction<alh<eag>> h_ = ae.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eag.P.h(), 1);
      $$0.put(eag.Q.h(), 1);
      $$0.put(eag.x.h(), 1);
      $$0.put(eag.J.h(), 2);
      $$0.put(eag.A.h(), 2);
      $$0.put(eag.O.h(), 2);
      $$0.put(eag.C.h(), 3);
      $$0.put(eag.K.h(), 3);
      $$0.put(eag.B.h(), 3);
      $$0.put(eag.u.h(), 4);
      $$0.put(eag.n.h(), 4);
      $$0.put(eag.S.h(), 4);
      $$0.put(eag.q.h(), 5);
      $$0.put(eag.v.h(), 5);
      $$0.put(eag.r.h(), 6);
      $$0.put(eag.M.h(), 6);
      $$0.put(eag.s.h(), 6);
      $$0.put(eag.o.h(), 7);
      $$0.put(eag.l.h(), 8);
      $$0.put(eag.m.h(), 8);
      $$0.put(eag.j.h(), 9);
      $$0.put(eag.d.h(), 9);
      $$0.put(eag.e.h(), 9);
      $$0.put(eag.g.h(), 9);
      $$0.put(eag.k.h(), 10);
      $$0.put(eag.h.h(), 10);
      $$0.put(eag.a.h(), 10);
      $$0.put(eag.b.h(), 10);
      $$0.put(eag.I.h(), 10);
      $$0.put(eag.H.h(), 10);
      $$0.put(eag.c.h(), 11);
      $$0.put(eag.f.h(), 12);
      $$0.put(eag.y.h(), 12);
      $$0.put(eag.i.h(), 13);
      $$0.put(eag.z.h(), 13);
      $$0.put(eag.t.h(), 14);
      $$0.put(eag.G.h(), 14);
      $$0.put(eag.R.h(), 14);
      $$0.put(eag.p.h(), 15);
      $$0.put(eag.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eap.a gw();

   eap.d gx();

   static int a_(jq<eag> $$0) {
      return $$0.e().map(eap::a).orElse(0);
   }

   static int a(alh<eag> $$0) {
      return h_.applyAsInt($$0);
   }

   static alh<eag> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azk.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eap.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ean.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  eao.a.fieldOf("selector").forGetter(eap.a::a),
                  ayt.l.fieldOf("event_delay").orElse(0).forGetter(eap.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eap.a((ean)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      ean c;
      private int d;
      final eao e;
      private boolean f;

      private a(@Nullable ean $$0, eao $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new eao(), 0, false);
      }

      public eao a() {
         return this.e;
      }

      @Nullable
      public ean b() {
         return this.c;
      }

      public void a(@Nullable ean $$0) {
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

   public static class b implements eai {
      private final eap a;

      public b(eap $$0) {
         this.a = $$0;
      }

      @Override
      public eak a() {
         return this.a.gx().b();
      }

      @Override
      public int b() {
         return this.a.gx().a();
      }

      @Override
      public boolean a(arn $$0, jq<eag> $$1, eag.a $$2, ezn $$3) {
         eap.a $$4 = this.a.gw();
         eap.d $$5 = this.a.gx();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ezn> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ezn $$7 = $$6.get();
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

      public void b(arn $$0, jq<eag> $$1, eag.a $$2, ezn $$3) {
         this.a.gx().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gw(), $$1, $$2, $$3, $$4));
      }

      private void a(arn $$0, eap.a $$1, jq<eag> $$2, eag.a $$3, ezn $$4, ezn $$5) {
         $$1.e.a(new ean($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(jh $$0, jh $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dfb $$0, ezn $$1, ezn $$2) {
         ezn $$3 = new ezn((double)azk.a($$1.d) + 0.5, (double)azk.a($$1.e) + 0.5, (double)azk.a($$1.f) + 0.5);
         ezn $$4 = new ezn((double)azk.a($$2.d) + 0.5, (double)azk.a($$2.e) + 0.5, (double)azk.a($$2.f) + 0.5);

         for (jm $$5 : jm.values()) {
            ezn $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dei($$6, $$4, $$0x -> $$0x.a(axa.br))).d() != ezl.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dfb $$0, eap.a $$1, eap.d $$2) {
         if ($$0 instanceof arn $$3) {
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

      private static void a(arn $$0, eap.a $$1, eap.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            ezn $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lw($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arn $$0, eap.a $$1, eap.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ezn $$3 = $$1.c.c();
               eak $$4 = $$2.b();
               ezn $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azk.d($$8, $$3.d, $$5.d);
               double $$10 = azk.d($$8, $$3.e, $$5.e);
               double $$11 = azk.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lw($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arn $$0, eap.a $$1, eap.d $$2, ean $$3) {
         jh $$4 = jh.a((ka)$$3.c());
         jh $$5 = $$2.b().a($$0).map(jh::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eap.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dfb $$0, jh $$1) {
         deh $$2 = new deh($$1);

         for (int $$3 = $$2.g - 1; $$3 <= $$2.g + 1; $$3++) {
            for (int $$4 = $$2.h - 1; $$4 <= $$2.h + 1; $$4++) {
               if (!$$0.a(deh.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      eak b();

      boolean a(arn var1, jh var2, jq<eag> var3, eag.a var4);

      void a(arn var1, jh var2, jq<eag> var3, @Nullable bue var4, @Nullable bue var5, float var6);

      default axq<eag> c() {
         return axh.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azk.d($$0);
      }

      default boolean a(jq<eag> $$0, eag.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bue $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.R_()) {
                  return false;
               }

               if ($$2.cf() && $$0.a(axh.d)) {
                  if (this.d() && $$2 instanceof aro $$3) {
                     ao.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bi()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axa.bs) : true;
         }
      }

      default void e() {
      }
   }
}
