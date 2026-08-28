import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dij(tw d, Optional<dij.a> e, Optional<bwe> f) {
   public static final String a = "entity";
   public static final Codec<dij> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tw.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dij.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bwe.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dij::new)
   );
   public static final Codec<bsb<dij>> c = bsb.a(b);

   public dij() {
      this(new tw(), Optional.empty(), Optional.empty());
   }

   public dij(tw d, Optional<dij.a> e, Optional<bwe> f) {
      if (d.e("id")) {
         ald $$3 = ald.c(d.l("id"));
         if ($$3 != null) {
            d.a("id", $$3.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tw a() {
      return this.d;
   }

   public Optional<dij.a> b() {
      return this.e;
   }

   public Optional<bwe> c() {
      return this.f;
   }

   public static record a(azc<Integer> b, azc<Integer> c) {
      private static final azc<Integer> d = new azc<>(0, 15);
      public static final Codec<dij.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dij.a::new)
      );

      private static DataResult<azc<Integer>> a(azc<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azc<Integer>> a(String $$0) {
         return azc.a.lenientOptionalFieldOf($$0, d).validate(dij.a::a);
      }

      public boolean a(jj $$0, arn $$1) {
         return this.b.a($$1.a(dhy.b, $$0)) && this.c.a($$1.a(dhy.a, $$0));
      }

      public azc<Integer> a() {
         return this.b;
      }

      public azc<Integer> b() {
         return this.c;
      }
   }
}
