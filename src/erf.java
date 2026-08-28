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

public class erf extends eru {
   private static final Map<alf, erf.c> b = Stream.of(erf.a.a, erf.d.b, erf.e.b).collect(Collectors.toMap(erf.c::a, Function.identity()));
   private static final Codec<erf.c> c = alf.a.comapFlatMap($$0 -> {
      erf.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, erf.c::a);
   private static final MapCodec<erf.b> d = ayh.a("formula", "parameters", c, erf.b::a, erf.c::b);
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(lp.f.r().fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, erf::new)
   );
   private final ji<daa> e;
   private final erf.b f;

   private erf(List<ets> $$0, ji<daa> $$1, erf.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public erw<erf> b() {
      return erx.x;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.i);
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      cup $$2 = $$1.c(ete.i);
      if ($$2 != null) {
         int $$3 = dab.a(this.e.a(), $$2);
         int $$4 = this.f.a($$1.b(), $$0.I(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eru.a<?> a(daa $$0, float $$1, int $$2) {
      return a($$3 -> new erf($$3, $$0.m(), new erf.a($$2, $$1)));
   }

   public static eru.a<?> a(daa $$0) {
      return a($$1 -> new erf($$1, $$0.m(), new erf.d()));
   }

   public static eru.a<?> b(daa $$0) {
      return a($$1 -> new erf($$1, $$0.m(), new erf.e(1)));
   }

   public static eru.a<?> a(daa $$0, int $$1) {
      return a($$2 -> new erf($$2, $$0.m(), new erf.e($$1)));
   }

   static record a(int b, float c) implements erf.b {
      private static final Codec<erf.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(erf.a::b), Codec.FLOAT.fieldOf("probability").forGetter(erf.a::c)).apply($$0, erf.a::new)
      );
      public static final erf.c a = new erf.c(new alf("binomial_with_bonus_count"), d);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public erf.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      erf.c a();
   }

   static record c(alf a, Codec<? extends erf.b> b) {
   }

   static record d() implements erf.b {
      public static final Codec<erf.d> a = Codec.unit(erf.d::new);
      public static final erf.c b = new erf.c(new alf("ore_drops"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
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
      public erf.c a() {
         return b;
      }
   }

   static record e(int c) implements erf.b {
      public static final Codec<erf.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(erf.e::b)).apply($$0, erf.e::new)
      );
      public static final erf.c b = new erf.c(new alf("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public erf.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
