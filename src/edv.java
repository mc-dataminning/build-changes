import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface edv {
   List<alc<edm>> d_ = List.of(
      edm.T.h(),
      edm.U.h(),
      edm.V.h(),
      edm.W.h(),
      edm.X.h(),
      edm.Y.h(),
      edm.Z.h(),
      edm.aa.h(),
      edm.ab.h(),
      edm.ac.h(),
      edm.ad.h(),
      edm.ae.h(),
      edm.af.h(),
      edm.ag.h(),
      edm.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alc<edm>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(edm.P.h(), 1);
      $$0.put(edm.Q.h(), 1);
      $$0.put(edm.x.h(), 1);
      $$0.put(edm.J.h(), 2);
      $$0.put(edm.A.h(), 2);
      $$0.put(edm.O.h(), 2);
      $$0.put(edm.C.h(), 3);
      $$0.put(edm.K.h(), 3);
      $$0.put(edm.B.h(), 3);
      $$0.put(edm.u.h(), 4);
      $$0.put(edm.n.h(), 4);
      $$0.put(edm.S.h(), 4);
      $$0.put(edm.q.h(), 5);
      $$0.put(edm.v.h(), 5);
      $$0.put(edm.r.h(), 6);
      $$0.put(edm.M.h(), 6);
      $$0.put(edm.s.h(), 6);
      $$0.put(edm.o.h(), 7);
      $$0.put(edm.l.h(), 8);
      $$0.put(edm.m.h(), 8);
      $$0.put(edm.j.h(), 9);
      $$0.put(edm.d.h(), 9);
      $$0.put(edm.e.h(), 9);
      $$0.put(edm.g.h(), 9);
      $$0.put(edm.k.h(), 10);
      $$0.put(edm.h.h(), 10);
      $$0.put(edm.a.h(), 10);
      $$0.put(edm.b.h(), 10);
      $$0.put(edm.I.h(), 10);
      $$0.put(edm.H.h(), 10);
      $$0.put(edm.c.h(), 11);
      $$0.put(edm.f.h(), 12);
      $$0.put(edm.y.h(), 12);
      $$0.put(edm.i.h(), 13);
      $$0.put(edm.z.h(), 13);
      $$0.put(edm.t.h(), 14);
      $$0.put(edm.G.h(), 14);
      $$0.put(edm.R.h(), 14);
      $$0.put(edm.p.h(), 15);
      $$0.put(edm.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   edv.a x();

   edv.d gq();

   static int a_(js<edm> $$0) {
      return $$0.e().map(edv::a).orElse(0);
   }

   static int a(alc<edm> $$0) {
      return f_.applyAsInt($$0);
   }

   static alc<edm> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azk.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<edv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edt.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  edu.a.fieldOf("selector").forGetter(edv.a::a),
                  ays.l.fieldOf("event_delay").orElse(0).forGetter(edv.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new edv.a((edt)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      edt c;
      private int d;
      final edu e;
      private boolean f;

      private a(@Nullable edt $$0, edu $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new edu(), 0, false);
      }

      public edu a() {
         return this.e;
      }

      @Nullable
      public edt b() {
         return this.c;
      }

      public void a(@Nullable edt $$0) {
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

   public static class b implements edo {
      private final edv a;

      public b(edv $$0) {
         this.a = $$0;
      }

      @Override
      public edq a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(arn $$0, js<edm> $$1, edm.a $$2, fcu $$3) {
         edv.a $$4 = this.a.x();
         edv.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fcu> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fcu $$7 = $$6.get();
               if (!$$5.a($$0, jj.a((kc)$$3), $$1, $$2)) {
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

      public void b(arn $$0, js<edm> $$1, edm.a $$2, fcu $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(arn $$0, edv.a $$1, js<edm> $$2, edm.a $$3, fcu $$4, fcu $$5) {
         $$1.e.a(new edt($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(jj $$0, jj $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dhp $$0, fcu $$1, fcu $$2) {
         fcu $$3 = new fcu((double)azk.a($$1.d) + 0.5, (double)azk.a($$1.e) + 0.5, (double)azk.a($$1.f) + 0.5);
         fcu $$4 = new fcu((double)azk.a($$2.d) + 0.5, (double)azk.a($$2.e) + 0.5, (double)azk.a($$2.f) + 0.5);

         for (jo $$5 : jo.values()) {
            fcu $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dgx($$6, $$4, $$0x -> $$0x.a(awz.bs))).d() != fcs.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dhp $$0, edv.a $$1, edv.d $$2) {
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

      private static void a(arn $$0, edv.a $$1, edv.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fcu $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new mb($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arn $$0, edv.a $$1, edv.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fcu $$3 = $$1.c.c();
               edq $$4 = $$2.b();
               fcu $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azk.d($$8, $$3.d, $$5.d);
               double $$10 = azk.d($$8, $$3.e, $$5.e);
               double $$11 = azk.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new mb($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arn $$0, edv.a $$1, edv.d $$2, edt $$3) {
         jj $$4 = jj.a((kc)$$3.c());
         jj $$5 = $$2.b().a($$0).map(jj::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), edv.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dhp $$0, jj $$1) {
         dgw $$2 = new dgw($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dgw.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      edq b();

      boolean a(arn var1, jj var2, js<edm> var3, edm.a var4);

      void a(arn var1, jj var2, js<edm> var3, @Nullable bvs var4, @Nullable bvs var5, float var6);

      default axp<edm> c() {
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

      default boolean a(js<edm> $$0, edm.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bvs $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.U_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axg.d)) {
                  if (this.d() && $$2 instanceof aro $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awz.bt) : true;
         }
      }

      default void e() {
      }
   }
}
