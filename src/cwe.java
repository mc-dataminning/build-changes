import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwe(sw d, Optional<cwe.a> e) {
   public static final String a = "entity";
   public static final Codec<cwe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sw.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cwe.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cwe::new)
   );
   public static final Codec<bke<cwe>> c = bke.a(b);

   public cwe() {
      this(new sw(), Optional.empty());
   }

   public cwe(sw d, Optional<cwe.a> e) {
      if (d.e("id")) {
         aiy $$2 = aiy.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sw a() {
      return this.d;
   }

   public Optional<cwe.a> b() {
      return this.e;
   }

   public sw c() {
      return this.d;
   }

   public Optional<cwe.a> d() {
      return this.e;
   }

   public static record a(avz<Integer> b, avz<Integer> c) {
      private static final avz<Integer> d = new avz<>(0, 15);
      public static final Codec<cwe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cwe.a::new)
      );

      private static DataResult<avz<Integer>> a(avz<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<avz<Integer>> a(String $$0) {
         return avp.a(avz.a.optionalFieldOf($$0, d), cwe.a::a);
      }

      public avz<Integer> a() {
         return this.b;
      }

      public avz<Integer> b() {
         return this.c;
      }
   }
}
