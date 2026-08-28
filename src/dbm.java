import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableFloat;

public record dbm(xh e, dbm.c f, jt<dbm> g, kp h) {
   public static final int a = 255;
   public static final Codec<dbm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xj.a.fieldOf("description").forGetter(dbm::f),
               dbm.c.a.forGetter(dbm::g),
               ke.a(ly.aM).optionalFieldOf("exclusive_set", jt.a()).forGetter(dbm::h),
               dbn.b.optionalFieldOf("effects", kp.a).forGetter(dbm::i)
            )
            .apply($$0, dbm::new)
   );
   public static final Codec<jp<dbm>> c = ale.a(ly.aM);
   public static final zf<ws, jp<dbm>> d = zd.b(ly.aM);

   public static dbm.b a(int $$0) {
      return new dbm.b($$0, 0);
   }

   public static dbm.b a(int $$0, int $$1) {
      return new dbm.b($$0, $$1);
   }

   public static dbm.c a(jt<cvt> $$0, jt<cvt> $$1, int $$2, int $$3, dbm.b $$4, dbm.b $$5, int $$6, bui... $$7) {
      return new dbm.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dbm.c a(jt<cvt> $$0, int $$1, int $$2, dbm.b $$3, dbm.b $$4, int $$5, bui... $$6) {
      return new dbm.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<buh, cvx> a(buv $$0) {
      Map<buh, cvx> $$1 = Maps.newEnumMap(buh.class);

      for (buh $$2 : buh.i) {
         if (this.a($$2)) {
            cvx $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jt<cvt> a() {
      return this.f.a();
   }

   public boolean a(buh $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cvx $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cvx $$0) {
      return $$0.a(this.f.b);
   }

   public int b() {
      return this.f.c();
   }

   public int c() {
      return this.f.g();
   }

   public int d() {
      return 1;
   }

   public int e() {
      return this.f.d();
   }

   public int b(int $$0) {
      return this.f.e().a($$0);
   }

   public int c(int $$0) {
      return this.f.f().a($$0);
   }

   @Override
   public String toString() {
      return "Enchantment " + this.e.getString();
   }

   public static boolean a(jp<dbm> $$0, jp<dbm> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xh a(jp<dbm> $$0, int $$1) {
      xv $$2 = $$0.a().e.f();
      if ($$0.a(axc.o)) {
         xk.a($$2, ye.a.a(n.m));
      } else {
         xk.a($$2, ye.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xg.v).b(xh.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cvx $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ks<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arm $$0, int $$1, btz $$2, bsp $$3) {
      etw $$4 = b($$0, $$1, $$2, $$3);

      for (dbj<dca> $$5 : this.a(dbn.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arm $$0, int $$1, cvx $$2, btz $$3, bsp $$4, MutableFloat $$5) {
      etw $$6 = b($$0, $$1, $$3, $$4);

      for (dbj<dcf> $$7 : this.a(dbn.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.ea(), $$5.floatValue()));
         }
      }
   }

   public void a(arm $$0, int $$1, cvx $$2, MutableFloat $$3) {
      this.a(dbn.k, $$0, $$1, $$2, $$3);
   }

   public void b(arm $$0, int $$1, cvx $$2, MutableFloat $$3) {
      this.a(dbn.p, $$0, $$1, $$2, $$3);
   }

   public void c(arm $$0, int $$1, cvx $$2, MutableFloat $$3) {
      this.a(dbn.q, $$0, $$1, $$2, $$3);
   }

   public void d(arm $$0, int $$1, cvx $$2, MutableFloat $$3) {
      this.a(dbn.x, $$0, $$1, $$2, $$3);
   }

   public void a(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arm $$0, int $$1, cvx $$2, MutableFloat $$3) {
      this.a(dbn.z, $$0, $$1, $$2, $$3);
   }

   public void b(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azr $$0, int $$1, MutableFloat $$2) {
      this.a(dbn.F, $$0, $$1, $$2);
   }

   public void c(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arm $$0, int $$1, cvx $$2, btz $$3, bsp $$4, MutableFloat $$5) {
      this.a(dbn.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arm $$0, int $$1, cvx $$2, btz $$3, bsp $$4, MutableFloat $$5) {
      this.a(dbn.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arm $$0, int $$1, cvx $$2, btz $$3, bsp $$4, MutableFloat $$5) {
      this.a(dbn.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arm $$0, int $$1, cvx $$2, btz $$3, bsp $$4, MutableFloat $$5) {
      this.a(dbn.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arm $$0, int $$1, dbl $$2, dbq $$3, btz $$4, bsp $$5) {
      for (dbv<dcd> $$6 : this.a(dbn.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dbv<dcd> $$0, arm $$1, int $$2, dbl $$3, btz $$4, bsp $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         btz $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dv());
         }
      }
   }

   public void e(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arm $$0, int $$1, cvx $$2, btz $$3, MutableFloat $$4) {
      this.a(dbn.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azr $$0, int $$1, MutableFloat $$2) {
      this.a(dbn.A, $$0, $$1, $$2);
   }

   public void a(ks<dcf> $$0, azr $$1, int $$2, MutableFloat $$3) {
      dcf $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arm $$0, int $$1, dbl $$2, btz $$3) {
      a(this.a(dbn.o), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void b(arm $$0, int $$1, dbl $$2, btz $$3) {
      a(this.a(dbn.r), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4, dvd $$5) {
      a(this.a(dbn.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ks<List<dbj<dcf>>> $$0, arm $$1, int $$2, cvx $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(ks<List<dbj<dcf>>> $$0, arm $$1, int $$2, cvx $$3, btz $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dv()), $$3x -> $$5.setValue($$3x.a($$2, $$4.ea(), $$5.floatValue())));
   }

   private void a(ks<List<dbj<dcf>>> $$0, arm $$1, int $$2, cvx $$3, btz $$4, bsp $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.ea(), $$6.floatValue())));
   }

   public static etw b(arm $$0, int $$1, btz $$2, bsp $$3) {
      etz $$4 = new etz.a($$0).a(ews.a, $$2).a(ews.k, $$1).a(ews.f, $$2.dv()).a(ews.c, $$3).b(ews.d, $$3.d()).b(ews.e, $$3.c()).a(ewr.t);
      return new etw.a($$4).a(Optional.empty());
   }

   private static etw a(arm $$0, int $$1, cvx $$2) {
      etz $$3 = new etz.a($$0).a(ews.i, $$2).a(ews.k, $$1).a(ewr.u);
      return new etw.a($$3).a(Optional.empty());
   }

   private static etw a(arm $$0, int $$1, btz $$2, boolean $$3) {
      etz $$4 = new etz.a($$0).a(ews.a, $$2).a(ews.k, $$1).a(ews.f, $$2.dv()).a(ews.l, $$3).a(ewr.v);
      return new etw.a($$4).a(Optional.empty());
   }

   private static etw a(arm $$0, int $$1, btz $$2, ezh $$3) {
      etz $$4 = new etz.a($$0).a(ews.a, $$2).a(ews.k, $$1).a(ews.f, $$3).a(ewr.w);
      return new etw.a($$4).a(Optional.empty());
   }

   private static etw a(arm $$0, int $$1, btz $$2, ezh $$3, dvd $$4) {
      etz $$5 = new etz.a($$0).a(ews.a, $$2).a(ews.k, $$1).a(ews.f, $$3).a(ews.g, $$4).a(ewr.x);
      return new etw.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dbj<T>> $$0, etw $$1, Consumer<T> $$2) {
      for (dbj<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arm $$0, int $$1, dbl $$2, buv $$3) {
      buh $$4 = $$2.b();
      if ($$4 != null) {
         Map<dbm, Set<dce>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dce> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dv(), $$1));
            }
         } else {
            Set<dce> $$7 = $$5.get(this);

            for (dbj<dce> $$8 : this.a(dbn.n)) {
               dce $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dv(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dv(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dbl $$1, buv $$2) {
      buh $$3 = $$1.b();
      if ($$3 != null) {
         Set<dce> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dce $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dv(), $$0);
            }
         }
      }
   }

   public static dbm.a a(dbm.c $$0) {
      return new dbm.a($$0);
   }

   public xh f() {
      return this.e;
   }

   public dbm.c g() {
      return this.f;
   }

   public jt<dbm> h() {
      return this.g;
   }

   public kp i() {
      return this.h;
   }

   public static class a {
      private final dbm.c a;
      private jt<dbm> b = jt.a();
      private final Map<ks<?>, List<?>> c = new HashMap<>();
      private final kp.a d = kp.a();

      public a(dbm.c $$0) {
         this.a = $$0;
      }

      public dbm.a a(jt<dbm> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dbm.a a(ks<List<dbj<E>>> $$0, E $$1, exh.a $$2) {
         this.b($$0).add(new dbj<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dbm.a a(ks<List<dbj<E>>> $$0, E $$1) {
         this.b($$0).add(new dbj<>($$1, Optional.empty()));
         return this;
      }

      public <E> dbm.a a(ks<List<dbv<E>>> $$0, dbq $$1, dbq $$2, E $$3, exh.a $$4) {
         this.b($$0).add(new dbv<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dbm.a a(ks<List<dbv<E>>> $$0, dbq $$1, dbq $$2, E $$3) {
         this.b($$0).add(new dbv<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dbm.a a(ks<List<dcc>> $$0, dcc $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dbm.a b(ks<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dbm.a a(ks<bao> $$0) {
         this.d.a($$0, bao.a);
         return this;
      }

      private <E> List<E> b(ks<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dbm a(alh $$0) {
         return new dbm(xh.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dbm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dbm.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dbm.b::b)).apply($$0, dbm.b::new)
      );

      public int a(int $$0) {
         return this.b + this.c * ($$0 - 1);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(jt<cvt> b, Optional<jt<cvt>> c, int d, int e, dbm.b f, dbm.b g, int h, List<bui> i) {
      public static final MapCodec<dbm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ke.a(ly.K).fieldOf("supported_items").forGetter(dbm.c::a),
                  ke.a(ly.K).optionalFieldOf("primary_items").forGetter(dbm.c::b),
                  ays.a(1, 1024).fieldOf("weight").forGetter(dbm.c::c),
                  ays.a(1, 255).fieldOf("max_level").forGetter(dbm.c::d),
                  dbm.b.a.fieldOf("min_cost").forGetter(dbm.c::e),
                  dbm.b.a.fieldOf("max_cost").forGetter(dbm.c::f),
                  ays.l.fieldOf("anvil_cost").forGetter(dbm.c::g),
                  bui.l.listOf().fieldOf("slots").forGetter(dbm.c::h)
               )
               .apply($$0, dbm.c::new)
      );

      public jt<cvt> a() {
         return this.b;
      }

      public Optional<jt<cvt>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dbm.b e() {
         return this.f;
      }

      public dbm.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bui> h() {
         return this.i;
      }
   }
}
