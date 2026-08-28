import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cye(Optional<jq<cyc>> d, Optional<Integer> e, List<btn> f, Optional<String> g) implements cym {
   public static final cye a = new cye(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xl h = xl.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<cye> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyc.a.optionalFieldOf("potion").forGetter(cye::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cye::f),
               btn.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cye::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(cye::g)
            )
            .apply($$0, cye::new)
   );
   public static final Codec<cye> b = Codec.withAlternative(j, cyc.a, cye::new);
   public static final zj<ww, cye> c = zj.a(cyc.b.a(zh::a), cye::e, zh.g.a(zh::a), cye::f, btn.e.a(zh.a()), cye::d, zh.m.a(zh::a), cye::g, cye::new);

   public cye(jq<cyc> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cwf a(cwb $$0, jq<cyc> $$1) {
      cwf $$2 = new cwf($$0);
      $$2.b(ku.Q, new cye($$1));
      return $$2;
   }

   public boolean a(jq<cyc> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<btn> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<btn>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<btn> $$0) {
      if (this.d.isPresent()) {
         for (btn $$1 : this.d.get().a().a()) {
            $$0.accept(new btn($$1));
         }
      }

      for (btn $$2 : this.f) {
         $$0.accept(new btn($$2));
      }
   }

   public cye b(jq<cyc> $$0) {
      return new cye(Optional.of($$0), this.e, this.f, this.g);
   }

   public cye a(btn $$0) {
      return new cye(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<cyc> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<btn> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xl a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((cyc)$$0x.a()).b())).orElse("empty");
      return xl.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<btn> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (btn $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axy.b($$6);
            $$2 += $$7 * axy.c($$6);
            $$3 += $$7 * axy.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axy.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<btn> d() {
      return Lists.transform(this.f, btn::new);
   }

   public void a(Consumer<xl> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bve $$0) {
      if (!$$0.dY().C) {
         cor $$2 = $$0 instanceof cor $$1 ? $$1 : null;
         this.a((Consumer<btn>)($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$2, $$2, $$0, $$2x.e(), 1.0);
            } else {
               $$0.a($$2x);
            }
         }));
      }
   }

   public static void a(Iterable<btn> $$0, Consumer<xl> $$1, float $$2, float $$3) {
      List<Pair<jq<bwh>, bwk>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (btn $$6 : $$0) {
         $$5 = false;
         xz $$7 = xl.c($$6.i());
         jq<btl> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xl.a("potion.withAmplifier", $$7, xl.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xl.a("potion.withDuration", $$7, bto.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xk.a);
         $$1.accept(xl.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bwh>, bwk> $$9 : $$4) {
            bwk $$10 = (bwk)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwk.a.b && $$10.d() != bwk.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xl.a("attribute.modifier.plus." + $$10.d().a(), cyw.d.format($$13), xl.c(((bwh)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xl.a("attribute.modifier.take." + $$10.d().a(), cyw.d.format($$13), xl.c(((bwh)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, cyl $$3) {
      this.a($$1);
   }

   public Optional<jq<cyc>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
