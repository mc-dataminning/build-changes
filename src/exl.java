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

public class exl extends eyb {
   private static final Map<alz, exl.c> b = Stream.of(exl.a.a, exl.d.b, exl.e.b).collect(Collectors.toMap(exl.c::a, Function.identity()));
   private static final Codec<exl.c> c = alz.a.comapFlatMap($$0 -> {
      exl.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, exl.c::a);
   private static final MapCodec<exl.b> d = azn.a("formula", "parameters", c, exl.b::a, exl.c::b);
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddy.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, exl::new)
   );
   private final jq<ddy> e;
   private final exl.b f;

   private exl(List<ezx> $$0, jq<ddy> $$1, exl.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public eyd<exl> b() {
      return eye.x;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.i);
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      cxo $$2 = $$1.c(ezi.i);
      if ($$2 != null) {
         int $$3 = dea.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static eyb.a<?> a(jq<ddy> $$0, float $$1, int $$2) {
      return a($$3 -> new exl($$3, $$0, new exl.a($$2, $$1)));
   }

   public static eyb.a<?> a(jq<ddy> $$0) {
      return a($$1 -> new exl($$1, $$0, new exl.d()));
   }

   public static eyb.a<?> b(jq<ddy> $$0) {
      return a($$1 -> new exl($$1, $$0, new exl.e(1)));
   }

   public static eyb.a<?> a(jq<ddy> $$0, int $$1) {
      return a($$2 -> new exl($$2, $$0, new exl.e($$1)));
   }

   static record a(int b, float c) implements exl.b {
      private static final Codec<exl.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(exl.a::b), Codec.FLOAT.fieldOf("probability").forGetter(exl.a::c)).apply($$0, exl.a::new)
      );
      public static final exl.c a = new exl.c(alz.b("binomial_with_bonus_count"), d);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public exl.c a() {
         return a;
      }
   }

   interface b {
      int a(bam var1, int var2, int var3);

      exl.c a();
   }

   static record c(alz a, Codec<? extends exl.b> b) {
   }

   static record d() implements exl.b {
      public static final Codec<exl.d> a = Codec.unit(exl.d::new);
      public static final exl.c b = new exl.c(alz.b("ore_drops"), a);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
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
      public exl.c a() {
         return b;
      }
   }

   static record e(int c) implements exl.b {
      public static final Codec<exl.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(exl.e::b)).apply($$0, exl.e::new)
      );
      public static final exl.c b = new exl.c(alz.b("uniform_bonus_count"), a);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public exl.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
