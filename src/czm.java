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

public record czm(wu e, czm.c f, jn<czm> g, kj h) {
   public static final int a = 255;
   public static final Codec<czm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(czm::f),
               czm.c.a.forGetter(czm::g),
               jy.a(lr.aK).optionalFieldOf("exclusive_set", jn.a()).forGetter(czm::h),
               czn.b.optionalFieldOf("effects", kj.a).forGetter(czm::i)
            )
            .apply($$0, czm::new)
   );
   public static final Codec<jj<czm>> c = akh.a(lr.aK);
   public static final ys<wf, jj<czm>> d = yq.b(lr.aK);

   public static czm.b a(int $$0) {
      return new czm.b($$0, 0);
   }

   public static czm.b a(int $$0, int $$1) {
      return new czm.b($$0, $$1);
   }

   public static czm.c a(jn<cty> $$0, jn<cty> $$1, int $$2, int $$3, czm.b $$4, czm.b $$5, int $$6, bsp... $$7) {
      return new czm.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static czm.c a(jn<cty> $$0, int $$1, int $$2, czm.b $$3, czm.b $$4, int $$5, bsp... $$6) {
      return new czm.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bso, cud> a(btc $$0) {
      Map<bso, cud> $$1 = Maps.newEnumMap(bso.class);

      for (bso $$2 : bso.values()) {
         if (this.a($$2)) {
            cud $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jn<cty> a() {
      return this.f.a();
   }

   public boolean a(bso $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cud $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cud $$0) {
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

   public static boolean a(jj<czm> $$0, jj<czm> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wu a(jj<czm> $$0, int $$1) {
      xi $$2 = $$0.a().e.f();
      if ($$0.a(avz.o)) {
         wx.a($$2, xr.a.a(n.m));
      } else {
         wx.a($$2, xr.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wt.v).b(wu.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cud $$0) {
      return this.f.a().a($$0.h());
   }

   public <T> List<T> a(km<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aqm $$0, int $$1, bsh $$2, bra $$3) {
      eqw $$4 = b($$0, $$1, $$2, $$3);

      for (czk<czz> $$5 : this.a(czn.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aqm $$0, int $$1, cud $$2, bsh $$3, bra $$4, MutableFloat $$5) {
      eqw $$6 = b($$0, $$1, $$3, $$4);

      for (czk<dae> $$7 : this.a(czn.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dU(), $$5.floatValue()));
         }
      }
   }

   public void a(aqm $$0, int $$1, cud $$2, MutableFloat $$3) {
      this.a(czn.k, $$0, $$1, $$2, $$3);
   }

   public void b(aqm $$0, int $$1, cud $$2, MutableFloat $$3) {
      this.a(czn.p, $$0, $$1, $$2, $$3);
   }

   public void c(aqm $$0, int $$1, cud $$2, MutableFloat $$3) {
      this.a(czn.q, $$0, $$1, $$2, $$3);
   }

   public void d(aqm $$0, int $$1, cud $$2, MutableFloat $$3) {
      this.a(czn.x, $$0, $$1, $$2, $$3);
   }

   public void a(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqm $$0, int $$1, cud $$2, MutableFloat $$3) {
      this.a(czn.z, $$0, $$1, $$2, $$3);
   }

   public void b(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(ayo $$0, int $$1, MutableFloat $$2) {
      this.a(czn.F, $$0, $$1, $$2);
   }

   public void c(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aqm $$0, int $$1, cud $$2, bsh $$3, bra $$4, MutableFloat $$5) {
      this.a(czn.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aqm $$0, int $$1, cud $$2, bsh $$3, bra $$4, MutableFloat $$5) {
      this.a(czn.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aqm $$0, int $$1, cud $$2, bsh $$3, bra $$4, MutableFloat $$5) {
      this.a(czn.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aqm $$0, int $$1, cud $$2, bsh $$3, bra $$4, MutableFloat $$5) {
      this.a(czn.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(czu<dac> $$0, aqm $$1, int $$2, czl $$3, bsh $$4, bra $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bsh $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dp());
         }
      }
   }

   public void a(aqm $$0, int $$1, czl $$2, czq $$3, bsh $$4, bra $$5) {
      for (czu<dac> $$6 : this.a(czn.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aqm $$0, int $$1, cud $$2, bsh $$3, MutableFloat $$4) {
      this.a(czn.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ayo $$0, int $$1, MutableFloat $$2) {
      this.a(czn.A, $$0, $$1, $$2);
   }

   public void a(km<dae> $$0, ayo $$1, int $$2, MutableFloat $$3) {
      dae $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aqm $$0, int $$1, czl $$2, bsh $$3) {
      a(this.a(czn.o), a($$0, $$1, $$3, $$3.dp()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dp()));
   }

   public void b(aqm $$0, int $$1, czl $$2, bsh $$3) {
      a(this.a(czn.r), a($$0, $$1, $$3, $$3.dp()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dp()));
   }

   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      a(this.a(czn.j), a($$0, $$1, $$3, $$4), $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(km<List<czk<dae>>> $$0, aqm $$1, int $$2, cud $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(km<List<czk<dae>>> $$0, aqm $$1, int $$2, cud $$3, bsh $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dp()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dU(), $$5.floatValue())));
   }

   private void a(km<List<czk<dae>>> $$0, aqm $$1, int $$2, cud $$3, bsh $$4, bra $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dU(), $$6.floatValue())));
   }

   public static eqw b(aqm $$0, int $$1, bsh $$2, bra $$3) {
      eqz $$4 = new eqz.a($$0).a(ets.a, $$2).a(ets.k, $$1).a(ets.f, $$2.dp()).a(ets.c, $$3).b(ets.d, $$3.d()).b(ets.e, $$3.c()).a(etr.t);
      return new eqw.a($$4).a(Optional.empty());
   }

   private static eqw a(aqm $$0, int $$1, cud $$2) {
      eqz $$3 = new eqz.a($$0).a(ets.i, $$2).a(ets.k, $$1).a(etr.u);
      return new eqw.a($$3).a(Optional.empty());
   }

   private static eqw a(aqm $$0, int $$1, bsh $$2, boolean $$3) {
      eqz $$4 = new eqz.a($$0).a(ets.a, $$2).a(ets.k, $$1).a(ets.f, $$2.dp()).a(ets.l, $$3).a(etr.v);
      return new eqw.a($$4).a(Optional.empty());
   }

   private static eqw a(aqm $$0, int $$1, bsh $$2, ewh $$3) {
      eqz $$4 = new eqz.a($$0).a(ets.a, $$2).a(ets.k, $$1).a(ets.f, $$3).a(etr.w);
      return new eqw.a($$4).a(Optional.empty());
   }

   private static <T> void a(List<czk<T>> $$0, eqw $$1, Consumer<T> $$2) {
      for (czk<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aqm $$0, int $$1, czl $$2, btc $$3) {
      if ($$2.b() != null && !this.a($$2.b())) {
         Set<dad> $$4 = $$3.eI().remove(this);
         if ($$4 != null) {
            $$4.forEach($$3x -> $$3x.a($$2, $$3, $$3.dp(), $$1));
         }
      } else {
         Set<dad> $$5 = $$3.eI().get(this);

         for (czk<dad> $$6 : this.a(czn.n)) {
            dad $$7 = $$6.a();
            boolean $$8 = $$5 != null && $$5.contains($$7);
            if ($$6.a(a($$0, $$1, $$3, $$8))) {
               if (!$$8) {
                  if ($$5 == null) {
                     $$5 = new ObjectArraySet();
                     $$3.eI().put(this, $$5);
                  }

                  $$5.add($$7);
               }

               $$7.a($$0, $$1, $$2, $$3, $$3.dp(), !$$8);
            } else if ($$5 != null && $$5.remove($$7)) {
               $$7.a($$2, $$3, $$3.dp(), $$1);
            }
         }

         if ($$5 != null && $$5.isEmpty()) {
            $$3.eI().remove(this);
         }
      }
   }

   public void a(int $$0, czl $$1, btc $$2) {
      Set<dad> $$3 = $$2.eI().remove(this);
      if ($$3 != null) {
         for (dad $$4 : $$3) {
            $$4.a($$1, $$2, $$2.dp(), $$0);
         }
      }
   }

   public static czm.a a(czm.c $$0) {
      return new czm.a($$0);
   }

   public wu f() {
      return this.e;
   }

   public czm.c g() {
      return this.f;
   }

   public jn<czm> h() {
      return this.g;
   }

   public kj i() {
      return this.h;
   }

   public static class a {
      private final czm.c a;
      private jn<czm> b = jn.a();
      private final Map<km<?>, List<?>> c = new HashMap<>();
      private final kj.a d = kj.a();

      public a(czm.c $$0) {
         this.a = $$0;
      }

      public czm.a a(jn<czm> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> czm.a a(km<List<czk<E>>> $$0, E $$1, euh.a $$2) {
         this.b($$0).add(new czk<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> czm.a a(km<List<czk<E>>> $$0, E $$1) {
         this.b($$0).add(new czk<>($$1, Optional.empty()));
         return this;
      }

      public <E> czm.a a(km<List<czu<E>>> $$0, czq $$1, czq $$2, E $$3, euh.a $$4) {
         this.b($$0).add(new czu<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> czm.a a(km<List<czu<E>>> $$0, czq $$1, czq $$2, E $$3) {
         this.b($$0).add(new czu<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public czm.a a(km<List<dab>> $$0, dab $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> czm.a b(km<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public czm.a a(km<azk> $$0) {
         this.d.a($$0, azk.a);
         return this;
      }

      private <E> List<E> b(km<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public czm a(akk $$0) {
         return new czm(wu.c(ac.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<czm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(czm.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(czm.b::b)).apply($$0, czm.b::new)
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

   public static record c(jn<cty> b, Optional<jn<cty>> c, int d, int e, czm.b f, czm.b g, int h, List<bsp> i) {
      public static final MapCodec<czm.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.K).fieldOf("supported_items").forGetter(czm.c::a),
                  jy.a(lr.K).optionalFieldOf("primary_items").forGetter(czm.c::b),
                  axo.a(1, 1024).fieldOf("weight").forGetter(czm.c::c),
                  axo.a(1, 255).fieldOf("max_level").forGetter(czm.c::d),
                  czm.b.a.fieldOf("min_cost").forGetter(czm.c::e),
                  czm.b.a.fieldOf("max_cost").forGetter(czm.c::f),
                  axo.k.fieldOf("anvil_cost").forGetter(czm.c::g),
                  bsp.l.listOf().fieldOf("slots").forGetter(czm.c::h)
               )
               .apply($$0, czm.c::new)
      );

      public jn<cty> a() {
         return this.b;
      }

      public Optional<jn<cty>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public czm.b e() {
         return this.f;
      }

      public czm.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bsp> h() {
         return this.i;
      }
   }
}
