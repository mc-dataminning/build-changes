import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface doi {
   List<ahg<dnz>> e_ = List.of(
      dnz.T.h(),
      dnz.U.h(),
      dnz.V.h(),
      dnz.W.h(),
      dnz.X.h(),
      dnz.Y.h(),
      dnz.Z.h(),
      dnz.aa.h(),
      dnz.ab.h(),
      dnz.ac.h(),
      dnz.ad.h(),
      dnz.ae.h(),
      dnz.af.h(),
      dnz.ag.h(),
      dnz.ah.h()
   );
   int f_ = 0;
   ToIntFunction<ahg<dnz>> g_ = ac.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dnz.P.h(), 1);
      $$0.put(dnz.Q.h(), 1);
      $$0.put(dnz.x.h(), 1);
      $$0.put(dnz.J.h(), 2);
      $$0.put(dnz.A.h(), 2);
      $$0.put(dnz.O.h(), 2);
      $$0.put(dnz.C.h(), 3);
      $$0.put(dnz.K.h(), 3);
      $$0.put(dnz.B.h(), 3);
      $$0.put(dnz.u.h(), 4);
      $$0.put(dnz.n.h(), 4);
      $$0.put(dnz.S.h(), 4);
      $$0.put(dnz.q.h(), 5);
      $$0.put(dnz.v.h(), 5);
      $$0.put(dnz.r.h(), 6);
      $$0.put(dnz.M.h(), 6);
      $$0.put(dnz.s.h(), 6);
      $$0.put(dnz.o.h(), 7);
      $$0.put(dnz.l.h(), 8);
      $$0.put(dnz.m.h(), 8);
      $$0.put(dnz.j.h(), 9);
      $$0.put(dnz.d.h(), 9);
      $$0.put(dnz.e.h(), 9);
      $$0.put(dnz.g.h(), 9);
      $$0.put(dnz.k.h(), 10);
      $$0.put(dnz.h.h(), 10);
      $$0.put(dnz.a.h(), 10);
      $$0.put(dnz.b.h(), 10);
      $$0.put(dnz.I.h(), 10);
      $$0.put(dnz.H.h(), 10);
      $$0.put(dnz.c.h(), 11);
      $$0.put(dnz.f.h(), 12);
      $$0.put(dnz.y.h(), 12);
      $$0.put(dnz.i.h(), 13);
      $$0.put(dnz.z.h(), 13);
      $$0.put(dnz.t.h(), 14);
      $$0.put(dnz.G.h(), 14);
      $$0.put(dnz.R.h(), 14);
      $$0.put(dnz.p.h(), 15);
      $$0.put(dnz.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   doi.a gh();

   doi.d gi();

   static int a_(ih<dnz> $$0) {
      return $$0.e().map(doi::a).orElse(0);
   }

   static int a(ahg<dnz> $$0) {
      return g_.applyAsInt($$0);
   }

   static ahg<dnz> b(int $$0) {
      return e_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - aup.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<doi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dog.a.optionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  doh.a.fieldOf("selector").forGetter(doi.a::a),
                  atx.i.fieldOf("event_delay").orElse(0).forGetter(doi.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new doi.a((dog)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      dog c;
      private int d;
      final doh e;
      private boolean f;

      private a(@Nullable dog $$0, doh $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new doh(), 0, false);
      }

      public doh a() {
         return this.e;
      }

      @Nullable
      public dog b() {
         return this.c;
      }

      public void a(@Nullable dog $$0) {
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

   public static class b implements dob {
      private final doi a;

      public b(doi $$0) {
         this.a = $$0;
      }

      @Override
      public dod a() {
         return this.a.gi().b();
      }

      @Override
      public int b() {
         return this.a.gi().a();
      }

      @Override
      public boolean a(ane $$0, ih<dnz> $$1, dnz.a $$2, emc $$3) {
         doi.a $$4 = this.a.gh();
         doi.d $$5 = this.a.gi();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<emc> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               emc $$7 = $$6.get();
               if (!$$5.a($$0, hx.a($$3), $$1, $$2)) {
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

      public void b(ane $$0, ih<dnz> $$1, dnz.a $$2, emc $$3) {
         this.a.gi().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gh(), $$1, $$2, $$3, $$4));
      }

      private void a(ane $$0, doi.a $$1, ih<dnz> $$2, dnz.a $$3, emc $$4, emc $$5) {
         $$1.e.a(new dog($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.X());
      }

      public static float a(hx $$0, hx $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(ctx $$0, emc $$1, emc $$2) {
         emc $$3 = new emc((double)aup.a($$1.c) + 0.5, (double)aup.a($$1.d) + 0.5, (double)aup.a($$1.e) + 0.5);
         emc $$4 = new emc((double)aup.a($$2.c) + 0.5, (double)aup.a($$2.d) + 0.5, (double)aup.a($$2.e) + 0.5);

         for (ic $$5 : ic.values()) {
            emc $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new ctf($$6, $$4, $$0x -> $$0x.a(asi.bp))).c() != ema.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(ctx $$0, doi.a $$1, doi.d $$2) {
         if ($$0 instanceof ane $$3) {
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

      private static void a(ane $$0, doi.a $$1, doi.d $$2) {
         $$1.a().a($$0.X()).ifPresent($$3 -> {
            $$1.a($$3);
            emc $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new kb($$2.b(), $$1.c()), $$4.c, $$4.d, $$4.e, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(ane $$0, doi.a $$1, doi.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               emc $$3 = $$1.c.c();
               dod $$4 = $$2.b();
               emc $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = aup.d($$8, $$3.c, $$5.c);
               double $$10 = aup.d($$8, $$3.d, $$5.d);
               double $$11 = aup.d($$8, $$3.e, $$5.e);
               boolean $$12 = $$0.a(new kb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(ane $$0, doi.a $$1, doi.d $$2, dog $$3) {
         hx $$4 = hx.a($$3.c());
         hx $$5 = $$2.b().a($$0).map(hx::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), doi.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(ctx $$0, hx $$1) {
         cte $$2 = new cte($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(cte.c($$3, $$4)) || $$0.L().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      dod b();

      boolean a(ane var1, hx var2, ih<dnz> var3, dnz.a var4);

      void a(ane var1, hx var2, ih<dnz> var3, @Nullable blw var4, @Nullable blw var5, float var6);

      default asx<dnz> c() {
         return aso.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return aup.d($$0);
      }

      default boolean a(ih<dnz> $$0, dnz.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            blw $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.P_()) {
                  return false;
               }

               if ($$2.bT() && $$0.a(aso.d)) {
                  if (this.d() && $$2 instanceof anf $$3) {
                     am.Z.a($$3);
                  }

                  return false;
               }

               if ($$2.aX()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(asi.bq) : true;
         }
      }

      default void e() {
      }
   }
}
