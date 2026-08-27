import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public record cwr(Optional<ja<cwp>> e, Optional<Integer> f, List<brh> g) {
   public static final cwr a = new cwr(Optional.empty(), Optional.empty(), List.of());
   private static final xe h = xe.c("effect.none").a(n.h);
   private static final int i = 16253176;
   private static final int j = 3694022;
   public static final int b = -1;
   private static final Codec<cwr> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(lh.i.r(), "potion").forGetter(cwr::f),
               axu.a(Codec.INT, "custom_color").forGetter(cwr::g),
               axu.a(brh.d.listOf(), "custom_effects", List.of()).forGetter(cwr::e)
            )
            .apply($$0, cwr::new)
   );
   public static final Codec<cwr> c = axu.a(k, lh.i.r(), cwr::new);
   public static final zc<wp, cwr> d = zc.a(za.b(li.Y).a(za::a), cwr::f, za.f.a(za::a), cwr::g, brh.e.a(za.a()), cwr::e, cwr::new);

   public cwr(ja<cwp> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cuh a(cuc $$0, ja<cwp> $$1) {
      cuh $$2 = new cuh($$0);
      $$2.b(ke.E, new cwr($$1));
      return $$2;
   }

   public boolean a(ja<cwp> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<brh> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<brh>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<brh> $$0) {
      if (this.e.isPresent()) {
         for (brh $$1 : this.e.get().a().a()) {
            $$0.accept(new brh($$1));
         }
      }

      for (brh $$2 : this.g) {
         $$0.accept(new brh($$2));
      }
   }

   public cwr b(ja<cwp> $$0) {
      return new cwr(Optional.of($$0), this.f, this.g);
   }

   public cwr a(brh $$0) {
      return new cwr(this.e, this.f, ad.a(this.g, $$0));
   }

   public int b() {
      if (this.f.isPresent()) {
         return this.f.get();
      } else {
         return this.e.isEmpty() ? 16253176 : a(this.a());
      }
   }

   public int c() {
      return this.f.isPresent() ? this.f.get() : a(this.a());
   }

   public static int c(ja<cwp> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<brh> $$0) {
      int $$1 = b($$0);
      return $$1 == -1 ? 3694022 : $$1;
   }

   public static int b(Iterable<brh> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (brh $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axw.b.b($$6);
            $$2 += $$7 * axw.b.c($$6);
            $$3 += $$7 * axw.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? -1 : axw.b.a(0, $$1 / $$4, $$2 / $$4, $$3 / $$4);
   }

   public boolean d() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<brh> e() {
      return Lists.transform(this.g, brh::new);
   }

   public void a(Consumer<xe> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<brh> $$0, Consumer<xe> $$1, float $$2, float $$3) {
      List<Pair<ja<btq>, btt>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (brh $$6 : $$0) {
         $$5 = false;
         xs $$7 = xe.c($$6.i());
         ja<brf> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xe.a("potion.withAmplifier", $$7, xe.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xe.a("potion.withDuration", $$7, bri.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xd.a);
         $$1.accept(xe.c("potion.whenDrank").a(n.f));

         for (Pair<ja<btq>, btt> $$9 : $$4) {
            btt $$10 = (btt)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != btt.a.b && $$10.e() != btt.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xe.a("attribute.modifier.plus." + $$10.e().a(), cxl.d.format($$13), xe.c(((btq)((ja)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xe.a("attribute.modifier.take." + $$10.e().a(), cxl.d.format($$13), xe.c(((btq)((ja)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ja<cwp>> f() {
      return this.e;
   }

   public Optional<Integer> g() {
      return this.f;
   }
}
