import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record czo(Optional<jq<czm>> d, Optional<Integer> e, List<bup> f, Optional<String> g) implements czw {
   public static final czo a = new czo(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xv h = xv.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<czo> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czm.a.optionalFieldOf("potion").forGetter(czo::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(czo::f),
               bup.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(czo::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(czo::g)
            )
            .apply($$0, czo::new)
   );
   public static final Codec<czo> b = Codec.withAlternative(j, czm.a, czo::new);
   public static final zt<xg, czo> c = zt.a(czm.b.a(zr::a), czo::e, zr.g.a(zr::a), czo::f, bup.e.a(zr.a()), czo::d, zr.o.a(zr::a), czo::g, czo::new);

   public czo(jq<czm> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxp a(cxl $$0, jq<czm> $$1) {
      cxp $$2 = new cxp($$0);
      $$2.b(ku.Q, new czo($$1));
      return $$2;
   }

   public boolean a(jq<czm> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bup> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bup>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bup> $$0) {
      if (this.d.isPresent()) {
         for (bup $$1 : this.d.get().a().a()) {
            $$0.accept(new bup($$1));
         }
      }

      for (bup $$2 : this.f) {
         $$0.accept(new bup($$2));
      }
   }

   public czo b(jq<czm> $$0) {
      return new czo(Optional.of($$0), this.e, this.f, this.g);
   }

   public czo a(bup $$0) {
      return new czo(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<czm> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bup> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xv a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((czm)$$0x.a()).b())).orElse("empty");
      return xv.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<bup> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bup $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayp.b($$6);
            $$2 += $$7 * ayp.c($$6);
            $$3 += $$7 * ayp.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayp.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bup> d() {
      return Lists.transform(this.f, bup::new);
   }

   public void a(Consumer<xv> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bwg $$0) {
      if ($$0.dW() instanceof ash $$1) {
         cpx $$4 = $$0 instanceof cpx $$3 ? $$3 : null;
         this.a((Consumer<bup>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<bup> $$0, Consumer<xv> $$1, float $$2, float $$3) {
      List<Pair<jq<bxj>, bxm>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bup $$6 : $$0) {
         $$5 = false;
         yj $$7 = xv.c($$6.i());
         jq<bun> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xv.a("potion.withAmplifier", $$7, xv.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xv.a("potion.withDuration", $$7, buq.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xu.a);
         $$1.accept(xv.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bxj>, bxm> $$9 : $$4) {
            bxm $$10 = (bxm)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bxm.a.b && $$10.d() != bxm.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xv.a("attribute.modifier.plus." + $$10.d().a(), dag.d.format($$13), xv.c(((bxj)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xv.a("attribute.modifier.take." + $$10.d().a(), dag.d.format($$13), xv.c(((bxj)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, czv $$3) {
      this.a($$1);
   }

   public Optional<jq<czm>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
