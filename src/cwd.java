import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwd(Optional<jj<cwb>> d, Optional<Integer> e, List<bro> f) {
   public static final cwd a = new cwd(Optional.empty(), Optional.empty(), List.of());
   private static final wu g = wu.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cwd> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.h.s().optionalFieldOf("potion").forGetter(cwd::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwd::f),
               bro.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwd::d)
            )
            .apply($$0, cwd::new)
   );
   public static final Codec<cwd> b = Codec.withAlternative(j, lq.h.s(), cwd::new);
   public static final ys<wf, cwd> c = ys.a(yq.b(lr.ac).a(yq::a), cwd::e, yq.f.a(yq::a), cwd::f, bro.e.a(yq.a()), cwd::d, cwd::new);

   public cwd(jj<cwb> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cuc a(ctx $$0, jj<cwb> $$1) {
      cuc $$2 = new cuc($$0);
      $$2.b(kn.G, new cwd($$1));
      return $$2;
   }

   public boolean a(jj<cwb> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bro> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bro>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bro> $$0) {
      if (this.d.isPresent()) {
         for (bro $$1 : this.d.get().a().a()) {
            $$0.accept(new bro($$1));
         }
      }

      for (bro $$2 : this.f) {
         $$0.accept(new bro($$2));
      }
   }

   public cwd b(jj<cwb> $$0) {
      return new cwd(Optional.of($$0), this.e, this.f);
   }

   public cwd a(bro $$0) {
      return new cwd(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jj<cwb> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bro> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bro> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bro $$5 : $$0) {
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

   public List<bro> d() {
      return Lists.transform(this.f, bro::new);
   }

   public void a(Consumer<wu> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bro> $$0, Consumer<wu> $$1, float $$2, float $$3) {
      List<Pair<jj<bue>, buh>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bro $$6 : $$0) {
         $$5 = false;
         xi $$7 = wu.c($$6.i());
         jj<brm> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wu.a("potion.withAmplifier", $$7, wu.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wu.a("potion.withDuration", $$7, brp.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wt.a);
         $$1.accept(wu.c("potion.whenDrank").a(n.f));

         for (Pair<jj<bue>, buh> $$9 : $$4) {
            buh $$10 = (buh)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != buh.a.b && $$10.e() != buh.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wu.a("attribute.modifier.plus." + $$10.e().a(), cww.d.format($$13), wu.c(((bue)((jj)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wu.a("attribute.modifier.take." + $$10.e().a(), cww.d.format($$13), wu.c(((bue)((jj)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jj<cwb>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
