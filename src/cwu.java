import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwu(Optional<jm<cws>> d, Optional<Integer> e, List<brz> f) {
   public static final cwu a = new cwu(Optional.empty(), Optional.empty(), List.of());
   private static final wz g = wz.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cwu> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cws.a.optionalFieldOf("potion").forGetter(cwu::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwu::f),
               brz.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwu::d)
            )
            .apply($$0, cwu::new)
   );
   public static final Codec<cwu> b = Codec.withAlternative(i, cws.a, cwu::new);
   public static final yx<wk, cwu> c = yx.a(cws.b.a(yv::a), cwu::e, yv.f.a(yv::a), cwu::f, brz.e.a(yv.a()), cwu::d, cwu::new);

   public cwu(jm<cws> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cuq a(cul $$0, jm<cws> $$1) {
      cuq $$2 = new cuq($$0);
      $$2.b(kq.G, new cwu($$1));
      return $$2;
   }

   public boolean a(jm<cws> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<brz> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<brz>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<brz> $$0) {
      if (this.d.isPresent()) {
         for (brz $$1 : this.d.get().a().a()) {
            $$0.accept(new brz($$1));
         }
      }

      for (brz $$2 : this.f) {
         $$0.accept(new brz($$2));
      }
   }

   public cwu b(jm<cws> $$0) {
      return new cwu(Optional.of($$0), this.e, this.f);
   }

   public cwu a(brz $$0) {
      return new cwu(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jm<cws> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<brz> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<brz> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (brz $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axy.b.b($$6);
            $$2 += $$7 * axy.b.c($$6);
            $$3 += $$7 * axy.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axy.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<brz> d() {
      return Lists.transform(this.f, brz::new);
   }

   public void a(Consumer<wz> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<brz> $$0, Consumer<wz> $$1, float $$2, float $$3) {
      List<Pair<jm<bur>, buu>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (brz $$6 : $$0) {
         $$5 = false;
         xn $$7 = wz.c($$6.i());
         jm<brx> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wz.a("potion.withAmplifier", $$7, wz.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wz.a("potion.withDuration", $$7, bsa.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wy.a);
         $$1.accept(wz.c("potion.whenDrank").a(n.f));

         for (Pair<jm<bur>, buu> $$9 : $$4) {
            buu $$10 = (buu)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != buu.a.b && $$10.d() != buu.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wz.a("attribute.modifier.plus." + $$10.d().a(), cxn.d.format($$13), wz.c(((bur)((jm)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wz.a("attribute.modifier.take." + $$10.d().a(), cxn.d.format($$13), wz.c(((bur)((jm)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jm<cws>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
