import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eex {
   List<ald<eeo>> d_ = List.of(
      eeo.T.h(),
      eeo.U.h(),
      eeo.V.h(),
      eeo.W.h(),
      eeo.X.h(),
      eeo.Y.h(),
      eeo.Z.h(),
      eeo.aa.h(),
      eeo.ab.h(),
      eeo.ac.h(),
      eeo.ad.h(),
      eeo.ae.h(),
      eeo.af.h(),
      eeo.ag.h(),
      eeo.ah.h()
   );
   int e_ = 0;
   ToIntFunction<ald<eeo>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eeo.P.h(), 1);
      $$0.put(eeo.Q.h(), 1);
      $$0.put(eeo.x.h(), 1);
      $$0.put(eeo.J.h(), 2);
      $$0.put(eeo.A.h(), 2);
      $$0.put(eeo.O.h(), 2);
      $$0.put(eeo.C.h(), 3);
      $$0.put(eeo.K.h(), 3);
      $$0.put(eeo.B.h(), 3);
      $$0.put(eeo.u.h(), 4);
      $$0.put(eeo.n.h(), 4);
      $$0.put(eeo.S.h(), 4);
      $$0.put(eeo.q.h(), 5);
      $$0.put(eeo.v.h(), 5);
      $$0.put(eeo.r.h(), 6);
      $$0.put(eeo.M.h(), 6);
      $$0.put(eeo.s.h(), 6);
      $$0.put(eeo.o.h(), 7);
      $$0.put(eeo.l.h(), 8);
      $$0.put(eeo.m.h(), 8);
      $$0.put(eeo.j.h(), 9);
      $$0.put(eeo.d.h(), 9);
      $$0.put(eeo.e.h(), 9);
      $$0.put(eeo.g.h(), 9);
      $$0.put(eeo.k.h(), 10);
      $$0.put(eeo.h.h(), 10);
      $$0.put(eeo.a.h(), 10);
      $$0.put(eeo.b.h(), 10);
      $$0.put(eeo.I.h(), 10);
      $$0.put(eeo.H.h(), 10);
      $$0.put(eeo.c.h(), 11);
      $$0.put(eeo.f.h(), 12);
      $$0.put(eeo.y.h(), 12);
      $$0.put(eeo.i.h(), 13);
      $$0.put(eeo.z.h(), 13);
      $$0.put(eeo.t.h(), 14);
      $$0.put(eeo.G.h(), 14);
      $$0.put(eeo.R.h(), 14);
      $$0.put(eeo.p.h(), 15);
      $$0.put(eeo.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eex.a x();

   eex.d gq();

   static int a_(je<eeo> $$0) {
      return $$0.e().map(eex::a).orElse(0);
   }

   static int a(ald<eeo> $$0) {
      return f_.applyAsInt($$0);
   }

   static ald<eeo> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azk.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eex.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eev.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  eew.a.fieldOf("selector").forGetter(eex.a::a),
                  ays.l.fieldOf("event_delay").orElse(0).forGetter(eex.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eex.a((eev)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eev c;
      private int d;
      final eew e;
      private boolean f;

      private a(@Nullable eev $$0, eew $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new eew(), 0, false);
      }

      public eew a() {
         return this.e;
      }

      @Nullable
      public eev b() {
         return this.c;
      }

      public void a(@Nullable eev $$0) {
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

   public static class b implements eeq {
      private final eex a;

      public b(eex $$0) {
         this.a = $$0;
      }

      @Override
      public ees a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(aro $$0, je<eeo> $$1, eeo.a $$2, fdw $$3) {
         eex.a $$4 = this.a.x();
         eex.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fdw> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fdw $$7 = $$6.get();
               if (!$$5.a($$0, iu.a((jo)$$3), $$1, $$2)) {
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

      public void b(aro $$0, je<eeo> $$1, eeo.a $$2, fdw $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(aro $$0, eex.a $$1, je<eeo> $$2, eeo.a $$3, fdw $$4, fdw $$5) {
         $$1.e.a(new eev($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iu $$0, iu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dip $$0, fdw $$1, fdw $$2) {
         fdw $$3 = new fdw((double)azk.a($$1.d) + 0.5, (double)azk.a($$1.e) + 0.5, (double)azk.a($$1.f) + 0.5);
         fdw $$4 = new fdw((double)azk.a($$2.d) + 0.5, (double)azk.a($$2.e) + 0.5, (double)azk.a($$2.f) + 0.5);

         for (ja $$5 : ja.values()) {
            fdw $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dhx($$6, $$4, $$0x -> $$0x.a(axa.bs))).d() != fdu.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dip $$0, eex.a $$1, eex.d $$2) {
         if ($$0 instanceof aro $$3) {
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

      private static void a(aro $$0, eex.a $$1, eex.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fdw $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new md($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aro $$0, eex.a $$1, eex.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fdw $$3 = $$1.c.c();
               ees $$4 = $$2.b();
               fdw $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azk.d($$8, $$3.d, $$5.d);
               double $$10 = azk.d($$8, $$3.e, $$5.e);
               double $$11 = azk.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new md($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aro $$0, eex.a $$1, eex.d $$2, eev $$3) {
         iu $$4 = iu.a((jo)$$3.c());
         iu $$5 = $$2.b().a($$0).map(iu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eex.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dip $$0, iu $$1) {
         dhw $$2 = new dhw($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dhw.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ees b();

      boolean a(aro var1, iu var2, je<eeo> var3, eeo.a var4);

      void a(aro var1, iu var2, je<eeo> var3, @Nullable bwa var4, @Nullable bwa var5, float var6);

      default axp<eeo> c() {
         return axg.a;
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

      default boolean a(je<eeo> $$0, eeo.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwa $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.U_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axg.d)) {
                  if (this.d() && $$2 instanceof arp $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axa.bt) : true;
         }
      }

      default void e() {
      }
   }
}
