import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record czf(Optional<jq<czd>> d, Optional<Integer> e, List<bug> f, Optional<String> g) implements czn {
   public static final czf a = new czf(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xk h = xk.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<czf> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czd.a.optionalFieldOf("potion").forGetter(czf::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(czf::f),
               bug.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(czf::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(czf::g)
            )
            .apply($$0, czf::new)
   );
   public static final Codec<czf> b = Codec.withAlternative(j, czd.a, czf::new);
   public static final zi<wv, czf> c = zi.a(czd.b.a(zg::a), czf::e, zg.g.a(zg::a), czf::f, bug.e.a(zg.a()), czf::d, zg.o.a(zg::a), czf::g, czf::new);

   public czf(jq<czd> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxg a(cxc $$0, jq<czd> $$1) {
      cxg $$2 = new cxg($$0);
      $$2.b(ku.Q, new czf($$1));
      return $$2;
   }

   public boolean a(jq<czd> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bug> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bug>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bug> $$0) {
      if (this.d.isPresent()) {
         for (bug $$1 : this.d.get().a().a()) {
            $$0.accept(new bug($$1));
         }
      }

      for (bug $$2 : this.f) {
         $$0.accept(new bug($$2));
      }
   }

   public czf b(jq<czd> $$0) {
      return new czf(Optional.of($$0), this.e, this.f, this.g);
   }

   public czf a(bug $$0) {
      return new czf(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<czd> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bug> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xk a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((czd)$$0x.a()).b())).orElse("empty");
      return xk.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<bug> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bug $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayf.b($$6);
            $$2 += $$7 * ayf.c($$6);
            $$3 += $$7 * ayf.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayf.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bug> d() {
      return Lists.transform(this.f, bug::new);
   }

   public void a(Consumer<xk> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvx $$0) {
      if ($$0.dW() instanceof arx $$1) {
         cpo $$4 = $$0 instanceof cpo $$3 ? $$3 : null;
         this.a((Consumer<bug>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<bug> $$0, Consumer<xk> $$1, float $$2, float $$3) {
      List<Pair<jq<bxa>, bxd>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bug $$6 : $$0) {
         $$5 = false;
         xy $$7 = xk.c($$6.i());
         jq<bue> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xk.a("potion.withAmplifier", $$7, xk.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xk.a("potion.withDuration", $$7, buh.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xj.a);
         $$1.accept(xk.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bxa>, bxd> $$9 : $$4) {
            bxd $$10 = (bxd)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bxd.a.b && $$10.d() != bxd.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xk.a("attribute.modifier.plus." + $$10.d().a(), czx.d.format($$13), xk.c(((bxa)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xk.a("attribute.modifier.take." + $$10.d().a(), czx.d.format($$13), xk.c(((bxa)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, czm $$3) {
      this.a($$1);
   }

   public Optional<jq<czd>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
