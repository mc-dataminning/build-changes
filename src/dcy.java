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

public record dcy(wp e, dcy.c f, jv<dcy> g, kr h) {
   public static final int a = 255;
   public static final Codec<dcy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.fieldOf("description").forGetter(dcy::f),
               dcy.c.a.forGetter(dcy::g),
               kg.a(mc.aO).optionalFieldOf("exclusive_set", jv.a()).forGetter(dcy::h),
               dcz.b.optionalFieldOf("effects", kr.a).forGetter(dcy::i)
            )
            .apply($$0, dcy::new)
   );
   public static final Codec<jr<dcy>> c = aks.a(mc.aO);
   public static final yn<wa, jr<dcy>> d = yl.b(mc.aO);

   public static dcy.b a(int $$0) {
      return new dcy.b($$0, 0);
   }

   public static dcy.b a(int $$0, int $$1) {
      return new dcy.b($$0, $$1);
   }

   public static dcy.c a(jv<cwk> $$0, jv<cwk> $$1, int $$2, int $$3, dcy.b $$4, dcy.b $$5, int $$6, but... $$7) {
      return new dcy.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dcy.c a(jv<cwk> $$0, int $$1, int $$2, dcy.b $$3, dcy.b $$4, int $$5, but... $$6) {
      return new dcy.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bus, cwo> a(bvg $$0) {
      Map<bus, cwo> $$1 = Maps.newEnumMap(bus.class);

      for (bus $$2 : bus.i) {
         if (this.a($$2)) {
            cwo $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jv<cwk> a() {
      return this.f.a();
   }

   public boolean a(bus $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwo $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwo $$0) {
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

   public static boolean a(jr<dcy> $$0, jr<dcy> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wp a(jr<dcy> $$0, int $$1) {
      xd $$2 = $$0.a().e.f();
      if ($$0.a(aws.o)) {
         ws.a($$2, xm.a.a(n.m));
      } else {
         ws.a($$2, xm.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wo.v).b(wp.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwo $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ku<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ard $$0, int $$1, buk $$2, bta $$3) {
      evq $$4 = b($$0, $$1, $$2, $$3);

      for (dcv<ddn> $$5 : this.a(dcz.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ard $$0, int $$1, cwo $$2, buk $$3, bta $$4, MutableFloat $$5) {
      evq $$6 = b($$0, $$1, $$3, $$4);

      for (dcv<ddr> $$7 : this.a(dcz.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ard $$0, int $$1, cwo $$2, MutableFloat $$3) {
      this.a(dcz.k, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwo $$2, MutableFloat $$3) {
      this.a(dcz.p, $$0, $$1, $$2, $$3);
   }

   public void c(ard $$0, int $$1, cwo $$2, MutableFloat $$3) {
      this.a(dcz.q, $$0, $$1, $$2, $$3);
   }

   public void d(ard $$0, int $$1, cwo $$2, MutableFloat $$3) {
      this.a(dcz.x, $$0, $$1, $$2, $$3);
   }

   public void a(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ard $$0, int $$1, cwo $$2, MutableFloat $$3) {
      this.a(dcz.z, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dcz.F, $$0, $$1, $$2);
   }

   public void c(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ard $$0, int $$1, cwo $$2, buk $$3, bta $$4, MutableFloat $$5) {
      this.a(dcz.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ard $$0, int $$1, cwo $$2, buk $$3, bta $$4, MutableFloat $$5) {
      this.a(dcz.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ard $$0, int $$1, cwo $$2, buk $$3, bta $$4, MutableFloat $$5) {
      this.a(dcz.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ard $$0, int $$1, cwo $$2, buk $$3, bta $$4, MutableFloat $$5) {
      this.a(dcz.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ard $$0, int $$1, dcx $$2, ddc $$3, buk $$4, bta $$5) {
      for (ddh<ddp> $$6 : this.a(dcz.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(ddh<ddp> $$0, ard $$1, int $$2, dcx $$3, buk $$4, bta $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         buk $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ard $$0, int $$1, cwo $$2, buk $$3, MutableFloat $$4) {
      this.a(dcz.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dcz.A, $$0, $$1, $$2);
   }

   public void a(ku<ddr> $$0, azh $$1, int $$2, MutableFloat $$3) {
      ddr $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ard $$0, int $$1, dcx $$2, buk $$3) {
      a(this.a(dcz.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ard $$0, int $$1, dcx $$2, buk $$3) {
      a(this.a(dcz.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4, dww $$5) {
      a(this.a(dcz.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ku<List<dcv<ddr>>> $$0, ard $$1, int $$2, cwo $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(ku<List<dcv<ddr>>> $$0, ard $$1, int $$2, cwo $$3, buk $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ku<List<dcv<ddr>>> $$0, ard $$1, int $$2, cwo $$3, buk $$4, bta $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static evq b(ard $$0, int $$1, buk $$2, bta $$3) {
      evt $$4 = new evt.a($$0).a(eyk.a, $$2).a(eyk.k, $$1).a(eyk.f, $$2.dt()).a(eyk.c, $$3).b(eyk.d, $$3.d()).b(eyk.e, $$3.c()).a(eyj.t);
      return new evq.a($$4).a(Optional.empty());
   }

   private static evq a(ard $$0, int $$1, cwo $$2) {
      evt $$3 = new evt.a($$0).a(eyk.i, $$2).a(eyk.k, $$1).a(eyj.u);
      return new evq.a($$3).a(Optional.empty());
   }

   private static evq a(ard $$0, int $$1, buk $$2, boolean $$3) {
      evt $$4 = new evt.a($$0).a(eyk.a, $$2).a(eyk.k, $$1).a(eyk.f, $$2.dt()).a(eyk.l, $$3).a(eyj.v);
      return new evq.a($$4).a(Optional.empty());
   }

   private static evq a(ard $$0, int $$1, buk $$2, faz $$3) {
      evt $$4 = new evt.a($$0).a(eyk.a, $$2).a(eyk.k, $$1).a(eyk.f, $$3).a(eyj.w);
      return new evq.a($$4).a(Optional.empty());
   }

   private static evq a(ard $$0, int $$1, buk $$2, faz $$3, dww $$4) {
      evt $$5 = new evt.a($$0).a(eyk.a, $$2).a(eyk.k, $$1).a(eyk.f, $$3).a(eyk.g, $$4).a(eyj.x);
      return new evq.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dcv<T>> $$0, evq $$1, Consumer<T> $$2) {
      for (dcv<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ard $$0, int $$1, dcx $$2, bvg $$3) {
      bus $$4 = $$2.b();
      if ($$4 != null) {
         Map<dcy, Set<ddq>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<ddq> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<ddq> $$7 = $$5.get(this);

            for (dcv<ddq> $$8 : this.a(dcz.n)) {
               ddq $$9 = $$8.a();
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

   public void a(int $$0, dcx $$1, bvg $$2) {
      bus $$3 = $$1.b();
      if ($$3 != null) {
         Set<ddq> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (ddq $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dcy.a a(dcy.c $$0) {
      return new dcy.a($$0);
   }

   public wp f() {
      return this.e;
   }

   public dcy.c g() {
      return this.f;
   }

   public jv<dcy> h() {
      return this.g;
   }

   public kr i() {
      return this.h;
   }

   public static class a {
      private final dcy.c a;
      private jv<dcy> b = jv.a();
      private final Map<ku<?>, List<?>> c = new HashMap<>();
      private final kr.a d = kr.a();

      public a(dcy.c $$0) {
         this.a = $$0;
      }

      public dcy.a a(jv<dcy> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dcy.a a(ku<List<dcv<E>>> $$0, E $$1, eyz.a $$2) {
         this.b($$0).add(new dcv<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dcy.a a(ku<List<dcv<E>>> $$0, E $$1) {
         this.b($$0).add(new dcv<>($$1, Optional.empty()));
         return this;
      }

      public <E> dcy.a a(ku<List<ddh<E>>> $$0, ddc $$1, ddc $$2, E $$3, eyz.a $$4) {
         this.b($$0).add(new ddh<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dcy.a a(ku<List<ddh<E>>> $$0, ddc $$1, ddc $$2, E $$3) {
         this.b($$0).add(new ddh<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dcy.a a(ku<List<ddo>> $$0, ddo $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dcy.a b(ku<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dcy.a a(ku<baf> $$0) {
         this.d.a($$0, baf.a);
         return this;
      }

      private <E> List<E> b(ku<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dcy a(akv $$0) {
         return new dcy(wp.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dcy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dcy.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dcy.b::b)).apply($$0, dcy.b::new)
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

   public static record c(jv<cwk> b, Optional<jv<cwk>> c, int d, int e, dcy.b f, dcy.b g, int h, List<but> i) {
      public static final MapCodec<dcy.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.K).fieldOf("supported_items").forGetter(dcy.c::a),
                  kg.a(mc.K).optionalFieldOf("primary_items").forGetter(dcy.c::b),
                  ayi.a(1, 1024).fieldOf("weight").forGetter(dcy.c::c),
                  ayi.a(1, 255).fieldOf("max_level").forGetter(dcy.c::d),
                  dcy.b.a.fieldOf("min_cost").forGetter(dcy.c::e),
                  dcy.b.a.fieldOf("max_cost").forGetter(dcy.c::f),
                  ayi.l.fieldOf("anvil_cost").forGetter(dcy.c::g),
                  but.l.listOf().fieldOf("slots").forGetter(dcy.c::h)
               )
               .apply($$0, dcy.c::new)
      );

      public jv<cwk> a() {
         return this.b;
      }

      public Optional<jv<cwk>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dcy.b e() {
         return this.f;
      }

      public dcy.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<but> h() {
         return this.i;
      }
   }
}
