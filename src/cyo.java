import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cyo(Optional<jr<cym>> e, Optional<Integer> f, List<btq> g, Optional<String> h) implements cyw {
   public static final cyo a = new cyo(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wp i = wp.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<cyo> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cym.a.optionalFieldOf("potion").forGetter(cyo::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cyo::f),
               btq.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cyo::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cyo::g)
            )
            .apply($$0, cyo::new)
   );
   public static final Codec<cyo> c = Codec.withAlternative(j, cym.a, cyo::new);
   public static final yn<wa, cyo> d = yn.a(cym.b.a(yl::a), cyo::e, yl.g.a(yl::a), cyo::f, btq.e.a(yl.a()), cyo::d, yl.o.a(yl::a), cyo::g, cyo::new);

   public cyo(jr<cym> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwp a(cwl $$0, jr<cym> $$1) {
      cwp $$2 = new cwp($$0);
      $$2.b(kv.Q, new cyo($$1));
      return $$2;
   }

   public boolean a(jr<cym> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<btq> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<btq>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<btq> $$0) {
      if (this.e.isPresent()) {
         for (btq $$1 : this.e.get().a().a()) {
            $$0.accept(new btq($$1));
         }
      }

      for (btq $$2 : this.g) {
         $$0.accept(new btq($$2));
      }
   }

   public cyo b(jr<cym> $$0) {
      return new cyo(Optional.of($$0), this.f, this.g, this.h);
   }

   public cyo a(btq $$0) {
      return new cyo(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wp a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((cym)$$0x.a()).b())).orElse("empty");
      return wp.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<btq> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (btq $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axk.b($$6);
            $$2 += $$7 * axk.c($$6);
            $$3 += $$7 * axk.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axk.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<btq> d() {
      return Lists.transform(this.g, btq::new);
   }

   public void a(Consumer<wp> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvh $$0) {
      if ($$0.dV() instanceof ard $$1) {
         cox $$4 = $$0 instanceof cox $$3 ? $$3 : null;
         this.a((Consumer<btq>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<btq> $$0, Consumer<wp> $$1, float $$2, float $$3) {
      List<Pair<jr<bwk>, bwn>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (btq $$6 : $$0) {
         $$5 = false;
         xd $$7 = wp.c($$6.i());
         jr<bto> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wp.a("potion.withAmplifier", $$7, wp.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wp.a("potion.withDuration", $$7, btr.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wo.a);
         $$1.accept(wp.c("potion.whenDrank").a(n.f));

         for (Pair<jr<bwk>, bwn> $$9 : $$4) {
            bwn $$10 = (bwn)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwn.a.b && $$10.d() != bwn.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wp.a("attribute.modifier.plus." + $$10.d().a(), czg.d.format($$13), wp.c(((bwk)((jr)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wp.a("attribute.modifier.take." + $$10.d().a(), czg.d.format($$13), wp.c(((bwk)((jr)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, cyv $$3) {
      this.a($$1);
   }

   public Optional<String> g() {
      return this.h;
   }
}
