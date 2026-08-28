import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record czn(Optional<jq<czl>> d, Optional<Integer> e, List<buo> f, Optional<String> g) implements czv {
   public static final czn a = new czn(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xv h = xv.c("effect.none").a(n.h);
   private static final int i = -13083194;
   private static final Codec<czn> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czl.a.optionalFieldOf("potion").forGetter(czn::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(czn::f),
               buo.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(czn::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(czn::g)
            )
            .apply($$0, czn::new)
   );
   public static final Codec<czn> b = Codec.withAlternative(j, czl.a, czn::new);
   public static final zt<xg, czn> c = zt.a(czl.b.a(zr::a), czn::e, zr.g.a(zr::a), czn::f, buo.e.a(zr.a()), czn::d, zr.o.a(zr::a), czn::g, czn::new);

   public czn(jq<czl> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static cxo a(cxk $$0, jq<czl> $$1) {
      cxo $$2 = new cxo($$0);
      $$2.b(ku.Q, new czn($$1));
      return $$2;
   }

   public boolean a(jq<czl> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<buo> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<buo>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<buo> $$0) {
      if (this.d.isPresent()) {
         for (buo $$1 : this.d.get().a().a()) {
            $$0.accept(new buo($$1));
         }
      }

      for (buo $$2 : this.f) {
         $$0.accept(new buo($$2));
      }
   }

   public czn b(jq<czl> $$0) {
      return new czn(Optional.of($$0), this.e, this.f, this.g);
   }

   public czn a(buo $$0) {
      return new czn(this.d, this.e, ae.a(this.f, $$0), this.g);
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jq<czl> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<buo> $$0) {
      return b($$0).orElse(-13083194);
   }

   public xv a(String $$0) {
      String $$1 = this.g.or(() -> this.d.map($$0x -> ((czl)$$0x.a()).b())).orElse("empty");
      return xv.c($$0 + $$1);
   }

   public static OptionalInt b(Iterable<buo> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (buo $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * ayp.b($$6);
            $$2 += $$7 * ayp.c($$6);
            $$3 += $$7 * ayp.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(ayp.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<buo> d() {
      return Lists.transform(this.f, buo::new);
   }

   public void a(Consumer<xv> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(bwf $$0) {
      if ($$0.dV() instanceof ash $$1) {
         cpw $$4 = $$0 instanceof cpw $$3 ? $$3 : null;
         this.a((Consumer<buo>)($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$1, $$4, $$4, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }));
      }
   }

   public static void a(Iterable<buo> $$0, Consumer<xv> $$1, float $$2, float $$3) {
      List<Pair<jq<bxi>, bxl>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (buo $$6 : $$0) {
         $$5 = false;
         yj $$7 = xv.c($$6.i());
         jq<bum> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xv.a("potion.withAmplifier", $$7, xv.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xv.a("potion.withDuration", $$7, bup.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xu.a);
         $$1.accept(xv.c("potion.whenDrank").a(n.f));

         for (Pair<jq<bxi>, bxl> $$9 : $$4) {
            bxl $$10 = (bxl)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bxl.a.b && $$10.d() != bxl.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xv.a("attribute.modifier.plus." + $$10.d().a(), daf.d.format($$13), xv.c(((bxi)((jq)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xv.a("attribute.modifier.take." + $$10.d().a(), daf.d.format($$13), xv.c(((bxi)((jq)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, czu $$3) {
      this.a($$1);
   }

   public Optional<jq<czl>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
