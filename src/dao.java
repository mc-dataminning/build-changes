import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dao(Optional<je<dam>> e, Optional<Integer> f, List<bve> g, Optional<String> h) implements day, dbx {
   public static final dao a = new dao(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final ww i = ww.c("effect.none").a(n.h);
   public static final int b = -13083194;
   private static final Codec<dao> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dam.a.optionalFieldOf("potion").forGetter(dao::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dao::f),
               bve.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dao::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dao::g)
            )
            .apply($$0, dao::new)
   );
   public static final Codec<dao> c = Codec.withAlternative(j, dam.a, dao::new);
   public static final yu<wh, dao> d = yu.a(dam.b.a(ys::a), dao::e, ys.g.a(ys::a), dao::f, bve.e.a(ys.a()), dao::d, ys.o.a(ys::a), dao::g, dao::new);

   public dao(je<dam> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cys a(cyo $$0, je<dam> $$1) {
      cys $$2 = new cys($$0);
      $$2.b(kj.R, new dao($$1));
      return $$2;
   }

   public boolean a(je<dam> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bve> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bve>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bve> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bve $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bve $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dao b(je<dam> $$0) {
      return new dao(Optional.of($$0), this.f, this.g, this.h);
   }

   public dao a(bve $$0) {
      return new dao(this.e, this.f, af.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public ww a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dam)$$0x.a()).b())).orElse("empty");
      return ww.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bve> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bve $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axu.b($$6);
            $$2 += $$7 * axu.c($$6);
            $$3 += $$7 * axu.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axu.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bve> d() {
      return Lists.transform(this.g, bve::new);
   }

   public void a(bwz $$0, float $$1) {
      if ($$0.dV() instanceof aro $$2) {
         cqs $$5 = $$0 instanceof cqs $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bve> $$0, Consumer<ww> $$1, float $$2, float $$3) {
      List<Pair<je<bya>, byd>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bve $$6 : $$0) {
         $$5 = false;
         je<bvc> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xk $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = ww.a("potion.withDuration", $$9, bvf.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wv.a);
         $$1.accept(ww.c("potion.whenDrank").a(n.f));

         for (Pair<je<bya>, byd> $$10 : $$4) {
            byd $$11 = (byd)$$10.getSecond();
            double $$12 = $$11.c();
            double $$14;
            if ($$11.d() != byd.a.b && $$11.d() != byd.a.c) {
               $$14 = $$11.c();
            } else {
               $$14 = $$11.c() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(ww.a("attribute.modifier.plus." + $$11.d().a(), dbj.d.format($$14), ww.c(((bya)((je)$$10.getFirst()).a()).c())).a(n.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(ww.a("attribute.modifier.take." + $$11.d().a(), dbj.d.format($$14), ww.c(((bya)((je)$$10.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public static xk a(je<bvc> $$0, int $$1) {
      xk $$2 = ww.c($$0.a().f());
      return $$1 > 0 ? ww.a("potion.withAmplifier", $$2, ww.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, dax $$3) {
      this.a($$1, $$2.a(kj.S, 1.0F));
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      a(this.a(), $$1, $$3.a(kj.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
