import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cze(Optional<jr<czc>> e, Optional<Integer> f, List<bue> g, Optional<String> h) implements czm {
   public static final cze a = new cze(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wp i = wp.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<cze> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czc.a.optionalFieldOf("potion").forGetter(cze::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cze::f),
               bue.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cze::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cze::g)
            )
            .apply($$0, cze::new)
   );
   public static final Codec<cze> c = Codec.withAlternative(j, czc.a, cze::new);
   public static final yn<wa, cze> d = yn.a(czc.b.a(yl::a), cze::e, yl.g.a(yl::a), cze::f, bue.e.a(yl.a()), cze::d, yl.o.a(yl::a), cze::g, cze::new);

   public cze(jr<czc> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxh a(cxd $$0, jr<czc> $$1) {
      cxh $$2 = new cxh($$0);
      $$2.b(kv.R, new cze($$1));
      return $$2;
   }

   public boolean a(jr<czc> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bue> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bue>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bue> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bue $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bue $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public cze b(jr<czc> $$0) {
      return new cze(Optional.of($$0), this.f, this.g, this.h);
   }

   public cze a(bue $$0) {
      return new cze(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wp a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((czc)$$0x.a()).b())).orElse("empty");
      return wp.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bue> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bue $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
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

   public List<bue> d() {
      return Lists.transform(this.g, bue::new);
   }

   public void a(Consumer<wp> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvy $$0, float $$1) {
      if ($$0.dU() instanceof ard $$2) {
         cpr $$5 = $$0 instanceof cpr $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bue> $$0, Consumer<wp> $$1, float $$2, float $$3) {
      List<Pair<jr<bxb>, bxe>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bue $$6 : $$0) {
         $$5 = false;
         xd $$7 = wp.c($$6.j());
         jr<buc> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wp.a("potion.withAmplifier", $$7, wp.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wp.a("potion.withDuration", $$7, buf.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wo.a);
         $$1.accept(wp.c("potion.whenDrank").a(n.f));

         for (Pair<jr<bxb>, bxe> $$9 : $$4) {
            bxe $$10 = (bxe)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bxe.a.b && $$10.d() != bxe.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wp.a("attribute.modifier.plus." + $$10.d().a(), czw.d.format($$13), wp.c(((bxb)((jr)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wp.a("attribute.modifier.take." + $$10.d().a(), czw.d.format($$13), wp.c(((bxb)((jr)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, czl $$3) {
      this.a($$1, $$2.a(kv.S, 1.0F));
   }

   public Optional<String> g() {
      return this.h;
   }
}
