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

public class exe extends exu {
   private static final Map<alz, exe.c> b = Stream.of(exe.a.a, exe.d.b, exe.e.b).collect(Collectors.toMap(exe.c::a, Function.identity()));
   private static final Codec<exe.c> c = alz.a.comapFlatMap($$0 -> {
      exe.c $$1 = b.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No formula type with id: '" + $$0 + "'");
   }, exe.c::a);
   private static final MapCodec<exe.b> d = azn.a("formula", "parameters", c, exe.b::a, exe.c::b);
   public static final MapCodec<exe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddr.c.fieldOf("enchantment").forGetter($$0x -> $$0x.e), d.forGetter($$0x -> $$0x.f))).apply($$0, exe::new)
   );
   private final jq<ddr> e;
   private final exe.b f;

   private exe(List<ezs> $$0, jq<ddr> $$1, exe.b $$2) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public exw<exe> b() {
      return exx.x;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.i);
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      cxk $$2 = $$1.c(ezd.i);
      if ($$2 != null) {
         int $$3 = ddt.a(this.e, $$2);
         int $$4 = this.f.a($$1.b(), $$0.L(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static exu.a<?> a(jq<ddr> $$0, float $$1, int $$2) {
      return a($$3 -> new exe($$3, $$0, new exe.a($$2, $$1)));
   }

   public static exu.a<?> a(jq<ddr> $$0) {
      return a($$1 -> new exe($$1, $$0, new exe.d()));
   }

   public static exu.a<?> b(jq<ddr> $$0) {
      return a($$1 -> new exe($$1, $$0, new exe.e(1)));
   }

   public static exu.a<?> a(jq<ddr> $$0, int $$1) {
      return a($$2 -> new exe($$2, $$0, new exe.e($$1)));
   }

   static record a(int b, float c) implements exe.b {
      private static final Codec<exe.a> d = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("extra").forGetter(exe.a::b), Codec.FLOAT.fieldOf("probability").forGetter(exe.a::c)).apply($$0, exe.a::new)
      );
      public static final exe.c a = new exe.c(alz.b("binomial_with_bonus_count"), d);

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
      public exe.c a() {
         return a;
      }
   }

   interface b {
      int a(bam var1, int var2, int var3);

      exe.c a();
   }

   static record c(alz a, Codec<? extends exe.b> b) {
   }

   static record d() implements exe.b {
      public static final Codec<exe.d> a = Codec.unit(exe.d::new);
      public static final exe.c b = new exe.c(alz.b("ore_drops"), a);

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
      public exe.c a() {
         return b;
      }
   }

   static record e(int c) implements exe.b {
      public static final Codec<exe.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(exe.e::b)).apply($$0, exe.e::new)
      );
      public static final exe.c b = new exe.c(alz.b("uniform_bonus_count"), a);

      @Override
      public int a(bam $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.c * $$2 + 1);
      }

      @Override
      public exe.c a() {
         return b;
      }

      public int b() {
         return this.c;
      }
   }
}
