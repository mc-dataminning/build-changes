import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djt {
   djk[] d_ = new djk[]{djk.T, djk.U, djk.V, djk.W, djk.X, djk.Y, djk.Z, djk.aa, djk.ab, djk.ac, djk.ad, djk.ae, djk.af, djk.ag, djk.ah};
   ToIntFunction<djk> e_ = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(djk.P, 1);
      $$0.put(djk.Q, 1);
      $$0.put(djk.x, 1);
      $$0.put(djk.J, 2);
      $$0.put(djk.A, 2);
      $$0.put(djk.O, 2);
      $$0.put(djk.C, 3);
      $$0.put(djk.K, 3);
      $$0.put(djk.B, 3);
      $$0.put(djk.u, 4);
      $$0.put(djk.n, 4);
      $$0.put(djk.S, 4);
      $$0.put(djk.q, 5);
      $$0.put(djk.v, 5);
      $$0.put(djk.r, 6);
      $$0.put(djk.M, 6);
      $$0.put(djk.s, 6);
      $$0.put(djk.o, 7);
      $$0.put(djk.l, 8);
      $$0.put(djk.m, 8);
      $$0.put(djk.j, 9);
      $$0.put(djk.d, 9);
      $$0.put(djk.e, 9);
      $$0.put(djk.g, 9);
      $$0.put(djk.k, 10);
      $$0.put(djk.h, 10);
      $$0.put(djk.a, 10);
      $$0.put(djk.b, 10);
      $$0.put(djk.I, 10);
      $$0.put(djk.H, 10);
      $$0.put(djk.c, 11);
      $$0.put(djk.f, 12);
      $$0.put(djk.y, 12);
      $$0.put(djk.i, 13);
      $$0.put(djk.z, 13);
      $$0.put(djk.t, 14);
      $$0.put(djk.G, 14);
      $$0.put(djk.R, 14);
      $$0.put(djk.p, 15);
      $$0.put(djk.w, 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   djt.a gb();

   djt.d gc();

   static int a_(djk $$0) {
      return e_.applyAsInt($$0);
   }

   static djk b(int $$0) {
      return d_[$$0 - 1];
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - arp.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<djt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  djr.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  djs.a.fieldOf("selector").forGetter(djt.a::a),
                  aqy.i.fieldOf("event_delay").orElse(0).forGetter(djt.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new djt.a((djr)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      djr c;
      private int d;
      final djs e;
      private boolean f;

      private a(@Nullable djr $$0, djs $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new djs(), 0, false);
      }

      public djs a() {
         return this.e;
      }

      @Nullable
      public djr b() {
         return this.c;
      }

      public void a(@Nullable djr $$0) {
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

   public static class b implements djm {
      private final djt a;

      public b(djt $$0) {
         this.a = $$0;
      }

      @Override
      public djo a() {
         return this.a.gc().b();
      }

      @Override
      public int b() {
         return this.a.gc().a();
      }

      @Override
      public boolean a(akk $$0, djk $$1, djk.a $$2, ehe $$3) {
         djt.a $$4 = this.a.gb();
         djt.d $$5 = this.a.gc();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ehe> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ehe $$7 = $$6.get();
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

      public void b(akk $$0, djk $$1, djk.a $$2, ehe $$3) {
         this.a.gc().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gb(), $$1, $$2, $$3, $$4));
      }

      private void a(akk $$0, djt.a $$1, djk $$2, djk.a $$3, ehe $$4, ehe $$5) {
         $$1.e.a(new djr($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.V());
      }

      public static float a(gu $$0, gu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(cpm $$0, ehe $$1, ehe $$2) {
         ehe $$3 = new ehe((double)arp.a($$1.c) + 0.5, (double)arp.a($$1.d) + 0.5, (double)arp.a($$1.e) + 0.5);
         ehe $$4 = new ehe((double)arp.a($$2.c) + 0.5, (double)arp.a($$2.d) + 0.5, (double)arp.a($$2.e) + 0.5);

         for (ha $$5 : ha.values()) {
            ehe $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cou($$6, $$4, $$0x -> $$0x.a(apl.bp))).c() != ehc.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(cpm $$0, djt.a $$1, djt.d $$2) {
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

      private static void a(akk $$0, djt.a $$1, djt.d $$2) {
         $$1.a().a($$0.V()).ifPresent($$3 -> {
            $$1.a($$3);
            ehe $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new iz($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(akk $$0, djt.a $$1, djt.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ehe $$3 = $$1.c.c();
               djo $$4 = $$2.b();
               ehe $$5 = $$4.a($$0).orElse($$3);
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

      private static boolean a(akk $$0, djt.a $$1, djt.d $$2, djr $$3) {
         gu $$4 = gu.a($$3.c());
         gu $$5 = $$2.b().a($$0).map(gu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), djt.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(cpm $$0, gu $$1) {
         cot $$2 = new cot($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cot.c($$3, $$4)) || $$0.J().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      djo b();

      boolean a(akk var1, gu var2, djk var3, djk.a var4);

      void a(akk var1, gu var2, djk var3, @Nullable bii var4, @Nullable bii var5, float var6);

      default aqa<djk> c() {
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

      default boolean a(djk $$0, djk.a $$1) {
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
