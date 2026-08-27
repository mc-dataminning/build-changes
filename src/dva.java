import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dva {
   List<ake<dur>> e_ = List.of(
      dur.T.h(),
      dur.U.h(),
      dur.V.h(),
      dur.W.h(),
      dur.X.h(),
      dur.Y.h(),
      dur.Z.h(),
      dur.aa.h(),
      dur.ab.h(),
      dur.ac.h(),
      dur.ad.h(),
      dur.ae.h(),
      dur.af.h(),
      dur.ag.h(),
      dur.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ake<dur>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dur.P.h(), 1);
      $$0.put(dur.Q.h(), 1);
      $$0.put(dur.x.h(), 1);
      $$0.put(dur.J.h(), 2);
      $$0.put(dur.A.h(), 2);
      $$0.put(dur.O.h(), 2);
      $$0.put(dur.C.h(), 3);
      $$0.put(dur.K.h(), 3);
      $$0.put(dur.B.h(), 3);
      $$0.put(dur.u.h(), 4);
      $$0.put(dur.n.h(), 4);
      $$0.put(dur.S.h(), 4);
      $$0.put(dur.q.h(), 5);
      $$0.put(dur.v.h(), 5);
      $$0.put(dur.r.h(), 6);
      $$0.put(dur.M.h(), 6);
      $$0.put(dur.s.h(), 6);
      $$0.put(dur.o.h(), 7);
      $$0.put(dur.l.h(), 8);
      $$0.put(dur.m.h(), 8);
      $$0.put(dur.j.h(), 9);
      $$0.put(dur.d.h(), 9);
      $$0.put(dur.e.h(), 9);
      $$0.put(dur.g.h(), 9);
      $$0.put(dur.k.h(), 10);
      $$0.put(dur.h.h(), 10);
      $$0.put(dur.a.h(), 10);
      $$0.put(dur.b.h(), 10);
      $$0.put(dur.I.h(), 10);
      $$0.put(dur.H.h(), 10);
      $$0.put(dur.c.h(), 11);
      $$0.put(dur.f.h(), 12);
      $$0.put(dur.y.h(), 12);
      $$0.put(dur.i.h(), 13);
      $$0.put(dur.z.h(), 13);
      $$0.put(dur.t.h(), 14);
      $$0.put(dur.G.h(), 14);
      $$0.put(dur.R.h(), 14);
      $$0.put(dur.p.h(), 15);
      $$0.put(dur.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dva.a gr();

   dva.d gs();

   static int a_(iv<dur> $$0) {
      return $$0.e().map(dva::a).orElse(0);
   }

   static int a(ake<dur> $$0) {
      return g_.applyAsInt($$0);
   }

   static ake<dur> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - axw.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dva.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  duy.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  duz.a.fieldOf("selector").forGetter(dva.a::a),
                  axe.i.fieldOf("event_delay").orElse(0).forGetter(dva.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dva.a((duy)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      duy c;
      private int d;
      final duz e;
      private boolean f;

      private a(@Nullable duy $$0, duz $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new duz(), 0, false);
      }

      public duz a() {
         return this.e;
      }

      @Nullable
      public duy b() {
         return this.c;
      }

      public void a(@Nullable duy $$0) {
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

   public static class b implements dut {
      private final dva a;

      public b(dva $$0) {
         this.a = $$0;
      }

      @Override
      public duv a() {
         return this.a.gs().b();
      }

      @Override
      public int b() {
         return this.a.gs().a();
      }

      @Override
      public boolean a(aqe $$0, iv<dur> $$1, dur.a $$2, etf $$3) {
         dva.a $$4 = this.a.gr();
         dva.d $$5 = this.a.gs();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<etf> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               etf $$7 = $$6.get();
               if (!$$5.a($$0, im.a($$3), $$1, $$2)) {
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

      public void b(aqe $$0, iv<dur> $$1, dur.a $$2, etf $$3) {
         this.a.gs().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gr(), $$1, $$2, $$3, $$4));
      }

      private void a(aqe $$0, dva.a $$1, iv<dur> $$2, dur.a $$3, etf $$4, etf $$5) {
         $$1.e.a(new duy($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(im $$0, im $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(czu $$0, etf $$1, etf $$2) {
         etf $$3 = new etf((double)axw.a($$1.c) + 0.5, (double)axw.a($$1.d) + 0.5, (double)axw.a($$1.e) + 0.5);
         etf $$4 = new etf((double)axw.a($$2.c) + 0.5, (double)axw.a($$2.d) + 0.5, (double)axw.a($$2.e) + 0.5);

         for (ir $$5 : ir.values()) {
            etf $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new czc($$6, $$4, $$0x -> $$0x.a(avo.bq))).c() != etd.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(czu $$0, dva.a $$1, dva.d $$2) {
         if ($$0 instanceof aqe $$3) {
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

      private static void a(aqe $$0, dva.a $$1, dva.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            etf $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new la($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aqe $$0, dva.a $$1, dva.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               etf $$3 = $$1.c.c();
               duv $$4 = $$2.b();
               etf $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = axw.d($$8, $$3.c, $$5.c);
               double $$10 = axw.d($$8, $$3.d, $$5.d);
               double $$11 = axw.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new la($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aqe $$0, dva.a $$1, dva.d $$2, duy $$3) {
         im $$4 = im.a($$3.c());
         im $$5 = $$2.b().a($$0).map(im::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dva.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(czu $$0, im $$1) {
         czb $$2 = new czb($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(czb.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      duv b();

      boolean a(aqe var1, im var2, iv<dur> var3, dur.a var4);

      void a(aqe var1, im var2, iv<dur> var3, @Nullable bql var4, @Nullable bql var5, float var6);

      default awd<dur> c() {
         return avu.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return axw.d($$0);
      }

      default boolean a(iv<dur> $$0, dur.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bql $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bU() && $$0.a(avu.d)) {
                  if (this.d() && $$2 instanceof aqf $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.ba()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(avo.br) : true;
         }
      }

      default void e() {
      }
   }
}
