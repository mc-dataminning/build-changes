import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record czu(Optional<js<czs>> e, Optional<Integer> f, List<buw> g, Optional<String> h) implements dac {
   public static final czu a = new czu(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wv i = wv.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<czu> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czs.a.optionalFieldOf("potion").forGetter(czu::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(czu::f),
               buw.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(czu::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(czu::g)
            )
            .apply($$0, czu::new)
   );
   public static final Codec<czu> c = Codec.withAlternative(j, czs.a, czu::new);
   public static final yt<wg, czu> d = yt.a(czs.b.a(yr::a), czu::e, yr.g.a(yr::a), czu::f, buw.e.a(yr.a()), czu::d, yr.o.a(yr::a), czu::g, czu::new);

   public czu(js<czs> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxy a(cxu $$0, js<czs> $$1) {
      cxy $$2 = new cxy($$0);
      $$2.b(kx.R, new czu($$1));
      return $$2;
   }

   public boolean a(js<czs> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<buw> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<buw>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<buw> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (buw $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (buw $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public czu b(js<czs> $$0) {
      return new czu(Optional.of($$0), this.f, this.g, this.h);
   }

   public czu a(buw $$0) {
      return new czu(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wv a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((czs)$$0x.a()).b())).orElse("empty");
      return wv.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<buw> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (buw $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axu.b($$6);
            $$2 += $$7 * axu.c($$6);
            $$3 += $$7 * axu.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axu.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<buw> d() {
      return Lists.transform(this.g, buw::new);
   }

   public void a(Consumer<wv> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bwr $$0, float $$1) {
      if ($$0.dV() instanceof arn $$2) {
         cqi $$5 = $$0 instanceof cqi $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<buw> $$0, Consumer<wv> $$1, float $$2, float $$3) {
      List<Pair<js<bxs>, bxv>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (buw $$6 : $$0) {
         $$5 = false;
         js<buu> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xj $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = wv.a("potion.withDuration", $$9, bux.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wu.a);
         $$1.accept(wv.c("potion.whenDrank").a(n.f));

         for (Pair<js<bxs>, bxv> $$10 : $$4) {
            bxv $$11 = (bxv)$$10.getSecond();
            double $$12 = $$11.c();
            double $$14;
            if ($$11.d() != bxv.a.b && $$11.d() != bxv.a.c) {
               $$14 = $$11.c();
            } else {
               $$14 = $$11.c() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(wv.a("attribute.modifier.plus." + $$11.d().a(), dam.d.format($$14), wv.c(((bxs)((js)$$10.getFirst()).a()).c())).a(n.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(wv.a("attribute.modifier.take." + $$11.d().a(), dam.d.format($$14), wv.c(((bxs)((js)$$10.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public static xj a(js<buu> $$0, int $$1) {
      xj $$2 = wv.c($$0.a().f());
      return $$1 > 0 ? wv.a("potion.withAmplifier", $$2, wv.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, dab $$3) {
      this.a($$1, $$2.a(kx.S, 1.0F));
   }

   public Optional<String> g() {
      return this.h;
   }
}
