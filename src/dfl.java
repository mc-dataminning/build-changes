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

public record dfl(wy e, dfl.c f, ji<dfl> g, kg h) {
   public static final int a = 255;
   public static final Codec<dfl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(dfl::f),
               dfl.c.a.forGetter(dfl::g),
               jt.a(mg.aQ).optionalFieldOf("exclusive_set", ji.a()).forGetter(dfl::h),
               dfm.b.optionalFieldOf("effects", kg.a).forGetter(dfl::i)
            )
            .apply($$0, dfl::new)
   );
   public static final Codec<je<dfl>> c = ald.a(mg.aQ);
   public static final yw<wj, je<dfl>> d = yu.b(mg.aQ);

   public static dfl.b a(int $$0) {
      return new dfl.b($$0, 0);
   }

   public static dfl.b a(int $$0, int $$1) {
      return new dfl.b($$0, $$1);
   }

   public static dfl.c a(ji<cyu> $$0, ji<cyu> $$1, int $$2, int $$3, dfl.b $$4, dfl.b $$5, int $$6, bwo... $$7) {
      return new dfl.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dfl.c a(ji<cyu> $$0, int $$1, int $$2, dfl.b $$3, dfl.b $$4, int $$5, bwo... $$6) {
      return new dfl.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bwn, cyy> a(bxc $$0) {
      Map<bwn, cyy> $$1 = Maps.newEnumMap(bwn.class);

      for (bwn $$2 : bwn.j) {
         if (this.a($$2)) {
            cyy $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ji<cyu> a() {
      return this.f.a();
   }

   public boolean a(bwn $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cyy $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cyy $$0) {
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

   public static boolean a(je<dfl> $$0, je<dfl> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wy a(je<dfl> $$0, int $$1) {
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

   public boolean c(cyy $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ki<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arq $$0, int $$1, bwd $$2, bus $$3) {
      eyz $$4 = b($$0, $$1, $$2, $$3);

      for (dfi<dga> $$5 : this.a(dfm.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arq $$0, int $$1, cyy $$2, bwd $$3, bus $$4, MutableFloat $$5) {
      eyz $$6 = b($$0, $$1, $$3, $$4);

      for (dfi<dge> $$7 : this.a(dfm.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(arq $$0, int $$1, cyy $$2, MutableFloat $$3) {
      this.a(dfm.k, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, cyy $$2, MutableFloat $$3) {
      this.a(dfm.p, $$0, $$1, $$2, $$3);
   }

   public void c(arq $$0, int $$1, cyy $$2, MutableFloat $$3) {
      this.a(dfm.q, $$0, $$1, $$2, $$3);
   }

   public void d(arq $$0, int $$1, cyy $$2, MutableFloat $$3) {
      this.a(dfm.x, $$0, $$1, $$2, $$3);
   }

   public void a(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arq $$0, int $$1, cyy $$2, MutableFloat $$3) {
      this.a(dfm.z, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfm.F, $$0, $$1, $$2);
   }

   public void c(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arq $$0, int $$1, cyy $$2, bwd $$3, bus $$4, MutableFloat $$5) {
      this.a(dfm.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arq $$0, int $$1, cyy $$2, bwd $$3, bus $$4, MutableFloat $$5) {
      this.a(dfm.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arq $$0, int $$1, cyy $$2, bwd $$3, bus $$4, MutableFloat $$5) {
      this.a(dfm.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arq $$0, int $$1, cyy $$2, bwd $$3, bus $$4, MutableFloat $$5) {
      this.a(dfm.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arq $$0, int $$1, dfk $$2, dfp $$3, bwd $$4, bus $$5) {
      for (dfu<dgc> $$6 : this.a(dfm.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dfu<dgc> $$0, arq $$1, int $$2, dfk $$3, bwd $$4, bus $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwd $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arq $$0, int $$1, cyy $$2, bwd $$3, MutableFloat $$4) {
      this.a(dfm.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfm.A, $$0, $$1, $$2);
   }

   public void a(ki<dge> $$0, azv $$1, int $$2, MutableFloat $$3) {
      dge $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arq $$0, int $$1, dfk $$2, bwd $$3) {
      a(this.a(dfm.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(arq $$0, int $$1, dfk $$2, bwd $$3) {
      a(this.a(dfm.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4, dzz $$5) {
      a(this.a(dfm.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ki<List<dfi<dge>>> $$0, arq $$1, int $$2, cyy $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(ki<List<dfi<dge>>> $$0, arq $$1, int $$2, cyy $$3, bwd $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ki<List<dfi<dge>>> $$0, arq $$1, int $$2, cyy $$3, bwd $$4, bus $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static eyz b(arq $$0, int $$1, bwd $$2, bus $$3) {
      ezc $$4 = new ezc.a($$0).a(fbt.a, $$2).a(fbt.k, $$1).a(fbt.f, $$2.dt()).a(fbt.c, $$3).b(fbt.d, $$3.d()).b(fbt.e, $$3.c()).a(fbs.t);
      return new eyz.a($$4).a(Optional.empty());
   }

   private static eyz a(arq $$0, int $$1, cyy $$2) {
      ezc $$3 = new ezc.a($$0).a(fbt.i, $$2).a(fbt.k, $$1).a(fbs.u);
      return new eyz.a($$3).a(Optional.empty());
   }

   private static eyz a(arq $$0, int $$1, bwd $$2, boolean $$3) {
      ezc $$4 = new ezc.a($$0).a(fbt.a, $$2).a(fbt.k, $$1).a(fbt.f, $$2.dt()).a(fbt.l, $$3).a(fbs.v);
      return new eyz.a($$4).a(Optional.empty());
   }

   private static eyz a(arq $$0, int $$1, bwd $$2, fei $$3) {
      ezc $$4 = new ezc.a($$0).a(fbt.a, $$2).a(fbt.k, $$1).a(fbt.f, $$3).a(fbs.w);
      return new eyz.a($$4).a(Optional.empty());
   }

   private static eyz a(arq $$0, int $$1, bwd $$2, fei $$3, dzz $$4) {
      ezc $$5 = new ezc.a($$0).a(fbt.a, $$2).a(fbt.k, $$1).a(fbt.f, $$3).a(fbt.g, $$4).a(fbs.x);
      return new eyz.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dfi<T>> $$0, eyz $$1, Consumer<T> $$2) {
      for (dfi<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arq $$0, int $$1, dfk $$2, bxc $$3) {
      bwn $$4 = $$2.b();
      if ($$4 != null) {
         Map<dfl, Set<dgd>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dgd> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dgd> $$7 = $$5.get(this);

            for (dfi<dgd> $$8 : this.a(dfm.n)) {
               dgd $$9 = $$8.a();
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

   public void a(int $$0, dfk $$1, bxc $$2) {
      bwn $$3 = $$1.b();
      if ($$3 != null) {
         Set<dgd> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dgd $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dfl.a a(dfl.c $$0) {
      return new dfl.a($$0);
   }

   public wy f() {
      return this.e;
   }

   public dfl.c g() {
      return this.f;
   }

   public ji<dfl> h() {
      return this.g;
   }

   public kg i() {
      return this.h;
   }

   public static class a {
      private final dfl.c a;
      private ji<dfl> b = ji.a();
      private final Map<ki<?>, List<?>> c = new HashMap<>();
      private final kg.a d = kg.a();

      public a(dfl.c $$0) {
         this.a = $$0;
      }

      public dfl.a a(ji<dfl> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dfl.a a(ki<List<dfi<E>>> $$0, E $$1, fci.a $$2) {
         this.b($$0).add(new dfi<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dfl.a a(ki<List<dfi<E>>> $$0, E $$1) {
         this.b($$0).add(new dfi<>($$1, Optional.empty()));
         return this;
      }

      public <E> dfl.a a(ki<List<dfu<E>>> $$0, dfp $$1, dfp $$2, E $$3, fci.a $$4) {
         this.b($$0).add(new dfu<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dfl.a a(ki<List<dfu<E>>> $$0, dfp $$1, dfp $$2, E $$3) {
         this.b($$0).add(new dfu<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dfl.a a(ki<List<dgb>> $$0, dgb $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dfl.a b(ki<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dfl.a a(ki<bau> $$0) {
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

      public dfl a(alg $$0) {
         return new dfl(wy.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dfl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dfl.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dfl.b::b)).apply($$0, dfl.b::new)
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

   public static record c(ji<cyu> b, Optional<ji<cyu>> c, int d, int e, dfl.b f, dfl.b g, int h, List<bwo> i) {
      public static final MapCodec<dfl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jt.a(mg.K).fieldOf("supported_items").forGetter(dfl.c::a),
                  jt.a(mg.K).optionalFieldOf("primary_items").forGetter(dfl.c::b),
                  ayu.a(1, 1024).fieldOf("weight").forGetter(dfl.c::c),
                  ayu.a(1, 255).fieldOf("max_level").forGetter(dfl.c::d),
                  dfl.b.a.fieldOf("min_cost").forGetter(dfl.c::e),
                  dfl.b.a.fieldOf("max_cost").forGetter(dfl.c::f),
                  ayu.l.fieldOf("anvil_cost").forGetter(dfl.c::g),
                  bwo.m.listOf().fieldOf("slots").forGetter(dfl.c::h)
               )
               .apply($$0, dfl.c::new)
      );

      public ji<cyu> a() {
         return this.b;
      }

      public Optional<ji<cyu>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dfl.b e() {
         return this.f;
      }

      public dfl.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bwo> h() {
         return this.i;
      }
   }
}
