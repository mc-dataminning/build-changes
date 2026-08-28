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

public record dfq(wy e, dfq.c f, ji<dfq> g, kg h) {
   public static final int a = 255;
   public static final Codec<dfq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(dfq::f),
               dfq.c.a.forGetter(dfq::g),
               jt.a(mg.aR).optionalFieldOf("exclusive_set", ji.a()).forGetter(dfq::h),
               dfr.b.optionalFieldOf("effects", kg.a).forGetter(dfq::i)
            )
            .apply($$0, dfq::new)
   );
   public static final Codec<je<dfq>> c = ald.a(mg.aR);
   public static final yw<wj, je<dfq>> d = yu.b(mg.aR);

   public static dfq.b a(int $$0) {
      return new dfq.b($$0, 0);
   }

   public static dfq.b a(int $$0, int $$1) {
      return new dfq.b($$0, $$1);
   }

   public static dfq.c a(ji<cyz> $$0, ji<cyz> $$1, int $$2, int $$3, dfq.b $$4, dfq.b $$5, int $$6, bwq... $$7) {
      return new dfq.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dfq.c a(ji<cyz> $$0, int $$1, int $$2, dfq.b $$3, dfq.b $$4, int $$5, bwq... $$6) {
      return new dfq.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bwp, czd> a(bxe $$0) {
      Map<bwp, czd> $$1 = Maps.newEnumMap(bwp.class);

      for (bwp $$2 : bwp.j) {
         if (this.a($$2)) {
            czd $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ji<cyz> a() {
      return this.f.a();
   }

   public boolean a(bwp $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(czd $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(czd $$0) {
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

   public static boolean a(je<dfq> $$0, je<dfq> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wy a(je<dfq> $$0, int $$1) {
      xm $$2 = $$0.a().e.f();
      if ($$0.a(axe.o)) {
         xb.a($$2, xv.a.a(n.m));
      } else {
         xb.a($$2, xv.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wx.v).b(wy.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(czd $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ki<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arq $$0, int $$1, bwf $$2, buu $$3) {
      ezh $$4 = b($$0, $$1, $$2, $$3);

      for (dfn<dgf> $$5 : this.a(dfr.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arq $$0, int $$1, czd $$2, bwf $$3, buu $$4, MutableFloat $$5) {
      ezh $$6 = b($$0, $$1, $$3, $$4);

      for (dfn<dgj> $$7 : this.a(dfr.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(arq $$0, int $$1, czd $$2, MutableFloat $$3) {
      this.a(dfr.k, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czd $$2, MutableFloat $$3) {
      this.a(dfr.p, $$0, $$1, $$2, $$3);
   }

   public void c(arq $$0, int $$1, czd $$2, MutableFloat $$3) {
      this.a(dfr.q, $$0, $$1, $$2, $$3);
   }

   public void d(arq $$0, int $$1, czd $$2, MutableFloat $$3) {
      this.a(dfr.x, $$0, $$1, $$2, $$3);
   }

   public void a(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arq $$0, int $$1, czd $$2, MutableFloat $$3) {
      this.a(dfr.z, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfr.F, $$0, $$1, $$2);
   }

   public void c(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arq $$0, int $$1, czd $$2, bwf $$3, buu $$4, MutableFloat $$5) {
      this.a(dfr.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arq $$0, int $$1, czd $$2, bwf $$3, buu $$4, MutableFloat $$5) {
      this.a(dfr.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arq $$0, int $$1, czd $$2, bwf $$3, buu $$4, MutableFloat $$5) {
      this.a(dfr.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arq $$0, int $$1, czd $$2, bwf $$3, buu $$4, MutableFloat $$5) {
      this.a(dfr.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arq $$0, int $$1, dfp $$2, dfu $$3, bwf $$4, buu $$5) {
      for (dfz<dgh> $$6 : this.a(dfr.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dfz<dgh> $$0, arq $$1, int $$2, dfp $$3, bwf $$4, buu $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwf $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arq $$0, int $$1, czd $$2, bwf $$3, MutableFloat $$4) {
      this.a(dfr.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfr.A, $$0, $$1, $$2);
   }

   public void a(ki<dgj> $$0, azv $$1, int $$2, MutableFloat $$3) {
      dgj $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arq $$0, int $$1, dfp $$2, bwf $$3) {
      a(this.a(dfr.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(arq $$0, int $$1, dfp $$2, bwf $$3) {
      a(this.a(dfr.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4, eah $$5) {
      a(this.a(dfr.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ki<List<dfn<dgj>>> $$0, arq $$1, int $$2, czd $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(ki<List<dfn<dgj>>> $$0, arq $$1, int $$2, czd $$3, bwf $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ki<List<dfn<dgj>>> $$0, arq $$1, int $$2, czd $$3, bwf $$4, buu $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static ezh b(arq $$0, int $$1, bwf $$2, buu $$3) {
      ezk $$4 = new ezk.a($$0).a(fcb.a, $$2).a(fcb.k, $$1).a(fcb.f, $$2.dt()).a(fcb.c, $$3).b(fcb.d, $$3.d()).b(fcb.e, $$3.c()).a(fca.t);
      return new ezh.a($$4).a(Optional.empty());
   }

   private static ezh a(arq $$0, int $$1, czd $$2) {
      ezk $$3 = new ezk.a($$0).a(fcb.i, $$2).a(fcb.k, $$1).a(fca.u);
      return new ezh.a($$3).a(Optional.empty());
   }

   private static ezh a(arq $$0, int $$1, bwf $$2, boolean $$3) {
      ezk $$4 = new ezk.a($$0).a(fcb.a, $$2).a(fcb.k, $$1).a(fcb.f, $$2.dt()).a(fcb.l, $$3).a(fca.v);
      return new ezh.a($$4).a(Optional.empty());
   }

   private static ezh a(arq $$0, int $$1, bwf $$2, feq $$3) {
      ezk $$4 = new ezk.a($$0).a(fcb.a, $$2).a(fcb.k, $$1).a(fcb.f, $$3).a(fca.w);
      return new ezh.a($$4).a(Optional.empty());
   }

   private static ezh a(arq $$0, int $$1, bwf $$2, feq $$3, eah $$4) {
      ezk $$5 = new ezk.a($$0).a(fcb.a, $$2).a(fcb.k, $$1).a(fcb.f, $$3).a(fcb.g, $$4).a(fca.x);
      return new ezh.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dfn<T>> $$0, ezh $$1, Consumer<T> $$2) {
      for (dfn<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arq $$0, int $$1, dfp $$2, bxe $$3) {
      bwp $$4 = $$2.b();
      if ($$4 != null) {
         Map<dfq, Set<dgi>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dgi> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dgi> $$7 = $$5.get(this);

            for (dfn<dgi> $$8 : this.a(dfr.n)) {
               dgi $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dt(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dt(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dfp $$1, bxe $$2) {
      bwp $$3 = $$1.b();
      if ($$3 != null) {
         Set<dgi> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dgi $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dfq.a a(dfq.c $$0) {
      return new dfq.a($$0);
   }

   public wy f() {
      return this.e;
   }

   public dfq.c g() {
      return this.f;
   }

   public ji<dfq> h() {
      return this.g;
   }

   public kg i() {
      return this.h;
   }

   public static class a {
      private final dfq.c a;
      private ji<dfq> b = ji.a();
      private final Map<ki<?>, List<?>> c = new HashMap<>();
      private final kg.a d = kg.a();

      public a(dfq.c $$0) {
         this.a = $$0;
      }

      public dfq.a a(ji<dfq> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dfq.a a(ki<List<dfn<E>>> $$0, E $$1, fcq.a $$2) {
         this.b($$0).add(new dfn<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dfq.a a(ki<List<dfn<E>>> $$0, E $$1) {
         this.b($$0).add(new dfn<>($$1, Optional.empty()));
         return this;
      }

      public <E> dfq.a a(ki<List<dfz<E>>> $$0, dfu $$1, dfu $$2, E $$3, fcq.a $$4) {
         this.b($$0).add(new dfz<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dfq.a a(ki<List<dfz<E>>> $$0, dfu $$1, dfu $$2, E $$3) {
         this.b($$0).add(new dfz<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dfq.a a(ki<List<dgg>> $$0, dgg $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dfq.a b(ki<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dfq.a a(ki<bau> $$0) {
         this.d.a($$0, bau.a);
         return this;
      }

      private <E> List<E> b(ki<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dfq a(alg $$0) {
         return new dfq(wy.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dfq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dfq.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dfq.b::b)).apply($$0, dfq.b::new)
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

   public static record c(ji<cyz> b, Optional<ji<cyz>> c, int d, int e, dfq.b f, dfq.b g, int h, List<bwq> i) {
      public static final MapCodec<dfq.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.K).fieldOf("supported_items").forGetter(dfq.c::a),
                  jt.a(mg.K).optionalFieldOf("primary_items").forGetter(dfq.c::b),
                  ayu.a(1, 1024).fieldOf("weight").forGetter(dfq.c::c),
                  ayu.a(1, 255).fieldOf("max_level").forGetter(dfq.c::d),
                  dfq.b.a.fieldOf("min_cost").forGetter(dfq.c::e),
                  dfq.b.a.fieldOf("max_cost").forGetter(dfq.c::f),
                  ayu.l.fieldOf("anvil_cost").forGetter(dfq.c::g),
                  bwq.m.listOf().fieldOf("slots").forGetter(dfq.c::h)
               )
               .apply($$0, dfq.c::new)
      );

      public ji<cyz> a() {
         return this.b;
      }

      public Optional<ji<cyz>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dfq.b e() {
         return this.f;
      }

      public dfq.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bwq> h() {
         return this.i;
      }
   }
}
