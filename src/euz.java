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

public class euz extends evp {
   private static final Map<ali, euz.c> b = Stream.of(euz.a.a, euz.d.b, euz.e.b).collect(Collectors.toMap(euz.c::a, Function.identity()));
   private static final Codec<euz.c> c = ali.a.comapFlatMap($$0 -> {
      euz.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, euz.c::a);
   private static final MapCodec<euz.b> d = ayt.a("formula", "parameters", c, euz.b::a, euz.c::b);
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbs.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, euz::new)
   );
   private final jq<dbs> e;
   private final euz.b f;

   private euz(List<exn> $$0, jq<dbs> $$1, euz.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public evr<euz> b() {
      return evs.x;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.i);
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      cwb $$2 = $$1.c(ewy.i);
      if ($$2 != null) {
         int $$3 = dbu.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static evp.a<?> a(jq<dbs> $$0, float $$1, int $$2) {
      return a($$3 -> new euz($$3, $$0, new euz.a($$2, $$1)));
   }

   public static evp.a<?> a(jq<dbs> $$0) {
      return a($$1 -> new euz($$1, $$0, new euz.d()));
   }

   public static evp.a<?> b(jq<dbs> $$0) {
      return a($$1 -> new euz($$1, $$0, new euz.e(1)));
   }

   public static evp.a<?> a(jq<dbs> $$0, int $$1) {
      return a($$2 -> new euz($$2, $$0, new euz.e($$1)));
   }

   static record a(int b, float c) implements euz.b {
      private static final Codec<euz.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(euz.a::b), Codec.FLOAT.fieldOf("probability").forGetter(euz.a::c)).apply($$0, euz.a::new)
      );
      public static final euz.c a = new euz.c(ali.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public euz.c a() {
         return a;
      }
   }

   interface b {
      int a(azs var1, int var2, int var3);

      euz.c a();
   }

   static record c(ali a, Codec<? extends euz.b> b) {
   }

   static record d() implements euz.b {
      public static final Codec<euz.d> a = Codec.unit(euz.d::new);
      public static final euz.c b = new euz.c(ali.b("ore_drops"), a);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
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
      public euz.c a() {
         return b;
      }
   }

   static record e(int c) implements euz.b {
      public static final Codec<euz.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(euz.e::b)).apply($$0, euz.e::new)
      );
      public static final euz.c b = new euz.c(ali.b("uniform_bonus_count"), a);

      @Override
      public int a(azs $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public euz.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
