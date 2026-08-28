import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eso extends ete {
   private static final Map<akr, eso.c> b = Stream.of(eso.a.a, eso.d.b, eso.e.b).collect(Collectors.toMap(eso.c::a, Function.identity()));
   private static final Codec<eso.c> c = akr.a.comapFlatMap($$0 -> {
      eso.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, eso.c::a);
   private static final MapCodec<eso.b> d = axw.a("formula", "parameters", c, eso.b::a, eso.c::b);
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dac.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, eso::new)
   );
   private final jm<dac> e;
   private final eso.b f;

   private eso(List<evc> $$0, jm<dac> $$1, eso.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public etg<eso> b() {
      return eth.x;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.i);
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      cuq $$2 = $$1.c(eun.i);
      if ($$2 != null) {
         int $$3 = dae.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.H(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static ete.a<?> a(jm<dac> $$0, float $$1, int $$2) {
      return a($$3 -> new eso($$3, $$0, new eso.a($$2, $$1)));
   }

   public static ete.a<?> a(jm<dac> $$0) {
      return a($$1 -> new eso($$1, $$0, new eso.d()));
   }

   public static ete.a<?> b(jm<dac> $$0) {
      return a($$1 -> new eso($$1, $$0, new eso.e(1)));
   }

   public static ete.a<?> a(jm<dac> $$0, int $$1) {
      return a($$2 -> new eso($$2, $$0, new eso.e($$1)));
   }

   static record a(int b, float c) implements eso.b {
      private static final Codec<eso.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(eso.a::b), Codec.FLOAT.fieldOf("probability").forGetter(eso.a::c)).apply($$0, eso.a::new)
      );
      public static final eso.c a = new eso.c(akr.b("binomial_with_bonus_count"), d);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public eso.c a() {
         return a;
      }
   }

   interface b {
      int a(ayw var1, int var2, int var3);

      eso.c a();
   }

   static record c(akr a, Codec<? extends eso.b> b) {
   }

   static record d() implements eso.b {
      public static final Codec<eso.d> a = Codec.unit(eso.d::new);
      public static final eso.c b = new eso.c(akr.b("ore_drops"), a);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public eso.c a() {
         return b;
      }
   }

   static record e(int c) implements eso.b {
      public static final Codec<eso.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(eso.e::b)).apply($$0, eso.e::new)
      );
      public static final eso.c b = new eso.c(akr.b("uniform_bonus_count"), a);

      @Override
      public int a(ayw $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public eso.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
