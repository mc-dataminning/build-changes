import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cxr(Optional<jo<cxp>> d, Optional<Integer> e, List<bsy> f) implements cyf {
   public static final cxr a = new cxr(Optional.empty(), Optional.empty(), List.of());
   private static final xe g = xe.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cxr> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxp.a.optionalFieldOf("potion").forGetter(cxr::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cxr::f),
               bsy.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cxr::d)
            )
            .apply($$0, cxr::new)
   );
   public static final Codec<cxr> b = Codec.withAlternative(i, cxp.a, cxr::new);
   public static final zc<wp, cxr> c = zc.a(cxp.b.a(za::a), cxr::e, za.g.a(za::a), cxr::f, bsy.e.a(za.a()), cxr::d, cxr::new);

   public cxr(jo<cxp> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cvs a(cvn $$0, jo<cxp> $$1) {
      cvs $$2 = new cvs($$0);
      $$2.b(ks.L, new cxr($$1));
      return $$2;
   }

   public boolean a(jo<cxp> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bsy> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bsy>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bsy> $$0) {
      if (this.d.isPresent()) {
         for (bsy $$1 : this.d.get().a().a()) {
            $$0.accept(new bsy($$1));
         }
      }

      for (bsy $$2 : this.f) {
         $$0.accept(new bsy($$2));
      }
   }

   public cxr b(jo<cxp> $$0) {
      return new cxr(Optional.of($$0), this.e, this.f);
   }

   public cxr a(bsy $$0) {
      return new cxr(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jo<cxp> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bsy> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bsy> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bsy $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axq.b($$6);
            $$2 += $$7 * axq.c($$6);
            $$3 += $$7 * axq.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axq.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bsy> d() {
      return Lists.transform(this.f, bsy::new);
   }

   public void a(Consumer<xe> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bun $$0) {
      if (!$$0.dS().B) {
         cnx $$2 = $$0 instanceof cnx $$1 ? $$1 : null;
         this.a((Consumer<bsy>)($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$2, $$2, $$0, $$2x.e(), 1.0);
            } else {
               $$0.a($$2x);
            }
         }));
      }
   }

   public static void a(Iterable<bsy> $$0, Consumer<xe> $$1, float $$2, float $$3) {
      List<Pair<jo<bvp>, bvs>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bsy $$6 : $$0) {
         $$5 = false;
         xs $$7 = xe.c($$6.i());
         jo<bsw> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xe.a("potion.withAmplifier", $$7, xe.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xe.a("potion.withDuration", $$7, bsz.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xd.a);
         $$1.accept(xe.c("potion.whenDrank").a(n.f));

         for (Pair<jo<bvp>, bvs> $$9 : $$4) {
            bvs $$10 = (bvs)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bvs.a.b && $$10.d() != bvs.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xe.a("attribute.modifier.plus." + $$10.d().a(), cyn.d.format($$13), xe.c(((bvp)((jo)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xe.a("attribute.modifier.take." + $$10.d().a(), cyn.d.format($$13), xe.c(((bvp)((jo)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, cye $$3) {
      this.a($$1);
   }

   public Optional<jo<cxp>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
