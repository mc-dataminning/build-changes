import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record daz(Optional<je<dax>> e, Optional<Integer> f, List<bvj> g, Optional<String> h) implements dbj, dci {
   public static final daz a = new daz(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wy i = wy.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<daz> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dax.a.optionalFieldOf("potion").forGetter(daz::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(daz::f),
               bvj.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(daz::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(daz::g)
            )
            .apply($$0, daz::new)
   );
   public static final Codec<daz> c = Codec.withAlternative(j, dax.a, daz::new);
   public static final yw<wj, daz> d = yw.a(dax.b.a(yu::a), daz::e, yu.g.a(yu::a), daz::f, bvj.e.a(yu.a()), daz::d, yu.o.a(yu::a), daz::g, daz::new);

   public daz(je<dax> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static czd a(cyz $$0, je<dax> $$1) {
      czd $$2 = new czd($$0);
      $$2.b(kj.R, new daz($$1));
      return $$2;
   }

   public boolean a(je<dax> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bvj> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bvj>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bvj> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bvj $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bvj $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public daz b(je<dax> $$0) {
      return new daz(Optional.of($$0), this.f, this.g, this.h);
   }

   public daz a(bvj $$0) {
      return new daz(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wy a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dax)$$0x.a()).b())).orElse("empty");
      return wy.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bvj> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bvj $$5 : $$0) {
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

   public List<bvj> d() {
      return Lists.transform(this.g, bvj::new);
   }

   public void a(bxe $$0, float $$1) {
      if ($$0.dV() instanceof arq $$2) {
         crc $$5 = $$0 instanceof crc $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bvj> $$0, Consumer<wy> $$1, float $$2, float $$3) {
      List<Pair<je<byf>, byi>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bvj $$6 : $$0) {
         $$5 = false;
         je<bvh> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xm $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = wy.a("potion.withDuration", $$9, bvk.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wx.a);
         $$1.accept(wy.c("potion.whenDrank").a(n.f));

         for (Pair<je<byf>, byi> $$10 : $$4) {
            byi $$11 = (byi)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != byi.a.b && $$11.c() != byi.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(wy.a("attribute.modifier.plus." + $$11.c().a(), dbu.d.format($$14), wy.c(((byf)((je)$$10.getFirst()).a()).c())).a(n.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(wy.a("attribute.modifier.take." + $$11.c().a(), dbu.d.format($$14), wy.c(((byf)((je)$$10.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public static xm a(je<bvh> $$0, int $$1) {
      xm $$2 = wy.c($$0.a().f());
      return $$1 > 0 ? wy.a("potion.withAmplifier", $$2, wy.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, dbi $$3) {
      this.a($$1, $$2.a(kj.S, 1.0F));
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      a(this.a(), $$1, $$3.a(kj.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
