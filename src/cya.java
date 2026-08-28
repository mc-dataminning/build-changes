import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cya(Optional<jq<cxy>> d, Optional<Integer> e, List<btj> f, Optional<String> g) implements cyi {
   public static final cya a = new cya(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xi h = xi.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<cya> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxy.a.optionalFieldOf("potion").forGetter(cya::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cya::f),
               btj.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cya::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cya::g)
            )
            .apply($$0, cya::new)
   );
   public static final Codec<cya> b = Codec.withAlternative(j, cxy.a, cya::new);
   public static final zg<wt, cya> c = zg.a(cxy.b.a(ze::a), cya::e, ze.g.a(ze::a), cya::f, btj.e.a(ze.a()), cya::d, ze.m.a(ze::a), cya::g, cya::new);

   public cya(jq<cxy> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwb a(cvx $$0, jq<cxy> $$1) {
      cwb $$2 = new cwb($$0);
      $$2.b(ku.Q, new cya($$1));
      return $$2;
   }

   public boolean a(jq<cxy> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<btj> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<btj>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<btj> $$0) {
      if (this.d.isPresent()) {
         for (btj $$1 : this.d.get().a().a()) {
            $$0.accept(new btj($$1));
         }
      }

      for (btj $$2 : this.f) {
         $$0.accept(new btj($$2));
      }
   }

   public cya b(jq<cxy> $$0) {
      return new cya(Optional.of($$0), this.e, this.f, this.g);
   }

   public cya a(btj $$0) {
      return new cya(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<cxy> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<btj> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xi a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((cxy)$$0x.a()).b())).orElse("empty");
      return xi.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<btj> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (btj $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axv.b($$6);
            $$2 += $$7 * axv.c($$6);
            $$3 += $$7 * axv.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axv.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<btj> d() {
      return Lists.transform(this.f, btj::new);
   }

   public void a(Consumer<xi> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bva $$0) {
      if (!$$0.dX().C) {
         com $$2 = $$0 instanceof com $$1 ? $$1 : null;
         this.a((Consumer<btj>)($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$2, $$2, $$0, $$2x.e(), 1.0);
            } else {
               $$0.a($$2x);
            }
         }));
      }
   }

   public static void a(Iterable<btj> $$0, Consumer<xi> $$1, float $$2, float $$3) {
      List<Pair<jq<bwd>, bwg>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (btj $$6 : $$0) {
         $$5 = false;
         xw $$7 = xi.c($$6.i());
         jq<bth> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xi.a("potion.withAmplifier", $$7, xi.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xi.a("potion.withDuration", $$7, btk.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xh.a);
         $$1.accept(xi.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bwd>, bwg> $$9 : $$4) {
            bwg $$10 = (bwg)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwg.a.b && $$10.d() != bwg.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xi.a("attribute.modifier.plus." + $$10.d().a(), cys.d.format($$13), xi.c(((bwd)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xi.a("attribute.modifier.take." + $$10.d().a(), cys.d.format($$13), xi.c(((bwd)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dfb $$0, bva $$1, cwb $$2, cyh $$3) {
      this.a($$1);
   }

   public Optional<jq<cxy>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
