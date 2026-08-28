import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record czj(Optional<jq<czh>> d, Optional<Integer> e, List<buk> f, Optional<String> g) implements czr {
   public static final czj a = new czj(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xv h = xv.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<czj> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czh.a.optionalFieldOf("potion").forGetter(czj::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(czj::f),
               buk.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(czj::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(czj::g)
            )
            .apply($$0, czj::new)
   );
   public static final Codec<czj> b = Codec.withAlternative(j, czh.a, czj::new);
   public static final zt<xg, czj> c = zt.a(czh.b.a(zr::a), czj::e, zr.g.a(zr::a), czj::f, buk.e.a(zr.a()), czj::d, zr.o.a(zr::a), czj::g, czj::new);

   public czj(jq<czh> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxk a(cxg $$0, jq<czh> $$1) {
      cxk $$2 = new cxk($$0);
      $$2.b(ku.Q, new czj($$1));
      return $$2;
   }

   public boolean a(jq<czh> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<buk> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<buk>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<buk> $$0) {
      if (this.d.isPresent()) {
         for (buk $$1 : this.d.get().a().a()) {
            $$0.accept(new buk($$1));
         }
      }

      for (buk $$2 : this.f) {
         $$0.accept(new buk($$2));
      }
   }

   public czj b(jq<czh> $$0) {
      return new czj(Optional.of($$0), this.e, this.f, this.g);
   }

   public czj a(buk $$0) {
      return new czj(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<czh> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<buk> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xv a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((czh)$$0x.a()).b())).orElse("empty");
      return xv.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<buk> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (buk $$5 : $$0) {
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

   public List<buk> d() {
      return Lists.transform(this.f, buk::new);
   }

   public void a(Consumer<xv> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bwb $$0) {
      if ($$0.dV() instanceof ash $$1) {
         cps $$4 = $$0 instanceof cps $$3 ? $$3 : null;
         this.a((Consumer<buk>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<buk> $$0, Consumer<xv> $$1, float $$2, float $$3) {
      List<Pair<jq<bxe>, bxh>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (buk $$6 : $$0) {
         $$5 = false;
         yj $$7 = xv.c($$6.i());
         jq<bui> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xv.a("potion.withAmplifier", $$7, xv.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xv.a("potion.withDuration", $$7, bul.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xu.a);
         $$1.accept(xv.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bxe>, bxh> $$9 : $$4) {
            bxh $$10 = (bxh)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bxh.a.b && $$10.d() != bxh.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xv.a("attribute.modifier.plus." + $$10.d().a(), dab.d.format($$13), xv.c(((bxe)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xv.a("attribute.modifier.take." + $$10.d().a(), dab.d.format($$13), xv.c(((bxe)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, czq $$3) {
      this.a($$1);
   }

   public Optional<jq<czh>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
