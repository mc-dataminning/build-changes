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

public record dcx(wo e, dcx.c f, jv<dcx> g, kr h) {
   public static final int a = 255;
   public static final Codec<dcx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wq.a.fieldOf("description").forGetter(dcx::f),
               dcx.c.a.forGetter(dcx::g),
               kg.a(mc.aO).optionalFieldOf("exclusive_set", jv.a()).forGetter(dcx::h),
               dcy.b.optionalFieldOf("effects", kr.a).forGetter(dcx::i)
            )
            .apply($$0, dcx::new)
   );
   public static final Codec<jr<dcx>> c = akr.a(mc.aO);
   public static final ym<vz, jr<dcx>> d = yk.b(mc.aO);

   public static dcx.b a(int $$0) {
      return new dcx.b($$0, 0);
   }

   public static dcx.b a(int $$0, int $$1) {
      return new dcx.b($$0, $$1);
   }

   public static dcx.c a(jv<cwj> $$0, jv<cwj> $$1, int $$2, int $$3, dcx.b $$4, dcx.b $$5, int $$6, bus... $$7) {
      return new dcx.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dcx.c a(jv<cwj> $$0, int $$1, int $$2, dcx.b $$3, dcx.b $$4, int $$5, bus... $$6) {
      return new dcx.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bur, cwn> a(bvf $$0) {
      Map<bur, cwn> $$1 = Maps.newEnumMap(bur.class);

      for (bur $$2 : bur.i) {
         if (this.a($$2)) {
            cwn $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jv<cwj> a() {
      return this.f.a();
   }

   public boolean a(bur $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwn $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwn $$0) {
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

   public static boolean a(jr<dcx> $$0, jr<dcx> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wo a(jr<dcx> $$0, int $$1) {
      xc $$2 = $$0.a().e.f();
      if ($$0.a(awr.o)) {
         wr.a($$2, xl.a.a(n.m));
      } else {
         wr.a($$2, xl.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wn.v).b(wo.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwn $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ku<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arc $$0, int $$1, buj $$2, bsz $$3) {
      evp $$4 = b($$0, $$1, $$2, $$3);

      for (dcu<ddm> $$5 : this.a(dcy.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arc $$0, int $$1, cwn $$2, buj $$3, bsz $$4, MutableFloat $$5) {
      evp $$6 = b($$0, $$1, $$3, $$4);

      for (dcu<ddq> $$7 : this.a(dcy.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dZ(), $$5.floatValue()));
         }
      }
   }

   public void a(arc $$0, int $$1, cwn $$2, MutableFloat $$3) {
      this.a(dcy.k, $$0, $$1, $$2, $$3);
   }

   public void b(arc $$0, int $$1, cwn $$2, MutableFloat $$3) {
      this.a(dcy.p, $$0, $$1, $$2, $$3);
   }

   public void c(arc $$0, int $$1, cwn $$2, MutableFloat $$3) {
      this.a(dcy.q, $$0, $$1, $$2, $$3);
   }

   public void d(arc $$0, int $$1, cwn $$2, MutableFloat $$3) {
      this.a(dcy.x, $$0, $$1, $$2, $$3);
   }

   public void a(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arc $$0, int $$1, cwn $$2, MutableFloat $$3) {
      this.a(dcy.z, $$0, $$1, $$2, $$3);
   }

   public void b(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azg $$0, int $$1, MutableFloat $$2) {
      this.a(dcy.F, $$0, $$1, $$2);
   }

   public void c(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arc $$0, int $$1, cwn $$2, buj $$3, bsz $$4, MutableFloat $$5) {
      this.a(dcy.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arc $$0, int $$1, cwn $$2, buj $$3, bsz $$4, MutableFloat $$5) {
      this.a(dcy.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arc $$0, int $$1, cwn $$2, buj $$3, bsz $$4, MutableFloat $$5) {
      this.a(dcy.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arc $$0, int $$1, cwn $$2, buj $$3, bsz $$4, MutableFloat $$5) {
      this.a(dcy.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arc $$0, int $$1, dcw $$2, ddb $$3, buj $$4, bsz $$5) {
      for (ddg<ddo> $$6 : this.a(dcy.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(ddg<ddo> $$0, arc $$1, int $$2, dcw $$3, buj $$4, bsz $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         buj $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.du());
         }
      }
   }

   public void e(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arc $$0, int $$1, cwn $$2, buj $$3, MutableFloat $$4) {
      this.a(dcy.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azg $$0, int $$1, MutableFloat $$2) {
      this.a(dcy.A, $$0, $$1, $$2);
   }

   public void a(ku<ddq> $$0, azg $$1, int $$2, MutableFloat $$3) {
      ddq $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arc $$0, int $$1, dcw $$2, buj $$3) {
      a(this.a(dcy.o), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void b(arc $$0, int $$1, dcw $$2, buj $$3) {
      a(this.a(dcy.r), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4, dwv $$5) {
      a(this.a(dcy.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ku<List<dcu<ddq>>> $$0, arc $$1, int $$2, cwn $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(ku<List<dcu<ddq>>> $$0, arc $$1, int $$2, cwn $$3, buj $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.du()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dZ(), $$5.floatValue())));
   }

   private void a(ku<List<dcu<ddq>>> $$0, arc $$1, int $$2, cwn $$3, buj $$4, bsz $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dZ(), $$6.floatValue())));
   }

   public static evp b(arc $$0, int $$1, buj $$2, bsz $$3) {
      evs $$4 = new evs.a($$0).a(eyj.a, $$2).a(eyj.k, $$1).a(eyj.f, $$2.du()).a(eyj.c, $$3).b(eyj.d, $$3.d()).b(eyj.e, $$3.c()).a(eyi.t);
      return new evp.a($$4).a(Optional.empty());
   }

   private static evp a(arc $$0, int $$1, cwn $$2) {
      evs $$3 = new evs.a($$0).a(eyj.i, $$2).a(eyj.k, $$1).a(eyi.u);
      return new evp.a($$3).a(Optional.empty());
   }

   private static evp a(arc $$0, int $$1, buj $$2, boolean $$3) {
      evs $$4 = new evs.a($$0).a(eyj.a, $$2).a(eyj.k, $$1).a(eyj.f, $$2.du()).a(eyj.l, $$3).a(eyi.v);
      return new evp.a($$4).a(Optional.empty());
   }

   private static evp a(arc $$0, int $$1, buj $$2, fay $$3) {
      evs $$4 = new evs.a($$0).a(eyj.a, $$2).a(eyj.k, $$1).a(eyj.f, $$3).a(eyi.w);
      return new evp.a($$4).a(Optional.empty());
   }

   private static evp a(arc $$0, int $$1, buj $$2, fay $$3, dwv $$4) {
      evs $$5 = new evs.a($$0).a(eyj.a, $$2).a(eyj.k, $$1).a(eyj.f, $$3).a(eyj.g, $$4).a(eyi.x);
      return new evp.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dcu<T>> $$0, evp $$1, Consumer<T> $$2) {
      for (dcu<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arc $$0, int $$1, dcw $$2, bvf $$3) {
      bur $$4 = $$2.b();
      if ($$4 != null) {
         Map<dcx, Set<ddp>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<ddp> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.du(), $$1));
            }
         } else {
            Set<ddp> $$7 = $$5.get(this);

            for (dcu<ddp> $$8 : this.a(dcy.n)) {
               ddp $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.du(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.du(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dcw $$1, bvf $$2) {
      bur $$3 = $$1.b();
      if ($$3 != null) {
         Set<ddp> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (ddp $$5 : $$4) {
               $$5.a($$1, $$2, $$2.du(), $$0);
            }
         }
      }
   }

   public static dcx.a a(dcx.c $$0) {
      return new dcx.a($$0);
   }

   public wo f() {
      return this.e;
   }

   public dcx.c g() {
      return this.f;
   }

   public jv<dcx> h() {
      return this.g;
   }

   public kr i() {
      return this.h;
   }

   public static class a {
      private final dcx.c a;
      private jv<dcx> b = jv.a();
      private final Map<ku<?>, List<?>> c = new HashMap<>();
      private final kr.a d = kr.a();

      public a(dcx.c $$0) {
         this.a = $$0;
      }

      public dcx.a a(jv<dcx> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dcx.a a(ku<List<dcu<E>>> $$0, E $$1, eyy.a $$2) {
         this.b($$0).add(new dcu<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dcx.a a(ku<List<dcu<E>>> $$0, E $$1) {
         this.b($$0).add(new dcu<>($$1, Optional.empty()));
         return this;
      }

      public <E> dcx.a a(ku<List<ddg<E>>> $$0, ddb $$1, ddb $$2, E $$3, eyy.a $$4) {
         this.b($$0).add(new ddg<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dcx.a a(ku<List<ddg<E>>> $$0, ddb $$1, ddb $$2, E $$3) {
         this.b($$0).add(new ddg<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dcx.a a(ku<List<ddn>> $$0, ddn $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dcx.a b(ku<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dcx.a a(ku<bae> $$0) {
         this.d.a($$0, bae.a);
         return this;
      }

      private <E> List<E> b(ku<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dcx a(aku $$0) {
         return new dcx(wo.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dcx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dcx.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dcx.b::b)).apply($$0, dcx.b::new)
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

   public static record c(jv<cwj> b, Optional<jv<cwj>> c, int d, int e, dcx.b f, dcx.b g, int h, List<bus> i) {
      public static final MapCodec<dcx.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.K).fieldOf("supported_items").forGetter(dcx.c::a),
                  kg.a(mc.K).optionalFieldOf("primary_items").forGetter(dcx.c::b),
                  ayh.a(1, 1024).fieldOf("weight").forGetter(dcx.c::c),
                  ayh.a(1, 255).fieldOf("max_level").forGetter(dcx.c::d),
                  dcx.b.a.fieldOf("min_cost").forGetter(dcx.c::e),
                  dcx.b.a.fieldOf("max_cost").forGetter(dcx.c::f),
                  ayh.l.fieldOf("anvil_cost").forGetter(dcx.c::g),
                  bus.l.listOf().fieldOf("slots").forGetter(dcx.c::h)
               )
               .apply($$0, dcx.c::new)
      );

      public jv<cwj> a() {
         return this.b;
      }

      public Optional<jv<cwj>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dcx.b e() {
         return this.f;
      }

      public dcx.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bus> h() {
         return this.i;
      }
   }
}
