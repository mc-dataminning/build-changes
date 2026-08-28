import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface egz {
   List<alq<egq>> c_ = List.of(
      egq.T.h(),
      egq.U.h(),
      egq.V.h(),
      egq.W.h(),
      egq.X.h(),
      egq.Y.h(),
      egq.Z.h(),
      egq.aa.h(),
      egq.ab.h(),
      egq.ac.h(),
      egq.ad.h(),
      egq.ae.h(),
      egq.af.h(),
      egq.ag.h(),
      egq.ah.h()
   );
   int d_ = 0;
   ToIntFunction<alq<egq>> e_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(egq.P.h(), 1);
      $$0.put(egq.Q.h(), 1);
      $$0.put(egq.x.h(), 1);
      $$0.put(egq.J.h(), 2);
      $$0.put(egq.A.h(), 2);
      $$0.put(egq.O.h(), 2);
      $$0.put(egq.C.h(), 3);
      $$0.put(egq.K.h(), 3);
      $$0.put(egq.B.h(), 3);
      $$0.put(egq.u.h(), 4);
      $$0.put(egq.n.h(), 4);
      $$0.put(egq.S.h(), 4);
      $$0.put(egq.q.h(), 5);
      $$0.put(egq.v.h(), 5);
      $$0.put(egq.r.h(), 6);
      $$0.put(egq.M.h(), 6);
      $$0.put(egq.s.h(), 6);
      $$0.put(egq.o.h(), 7);
      $$0.put(egq.l.h(), 8);
      $$0.put(egq.m.h(), 8);
      $$0.put(egq.j.h(), 9);
      $$0.put(egq.d.h(), 9);
      $$0.put(egq.e.h(), 9);
      $$0.put(egq.g.h(), 9);
      $$0.put(egq.k.h(), 10);
      $$0.put(egq.h.h(), 10);
      $$0.put(egq.a.h(), 10);
      $$0.put(egq.b.h(), 10);
      $$0.put(egq.I.h(), 10);
      $$0.put(egq.H.h(), 10);
      $$0.put(egq.c.h(), 11);
      $$0.put(egq.f.h(), 12);
      $$0.put(egq.y.h(), 12);
      $$0.put(egq.i.h(), 13);
      $$0.put(egq.z.h(), 13);
      $$0.put(egq.t.h(), 14);
      $$0.put(egq.G.h(), 14);
      $$0.put(egq.R.h(), 14);
      $$0.put(egq.p.h(), 15);
      $$0.put(egq.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   egz.a gw();

   egz.d gx();

   static int a_(jg<egq> $$0) {
      return $$0.e().map(egz::a).orElse(0);
   }

   static int a(alq<egq> $$0) {
      return e_.applyAsInt($$0);
   }

   static alq<egq> b(int $$0) {
      return c_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / (double)$$1;
      return Math.max(1, 15 - azz.a($$2 * (double)$$0));
   }

   public static final class a {
      public static Codec<egz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  egx.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  egy.a.fieldOf("selector").forGetter(egz.a::a),
                  azg.l.fieldOf("event_delay").orElse(0).forGetter(egz.a::c)
               )
               .apply($$0, ($$0x, $$1, $$2) -> new egz.a((egx)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      egx c;
      private int d;
      final egy e;
      private boolean f;

      private a(@Nullable egx $$0, egy $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new egy(), 0, false);
      }

      public egy a() {
         return this.e;
      }

      @Nullable
      public egx b() {
         return this.c;
      }

      public void a(@Nullable egx $$0) {
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

   public static class b implements egs {
      private final egz a;

      public b(egz $$0) {
         this.a = $$0;
      }

      @Override
      public egu a() {
         return this.a.gx().b();
      }

      @Override
      public int b() {
         return this.a.gx().a();
      }

      @Override
      public boolean a(asb $$0, jg<egq> $$1, egq.a $$2, fgc $$3) {
         egz.a $$4 = this.a.gw();
         egz.d $$5 = this.a.gx();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fgc> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fgc $$7 = $$6.get();
               if (!$$5.a($$0, iw.a((jq)$$3), $$1, $$2)) {
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

      public void b(asb $$0, jg<egq> $$1, egq.a $$2, fgc $$3) {
         this.a.gx().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gw(), $$1, $$2, $$3, $$4));
      }

      private void a(asb $$0, egz.a $$1, jg<egq> $$2, egq.a $$3, fgc $$4, fgc $$5) {
         $$1.e.a(new egx($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(iw $$0, iw $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dkj $$0, fgc $$1, fgc $$2) {
         fgc $$3 = new fgc((double)azz.a($$1.d) + 0.5, (double)azz.a($$1.e) + 0.5, (double)azz.a($$1.f) + 0.5);
         fgc $$4 = new fgc((double)azz.a($$2.d) + 0.5, (double)azz.a($$2.e) + 0.5, (double)azz.a($$2.f) + 0.5);

         for (jc $$5 : jc.values()) {
            fgc $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new djp($$6, $$4, $$0x -> $$0x.a(axn.bt))).d() != fga.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dkj $$0, egz.a $$1, egz.d $$2) {
         if ($$0 instanceof asb $$3) {
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

      private static void a(asb $$0, egz.a $$1, egz.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fgc $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new mf($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(asb $$0, egz.a $$1, egz.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fgc $$3 = $$1.c.c();
               egu $$4 = $$2.b();
               fgc $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / (double)$$7;
               double $$9 = azz.d($$8, $$3.d, $$5.d);
               double $$10 = azz.d($$8, $$3.e, $$5.e);
               double $$11 = azz.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new mf($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(asb $$0, egz.a $$1, egz.d $$2, egx $$3) {
         iw $$4 = iw.a((jq)$$3.c());
         iw $$5 = $$2.b().a($$0).map(iw::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), egz.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dkj $$0, iw $$1) {
         djo $$2 = new djo($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(djo.c($$3, $$4)) || $$0.S().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      egu b();

      boolean a(asb var1, iw var2, jg<egq> var3, egq.a var4);

      void a(asb var1, iw var2, jg<egq> var3, @Nullable bxe var4, @Nullable bxe var5, float var6);

      default ayc<egq> c() {
         return axt.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return azz.d($$0);
      }

      default boolean a(jg<egq> $$0, egq.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bxe $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.ak()) {
                  return false;
               }

               if ($$2.cd() && $$0.a(axt.d)) {
                  if (this.d() && $$2 instanceof asc $$3) {
                     aq.ab.a($$3);
                  }

                  return false;
               }

               if ($$2.bg()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(axn.bu) : true;
         }
      }

      default void e() {
      }
   }
}
