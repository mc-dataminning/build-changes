import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record csr(rz d, Optional<csr.a> e) {
   public static final String a = "entity";
   public static final Codec<csr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(rz.a.fieldOf("entity").forGetter($$0x -> $$0x.d), csr.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, csr::new)
   );
   public static final Codec<bhh<csr>> c = bhh.a(b);

   public csr() {
      this(new rz(), Optional.empty());
   }

   public csr(rz d, Optional<csr.a> e) {
      if (d.e("id")) {
         agi $$2 = agi.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public rz a() {
      return this.d;
   }

   public Optional<csr.a> b() {
      return this.e;
   }

   public rz c() {
      return this.d;
   }

   public Optional<csr.a> d() {
      return this.e;
   }

   public static record a(ate<Integer> b, ate<Integer> c) {
      private static final ate<Integer> d = new ate<>(0, 15);
      public static final Codec<csr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, csr.a::new)
      );

      private static DataResult<ate<Integer>> a(ate<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ate<Integer>> a(String $$0) {
         return asu.a(ate.a.optionalFieldOf($$0, d), csr.a::a);
      }

      public ate<Integer> a() {
         return this.b;
      }

      public ate<Integer> b() {
         return this.c;
      }
   }
}
