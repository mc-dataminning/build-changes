import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cym(Optional<jr<cyk>> e, Optional<Integer> f, List<bto> g, Optional<String> h) implements cyu {
   public static final cym a = new cym(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wo i = wo.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<cym> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyk.a.optionalFieldOf("potion").forGetter(cym::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cym::f),
               bto.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cym::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cym::g)
            )
            .apply($$0, cym::new)
   );
   public static final Codec<cym> c = Codec.withAlternative(j, cyk.a, cym::new);
   public static final ym<vz, cym> d = ym.a(cyk.b.a(yk::a), cym::e, yk.g.a(yk::a), cym::f, bto.e.a(yk.a()), cym::d, yk.o.a(yk::a), cym::g, cym::new);

   public cym(jr<cyk> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwn a(cwj $$0, jr<cyk> $$1) {
      cwn $$2 = new cwn($$0);
      $$2.b(kv.Q, new cym($$1));
      return $$2;
   }

   public boolean a(jr<cyk> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bto> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bto>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bto> $$0) {
      if (this.e.isPresent()) {
         for (bto $$1 : this.e.get().a().a()) {
            $$0.accept(new bto($$1));
         }
      }

      for (bto $$2 : this.g) {
         $$0.accept(new bto($$2));
      }
   }

   public cym b(jr<cyk> $$0) {
      return new cym(Optional.of($$0), this.f, this.g, this.h);
   }

   public cym a(bto $$0) {
      return new cym(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wo a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((cyk)$$0x.a()).b())).orElse("empty");
      return wo.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bto> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bto $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axj.b($$6);
            $$2 += $$7 * axj.c($$6);
            $$3 += $$7 * axj.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axj.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bto> d() {
      return Lists.transform(this.g, bto::new);
   }

   public void a(Consumer<wo> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bvf $$0) {
      if ($$0.dW() instanceof arc $$1) {
         cov $$4 = $$0 instanceof cov $$3 ? $$3 : null;
         this.a((Consumer<bto>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<bto> $$0, Consumer<wo> $$1, float $$2, float $$3) {
      List<Pair<jr<bwi>, bwl>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bto $$6 : $$0) {
         $$5 = false;
         xc $$7 = wo.c($$6.i());
         jr<btm> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wo.a("potion.withAmplifier", $$7, wo.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wo.a("potion.withDuration", $$7, btp.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wn.a);
         $$1.accept(wo.c("potion.whenDrank").a(n.f));

         for (Pair<jr<bwi>, bwl> $$9 : $$4) {
            bwl $$10 = (bwl)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwl.a.b && $$10.d() != bwl.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wo.a("attribute.modifier.plus." + $$10.d().a(), cze.d.format($$13), wo.c(((bwi)((jr)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wo.a("attribute.modifier.take." + $$10.d().a(), cze.d.format($$13), wo.c(((bwi)((jr)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, cyt $$3) {
      this.a($$1);
   }

   public Optional<String> g() {
      return this.h;
   }
}
