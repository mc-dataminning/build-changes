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

public record dff(ww e, dff.c f, ji<dff> g, kg h) {
   public static final int a = 255;
   public static final Codec<dff> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wy.a.fieldOf("description").forGetter(dff::f),
               dff.c.a.forGetter(dff::g),
               jt.a(mg.aP).optionalFieldOf("exclusive_set", ji.a()).forGetter(dff::h),
               dfg.b.optionalFieldOf("effects", kg.a).forGetter(dff::i)
            )
            .apply($$0, dff::new)
   );
   public static final Codec<je<dff>> c = alb.a(mg.aP);
   public static final yu<wh, je<dff>> d = ys.b(mg.aP);

   public static dff.b a(int $$0) {
      return new dff.b($$0, 0);
   }

   public static dff.b a(int $$0, int $$1) {
      return new dff.b($$0, $$1);
   }

   public static dff.c a(ji<cyo> $$0, ji<cyo> $$1, int $$2, int $$3, dff.b $$4, dff.b $$5, int $$6, bwl... $$7) {
      return new dff.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dff.c a(ji<cyo> $$0, int $$1, int $$2, dff.b $$3, dff.b $$4, int $$5, bwl... $$6) {
      return new dff.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bwk, cys> a(bwz $$0) {
      Map<bwk, cys> $$1 = Maps.newEnumMap(bwk.class);

      for (bwk $$2 : bwk.j) {
         if (this.a($$2)) {
            cys $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ji<cyo> a() {
      return this.f.a();
   }

   public boolean a(bwk $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cys $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cys $$0) {
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

   public static boolean a(je<dff> $$0, je<dff> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static ww a(je<dff> $$0, int $$1) {
      xk $$2 = $$0.a().e.f();
      if ($$0.a(axc.o)) {
         wz.a($$2, xt.a.a(n.m));
      } else {
         wz.a($$2, xt.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wv.v).b(ww.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cys $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ki<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aro $$0, int $$1, bwa $$2, bup $$3) {
      eyn $$4 = b($$0, $$1, $$2, $$3);

      for (dfc<dfu> $$5 : this.a(dfg.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aro $$0, int $$1, cys $$2, bwa $$3, bup $$4, MutableFloat $$5) {
      eyn $$6 = b($$0, $$1, $$3, $$4);

      for (dfc<dfy> $$7 : this.a(dfg.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(aro $$0, int $$1, cys $$2, MutableFloat $$3) {
      this.a(dfg.k, $$0, $$1, $$2, $$3);
   }

   public void b(aro $$0, int $$1, cys $$2, MutableFloat $$3) {
      this.a(dfg.p, $$0, $$1, $$2, $$3);
   }

   public void c(aro $$0, int $$1, cys $$2, MutableFloat $$3) {
      this.a(dfg.q, $$0, $$1, $$2, $$3);
   }

   public void d(aro $$0, int $$1, cys $$2, MutableFloat $$3) {
      this.a(dfg.x, $$0, $$1, $$2, $$3);
   }

   public void a(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aro $$0, int $$1, cys $$2, MutableFloat $$3) {
      this.a(dfg.z, $$0, $$1, $$2, $$3);
   }

   public void b(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azt $$0, int $$1, MutableFloat $$2) {
      this.a(dfg.F, $$0, $$1, $$2);
   }

   public void c(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aro $$0, int $$1, cys $$2, bwa $$3, bup $$4, MutableFloat $$5) {
      this.a(dfg.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aro $$0, int $$1, cys $$2, bwa $$3, bup $$4, MutableFloat $$5) {
      this.a(dfg.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aro $$0, int $$1, cys $$2, bwa $$3, bup $$4, MutableFloat $$5) {
      this.a(dfg.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aro $$0, int $$1, cys $$2, bwa $$3, bup $$4, MutableFloat $$5) {
      this.a(dfg.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(aro $$0, int $$1, dfe $$2, dfj $$3, bwa $$4, bup $$5) {
      for (dfo<dfw> $$6 : this.a(dfg.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dfo<dfw> $$0, aro $$1, int $$2, dfe $$3, bwa $$4, bup $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwa $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aro $$0, int $$1, cys $$2, bwa $$3, MutableFloat $$4) {
      this.a(dfg.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azt $$0, int $$1, MutableFloat $$2) {
      this.a(dfg.A, $$0, $$1, $$2);
   }

   public void a(ki<dfy> $$0, azt $$1, int $$2, MutableFloat $$3) {
      dfy $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aro $$0, int $$1, dfe $$2, bwa $$3) {
      a(this.a(dfg.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(aro $$0, int $$1, dfe $$2, bwa $$3) {
      a(this.a(dfg.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4, dzo $$5) {
      a(this.a(dfg.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ki<List<dfc<dfy>>> $$0, aro $$1, int $$2, cys $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(ki<List<dfc<dfy>>> $$0, aro $$1, int $$2, cys $$3, bwa $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ki<List<dfc<dfy>>> $$0, aro $$1, int $$2, cys $$3, bwa $$4, bup $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static eyn b(aro $$0, int $$1, bwa $$2, bup $$3) {
      eyq $$4 = new eyq.a($$0).a(fbh.a, $$2).a(fbh.k, $$1).a(fbh.f, $$2.dt()).a(fbh.c, $$3).b(fbh.d, $$3.d()).b(fbh.e, $$3.c()).a(fbg.t);
      return new eyn.a($$4).a(Optional.empty());
   }

   private static eyn a(aro $$0, int $$1, cys $$2) {
      eyq $$3 = new eyq.a($$0).a(fbh.i, $$2).a(fbh.k, $$1).a(fbg.u);
      return new eyn.a($$3).a(Optional.empty());
   }

   private static eyn a(aro $$0, int $$1, bwa $$2, boolean $$3) {
      eyq $$4 = new eyq.a($$0).a(fbh.a, $$2).a(fbh.k, $$1).a(fbh.f, $$2.dt()).a(fbh.l, $$3).a(fbg.v);
      return new eyn.a($$4).a(Optional.empty());
   }

   private static eyn a(aro $$0, int $$1, bwa $$2, fdw $$3) {
      eyq $$4 = new eyq.a($$0).a(fbh.a, $$2).a(fbh.k, $$1).a(fbh.f, $$3).a(fbg.w);
      return new eyn.a($$4).a(Optional.empty());
   }

   private static eyn a(aro $$0, int $$1, bwa $$2, fdw $$3, dzo $$4) {
      eyq $$5 = new eyq.a($$0).a(fbh.a, $$2).a(fbh.k, $$1).a(fbh.f, $$3).a(fbh.g, $$4).a(fbg.x);
      return new eyn.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dfc<T>> $$0, eyn $$1, Consumer<T> $$2) {
      for (dfc<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aro $$0, int $$1, dfe $$2, bwz $$3) {
      bwk $$4 = $$2.b();
      if ($$4 != null) {
         Map<dff, Set<dfx>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dfx> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dfx> $$7 = $$5.get(this);

            for (dfc<dfx> $$8 : this.a(dfg.n)) {
               dfx $$9 = $$8.a();
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

   public void a(int $$0, dfe $$1, bwz $$2) {
      bwk $$3 = $$1.b();
      if ($$3 != null) {
         Set<dfx> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dfx $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dff.a a(dff.c $$0) {
      return new dff.a($$0);
   }

   public ww f() {
      return this.e;
   }

   public dff.c g() {
      return this.f;
   }

   public ji<dff> h() {
      return this.g;
   }

   public kg i() {
      return this.h;
   }

   public static class a {
      private final dff.c a;
      private ji<dff> b = ji.a();
      private final Map<ki<?>, List<?>> c = new HashMap<>();
      private final kg.a d = kg.a();

      public a(dff.c $$0) {
         this.a = $$0;
      }

      public dff.a a(ji<dff> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dff.a a(ki<List<dfc<E>>> $$0, E $$1, fbw.a $$2) {
         this.b($$0).add(new dfc<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dff.a a(ki<List<dfc<E>>> $$0, E $$1) {
         this.b($$0).add(new dfc<>($$1, Optional.empty()));
         return this;
      }

      public <E> dff.a a(ki<List<dfo<E>>> $$0, dfj $$1, dfj $$2, E $$3, fbw.a $$4) {
         this.b($$0).add(new dfo<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dff.a a(ki<List<dfo<E>>> $$0, dfj $$1, dfj $$2, E $$3) {
         this.b($$0).add(new dfo<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dff.a a(ki<List<dfv>> $$0, dfv $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dff.a b(ki<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dff.a a(ki<bas> $$0) {
         this.d.a($$0, bas.a);
         return this;
      }

      private <E> List<E> b(ki<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dff a(ale $$0) {
         return new dff(ww.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dff.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dff.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dff.b::b)).apply($$0, dff.b::new)
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

   public static record c(ji<cyo> b, Optional<ji<cyo>> c, int d, int e, dff.b f, dff.b g, int h, List<bwl> i) {
      public static final MapCodec<dff.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.K).fieldOf("supported_items").forGetter(dff.c::a),
                  jt.a(mg.K).optionalFieldOf("primary_items").forGetter(dff.c::b),
                  ays.a(1, 1024).fieldOf("weight").forGetter(dff.c::c),
                  ays.a(1, 255).fieldOf("max_level").forGetter(dff.c::d),
                  dff.b.a.fieldOf("min_cost").forGetter(dff.c::e),
                  dff.b.a.fieldOf("max_cost").forGetter(dff.c::f),
                  ays.l.fieldOf("anvil_cost").forGetter(dff.c::g),
                  bwl.m.listOf().fieldOf("slots").forGetter(dff.c::h)
               )
               .apply($$0, dff.c::new)
      );

      public ji<cyo> a() {
         return this.b;
      }

      public Optional<ji<cyo>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dff.b e() {
         return this.f;
      }

      public dff.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bwl> h() {
         return this.i;
      }
   }
}
