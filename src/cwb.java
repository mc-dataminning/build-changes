import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwb(Optional<jj<cvz>> d, Optional<Integer> e, List<brl> f) {
   public static final cwb a = new cwb(Optional.empty(), Optional.empty(), List.of());
   private static final wu g = wu.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cwb> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.h.s().optionalFieldOf("potion").forGetter(cwb::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwb::f),
               brl.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwb::d)
            )
            .apply($$0, cwb::new)
   );
   public static final Codec<cwb> b = Codec.withAlternative(j, lq.h.s(), cwb::new);
   public static final ys<wf, cwb> c = ys.a(yq.b(lr.ac).a(yq::a), cwb::e, yq.f.a(yq::a), cwb::f, brl.e.a(yq.a()), cwb::d, cwb::new);

   public cwb(jj<cvz> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cua a(ctv $$0, jj<cvz> $$1) {
      cua $$2 = new cua($$0);
      $$2.b(kn.G, new cwb($$1));
      return $$2;
   }

   public boolean a(jj<cvz> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<brl> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<brl>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<brl> $$0) {
      if (this.d.isPresent()) {
         for (brl $$1 : this.d.get().a().a()) {
            $$0.accept(new brl($$1));
         }
      }

      for (brl $$2 : this.f) {
         $$0.accept(new brl($$2));
      }
   }

   public cwb b(jj<cvz> $$0) {
      return new cwb(Optional.of($$0), this.e, this.f);
   }

   public cwb a(brl $$0) {
      return new cwb(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jj<cvz> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<brl> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<brl> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (brl $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axo.b.b($$6);
            $$2 += $$7 * axo.b.c($$6);
            $$3 += $$7 * axo.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axo.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<brl> d() {
      return Lists.transform(this.f, brl::new);
   }

   public void a(Consumer<wu> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<brl> $$0, Consumer<wu> $$1, float $$2, float $$3) {
      List<Pair<jj<bub>, bue>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (brl $$6 : $$0) {
         $$5 = false;
         xi $$7 = wu.c($$6.i());
         jj<brj> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wu.a("potion.withAmplifier", $$7, wu.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wu.a("potion.withDuration", $$7, brm.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wt.a);
         $$1.accept(wu.c("potion.whenDrank").a(n.f));

         for (Pair<jj<bub>, bue> $$9 : $$4) {
            bue $$10 = (bue)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != bue.a.b && $$10.e() != bue.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wu.a("attribute.modifier.plus." + $$10.e().a(), cwu.d.format($$13), wu.c(((bub)((jj)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wu.a("attribute.modifier.take." + $$10.e().a(), cwu.d.format($$13), wu.c(((bub)((jj)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jj<cvz>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
