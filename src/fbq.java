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

public class fbq extends fcg {
   private static final Map<alr, fbq.c> b = Stream.of(fbq.a.a, fbq.d.b, fbq.e.b).collect(Collectors.toMap(fbq.c::a, Function.identity()));
   private static final Codec<fbq.c> c = alr.a.comapFlatMap($$0 -> {
      fbq.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, fbq.c::a);
   private static final MapCodec<fbq.b> d = azg.a("formula", "parameters", c, fbq.b::a, fbq.c::b);
   public static final MapCodec<fbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dgx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, fbq::new)
   );
   private final jg<dgx> e;
   private final fbq.b f;

   private fbq(List<fec> $$0, jg<dgx> $$1, fbq.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public fci<fbq> b() {
      return fcj.x;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.i);
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      dak $$2 = $$1.c(fdn.i);
      if ($$2 != null) {
         int $$3 = dgz.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static fcg.a<?> a(jg<dgx> $$0, float $$1, int $$2) {
      return a($$3 -> new fbq($$3, $$0, new fbq.a($$2, $$1)));
   }

   public static fcg.a<?> a(jg<dgx> $$0) {
      return a($$1 -> new fbq($$1, $$0, new fbq.d()));
   }

   public static fcg.a<?> b(jg<dgx> $$0) {
      return a($$1 -> new fbq($$1, $$0, new fbq.e(1)));
   }

   public static fcg.a<?> a(jg<dgx> $$0, int $$1) {
      return a($$2 -> new fbq($$2, $$0, new fbq.e($$1)));
   }

   static record a(int b, float c) implements fbq.b {
      private static final Codec<fbq.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(fbq.a::b), Codec.FLOAT.fieldOf("probability").forGetter(fbq.a::c)).apply($$0, fbq.a::new)
      );
      public static final fbq.c a = new fbq.c(alr.b("binomial_with_bonus_count"), d);

      @Override
      public int a(bai $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public fbq.c a() {
         return a;
      }
   }

   interface b {
      int a(bai var1, int var2, int var3);

      fbq.c a();
   }

   static record c(alr a, Codec<? extends fbq.b> b) {
   }

   static record d() implements fbq.b {
      public static final Codec<fbq.d> a = Codec.unit(fbq.d::new);
      public static final fbq.c b = new fbq.c(alr.b("ore_drops"), a);

      @Override
      public int a(bai $$0, int $$1, int $$2) {
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
      public fbq.c a() {
         return b;
      }
   }

   static record e(int c) implements fbq.b {
      public static final Codec<fbq.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(fbq.e::b)).apply($$0, fbq.e::new)
      );
      public static final fbq.c b = new fbq.c(alr.b("uniform_bonus_count"), a);

      @Override
      public int a(bai $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public fbq.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
