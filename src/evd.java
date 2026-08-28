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

public class evd extends evt {
   private static final Map<all, evd.c> b = Stream.of(evd.a.a, evd.d.b, evd.e.b).collect(Collectors.toMap(evd.c::a, Function.identity()));
   private static final Codec<evd.c> c = all.a.comapFlatMap($$0 -> {
      evd.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, evd.c::a);
   private static final MapCodec<evd.b> d = ayw.a("formula", "parameters", c, evd.b::a, evd.c::b);
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dbw.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, evd::new)
   );
   private final jq<dbw> e;
   private final evd.b f;

   private evd(List<exr> $$0, jq<dbw> $$1, evd.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public evv<evd> b() {
      return evw.x;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.i);
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      cwf $$2 = $$1.c(exc.i);
      if ($$2 != null) {
         int $$3 = dby.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static evt.a<?> a(jq<dbw> $$0, float $$1, int $$2) {
      return a($$3 -> new evd($$3, $$0, new evd.a($$2, $$1)));
   }

   public static evt.a<?> a(jq<dbw> $$0) {
      return a($$1 -> new evd($$1, $$0, new evd.d()));
   }

   public static evt.a<?> b(jq<dbw> $$0) {
      return a($$1 -> new evd($$1, $$0, new evd.e(1)));
   }

   public static evt.a<?> a(jq<dbw> $$0, int $$1) {
      return a($$2 -> new evd($$2, $$0, new evd.e($$1)));
   }

   static record a(int b, float c) implements evd.b {
      private static final Codec<evd.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(evd.a::b), Codec.FLOAT.fieldOf("probability").forGetter(evd.a::c)).apply($$0, evd.a::new)
      );
      public static final evd.c a = new evd.c(all.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public evd.c a() {
         return a;
      }
   }

   interface b {
      int a(azv var1, int var2, int var3);

      evd.c a();
   }

   static record c(all a, Codec<? extends evd.b> b) {
   }

   static record d() implements evd.b {
      public static final Codec<evd.d> a = Codec.unit(evd.d::new);
      public static final evd.c b = new evd.c(all.b("ore_drops"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
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
      public evd.c a() {
         return b;
      }
   }

   static record e(int c) implements evd.b {
      public static final Codec<evd.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(evd.e::b)).apply($$0, evd.e::new)
      );
      public static final evd.c b = new evd.c(all.b("uniform_bonus_count"), a);

      @Override
      public int a(azv $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public evd.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
