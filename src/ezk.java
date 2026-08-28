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

public class ezk extends faa {
   private static final Map<ale, ezk.c> b = Stream.of(ezk.a.a, ezk.d.b, ezk.e.b).collect(Collectors.toMap(ezk.c::a, Function.identity()));
   private static final Codec<ezk.c> c = ale.a.comapFlatMap($$0 -> {
      ezk.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ezk.c::a);
   private static final MapCodec<ezk.b> d = ays.a("formula", "parameters", c, ezk.b::a, ezk.c::b);
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dff.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ezk::new)
   );
   private final je<dff> e;
   private final ezk.b f;

   private ezk(List<fbw> $$0, je<dff> $$1, ezk.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fac<ezk> b() {
      return fad.x;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.i);
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      cys $$2 = $$1.c(fbh.i);
      if ($$2 != null) {
         int $$3 = dfh.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static faa.a<?> a(je<dff> $$0, float $$1, int $$2) {
      return a($$3 -> new ezk($$3, $$0, new ezk.a($$2, $$1)));
   }

   public static faa.a<?> a(je<dff> $$0) {
      return a($$1 -> new ezk($$1, $$0, new ezk.d()));
   }

   public static faa.a<?> b(je<dff> $$0) {
      return a($$1 -> new ezk($$1, $$0, new ezk.e(1)));
   }

   public static faa.a<?> a(je<dff> $$0, int $$1) {
      return a($$2 -> new ezk($$2, $$0, new ezk.e($$1)));
   }

   static record a(int b, float c) implements ezk.b {
      private static final Codec<ezk.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ezk.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ezk.a::c)).apply($$0, ezk.a::new)
      );
      public static final ezk.c a = new ezk.c(ale.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azt $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ezk.c a() {
         return a;
      }
   }

   interface b {
      int a(azt var1, int var2, int var3);

      ezk.c a();
   }

   static record c(ale a, Codec<? extends ezk.b> b) {
   }

   static record d() implements ezk.b {
      public static final Codec<ezk.d> a = Codec.unit(ezk.d::new);
      public static final ezk.c b = new ezk.c(ale.b("ore_drops"), a);

      @Override
      public int a(azt $$0, int $$1, int $$2) {
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
      public ezk.c a() {
         return b;
      }
   }

   static record e(int c) implements ezk.b {
      public static final Codec<ezk.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ezk.e::b)).apply($$0, ezk.e::new)
      );
      public static final ezk.c b = new ezk.c(ale.b("uniform_bonus_count"), a);

      @Override
      public int a(azt $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ezk.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
