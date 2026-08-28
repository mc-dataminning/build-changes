import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cxn(Optional<jn<cxl>> d, Optional<Integer> e, List<bsq> f) {
   public static final cxn a = new cxn(Optional.empty(), Optional.empty(), List.of());
   private static final xd g = xd.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cxn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxl.a.optionalFieldOf("potion").forGetter(cxn::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cxn::f),
               bsq.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cxn::d)
            )
            .apply($$0, cxn::new)
   );
   public static final Codec<cxn> b = Codec.withAlternative(i, cxl.a, cxn::new);
   public static final zb<wo, cxn> c = zb.a(cxl.b.a(yz::a), cxn::e, yz.f.a(yz::a), cxn::f, bsq.e.a(yz.a()), cxn::d, cxn::new);

   public cxn(jn<cxl> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cvl a(cvg $$0, jn<cxl> $$1) {
      cvl $$2 = new cvl($$0);
      $$2.b(kr.I, new cxn($$1));
      return $$2;
   }

   public boolean a(jn<cxl> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bsq> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bsq>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bsq> $$0) {
      if (this.d.isPresent()) {
         for (bsq $$1 : this.d.get().a().a()) {
            $$0.accept(new bsq($$1));
         }
      }

      for (bsq $$2 : this.f) {
         $$0.accept(new bsq($$2));
      }
   }

   public cxn b(jn<cxl> $$0) {
      return new cxn(Optional.of($$0), this.e, this.f);
   }

   public cxn a(bsq $$0) {
      return new cxn(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jn<cxl> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bsq> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bsq> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bsq $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axn.b($$6);
            $$2 += $$7 * axn.c($$6);
            $$3 += $$7 * axn.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axn.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bsq> d() {
      return Lists.transform(this.f, bsq::new);
   }

   public void a(Consumer<xd> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bsq> $$0, Consumer<xd> $$1, float $$2, float $$3) {
      List<Pair<jn<bvh>, bvk>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bsq $$6 : $$0) {
         $$5 = false;
         xr $$7 = xd.c($$6.i());
         jn<bso> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xd.a("potion.withAmplifier", $$7, xd.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xd.a("potion.withDuration", $$7, bsr.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xc.a);
         $$1.accept(xd.c("potion.whenDrank").a(n.f));

         for (Pair<jn<bvh>, bvk> $$9 : $$4) {
            bvk $$10 = (bvk)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bvk.a.b && $$10.d() != bvk.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xd.a("attribute.modifier.plus." + $$10.d().a(), cyg.d.format($$13), xd.c(((bvh)((jn)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xd.a("attribute.modifier.take." + $$10.d().a(), cyg.d.format($$13), xd.c(((bvh)((jn)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<jn<cxl>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
