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

public class evk extends ewa {
   private static final Map<alj, evk.c> b = Stream.of(evk.a.a, evk.d.b, evk.e.b).collect(Collectors.toMap(evk.c::a, Function.identity()));
   private static final Codec<evk.c> c = alj.a.comapFlatMap($$0 -> {
      evk.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, evk.c::a);
   private static final MapCodec<evk.b> d = ayv.a("formula", "parameters", c, evk.b::a, evk.c::b);
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcd.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, evk::new)
   );
   private final jq<dcd> e;
   private final evk.b f;

   private evk(List<exy> $$0, jq<dcd> $$1, evk.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public ewc<evk> b() {
      return ewd.x;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.i);
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      cwm $$2 = $$1.c(exj.i);
      if ($$2 != null) {
         int $$3 = dcf.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static ewa.a<?> a(jq<dcd> $$0, float $$1, int $$2) {
      return a($$3 -> new evk($$3, $$0, new evk.a($$2, $$1)));
   }

   public static ewa.a<?> a(jq<dcd> $$0) {
      return a($$1 -> new evk($$1, $$0, new evk.d()));
   }

   public static ewa.a<?> b(jq<dcd> $$0) {
      return a($$1 -> new evk($$1, $$0, new evk.e(1)));
   }

   public static ewa.a<?> a(jq<dcd> $$0, int $$1) {
      return a($$2 -> new evk($$2, $$0, new evk.e($$1)));
   }

   static record a(int b, float c) implements evk.b {
      private static final Codec<evk.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(evk.a::b), Codec.FLOAT.fieldOf("probability").forGetter(evk.a::c)).apply($$0, evk.a::new)
      );
      public static final evk.c a = new evk.c(alj.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azu $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public evk.c a() {
         return a;
      }
   }

   interface b {
      int a(azu var1, int var2, int var3);

      evk.c a();
   }

   static record c(alj a, Codec<? extends evk.b> b) {
   }

   static record d() implements evk.b {
      public static final Codec<evk.d> a = Codec.unit(evk.d::new);
      public static final evk.c b = new evk.c(alj.b("ore_drops"), a);

      @Override
      public int a(azu $$0, int $$1, int $$2) {
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
      public evk.c a() {
         return b;
      }
   }

   static record e(int c) implements evk.b {
      public static final Codec<evk.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(evk.e::b)).apply($$0, evk.e::new)
      );
      public static final evk.c b = new evk.c(alj.b("uniform_bonus_count"), a);

      @Override
      public int a(azu $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public evk.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
