import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfu(uk d, Optional<dfu.a> e, Optional<buo> f) {
   public static final String a = "entity";
   public static final Codec<dfu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uk.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dfu.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               buo.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dfu::new)
   );
   public static final Codec<bql<dfu>> c = bql.a(b);

   public dfu() {
      this(new uk(), Optional.empty(), Optional.empty());
   }

   public dfu(uk d, Optional<dfu.a> e, Optional<buo> f) {
      if (d.e("id")) {
         ali $$3 = ali.c(d.l("id"));
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

   public uk a() {
      return this.d;
   }

   public Optional<dfu.a> b() {
      return this.e;
   }

   public Optional<buo> c() {
      return this.f;
   }

   public static record a(azc<Integer> b, azc<Integer> c) {
      private static final azc<Integer> d = new azc<>(0, 15);
      public static final Codec<dfu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dfu.a::new)
      );

      private static DataResult<azc<Integer>> a(azc<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azc<Integer>> a(String $$0) {
         return azc.a.lenientOptionalFieldOf($$0, d).validate(dfu.a::a);
      }

      public boolean a(jh $$0, arn $$1) {
         return this.b.a($$1.a(dfk.b, $$0)) && this.c.a($$1.a(dfk.a, $$0));
      }

      public azc<Integer> a() {
         return this.b;
      }

      public azc<Integer> b() {
         return this.c;
      }
   }
}
