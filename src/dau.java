import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dau(Optional<je<das>> e, Optional<Integer> f, List<bvh> g, Optional<String> h) implements dbe, dcd {
   public static final dau a = new dau(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wy i = wy.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<dau> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               das.a.optionalFieldOf("potion").forGetter(dau::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dau::f),
               bvh.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dau::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dau::g)
            )
            .apply($$0, dau::new)
   );
   public static final Codec<dau> c = Codec.withAlternative(j, das.a, dau::new);
   public static final yw<wj, dau> d = yw.a(das.b.a(yu::a), dau::e, yu.g.a(yu::a), dau::f, bvh.e.a(yu.a()), dau::d, yu.o.a(yu::a), dau::g, dau::new);

   public dau(je<das> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cyy a(cyu $$0, je<das> $$1) {
      cyy $$2 = new cyy($$0);
      $$2.b(kj.R, new dau($$1));
      return $$2;
   }

   public boolean a(je<das> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bvh> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bvh>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bvh> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bvh $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bvh $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dau b(je<das> $$0) {
      return new dau(Optional.of($$0), this.f, this.g, this.h);
   }

   public dau a(bvh $$0) {
      return new dau(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wy a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((das)$$0x.a()).b())).orElse("empty");
      return wy.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bvh> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bvh $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axw.b($$6);
            $$2 += $$7 * axw.c($$6);
            $$3 += $$7 * axw.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axw.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bvh> d() {
      return Lists.transform(this.g, bvh::new);
   }

   public void a(bxc $$0, float $$1) {
      if ($$0.dV() instanceof arq $$2) {
         cqy $$5 = $$0 instanceof cqy $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bvh> $$0, Consumer<wy> $$1, float $$2, float $$3) {
      List<Pair<je<byd>, byg>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bvh $$6 : $$0) {
         $$5 = false;
         je<bvf> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xm $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = wy.a("potion.withDuration", $$9, bvi.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wx.a);
         $$1.accept(wy.c("potion.whenDrank").a(n.f));

         for (Pair<je<byd>, byg> $$10 : $$4) {
            byg $$11 = (byg)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != byg.a.b && $$11.c() != byg.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(wy.a("attribute.modifier.plus." + $$11.c().a(), dbp.d.format($$14), wy.c(((byd)((je)$$10.getFirst()).a()).c())).a(n.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(wy.a("attribute.modifier.take." + $$11.c().a(), dbp.d.format($$14), wy.c(((byd)((je)$$10.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public static xm a(je<bvf> $$0, int $$1) {
      xm $$2 = wy.c($$0.a().f());
      return $$1 > 0 ? wy.a("potion.withAmplifier", $$2, wy.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, dbd $$3) {
      this.a($$1, $$2.a(kj.S, 1.0F));
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      a(this.a(), $$1, $$3.a(kj.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
