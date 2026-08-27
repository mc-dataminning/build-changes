import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ctz(sl d, Optional<ctz.a> e) {
   public static final String a = "entity";
   public static final Codec<ctz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sl.a.fieldOf("entity").forGetter($$0x -> $$0x.d), ctz.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, ctz::new)
   );
   public static final Codec<bif<ctz>> c = bif.a(b);

   public ctz() {
      this(new sl(), Optional.empty());
   }

   public ctz(sl d, Optional<ctz.a> e) {
      if (d.e("id")) {
         ahd $$2 = ahd.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sl a() {
      return this.d;
   }

   public Optional<ctz.a> b() {
      return this.e;
   }

   public sl c() {
      return this.d;
   }

   public Optional<ctz.a> d() {
      return this.e;
   }

   public static record a(aua<Integer> b, aua<Integer> c) {
      private static final aua<Integer> d = new aua<>(0, 15);
      public static final Codec<ctz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, ctz.a::new)
      );

      private static DataResult<aua<Integer>> a(aua<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aua<Integer>> a(String $$0) {
         return atq.a(aua.a.optionalFieldOf($$0, d), ctz.a::a);
      }

      public aua<Integer> a() {
         return this.b;
      }

      public aua<Integer> b() {
         return this.c;
      }
   }
}
