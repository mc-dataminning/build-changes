import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record dbj(Optional<jf<dbh>> e, Optional<Integer> f, List<bvm> g, Optional<String> h) implements dbt, dcs {
   public static final dbj a = new dbj(Optional.empty(), Optional.empty(), List.of(), Optional.empty());
   private static final wy i = wy.c("effect.none").a(o.h);
   public static final int b = -13083194;
   private static final Codec<dbj> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbh.a.optionalFieldOf("potion").forGetter(dbj::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(dbj::f),
               bvm.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(dbj::d),
               Codec.STRING.optionalFieldOf("custom_name").forGetter(dbj::g)
            )
            .apply($$0, dbj::new)
   );
   public static final Codec<dbj> c = Codec.withAlternative(j, dbh.a, dbj::new);
   public static final yw<wj, dbj> d = yw.a(dbh.b.a(yu::a), dbj::e, yu.g.a(yu::a), dbj::f, bvm.e.a(yu.a()), dbj::d, yu.p.a(yu::a), dbj::g, dbj::new);

   public dbj(jf<dbh> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of(), Optional.empty());
   }

   public static czn a(czj $$0, jf<dbh> $$1) {
      czn $$2 = new czn($$0);
      $$2.b(kk.R, new dbj($$1));
      return $$2;
   }

   public boolean a(jf<dbh> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bvm> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bvm>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bvm> $$0, float $$1) {
      if (this.e.isPresent()) {
         for (bvm $$2 : this.e.get().a().a()) {
            $$0.accept($$2.a($$1));
         }
      }

      for (bvm $$3 : this.g) {
         $$0.accept($$3.a($$1));
      }
   }

   public dbj b(jf<dbh> $$0) {
      return new dbj(Optional.of($$0), this.f, this.g, this.h);
   }

   public dbj a(bvm $$0) {
      return new dbj(this.e, this.f, ag.a(this.g, $$0), this.h);
   }

   public int b() {
      return this.a(-13083194);
   }

   public int a(int $$0) {
      return this.f.isPresent() ? this.f.get() : a(this.a()).orElse($$0);
   }

   public wy a(String $$0) {
      String $$1 = this.h.or(() -> this.e.map($$0x -> ((dbh)$$0x.a()).b())).orElse("empty");
      return wy.c($$0 + $$1);
   }

   public static OptionalInt a(Iterable<bvm> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bvm $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().i();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axw.b($$6);
            $$2 += $$7 * axw.c($$6);
            $$3 += $$7 * axw.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axw.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bvm> d() {
      return Lists.transform(this.g, bvm::new);
   }

   public void a(bxj $$0, float $$1) {
      if ($$0.dU() instanceof arq $$2) {
         crm $$5 = $$0 instanceof crm $$4 ? $$4 : null;
         this.a($$3x -> {
            if ($$3x.c().a().a()) {
               $$3x.c().a().a($$2, $$5, $$5, $$0, $$3x.e(), 1.0);
            } else {
               $$0.a($$3x);
            }
         }, $$1);
      }
   }

   public static void a(Iterable<bvm> $$0, Consumer<wy> $$1, float $$2, float $$3) {
      List<Pair<jf<byk>, byn>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bvm $$6 : $$0) {
         $$5 = false;
         jf<bvk> $$7 = $$6.c();
         int $$8 = $$6.e();
         $$7.a().a($$8, ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         xm $$9 = a($$7, $$8);
         if (!$$6.a(20)) {
            $$9 = wy.a("potion.withDuration", $$9, bvn.a($$6, $$2, $$3));
         }

         $$1.accept($$9.a($$7.a().h().a()));
      }

      if ($$5) {
         $$1.accept(i);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wx.a);
         $$1.accept(wy.c("potion.whenDrank").a(o.f));

         for (Pair<jf<byk>, byn> $$10 : $$4) {
            byn $$11 = (byn)$$10.getSecond();
            double $$12 = $$11.b();
            double $$14;
            if ($$11.c() != byn.a.b && $$11.c() != byn.a.c) {
               $$14 = $$11.b();
            } else {
               $$14 = $$11.b() * 100.0;
            }

            if ($$12 > 0.0) {
               $$1.accept(wy.a("attribute.modifier.plus." + $$11.c().a(), dce.d.format($$14), wy.c(((byk)((jf)$$10.getFirst()).a()).c())).a(o.j));
            } else if ($$12 < 0.0) {
               $$14 *= -1.0;
               $$1.accept(wy.a("attribute.modifier.take." + $$11.c().a(), dce.d.format($$14), wy.c(((byk)((jf)$$10.getFirst()).a()).c())).a(o.m));
            }
         }
      }
   }

   public static xm a(jf<bvk> $$0, int $$1) {
      xm $$2 = wy.c($$0.a().f());
      return $$1 > 0 ? wy.a("potion.withAmplifier", $$2, wy.c("potion.potency." + $$1)) : $$2;
   }

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, dbs $$3) {
      this.a($$1, $$2.a(kk.S, 1.0F));
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      a(this.a(), $$1, $$3.a(kk.S, 1.0F), $$0.b());
   }

   public Optional<String> g() {
      return this.h;
   }
}
