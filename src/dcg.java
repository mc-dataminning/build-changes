import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dcg(Optional<jg<dce>> e, Optional<Integer> f, List<bwi> g, Optional<String> h) implements dcq, ddp {
   public static final dcg a = new dcg(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xg i = xg.c("effect.none").a(o.h);
   public static final int b = -13083194;
   private static final Codec<dcg> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dce.a.optionalFieldOf("potion").forGetter(dcg::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dcg::f),
               bwi.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dcg::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dcg::g)
            )
            .apply($$0, dcg::new)
   );
   public static final Codec<dcg> c = Codec.withAlternative(j, dce.a, dcg::new);
   public static final ze<wp, dcg> d = ze.a(dce.b.a(zc::a), dcg::e, zc.g.a(zc::a), dcg::f, bwi.e.a(zc.a()), dcg::d, zc.p.a(zc::a), dcg::g, dcg::new);

   public dcg(jg<dce> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static dak a(dag $$0, jg<dce> $$1) {
      dak $$2 = new dak($$0);
      $$2.b(kl.R, new dcg($$1));
      return $$2;
   }

   public boolean a(jg<dce> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bwi> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bwi>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bwi> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bwi $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bwi $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dcg b(jg<dce> $$0) {
      return new dcg(Optional.of($$0), this.f, this.g, this.h);
   }

   public dcg a(bwi $$0) {
      return new dcg(this.e, this.f, ag.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public xg a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dce)$$0x.a()).b())).orElse("empty");
      return xg.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bwi> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bwi $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayh.b($$6);
            $$2 += $$7 * ayh.c($$6);
            $$3 += $$7 * ayh.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayh.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bwi> d() {
      return Lists.transform(this.g, bwi::new);
   }

   public void a(byf $$0, float $$1) {
      if ($$0.dV() instanceof asb $$2) {
         csi $$5 = $$0 instanceof csi $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bwi> $$0, Consumer<xg> $$1, float $$2, float $$3) {
      List<Pair<jg<bzg>, bzj>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bwi $$6 : $$0) {
         $$5 = false;
         jg<bwg> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xu $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = xg.a("potion.withDuration", $$9, bwj.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xf.a);
         $$1.accept(xg.c("potion.whenDrank").a(o.f));

         for (Pair<jg<bzg>, bzj> $$10 : $$4) {
            bzj $$11 = (bzj)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != bzj.a.b && $$11.c() != bzj.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(xg.a("attribute.modifier.plus." + $$11.c().a(), ddb.d.format($$14), xg.c(((bzg)((jg)$$10.getFirst()).a()).c())).a(o.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(xg.a("attribute.modifier.take." + $$11.c().a(), ddb.d.format($$14), xg.c(((bzg)((jg)$$10.getFirst()).a()).c())).a(o.m));
            }
         }
      }
   }

   public static xu a(jg<bwg> $$0, int $$1) {
      xu $$2 = xg.c($$0.a().f());
      return $$1 > 0 ? xg.a("potion.withAmplifier", $$2, xg.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, dcp $$3) {
      this.a($$1, $$2.a(kl.S, 1.0F));
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      a(this.a(), $$1, $$3.a(kl.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
