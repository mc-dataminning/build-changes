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

public class ewm extends exc {
   private static final Map<aku, ewm.c> b = Stream.of(ewm.a.a, ewm.d.b, ewm.e.b).collect(Collectors.toMap(ewm.c::a, Function.identity()));
   private static final Codec<ewm.c> c = aku.a.comapFlatMap($$0 -> {
      ewm.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, ewm.c::a);
   private static final MapCodec<ewm.b> d = ayh.a("formula", "parameters", c, ewm.b::a, ewm.c::b);
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dcx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, ewm::new)
   );
   private final jr<dcx> e;
   private final ewm.b f;

   private ewm(List<eyy> $$0, jr<dcx> $$1, ewm.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exe<ewm> b() {
      return exf.x;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.i);
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      cwn $$2 = $$1.c(eyj.i);
      if ($$2 != null) {
         int $$3 = dcz.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.M(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exc.a<?> a(jr<dcx> $$0, float $$1, int $$2) {
      return a($$3 -> new ewm($$3, $$0, new ewm.a($$2, $$1)));
   }

   public static exc.a<?> a(jr<dcx> $$0) {
      return a($$1 -> new ewm($$1, $$0, new ewm.d()));
   }

   public static exc.a<?> b(jr<dcx> $$0) {
      return a($$1 -> new ewm($$1, $$0, new ewm.e(1)));
   }

   public static exc.a<?> a(jr<dcx> $$0, int $$1) {
      return a($$2 -> new ewm($$2, $$0, new ewm.e($$1)));
   }

   static record a(int b, float c) implements ewm.b {
      private static final Codec<ewm.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(ewm.a::b), Codec.FLOAT.fieldOf("probability").forGetter(ewm.a::c)).apply($$0, ewm.a::new)
      );
      public static final ewm.c a = new ewm.c(aku.b("binomial_with_bonus_count"), d);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
         for (int $$3 = 0; $$3 < $$2 + this.b; $$3++) {
            if ($$0.i() < this.c) {
               $$1++;
            }
         }

         return $$1;
      }

      @Override
      public ewm.c a() {
         return a;
      }
   }

   interface b {
      int a(azg var1, int var2, int var3);

      ewm.c a();
   }

   static record c(aku a, Codec<? extends ewm.b> b) {
   }

   static record d() implements ewm.b {
      public static final Codec<ewm.d> a = Codec.unit(ewm.d::new);
      public static final ewm.c b = new ewm.c(aku.b("ore_drops"), a);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
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
      public ewm.c a() {
         return b;
      }
   }

   static record e(int c) implements ewm.b {
      public static final Codec<ewm.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(ewm.e::b)).apply($$0, ewm.e::new)
      );
      public static final ewm.c b = new ewm.c(aku.b("uniform_bonus_count"), a);

      @Override
      public int a(azg $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public ewm.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
