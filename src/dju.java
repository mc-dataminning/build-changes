import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dju(tz d, Optional<dju.a> e, Optional<bwr> f) {
   public static final String a = "entity";
   public static final Codec<dju> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tz.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dju.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bwr.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dju::new)
   );
   public static final Codec<bso<dju>> c = bso.a(b);

   public dju() {
      this(new tz(), Optional.empty(), Optional.empty());
   }

   public dju(tz d, Optional<dju.a> e, Optional<bwr> f) {
      if (d.e("id")) {
         alg $$3 = alg.c(d.l("id"));
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

   public tz a() {
      return this.d;
   }

   public Optional<dju.a> b() {
      return this.e;
   }

   public Optional<bwr> c() {
      return this.f;
   }

   public static record a(aze<Integer> b, aze<Integer> c) {
      private static final aze<Integer> d = new aze<>(0, 15);
      public static final Codec<dju.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dju.a::new)
      );

      private static DataResult<aze<Integer>> a(aze<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aze<Integer>> a(String $$0) {
         return aze.a.lenientOptionalFieldOf($$0, d).validate(dju.a::a);
      }

      public boolean a(iu $$0, arq $$1) {
         return this.b.a($$1.a(djj.b, $$0)) && this.c.a($$1.a(djj.a, $$0));
      }

      public aze<Integer> a() {
         return this.b;
      }

      public aze<Integer> b() {
         return this.c;
      }
   }
}
