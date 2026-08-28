import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkg(tz d, Optional<dkg.a> e, Optional<bwu> f) {
   public static final String a = "entity";
   public static final Codec<dkg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tz.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dkg.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bwu.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dkg::new)
   );
   public static final Codec<bsq<dkg>> c = bsq.a(b);

   public dkg() {
      this(new tz(), Optional.empty(), Optional.empty());
   }

   public dkg(tz d, Optional<dkg.a> e, Optional<bwu> f) {
      Optional<alg> $$3 = d.a("id", alg.a);
      if ($$3.isPresent()) {
         d.a("id", alg.a, $$3.get());
      } else {
         d.p("id");
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tz a() {
      return this.d;
   }

   public Optional<dkg.a> b() {
      return this.e;
   }

   public Optional<bwu> c() {
      return this.f;
   }

   public static record a(aze<Integer> b, aze<Integer> c) {
      private static final aze<Integer> d = new aze<>(0, 15);
      public static final Codec<dkg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dkg.a::new)
      );

      private static DataResult<aze<Integer>> a(aze<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aze<Integer>> a(String $$0) {
         return aze.a.lenientOptionalFieldOf($$0, d).validate(dkg.a::a);
      }

      public boolean a(iv $$0, arq $$1) {
         return this.b.a($$1.a(djv.b, $$0)) && this.c.a($$1.a(djv.a, $$0));
      }

      public aze<Integer> a() {
         return this.b;
      }

      public aze<Integer> b() {
         return this.c;
      }
   }
}
