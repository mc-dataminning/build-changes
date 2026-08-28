import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwo(Optional<ji<cwm>> d, Optional<Integer> e, List<bsa> f) {
   public static final cwo a = new cwo(Optional.empty(), Optional.empty(), List.of());
   private static final xo g = xo.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cwo> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.i.r().optionalFieldOf("potion").forGetter(cwo::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwo::f),
               bsa.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwo::d)
            )
            .apply($$0, cwo::new)
   );
   public static final Codec<cwo> b = Codec.withAlternative(j, lp.i.r(), cwo::new);
   public static final zm<wz, cwo> c = zm.a(zk.b(lq.Y).a(zk::a), cwo::e, zk.f.a(zk::a), cwo::f, bsa.e.a(zk.a()), cwo::d, cwo::new);

   public cwo(ji<cwm> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cun a(cui $$0, ji<cwm> $$1) {
      cun $$2 = new cun($$0);
      $$2.b(km.F, new cwo($$1));
      return $$2;
   }

   public boolean a(ji<cwm> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bsa> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bsa>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bsa> $$0) {
      if (this.d.isPresent()) {
         for (bsa $$1 : this.d.get().a().a()) {
            $$0.accept(new bsa($$1));
         }
      }

      for (bsa $$2 : this.f) {
         $$0.accept(new bsa($$2));
      }
   }

   public cwo b(ji<cwm> $$0) {
      return new cwo(Optional.of($$0), this.e, this.f);
   }

   public cwo a(bsa $$0) {
      return new cwo(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(ji<cwm> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bsa> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bsa> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bsa $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayh.b.b($$6);
            $$2 += $$7 * ayh.b.c($$6);
            $$3 += $$7 * ayh.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayh.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bsa> d() {
      return Lists.transform(this.f, bsa::new);
   }

   public void a(Consumer<xo> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bsa> $$0, Consumer<xo> $$1, float $$2, float $$3) {
      List<Pair<ji<buq>, but>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bsa $$6 : $$0) {
         $$5 = false;
         yc $$7 = xo.c($$6.i());
         ji<bry> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xo.a("potion.withAmplifier", $$7, xo.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xo.a("potion.withDuration", $$7, bsb.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xn.a);
         $$1.accept(xo.c("potion.whenDrank").a(n.f));

         for (Pair<ji<buq>, but> $$9 : $$4) {
            but $$10 = (but)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != but.a.b && $$10.e() != but.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xo.a("attribute.modifier.plus." + $$10.e().a(), cxi.d.format($$13), xo.c(((buq)((ji)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xo.a("attribute.modifier.take." + $$10.e().a(), cxi.d.format($$13), xo.c(((buq)((ji)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ji<cwm>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
