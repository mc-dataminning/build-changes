import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cxo(Optional<jn<cxm>> d, Optional<Integer> e, List<bsv> f) implements cyc {
   public static final cxo a = new cxo(Optional.empty(), Optional.empty(), List.of());
   private static final xd g = xd.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cxo> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxm.a.optionalFieldOf("potion").forGetter(cxo::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cxo::f),
               bsv.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cxo::d)
            )
            .apply($$0, cxo::new)
   );
   public static final Codec<cxo> b = Codec.withAlternative(i, cxm.a, cxo::new);
   public static final zb<wo, cxo> c = zb.a(cxm.b.a(yz::a), cxo::e, yz.f.a(yz::a), cxo::f, bsv.e.a(yz.a()), cxo::d, cxo::new);

   public cxo(jn<cxm> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cvp a(cvk $$0, jn<cxm> $$1) {
      cvp $$2 = new cvp($$0);
      $$2.b(kr.L, new cxo($$1));
      return $$2;
   }

   public boolean a(jn<cxm> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bsv> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bsv>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bsv> $$0) {
      if (this.d.isPresent()) {
         for (bsv $$1 : this.d.get().a().a()) {
            $$0.accept(new bsv($$1));
         }
      }

      for (bsv $$2 : this.f) {
         $$0.accept(new bsv($$2));
      }
   }

   public cxo b(jn<cxm> $$0) {
      return new cxo(Optional.of($$0), this.e, this.f);
   }

   public cxo a(bsv $$0) {
      return new cxo(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jn<cxm> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bsv> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bsv> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bsv $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axo.b($$6);
            $$2 += $$7 * axo.c($$6);
            $$3 += $$7 * axo.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axo.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bsv> d() {
      return Lists.transform(this.f, bsv::new);
   }

   public void a(Consumer<xd> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(buk $$0) {
      if (!$$0.dS().B) {
         cnu $$2 = $$0 instanceof cnu $$1 ? $$1 : null;
         this.a((Consumer<bsv>)($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$2, $$2, $$0, $$2x.e(), 1.0);
            } else {
               $$0.a($$2x);
            }
         }));
      }
   }

   public static void a(Iterable<bsv> $$0, Consumer<xd> $$1, float $$2, float $$3) {
      List<Pair<jn<bvm>, bvp>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bsv $$6 : $$0) {
         $$5 = false;
         xr $$7 = xd.c($$6.i());
         jn<bst> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xd.a("potion.withAmplifier", $$7, xd.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xd.a("potion.withDuration", $$7, bsw.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xc.a);
         $$1.accept(xd.c("potion.whenDrank").a(n.f));

         for (Pair<jn<bvm>, bvp> $$9 : $$4) {
            bvp $$10 = (bvp)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bvp.a.b && $$10.d() != bvp.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xd.a("attribute.modifier.plus." + $$10.d().a(), cyk.d.format($$13), xd.c(((bvm)((jn)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xd.a("attribute.modifier.take." + $$10.d().a(), cyk.d.format($$13), xd.c(((bvm)((jn)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, cyb $$3) {
      this.a($$1);
   }

   public Optional<jn<cxm>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
