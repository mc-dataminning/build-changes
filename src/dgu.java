import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dgu {
   dgl[] d_ = new dgl[]{dgl.T, dgl.U, dgl.V, dgl.W, dgl.X, dgl.Y, dgl.Z, dgl.aa, dgl.ab, dgl.ac, dgl.ad, dgl.ae, dgl.af, dgl.ag, dgl.ah};
   ToIntFunction<dgl> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dgl.Q, 1);
      $$0.put(dgl.R, 1);
      $$0.put(dgl.y, 1);
      $$0.put(dgl.K, 2);
      $$0.put(dgl.B, 2);
      $$0.put(dgl.P, 2);
      $$0.put(dgl.D, 3);
      $$0.put(dgl.L, 3);
      $$0.put(dgl.C, 3);
      $$0.put(dgl.u, 4);
      $$0.put(dgl.v, 4);
      $$0.put(dgl.n, 4);
      $$0.put(dgl.q, 5);
      $$0.put(dgl.w, 5);
      $$0.put(dgl.r, 6);
      $$0.put(dgl.N, 6);
      $$0.put(dgl.s, 6);
      $$0.put(dgl.o, 7);
      $$0.put(dgl.l, 8);
      $$0.put(dgl.m, 8);
      $$0.put(dgl.j, 9);
      $$0.put(dgl.d, 9);
      $$0.put(dgl.e, 9);
      $$0.put(dgl.g, 9);
      $$0.put(dgl.k, 10);
      $$0.put(dgl.h, 10);
      $$0.put(dgl.a, 10);
      $$0.put(dgl.b, 10);
      $$0.put(dgl.J, 10);
      $$0.put(dgl.I, 10);
      $$0.put(dgl.c, 11);
      $$0.put(dgl.f, 12);
      $$0.put(dgl.z, 12);
      $$0.put(dgl.i, 13);
      $$0.put(dgl.A, 13);
      $$0.put(dgl.t, 14);
      $$0.put(dgl.H, 14);
      $$0.put(dgl.S, 14);
      $$0.put(dgl.p, 15);
      $$0.put(dgl.x, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   dgu.a gb();

   dgu.d gc();

   static int a_(dgl $$0) {
      return e_.applyAsInt($$0);
   }

   static dgl b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - apa.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<dgu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dgs.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  dgt.a.fieldOf("selector").forGetter(dgu.a::a),
                  aoi.i.fieldOf("event_delay").orElse(0).forGetter(dgu.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new dgu.a((dgs)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dgs c;
      private int d;
      final dgt e;
      private boolean f;

      private a(@Nullable dgs $$0, dgt $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new dgt(), 0, false);
      }

      public dgt a() {
         return this.e;
      }

      @Nullable
      public dgs b() {
         return this.c;
      }

      public void a(@Nullable dgs $$0) {
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

   public static class b implements dgn {
      private final dgu a;

      public b(dgu $$0) {
         this.a = $$0;
      }

      @Override
      public dgp a() {
         return this.a.gc().b();
      }

      @Override
      public int b() {
         return this.a.gc().a();
      }

      @Override
      public boolean a(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
         dgu.a $$4 = this.a.gb();
         dgu.d $$5 = this.a.gc();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<eei> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               eei $$7 = $$6.get();
               if (!$$5.a($$0, gu.a($$3), $$1, $$2)) {
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

      public void b(aif $$0, dgl $$1, dgl.a $$2, eei $$3) {
         this.a.gc().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gb(), $$1, $$2, $$3, $$4));
      }

      private void a(aif $$0, dgu.a $$1, dgl $$2, dgl.a $$3, eei $$4, eei $$5) {
         $$1.e.a(new dgs($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gu $$0, gu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cmm $$0, eei $$1, eei $$2) {
         eei $$3 = new eei((double)apa.a($$1.c) + 0.5, (double)apa.a($$1.d) + 0.5, (double)apa.a($$1.e) + 0.5);
         eei $$4 = new eei((double)apa.a($$2.c) + 0.5, (double)apa.a($$2.d) + 0.5, (double)apa.a($$2.e) + 0.5);

         for (ha $$5 : ha.values()) {
            eei $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new clu($$6, $$4, $$0x -> $$0x.a(amw.bn))).c() != eeg.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cmm $$0, dgu.a $$1, dgu.d $$2) {
         if ($$0 instanceof aif $$3) {
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

      private static void a(aif $$0, dgu.a $$1, dgu.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            eei $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new iz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aif $$0, dgu.a $$1, dgu.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               eei $$3 = $$1.c.c();
               dgp $$4 = $$2.b();
               eei $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = apa.d($$8, $$3.c, $$5.c);
               double $$10 = apa.d($$8, $$3.d, $$5.d);
               double $$11 = apa.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new iz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aif $$0, dgu.a $$1, dgu.d $$2, dgs $$3) {
         gu $$4 = gu.a($$3.c());
         gu $$5 = $$2.b().a($$0).map(gu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), dgu.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cmm $$0, gu $$1) {
         clt $$2 = new clt($$1);

         for (int $$3 = $$2.e - 1; $$3 < $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 < $$2.f + 1; $$4++) {
               ddx $$5 = $$0.J().a($$3, $$4);
               if ($$5 == null || !$$0.a($$5.f().a())) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dgp b();

      boolean a(aif var1, gu var2, dgl var3, dgl.a var4);

      void a(aif var1, gu var2, dgl var3, @Nullable bfj var4, @Nullable bfj var5, float var6);

      default anl<dgl> c() {
         return anc.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return apa.d($$0);
      }

      default boolean a(dgl $$0, dgl.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bfj $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.G_()) {
                  return false;
               }

               if ($$2.bQ() && $$0.a(anc.d)) {
                  if (this.d() && $$2 instanceof aig $$3) {
                     ai.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aT()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(amw.bo) : true;
         }
      }

      default void e() {
      }
   }
}
