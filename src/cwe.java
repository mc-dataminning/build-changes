import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwe(Optional<jj<cwc>> d, Optional<Integer> e, List<brp> f) {
   public static final cwe a = new cwe(Optional.empty(), Optional.empty(), List.of());
   private static final wu g = wu.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cwe> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwc.a.optionalFieldOf("potion").forGetter(cwe::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwe::f),
               brp.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwe::d)
            )
            .apply($$0, cwe::new)
   );
   public static final Codec<cwe> b = Codec.withAlternative(i, cwc.a, cwe::new);
   public static final ys<wf, cwe> c = ys.a(cwc.b.a(yq::a), cwe::e, yq.f.a(yq::a), cwe::f, brp.e.a(yq.a()), cwe::d, cwe::new);

   public cwe(jj<cwc> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cud a(cty $$0, jj<cwc> $$1) {
      cud $$2 = new cud($$0);
      $$2.b(kn.G, new cwe($$1));
      return $$2;
   }

   public boolean a(jj<cwc> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<brp> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<brp>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<brp> $$0) {
      if (this.d.isPresent()) {
         for (brp $$1 : this.d.get().a().a()) {
            $$0.accept(new brp($$1));
         }
      }

      for (brp $$2 : this.f) {
         $$0.accept(new brp($$2));
      }
   }

   public cwe b(jj<cwc> $$0) {
      return new cwe(Optional.of($$0), this.e, this.f);
   }

   public cwe a(brp $$0) {
      return new cwe(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jj<cwc> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<brp> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<brp> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (brp $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axq.b.b($$6);
            $$2 += $$7 * axq.b.c($$6);
            $$3 += $$7 * axq.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axq.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<brp> d() {
      return Lists.transform(this.f, brp::new);
   }

   public void a(Consumer<wu> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<brp> $$0, Consumer<wu> $$1, float $$2, float $$3) {
      List<Pair<jj<buf>, bui>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (brp $$6 : $$0) {
         $$5 = false;
         xi $$7 = wu.c($$6.i());
         jj<brn> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wu.a("potion.withAmplifier", $$7, wu.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wu.a("potion.withDuration", $$7, brq.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wt.a);
         $$1.accept(wu.c("potion.whenDrank").a(n.f));

         for (Pair<jj<buf>, bui> $$9 : $$4) {
            bui $$10 = (bui)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != bui.a.b && $$10.e() != bui.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wu.a("attribute.modifier.plus." + $$10.e().a(), cwx.d.format($$13), wu.c(((buf)((jj)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wu.a("attribute.modifier.take." + $$10.e().a(), cwx.d.format($$13), wu.c(((buf)((jj)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jj<cwc>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
