import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djs {
   djj[] d_ = new djj[]{djj.T, djj.U, djj.V, djj.W, djj.X, djj.Y, djj.Z, djj.aa, djj.ab, djj.ac, djj.ad, djj.ae, djj.af, djj.ag, djj.ah};
   ToIntFunction<djj> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djj.P, 1);
      $$0.put(djj.Q, 1);
      $$0.put(djj.x, 1);
      $$0.put(djj.J, 2);
      $$0.put(djj.A, 2);
      $$0.put(djj.O, 2);
      $$0.put(djj.C, 3);
      $$0.put(djj.K, 3);
      $$0.put(djj.B, 3);
      $$0.put(djj.u, 4);
      $$0.put(djj.n, 4);
      $$0.put(djj.S, 4);
      $$0.put(djj.q, 5);
      $$0.put(djj.v, 5);
      $$0.put(djj.r, 6);
      $$0.put(djj.M, 6);
      $$0.put(djj.s, 6);
      $$0.put(djj.o, 7);
      $$0.put(djj.l, 8);
      $$0.put(djj.m, 8);
      $$0.put(djj.j, 9);
      $$0.put(djj.d, 9);
      $$0.put(djj.e, 9);
      $$0.put(djj.g, 9);
      $$0.put(djj.k, 10);
      $$0.put(djj.h, 10);
      $$0.put(djj.a, 10);
      $$0.put(djj.b, 10);
      $$0.put(djj.I, 10);
      $$0.put(djj.H, 10);
      $$0.put(djj.c, 11);
      $$0.put(djj.f, 12);
      $$0.put(djj.y, 12);
      $$0.put(djj.i, 13);
      $$0.put(djj.z, 13);
      $$0.put(djj.t, 14);
      $$0.put(djj.G, 14);
      $$0.put(djj.R, 14);
      $$0.put(djj.p, 15);
      $$0.put(djj.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   djs.a gc();

   djs.d gd();

   static int a_(djj $$0) {
      return e_.applyAsInt($$0);
   }

   static djj b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - arp.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<djs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djq.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  djr.a.fieldOf("selector").forGetter(djs.a::a),
                  aqy.i.fieldOf("event_delay").orElse(0).forGetter(djs.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new djs.a((djq)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      djq c;
      private int d;
      final djr e;
      private boolean f;

      private a(@Nullable djq $$0, djr $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new djr(), 0, false);
      }

      public djr a() {
         return this.e;
      }

      @Nullable
      public djq b() {
         return this.c;
      }

      public void a(@Nullable djq $$0) {
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

   public static class b implements djl {
      private final djs a;

      public b(djs $$0) {
         this.a = $$0;
      }

      @Override
      public djn a() {
         return this.a.gd().b();
      }

      @Override
      public int b() {
         return this.a.gd().a();
      }

      @Override
      public boolean a(akk $$0, djj $$1, djj.a $$2, ehd $$3) {
         djs.a $$4 = this.a.gc();
         djs.d $$5 = this.a.gd();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehd> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehd $$7 = $$6.get();
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

      public void b(akk $$0, djj $$1, djj.a $$2, ehd $$3) {
         this.a.gd().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gc(), $$1, $$2, $$3, $$4));
      }

      private void a(akk $$0, djs.a $$1, djj $$2, djj.a $$3, ehd $$4, ehd $$5) {
         $$1.e.a(new djq($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gu $$0, gu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpl $$0, ehd $$1, ehd $$2) {
         ehd $$3 = new ehd((double)arp.a($$1.c) + 0.5, (double)arp.a($$1.d) + 0.5, (double)arp.a($$1.e) + 0.5);
         ehd $$4 = new ehd((double)arp.a($$2.c) + 0.5, (double)arp.a($$2.d) + 0.5, (double)arp.a($$2.e) + 0.5);

         for (ha $$5 : ha.values()) {
            ehd $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cot($$6, $$4, $$0x -> $$0x.a(apl.bp))).c() != ehb.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpl $$0, djs.a $$1, djs.d $$2) {
         if ($$0 instanceof akk $$3) {
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

      private static void a(akk $$0, djs.a $$1, djs.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehd $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new iz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(akk $$0, djs.a $$1, djs.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehd $$3 = $$1.c.c();
               djn $$4 = $$2.b();
               ehd $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = arp.d($$8, $$3.c, $$5.c);
               double $$10 = arp.d($$8, $$3.d, $$5.d);
               double $$11 = arp.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new iz($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(akk $$0, djs.a $$1, djs.d $$2, djq $$3) {
         gu $$4 = gu.a($$3.c());
         gu $$5 = $$2.b().a($$0).map(gu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), djs.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpl $$0, gu $$1) {
         cos $$2 = new cos($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cos.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djn b();

      boolean a(akk var1, gu var2, djj var3, djj.a var4);

      void a(akk var1, gu var2, djj var3, @Nullable bii var4, @Nullable bii var5, float var6);

      default aqa<djj> c() {
         return apr.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return arp.d($$0);
      }

      default boolean a(djj $$0, djj.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bii $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.G_()) {
                  return false;
               }

               if ($$2.bS() && $$0.a(apr.d)) {
                  if (this.d() && $$2 instanceof akl $$3) {
                     ai.Y.a($$3);
                  }

                  return false;
               }

               if ($$2.aV()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(apl.bq) : true;
         }
      }

      default void e() {
      }
   }
}
