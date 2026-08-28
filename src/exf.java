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

public class exf extends exv {
   private static final Map<alp, exf.c> b = Stream.of(exf.a.a, exf.d.b, exf.e.b).collect(Collectors.toMap(exf.c::a, Function.identity()));
   private static final Codec<exf.c> c = alp.a.comapFlatMap($$0 -> {
      exf.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, exf.c::a);
   private static final MapCodec<exf.b> d = azd.a("formula", "parameters", c, exf.b::a, exf.c::b);
   public static final MapCodec<exf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddq.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, exf::new)
   );
   private final jq<ddq> e;
   private final exf.b f;

   private exf(List<ezr> $$0, jq<ddq> $$1, exf.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exx<exf> b() {
      return exy.x;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.i);
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      cxg $$2 = $$1.c(ezc.i);
      if ($$2 != null) {
         int $$3 = dds.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exv.a<?> a(jq<ddq> $$0, float $$1, int $$2) {
      return a($$3 -> new exf($$3, $$0, new exf.a($$2, $$1)));
   }

   public static exv.a<?> a(jq<ddq> $$0) {
      return a($$1 -> new exf($$1, $$0, new exf.d()));
   }

   public static exv.a<?> b(jq<ddq> $$0) {
      return a($$1 -> new exf($$1, $$0, new exf.e(1)));
   }

   public static exv.a<?> a(jq<ddq> $$0, int $$1) {
      return a($$2 -> new exf($$2, $$0, new exf.e($$1)));
   }

   static record a(int b, float c) implements exf.b {
      private static final Codec<exf.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(exf.a::b), Codec.FLOAT.fieldOf("probability").forGetter(exf.a::c)).apply($$0, exf.a::new)
      );
      public static final exf.c a = new exf.c(alp.b("binomial_with_bonus_count"), d);

      @Override
      public int a(bac $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public exf.c a() {
         return a;
      }
   }

   interface b {
      int a(bac var1, int var2, int var3);

      exf.c a();
   }

   static record c(alp a, Codec<? extends exf.b> b) {
   }

   static record d() implements exf.b {
      public static final Codec<exf.d> a = Codec.unit(exf.d::new);
      public static final exf.c b = new exf.c(alp.b("ore_drops"), a);

      @Override
      public int a(bac $$0, int $$1, int $$2) {
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
      public exf.c a() {
         return b;
      }
   }

   static record e(int c) implements exf.b {
      public static final Codec<exf.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(exf.e::b)).apply($$0, exf.e::new)
      );
      public static final exf.c b = new exf.c(alp.b("uniform_bonus_count"), a);

      @Override
      public int a(bac $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public exf.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
