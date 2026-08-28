import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkr(tz d, Optional<dkr.a> e, Optional<bxf> f) {
   public static final String a = "entity";
   public static final Codec<dkr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tz.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dkr.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bxf.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dkr::new)
   );
   public static final Codec<btb<dkr>> c = btb.a(b);

   public dkr() {
      this(new tz(), Optional.empty(), Optional.empty());
   }

   public dkr(tz d, Optional<dkr.a> e, Optional<bxf> f) {
      Optional<ali> $$3 = d.a("id", ali.a);
      if ($$3.isPresent()) {
         d.a("id", ali.a, $$3.get());
      } else {
         d.r("id");
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tz a() {
      return this.d;
   }

   public Optional<dkr.a> b() {
      return this.e;
   }

   public Optional<bxf> c() {
      return this.f;
   }

   public static record a(azg<Integer> b, azg<Integer> c) {
      private static final azg<Integer> d = new azg<>(0, 15);
      public static final Codec<dkr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dkr.a::new)
      );

      private static DataResult<azg<Integer>> a(azg<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azg<Integer>> a(String $$0) {
         return azg.a.lenientOptionalFieldOf($$0, d).validate(dkr.a::a);
      }

      public boolean a(iv $$0, ars $$1) {
         return this.b.a($$1.a(dkg.b, $$0)) && this.c.a($$1.a(dkg.a, $$0));
      }

      public azg<Integer> a() {
         return this.b;
      }

      public azg<Integer> b() {
         return this.c;
      }
   }
}
