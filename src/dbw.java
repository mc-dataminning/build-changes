import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dbw(Optional<jg<dbu>> e, Optional<Integer> f, List<bvz> g, Optional<String> h) implements dcg, ddf {
   public static final dbw a = new dbw(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xc i = xc.c("effect.none").a(o.h);
   public static final int b = -13083194;
   private static final Codec<dbw> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbu.a.optionalFieldOf("potion").forGetter(dbw::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dbw::f),
               bvz.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dbw::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dbw::g)
            )
            .apply($$0, dbw::new)
   );
   public static final Codec<dbw> c = Codec.withAlternative(j, dbu.a, dbw::new);
   public static final za<wn, dbw> d = za.a(dbu.b.a(yy::a), dbw::e, yy.g.a(yy::a), dbw::f, bvz.e.a(yy.a()), dbw::d, yy.p.a(yy::a), dbw::g, dbw::new);

   public dbw(jg<dbu> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static daa a(czw $$0, jg<dbu> $$1) {
      daa $$2 = new daa($$0);
      $$2.b(kl.R, new dbw($$1));
      return $$2;
   }

   public boolean a(jg<dbu> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bvz> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bvz>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bvz> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bvz $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bvz $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dbw b(jg<dbu> $$0) {
      return new dbw(Optional.of($$0), this.f, this.g, this.h);
   }

   public dbw a(bvz $$0) {
      return new dbw(this.e, this.f, ag.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public xc a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dbu)$$0x.a()).b())).orElse("empty");
      return xc.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bvz> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bvz $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * aya.b($$6);
            $$2 += $$7 * aya.c($$6);
            $$3 += $$7 * aya.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(aya.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bvz> d() {
      return Lists.transform(this.g, bvz::new);
   }

   public void a(bxw $$0, float $$1) {
      if ($$0.dV() instanceof aru $$2) {
         crz $$5 = $$0 instanceof crz $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bvz> $$0, Consumer<xc> $$1, float $$2, float $$3) {
      List<Pair<jg<byx>, bza>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bvz $$6 : $$0) {
         $$5 = false;
         jg<bvx> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xq $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = xc.a("potion.withDuration", $$9, bwa.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xb.a);
         $$1.accept(xc.c("potion.whenDrank").a(o.f));

         for (Pair<jg<byx>, bza> $$10 : $$4) {
            bza $$11 = (bza)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != bza.a.b && $$11.c() != bza.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(xc.a("attribute.modifier.plus." + $$11.c().a(), dcr.d.format($$14), xc.c(((byx)((jg)$$10.getFirst()).a()).c())).a(o.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(xc.a("attribute.modifier.take." + $$11.c().a(), dcr.d.format($$14), xc.c(((byx)((jg)$$10.getFirst()).a()).c())).a(o.m));
            }
         }
      }
   }

   public static xq a(jg<bvx> $$0, int $$1) {
      xq $$2 = xc.c($$0.a().f());
      return $$1 > 0 ? xc.a("potion.withAmplifier", $$2, xc.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, dcf $$3) {
      this.a($$1, $$2.a(kl.S, 1.0F));
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      a(this.a(), $$1, $$3.a(kl.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
