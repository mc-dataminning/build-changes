import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface duk {
   List<aju<dub>> e_ = List.of(
      dub.T.h(),
      dub.U.h(),
      dub.V.h(),
      dub.W.h(),
      dub.X.h(),
      dub.Y.h(),
      dub.Z.h(),
      dub.aa.h(),
      dub.ab.h(),
      dub.ac.h(),
      dub.ad.h(),
      dub.ae.h(),
      dub.af.h(),
      dub.ag.h(),
      dub.ah.h()
   );
   int f_ = 0;
   ToIntFunction<aju<dub>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dub.P.h(), 1);
      $$0.put(dub.Q.h(), 1);
      $$0.put(dub.x.h(), 1);
      $$0.put(dub.J.h(), 2);
      $$0.put(dub.A.h(), 2);
      $$0.put(dub.O.h(), 2);
      $$0.put(dub.C.h(), 3);
      $$0.put(dub.K.h(), 3);
      $$0.put(dub.B.h(), 3);
      $$0.put(dub.u.h(), 4);
      $$0.put(dub.n.h(), 4);
      $$0.put(dub.S.h(), 4);
      $$0.put(dub.q.h(), 5);
      $$0.put(dub.v.h(), 5);
      $$0.put(dub.r.h(), 6);
      $$0.put(dub.M.h(), 6);
      $$0.put(dub.s.h(), 6);
      $$0.put(dub.o.h(), 7);
      $$0.put(dub.l.h(), 8);
      $$0.put(dub.m.h(), 8);
      $$0.put(dub.j.h(), 9);
      $$0.put(dub.d.h(), 9);
      $$0.put(dub.e.h(), 9);
      $$0.put(dub.g.h(), 9);
      $$0.put(dub.k.h(), 10);
      $$0.put(dub.h.h(), 10);
      $$0.put(dub.a.h(), 10);
      $$0.put(dub.b.h(), 10);
      $$0.put(dub.I.h(), 10);
      $$0.put(dub.H.h(), 10);
      $$0.put(dub.c.h(), 11);
      $$0.put(dub.f.h(), 12);
      $$0.put(dub.y.h(), 12);
      $$0.put(dub.i.h(), 13);
      $$0.put(dub.z.h(), 13);
      $$0.put(dub.t.h(), 14);
      $$0.put(dub.G.h(), 14);
      $$0.put(dub.R.h(), 14);
      $$0.put(dub.p.h(), 15);
      $$0.put(dub.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   duk.a gp();

   duk.d gq();

   static int a_(in<dub> $$0) {
      return $$0.e().map(duk::a).orElse(0);
   }

   static int a(aju<dub> $$0) {
      return g_.applyAsInt($$0);
   }

   static aju<dub> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - axm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<duk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dui.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  duj.a.fieldOf("selector").forGetter(duk.a::a),
                  awu.i.fieldOf("event_delay").orElse(0).forGetter(duk.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new duk.a((dui)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dui c;
      private int d;
      final duj e;
      private boolean f;

      private a(@Nullable dui $$0, duj $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new duj(), 0, false);
      }

      public duj a() {
         return this.e;
      }

      @Nullable
      public dui b() {
         return this.c;
      }

      public void a(@Nullable dui $$0) {
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

   public static class b implements dud {
      private final duk a;

      public b(duk $$0) {
         this.a = $$0;
      }

      @Override
      public duf a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(apu $$0, in<dub> $$1, dub.a $$2, esj $$3) {
         duk.a $$4 = this.a.gp();
         duk.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<esj> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               esj $$7 = $$6.get();
               if (!$$5.a($$0, id.a($$3), $$1, $$2)) {
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

      public void b(apu $$0, in<dub> $$1, dub.a $$2, esj $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gp(), $$1, $$2, $$3, $$4));
      }

      private void a(apu $$0, duk.a $$1, in<dub> $$2, dub.a $$3, esj $$4, esj $$5) {
         $$1.e.a(new dui($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.Y());
      }

      public static float a(id $$0, id $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(czg $$0, esj $$1, esj $$2) {
         esj $$3 = new esj((double)axm.a($$1.c) + 0.5, (double)axm.a($$1.d) + 0.5, (double)axm.a($$1.e) + 0.5);
         esj $$4 = new esj((double)axm.a($$2.c) + 0.5, (double)axm.a($$2.d) + 0.5, (double)axm.a($$2.e) + 0.5);

         for (ij $$5 : ij.values()) {
            esj $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new cyo($$6, $$4, $$0x -> $$0x.a(ave.bq))).c() != esh.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(czg $$0, duk.a $$1, duk.d $$2) {
         if ($$0 instanceof apu $$3) {
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

      private static void a(apu $$0, duk.a $$1, duk.d $$2) {
         $$1.a().a($$0.Y()).ifPresent($$3 -> {
            $$1.a($$3);
            esj $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kr($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(apu $$0, duk.a $$1, duk.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               esj $$3 = $$1.c.c();
               duf $$4 = $$2.b();
               esj $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = axm.d($$8, $$3.c, $$5.c);
               double $$10 = axm.d($$8, $$3.d, $$5.d);
               double $$11 = axm.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kr($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(apu $$0, duk.a $$1, duk.d $$2, dui $$3) {
         id $$4 = id.a($$3.c());
         id $$5 = $$2.b().a($$0).map(id::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), duk.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(czg $$0, id $$1) {
         cyn $$2 = new cyn($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cyn.c($$3, $$4)) || $$0.M().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      duf b();

      boolean a(apu var1, id var2, in<dub> var3, dub.a var4);

      void a(apu var1, id var2, in<dub> var3, @Nullable bqa var4, @Nullable bqa var5, float var6);

      default avt<dub> c() {
         return avk.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return axm.d($$0);
      }

      default boolean a(in<dub> $$0, dub.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bqa $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.N_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(avk.d)) {
                  if (this.d() && $$2 instanceof apv $$3) {
                     am.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.ba()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(ave.br) : true;
         }
      }

      default void e() {
      }
   }
}
