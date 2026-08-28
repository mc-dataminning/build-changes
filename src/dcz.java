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

public record dcz(wp e, dcz.c f, jv<dcz> g, kr h) {
   public static final int a = 255;
   public static final Codec<dcz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.fieldOf("description").forGetter(dcz::f),
               dcz.c.a.forGetter(dcz::g),
               kg.a(mc.aO).optionalFieldOf("exclusive_set", jv.a()).forGetter(dcz::h),
               dda.b.optionalFieldOf("effects", kr.a).forGetter(dcz::i)
            )
            .apply($$0, dcz::new)
   );
   public static final Codec<jr<dcz>> c = aks.a(mc.aO);
   public static final yn<wa, jr<dcz>> d = yl.b(mc.aO);

   public static dcz.b a(int $$0) {
      return new dcz.b($$0, 0);
   }

   public static dcz.b a(int $$0, int $$1) {
      return new dcz.b($$0, $$1);
   }

   public static dcz.c a(jv<cwl> $$0, jv<cwl> $$1, int $$2, int $$3, dcz.b $$4, dcz.b $$5, int $$6, buu... $$7) {
      return new dcz.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dcz.c a(jv<cwl> $$0, int $$1, int $$2, dcz.b $$3, dcz.b $$4, int $$5, buu... $$6) {
      return new dcz.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<but, cwp> a(bvh $$0) {
      Map<but, cwp> $$1 = Maps.newEnumMap(but.class);

      for (but $$2 : but.i) {
         if (this.a($$2)) {
            cwp $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jv<cwl> a() {
      return this.f.a();
   }

   public boolean a(but $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwp $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwp $$0) {
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

   public static boolean a(jr<dcz> $$0, jr<dcz> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wp a(jr<dcz> $$0, int $$1) {
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

   public boolean c(cwp $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ku<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ard $$0, int $$1, bul $$2, btb $$3) {
      evr $$4 = b($$0, $$1, $$2, $$3);

      for (dcw<ddo> $$5 : this.a(dda.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ard $$0, int $$1, cwp $$2, bul $$3, btb $$4, MutableFloat $$5) {
      evr $$6 = b($$0, $$1, $$3, $$4);

      for (dcw<dds> $$7 : this.a(dda.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ard $$0, int $$1, cwp $$2, MutableFloat $$3) {
      this.a(dda.k, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwp $$2, MutableFloat $$3) {
      this.a(dda.p, $$0, $$1, $$2, $$3);
   }

   public void c(ard $$0, int $$1, cwp $$2, MutableFloat $$3) {
      this.a(dda.q, $$0, $$1, $$2, $$3);
   }

   public void d(ard $$0, int $$1, cwp $$2, MutableFloat $$3) {
      this.a(dda.x, $$0, $$1, $$2, $$3);
   }

   public void a(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ard $$0, int $$1, cwp $$2, MutableFloat $$3) {
      this.a(dda.z, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dda.F, $$0, $$1, $$2);
   }

   public void c(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ard $$0, int $$1, cwp $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dda.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ard $$0, int $$1, cwp $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dda.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ard $$0, int $$1, cwp $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dda.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ard $$0, int $$1, cwp $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dda.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ard $$0, int $$1, dcy $$2, ddd $$3, bul $$4, btb $$5) {
      for (ddi<ddq> $$6 : this.a(dda.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(ddi<ddq> $$0, ard $$1, int $$2, dcy $$3, bul $$4, btb $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bul $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ard $$0, int $$1, cwp $$2, bul $$3, MutableFloat $$4) {
      this.a(dda.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dda.A, $$0, $$1, $$2);
   }

   public void a(ku<dds> $$0, azh $$1, int $$2, MutableFloat $$3) {
      dds $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ard $$0, int $$1, dcy $$2, bul $$3) {
      a(this.a(dda.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ard $$0, int $$1, dcy $$2, bul $$3) {
      a(this.a(dda.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4, dwx $$5) {
      a(this.a(dda.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ku<List<dcw<dds>>> $$0, ard $$1, int $$2, cwp $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(ku<List<dcw<dds>>> $$0, ard $$1, int $$2, cwp $$3, bul $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ku<List<dcw<dds>>> $$0, ard $$1, int $$2, cwp $$3, bul $$4, btb $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static evr b(ard $$0, int $$1, bul $$2, btb $$3) {
      evu $$4 = new evu.a($$0).a(eyl.a, $$2).a(eyl.k, $$1).a(eyl.f, $$2.dt()).a(eyl.c, $$3).b(eyl.d, $$3.d()).b(eyl.e, $$3.c()).a(eyk.t);
      return new evr.a($$4).a(Optional.empty());
   }

   private static evr a(ard $$0, int $$1, cwp $$2) {
      evu $$3 = new evu.a($$0).a(eyl.i, $$2).a(eyl.k, $$1).a(eyk.u);
      return new evr.a($$3).a(Optional.empty());
   }

   private static evr a(ard $$0, int $$1, bul $$2, boolean $$3) {
      evu $$4 = new evu.a($$0).a(eyl.a, $$2).a(eyl.k, $$1).a(eyl.f, $$2.dt()).a(eyl.l, $$3).a(eyk.v);
      return new evr.a($$4).a(Optional.empty());
   }

   private static evr a(ard $$0, int $$1, bul $$2, fba $$3) {
      evu $$4 = new evu.a($$0).a(eyl.a, $$2).a(eyl.k, $$1).a(eyl.f, $$3).a(eyk.w);
      return new evr.a($$4).a(Optional.empty());
   }

   private static evr a(ard $$0, int $$1, bul $$2, fba $$3, dwx $$4) {
      evu $$5 = new evu.a($$0).a(eyl.a, $$2).a(eyl.k, $$1).a(eyl.f, $$3).a(eyl.g, $$4).a(eyk.x);
      return new evr.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dcw<T>> $$0, evr $$1, Consumer<T> $$2) {
      for (dcw<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ard $$0, int $$1, dcy $$2, bvh $$3) {
      but $$4 = $$2.b();
      if ($$4 != null) {
         Map<dcz, Set<ddr>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<ddr> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<ddr> $$7 = $$5.get(this);

            for (dcw<ddr> $$8 : this.a(dda.n)) {
               ddr $$9 = $$8.a();
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

   public void a(int $$0, dcy $$1, bvh $$2) {
      but $$3 = $$1.b();
      if ($$3 != null) {
         Set<ddr> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (ddr $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dcz.a a(dcz.c $$0) {
      return new dcz.a($$0);
   }

   public wp f() {
      return this.e;
   }

   public dcz.c g() {
      return this.f;
   }

   public jv<dcz> h() {
      return this.g;
   }

   public kr i() {
      return this.h;
   }

   public static class a {
      private final dcz.c a;
      private jv<dcz> b = jv.a();
      private final Map<ku<?>, List<?>> c = new HashMap<>();
      private final kr.a d = kr.a();

      public a(dcz.c $$0) {
         this.a = $$0;
      }

      public dcz.a a(jv<dcz> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dcz.a a(ku<List<dcw<E>>> $$0, E $$1, eza.a $$2) {
         this.b($$0).add(new dcw<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dcz.a a(ku<List<dcw<E>>> $$0, E $$1) {
         this.b($$0).add(new dcw<>($$1, Optional.empty()));
         return this;
      }

      public <E> dcz.a a(ku<List<ddi<E>>> $$0, ddd $$1, ddd $$2, E $$3, eza.a $$4) {
         this.b($$0).add(new ddi<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dcz.a a(ku<List<ddi<E>>> $$0, ddd $$1, ddd $$2, E $$3) {
         this.b($$0).add(new ddi<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dcz.a a(ku<List<ddp>> $$0, ddp $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dcz.a b(ku<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dcz.a a(ku<baf> $$0) {
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

      public dcz a(akv $$0) {
         return new dcz(wp.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dcz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dcz.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dcz.b::b)).apply($$0, dcz.b::new)
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

   public static record c(jv<cwl> b, Optional<jv<cwl>> c, int d, int e, dcz.b f, dcz.b g, int h, List<buu> i) {
      public static final MapCodec<dcz.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.K).fieldOf("supported_items").forGetter(dcz.c::a),
                  kg.a(mc.K).optionalFieldOf("primary_items").forGetter(dcz.c::b),
                  ayi.a(1, 1024).fieldOf("weight").forGetter(dcz.c::c),
                  ayi.a(1, 255).fieldOf("max_level").forGetter(dcz.c::d),
                  dcz.b.a.fieldOf("min_cost").forGetter(dcz.c::e),
                  dcz.b.a.fieldOf("max_cost").forGetter(dcz.c::f),
                  ayi.l.fieldOf("anvil_cost").forGetter(dcz.c::g),
                  buu.l.listOf().fieldOf("slots").forGetter(dcz.c::h)
               )
               .apply($$0, dcz.c::new)
      );

      public jv<cwl> a() {
         return this.b;
      }

      public Optional<jv<cwl>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dcz.b e() {
         return this.f;
      }

      public dcz.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<buu> h() {
         return this.i;
      }
   }
}
