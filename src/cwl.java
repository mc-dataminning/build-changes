import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cwl(Optional<ji<cwj>> d, Optional<Integer> e, List<brx> f) {
   public static final cwl a = new cwl(Optional.empty(), Optional.empty(), List.of());
   private static final xl g = xl.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cwl> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.i.r().optionalFieldOf("potion").forGetter(cwl::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cwl::f),
               brx.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cwl::d)
            )
            .apply($$0, cwl::new)
   );
   public static final Codec<cwl> b = Codec.withAlternative(j, lp.i.r(), cwl::new);
   public static final zj<ww, cwl> c = zj.a(zh.b(lq.Y).a(zh::a), cwl::e, zh.f.a(zh::a), cwl::f, brx.e.a(zh.a()), cwl::d, cwl::new);

   public cwl(ji<cwj> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cuk a(cuf $$0, ji<cwj> $$1) {
      cuk $$2 = new cuk($$0);
      $$2.b(km.F, new cwl($$1));
      return $$2;
   }

   public boolean a(ji<cwj> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<brx> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<brx>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<brx> $$0) {
      if (this.d.isPresent()) {
         for (brx $$1 : this.d.get().a().a()) {
            $$0.accept(new brx($$1));
         }
      }

      for (brx $$2 : this.f) {
         $$0.accept(new brx($$2));
      }
   }

   public cwl b(ji<cwj> $$0) {
      return new cwl(Optional.of($$0), this.e, this.f);
   }

   public cwl a(brx $$0) {
      return new cwl(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(ji<cwj> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<brx> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<brx> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (brx $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * aye.b.b($$6);
            $$2 += $$7 * aye.b.c($$6);
            $$3 += $$7 * aye.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(aye.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<brx> d() {
      return Lists.transform(this.f, brx::new);
   }

   public void a(Consumer<xl> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<brx> $$0, Consumer<xl> $$1, float $$2, float $$3) {
      List<Pair<ji<bun>, buq>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (brx $$6 : $$0) {
         $$5 = false;
         xz $$7 = xl.c($$6.i());
         ji<brv> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xl.a("potion.withAmplifier", $$7, xl.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xl.a("potion.withDuration", $$7, bry.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xk.a);
         $$1.accept(xl.c("potion.whenDrank").a(n.f));

         for (Pair<ji<bun>, buq> $$9 : $$4) {
            buq $$10 = (buq)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != buq.a.b && $$10.e() != buq.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xl.a("attribute.modifier.plus." + $$10.e().a(), cxf.d.format($$13), xl.c(((bun)((ji)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xl.a("attribute.modifier.take." + $$10.e().a(), cxf.d.format($$13), xl.c(((bun)((ji)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ji<cwj>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
