import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cyn(Optional<jr<cyl>> e, Optional<Integer> f, List<btp> g, Optional<String> h) implements cyv {
   public static final cyn a = new cyn(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wp i = wp.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<cyn> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyl.a.optionalFieldOf("potion").forGetter(cyn::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cyn::f),
               btp.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cyn::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cyn::g)
            )
            .apply($$0, cyn::new)
   );
   public static final Codec<cyn> c = Codec.withAlternative(j, cyl.a, cyn::new);
   public static final yn<wa, cyn> d = yn.a(cyl.b.a(yl::a), cyn::e, yl.g.a(yl::a), cyn::f, btp.e.a(yl.a()), cyn::d, yl.o.a(yl::a), cyn::g, cyn::new);

   public cyn(jr<cyl> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwo a(cwk $$0, jr<cyl> $$1) {
      cwo $$2 = new cwo($$0);
      $$2.b(kv.Q, new cyn($$1));
      return $$2;
   }

   public boolean a(jr<cyl> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<btp> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<btp>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<btp> $$0) {
      if (this.e.isPresent()) {
         for (btp $$1 : this.e.get().a().a()) {
            $$0.accept(new btp($$1));
         }
      }

      for (btp $$2 : this.g) {
         $$0.accept(new btp($$2));
      }
   }

   public cyn b(jr<cyl> $$0) {
      return new cyn(Optional.of($$0), this.f, this.g, this.h);
   }

   public cyn a(btp $$0) {
      return new cyn(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wp a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((cyl)$$0x.a()).b())).orElse("empty");
      return wp.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<btp> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (btp $$5 : $$0) {
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

   public List<btp> d() {
      return Lists.transform(this.g, btp::new);
   }

   public void a(Consumer<wp> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvg $$0) {
      if ($$0.dV() instanceof ard $$1) {
         cow $$4 = $$0 instanceof cow $$3 ? $$3 : null;
         this.a((Consumer<btp>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<btp> $$0, Consumer<wp> $$1, float $$2, float $$3) {
      List<Pair<jr<bwj>, bwm>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (btp $$6 : $$0) {
         $$5 = false;
         xd $$7 = wp.c($$6.i());
         jr<btn> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wp.a("potion.withAmplifier", $$7, wp.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wp.a("potion.withDuration", $$7, btq.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wo.a);
         $$1.accept(wp.c("potion.whenDrank").a(n.f));

         for (Pair<jr<bwj>, bwm> $$9 : $$4) {
            bwm $$10 = (bwm)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwm.a.b && $$10.d() != bwm.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wp.a("attribute.modifier.plus." + $$10.d().a(), czf.d.format($$13), wp.c(((bwj)((jr)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wp.a("attribute.modifier.take." + $$10.d().a(), czf.d.format($$13), wp.c(((bwj)((jr)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, cyu $$3) {
      this.a($$1);
   }

   public Optional<String> g() {
      return this.h;
   }
}
