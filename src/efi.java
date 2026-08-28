import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface efi {
   List<alf<eez>> d_ = List.of(
      eez.T.h(),
      eez.U.h(),
      eez.V.h(),
      eez.W.h(),
      eez.X.h(),
      eez.Y.h(),
      eez.Z.h(),
      eez.aa.h(),
      eez.ab.h(),
      eez.ac.h(),
      eez.ad.h(),
      eez.ae.h(),
      eez.af.h(),
      eez.ag.h(),
      eez.ah.h()
   );
   int e_ = 0;
   ToIntFunction<alf<eez>> f_ = af.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eez.P.h(), 1);
      $$0.put(eez.Q.h(), 1);
      $$0.put(eez.x.h(), 1);
      $$0.put(eez.J.h(), 2);
      $$0.put(eez.A.h(), 2);
      $$0.put(eez.O.h(), 2);
      $$0.put(eez.C.h(), 3);
      $$0.put(eez.K.h(), 3);
      $$0.put(eez.B.h(), 3);
      $$0.put(eez.u.h(), 4);
      $$0.put(eez.n.h(), 4);
      $$0.put(eez.S.h(), 4);
      $$0.put(eez.q.h(), 5);
      $$0.put(eez.v.h(), 5);
      $$0.put(eez.r.h(), 6);
      $$0.put(eez.M.h(), 6);
      $$0.put(eez.s.h(), 6);
      $$0.put(eez.o.h(), 7);
      $$0.put(eez.l.h(), 8);
      $$0.put(eez.m.h(), 8);
      $$0.put(eez.j.h(), 9);
      $$0.put(eez.d.h(), 9);
      $$0.put(eez.e.h(), 9);
      $$0.put(eez.g.h(), 9);
      $$0.put(eez.k.h(), 10);
      $$0.put(eez.h.h(), 10);
      $$0.put(eez.a.h(), 10);
      $$0.put(eez.b.h(), 10);
      $$0.put(eez.I.h(), 10);
      $$0.put(eez.H.h(), 10);
      $$0.put(eez.c.h(), 11);
      $$0.put(eez.f.h(), 12);
      $$0.put(eez.y.h(), 12);
      $$0.put(eez.i.h(), 13);
      $$0.put(eez.z.h(), 13);
      $$0.put(eez.t.h(), 14);
      $$0.put(eez.G.h(), 14);
      $$0.put(eez.R.h(), 14);
      $$0.put(eez.p.h(), 15);
      $$0.put(eez.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   efi.a x();

   efi.d gq();

   static int a_(je<eez> $$0) {
      return $$0.e().map(efi::a).orElse(0);
   }

   static int a(alf<eez> $$0) {
      return f_.applyAsInt($$0);
   }

   static alf<eez> b(int $$0) {
      return d_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azm.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<efi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  efg.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  efh.a.fieldOf("selector").forGetter(efi.a::a),
                  ayu.l.fieldOf("event_delay").orElse(0).forGetter(efi.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new efi.a((efg)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      efg c;
      private int d;
      final efh e;
      private boolean f;

      private a(@Nullable efg $$0, efh $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new efh(), 0, false);
      }

      public efh a() {
         return this.e;
      }

      @Nullable
      public efg b() {
         return this.c;
      }

      public void a(@Nullable efg $$0) {
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

   public static class b implements efb {
      private final efi a;

      public b(efi $$0) {
         this.a = $$0;
      }

      @Override
      public efd a() {
         return this.a.gq().b();
      }

      @Override
      public int b() {
         return this.a.gq().a();
      }

      @Override
      public boolean a(arq $$0, je<eez> $$1, eez.a $$2, fei $$3) {
         efi.a $$4 = this.a.x();
         efi.d $$5 = this.a.gq();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fei> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fei $$7 = $$6.get();
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

      public void b(arq $$0, je<eez> $$1, eez.a $$2, fei $$3) {
         this.a.gq().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.x(), $$1, $$2, $$3, $$4));
      }

      private void a(arq $$0, efi.a $$1, je<eez> $$2, eez.a $$3, fei $$4, fei $$5) {
         $$1.e.a(new efg($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iu $$0, iu $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(div $$0, fei $$1, fei $$2) {
         fei $$3 = new fei((double)azm.a($$1.d) + 0.5, (double)azm.a($$1.e) + 0.5, (double)azm.a($$1.f) + 0.5);
         fei $$4 = new fei((double)azm.a($$2.d) + 0.5, (double)azm.a($$2.e) + 0.5, (double)azm.a($$2.f) + 0.5);

         for (ja $$5 : ja.values()) {
            fei $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new did($$6, $$4, $$0x -> $$0x.a(axc.bs))).d() != feg.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(div $$0, efi.a $$1, efi.d $$2) {
         if ($$0 instanceof arq $$3) {
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

      private static void a(arq $$0, efi.a $$1, efi.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fei $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new md($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(arq $$0, efi.a $$1, efi.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fei $$3 = $$1.c.c();
               efd $$4 = $$2.b();
               fei $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azm.d($$8, $$3.d, $$5.d);
               double $$10 = azm.d($$8, $$3.e, $$5.e);
               double $$11 = azm.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new md($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(arq $$0, efi.a $$1, efi.d $$2, efg $$3) {
         iu $$4 = iu.a((jo)$$3.c());
         iu $$5 = $$2.b().a($$0).map(iu::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), efi.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(div $$0, iu $$1) {
         dic $$2 = new dic($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dic.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      efd b();

      boolean a(arq var1, iu var2, je<eez> var3, eez.a var4);

      void a(arq var1, iu var2, je<eez> var3, @Nullable bwd var4, @Nullable bwd var5, float var6);

      default axr<eez> c() {
         return axi.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azm.d($$0);
      }

      default boolean a(je<eez> $$0, eez.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bwd $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.U_()) {
                  return false;
               }

               if ($$2.ce() && $$0.a(axi.d)) {
                  if (this.d() && $$2 instanceof arr $$3) {
                     ap.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bh()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axc.bt) : true;
         }
      }

      default void e() {
      }
   }
}
