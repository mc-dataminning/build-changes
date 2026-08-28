import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface eaj {
   List<alg<eaa>> f_ = List.of(
      eaa.T.h(),
      eaa.U.h(),
      eaa.V.h(),
      eaa.W.h(),
      eaa.X.h(),
      eaa.Y.h(),
      eaa.Z.h(),
      eaa.aa.h(),
      eaa.ab.h(),
      eaa.ac.h(),
      eaa.ad.h(),
      eaa.ae.h(),
      eaa.af.h(),
      eaa.ag.h(),
      eaa.ah.h()
   );
   int g_ = 0;
   ToIntFunction<alg<eaa>> h_ = ad.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eaa.P.h(), 1);
      $$0.put(eaa.Q.h(), 1);
      $$0.put(eaa.x.h(), 1);
      $$0.put(eaa.J.h(), 2);
      $$0.put(eaa.A.h(), 2);
      $$0.put(eaa.O.h(), 2);
      $$0.put(eaa.C.h(), 3);
      $$0.put(eaa.K.h(), 3);
      $$0.put(eaa.B.h(), 3);
      $$0.put(eaa.u.h(), 4);
      $$0.put(eaa.n.h(), 4);
      $$0.put(eaa.S.h(), 4);
      $$0.put(eaa.q.h(), 5);
      $$0.put(eaa.v.h(), 5);
      $$0.put(eaa.r.h(), 6);
      $$0.put(eaa.M.h(), 6);
      $$0.put(eaa.s.h(), 6);
      $$0.put(eaa.o.h(), 7);
      $$0.put(eaa.l.h(), 8);
      $$0.put(eaa.m.h(), 8);
      $$0.put(eaa.j.h(), 9);
      $$0.put(eaa.d.h(), 9);
      $$0.put(eaa.e.h(), 9);
      $$0.put(eaa.g.h(), 9);
      $$0.put(eaa.k.h(), 10);
      $$0.put(eaa.h.h(), 10);
      $$0.put(eaa.a.h(), 10);
      $$0.put(eaa.b.h(), 10);
      $$0.put(eaa.I.h(), 10);
      $$0.put(eaa.H.h(), 10);
      $$0.put(eaa.c.h(), 11);
      $$0.put(eaa.f.h(), 12);
      $$0.put(eaa.y.h(), 12);
      $$0.put(eaa.i.h(), 13);
      $$0.put(eaa.z.h(), 13);
      $$0.put(eaa.t.h(), 14);
      $$0.put(eaa.G.h(), 14);
      $$0.put(eaa.R.h(), 14);
      $$0.put(eaa.p.h(), 15);
      $$0.put(eaa.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   eaj.a gx();

   eaj.d gy();

   static int a_(jp<eaa> $$0) {
      return $$0.e().map(eaj::a).orElse(0);
   }

   static int a(alg<eaa> $$0) {
      return h_.applyAsInt($$0);
   }

   static alg<eaa> b(int $$0) {
      return f_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azj.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<eaj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eah.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  eai.a.fieldOf("selector").forGetter(eaj.a::a),
                  ays.l.fieldOf("event_delay").orElse(0).forGetter(eaj.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new eaj.a((eah)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eah c;
      private int d;
      final eai e;
      private boolean f;

      private a(@Nullable eah $$0, eai $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new eai(), 0, false);
      }

      public eai a() {
         return this.e;
      }

      @Nullable
      public eah b() {
         return this.c;
      }

      public void a(@Nullable eah $$0) {
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

   public static class b implements eac {
      private final eaj a;

      public b(eaj $$0) {
         this.a = $$0;
      }

      @Override
      public eae a() {
         return this.a.gy().b();
      }

      @Override
      public int b() {
         return this.a.gy().a();
      }

      @Override
      public boolean a(arm $$0, jp<eaa> $$1, eaa.a $$2, ezh $$3) {
         eaj.a $$4 = this.a.gx();
         eaj.d $$5 = this.a.gy();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<ezh> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               ezh $$7 = $$6.get();
               if (!$$5.a($$0, jg.a((jz)$$3), $$1, $$2)) {
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

      public void b(arm $$0, jp<eaa> $$1, eaa.a $$2, ezh $$3) {
         this.a.gy().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gx(), $$1, $$2, $$3, $$4));
      }

      private void a(arm $$0, eaj.a $$1, jp<eaa> $$2, eaa.a $$3, ezh $$4, ezh $$5) {
         $$1.e.a(new eah($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.aa());
      }

      public static float a(jg $$0, jg $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dev $$0, ezh $$1, ezh $$2) {
         ezh $$3 = new ezh((double)azj.a($$1.d) + 0.5, (double)azj.a($$1.e) + 0.5, (double)azj.a($$1.f) + 0.5);
         ezh $$4 = new ezh((double)azj.a($$2.d) + 0.5, (double)azj.a($$2.e) + 0.5, (double)azj.a($$2.f) + 0.5);

         for (jl $$5 : jl.values()) {
            ezh $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dec($$6, $$4, $$0x -> $$0x.a(awz.br))).d() != ezf.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dev $$0, eaj.a $$1, eaj.d $$2) {
         if ($$0 instanceof arm $$3) {
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

      private static void a(arm $$0, eaj.a $$1, eaj.d $$2) {
         $$1.a().a($$0.aa()).ifPresent($$3 -> {
            $$1.a($$3);
            ezh $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new lv($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arm $$0, eaj.a $$1, eaj.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               ezh $$3 = $$1.c.c();
               eae $$4 = $$2.b();
               ezh $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azj.d($$8, $$3.d, $$5.d);
               double $$10 = azj.d($$8, $$3.e, $$5.e);
               double $$11 = azj.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new lv($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arm $$0, eaj.a $$1, eaj.d $$2, eah $$3) {
         jg $$4 = jg.a((jz)$$3.c());
         jg $$5 = $$2.b().a($$0).map(jg::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), eaj.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dev $$0, jg $$1) {
         deb $$2 = new deb($$1);

         for (int $$3 = $$2.e - 1; $$3 <= $$2.e + 1; $$3++) {
            for (int $$4 = $$2.f - 1; $$4 <= $$2.f + 1; $$4++) {
               if (!$$0.a(deb.c($$3, $$4)) || $$0.P().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      eae b();

      boolean a(arm var1, jg var2, jp<eaa> var3, eaa.a var4);

      void a(arm var1, jg var2, jp<eaa> var3, @Nullable btz var4, @Nullable btz var5, float var6);

      default axp<eaa> c() {
         return axg.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azj.d($$0);
      }

      default boolean a(jp<eaa> $$0, eaa.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            btz $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.R_()) {
                  return false;
               }

               if ($$2.cf() && $$0.a(axg.d)) {
                  if (this.d() && $$2 instanceof arn $$3) {
                     an.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bi()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(awz.bs) : true;
         }
      }

      default void e() {
      }
   }
}
