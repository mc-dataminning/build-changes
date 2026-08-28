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

public class ewo extends exe {
   private static final Map<akv, ewo.c> b = Stream.of(ewo.a.a, ewo.d.b, ewo.e.b).collect(Collectors.toMap(ewo.c::a, Function.identity()));
   private static final Codec<ewo.c> c = akv.a.comapFlatMap($$0 -> {
      ewo.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ewo.c::a);
   private static final MapCodec<ewo.b> d = ayi.a("formula", "parameters", c, ewo.b::a, ewo.c::b);
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcz.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ewo::new)
   );
   private final jr<dcz> e;
   private final ewo.b f;

   private ewo(List<eza> $$0, jr<dcz> $$1, ewo.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exg<ewo> b() {
      return exh.x;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.i);
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      cwp $$2 = $$1.c(eyl.i);
      if ($$2 != null) {
         int $$3 = ddb.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exe.a<?> a(jr<dcz> $$0, float $$1, int $$2) {
      return a($$3 -> new ewo($$3, $$0, new ewo.a($$2, $$1)));
   }

   public static exe.a<?> a(jr<dcz> $$0) {
      return a($$1 -> new ewo($$1, $$0, new ewo.d()));
   }

   public static exe.a<?> b(jr<dcz> $$0) {
      return a($$1 -> new ewo($$1, $$0, new ewo.e(1)));
   }

   public static exe.a<?> a(jr<dcz> $$0, int $$1) {
      return a($$2 -> new ewo($$2, $$0, new ewo.e($$1)));
   }

   static record a(int b, float c) implements ewo.b {
      private static final Codec<ewo.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ewo.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ewo.a::c)).apply($$0, ewo.a::new)
      );
      public static final ewo.c a = new ewo.c(akv.b("binomial_with_bonus_count"), d);

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
      public ewo.c a() {
         return a;
      }
   }

   interface b {
      int a(azh var1, int var2, int var3);

      ewo.c a();
   }

   static record c(akv a, Codec<? extends ewo.b> b) {
   }

   static record d() implements ewo.b {
      public static final Codec<ewo.d> a = Codec.unit(ewo.d::new);
      public static final ewo.c b = new ewo.c(akv.b("ore_drops"), a);

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
      public ewo.c a() {
         return b;
      }
   }

   static record e(int c) implements ewo.b {
      public static final Codec<ewo.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ewo.e::b)).apply($$0, ewo.e::new)
      );
      public static final ewo.c b = new ewo.c(akv.b("uniform_bonus_count"), a);

      @Override
      public int a(azh $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ewo.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
