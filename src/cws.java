import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cws(Optional<jm<cwq>> d, Optional<Integer> e, List<bry> f) {
   public static final cws a = new cws(Optional.empty(), Optional.empty(), List.of());
   private static final wy g = wy.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cws> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwq.a.optionalFieldOf("potion").forGetter(cws::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cws::f),
               bry.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cws::d)
            )
            .apply($$0, cws::new)
   );
   public static final Codec<cws> b = Codec.withAlternative(i, cwq.a, cws::new);
   public static final yw<wj, cws> c = yw.a(cwq.b.a(yu::a), cws::e, yu.f.a(yu::a), cws::f, bry.e.a(yu.a()), cws::d, cws::new);

   public cws(jm<cwq> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cuo a(cuj $$0, jm<cwq> $$1) {
      cuo $$2 = new cuo($$0);
      $$2.b(kq.G, new cws($$1));
      return $$2;
   }

   public boolean a(jm<cwq> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bry> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bry>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bry> $$0) {
      if (this.d.isPresent()) {
         for (bry $$1 : this.d.get().a().a()) {
            $$0.accept(new bry($$1));
         }
      }

      for (bry $$2 : this.f) {
         $$0.accept(new bry($$2));
      }
   }

   public cws b(jm<cwq> $$0) {
      return new cws(Optional.of($$0), this.e, this.f);
   }

   public cws a(bry $$0) {
      return new cws(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jm<cwq> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bry> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bry> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bry $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axx.b.b($$6);
            $$2 += $$7 * axx.b.c($$6);
            $$3 += $$7 * axx.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axx.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bry> d() {
      return Lists.transform(this.f, bry::new);
   }

   public void a(Consumer<wy> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bry> $$0, Consumer<wy> $$1, float $$2, float $$3) {
      List<Pair<jm<bup>, bus>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bry $$6 : $$0) {
         $$5 = false;
         xm $$7 = wy.c($$6.i());
         jm<brw> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wy.a("potion.withAmplifier", $$7, wy.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wy.a("potion.withDuration", $$7, brz.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wx.a);
         $$1.accept(wy.c("potion.whenDrank").a(n.f));

         for (Pair<jm<bup>, bus> $$9 : $$4) {
            bus $$10 = (bus)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bus.a.b && $$10.d() != bus.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wy.a("attribute.modifier.plus." + $$10.d().a(), cxl.d.format($$13), wy.c(((bup)((jm)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wy.a("attribute.modifier.take." + $$10.d().a(), cxl.d.format($$13), wy.c(((bup)((jm)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jm<cwq>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
