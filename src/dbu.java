import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dbu(Optional<jf<dbs>> e, Optional<Integer> f, List<bvx> g, Optional<String> h) implements dce, ddd {
   public static final dbu a = new dbu(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final xa i = xa.c("effect.none").a(o.h);
   public static final int b = -13083194;
   private static final Codec<dbu> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbs.a.optionalFieldOf("potion").forGetter(dbu::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dbu::f),
               bvx.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dbu::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dbu::g)
            )
            .apply($$0, dbu::new)
   );
   public static final Codec<dbu> c = Codec.withAlternative(j, dbs.a, dbu::new);
   public static final yy<wl, dbu> d = yy.a(dbs.b.a(yw::a), dbu::e, yw.g.a(yw::a), dbu::f, bvx.e.a(yw.a()), dbu::d, yw.p.a(yw::a), dbu::g, dbu::new);

   public dbu(jf<dbs> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static czy a(czu $$0, jf<dbs> $$1) {
      czy $$2 = new czy($$0);
      $$2.b(kk.R, new dbu($$1));
      return $$2;
   }

   public boolean a(jf<dbs> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bvx> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bvx>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bvx> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bvx $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bvx $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dbu b(jf<dbs> $$0) {
      return new dbu(Optional.of($$0), this.f, this.g, this.h);
   }

   public dbu a(bvx $$0) {
      return new dbu(this.e, this.f, ag.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public xa a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dbs)$$0x.a()).b())).orElse("empty");
      return xa.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bvx> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bvx $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
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
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bvx> d() {
      return Lists.transform(this.g, bvx::new);
   }

   public void a(bxu $$0, float $$1) {
      if ($$0.dV() instanceof ars $$2) {
         crx $$5 = $$0 instanceof crx $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bvx> $$0, Consumer<xa> $$1, float $$2, float $$3) {
      List<Pair<jf<byv>, byy>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bvx $$6 : $$0) {
         $$5 = false;
         jf<bvv> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xo $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = xa.a("potion.withDuration", $$9, bvy.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wz.a);
         $$1.accept(xa.c("potion.whenDrank").a(o.f));

         for (Pair<jf<byv>, byy> $$10 : $$4) {
            byy $$11 = (byy)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != byy.a.b && $$11.c() != byy.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(xa.a("attribute.modifier.plus." + $$11.c().a(), dcp.d.format($$14), xa.c(((byv)((jf)$$10.getFirst()).a()).c())).a(o.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(xa.a("attribute.modifier.take." + $$11.c().a(), dcp.d.format($$14), xa.c(((byv)((jf)$$10.getFirst()).a()).c())).a(o.m));
            }
         }
      }
   }

   public static xo a(jf<bvv> $$0, int $$1) {
      xo $$2 = xa.c($$0.a().f());
      return $$1 > 0 ? xa.a("potion.withAmplifier", $$2, xa.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, dcd $$3) {
      this.a($$1, $$2.a(kk.S, 1.0F));
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      a(this.a(), $$1, $$3.a(kk.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
