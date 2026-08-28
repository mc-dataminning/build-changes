import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgg(ul d, Optional<dgg.a> e, Optional<buv> f) {
   public static final String a = "entity";
   public static final Codec<dgg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ul.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dgg.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               buv.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dgg::new)
   );
   public static final Codec<bqs<dgg>> c = bqs.a(b);

   public dgg() {
      this(new ul(), Optional.empty(), Optional.empty());
   }

   public dgg(ul d, Optional<dgg.a> e, Optional<buv> f) {
      if (d.e("id")) {
         alj $$3 = alj.c(d.l("id"));
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

   public ul a() {
      return this.d;
   }

   public Optional<dgg.a> b() {
      return this.e;
   }

   public Optional<buv> c() {
      return this.f;
   }

   public static record a(aze<Integer> b, aze<Integer> c) {
      private static final aze<Integer> d = new aze<>(0, 15);
      public static final Codec<dgg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dgg.a::new)
      );

      private static DataResult<aze<Integer>> a(aze<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aze<Integer>> a(String $$0) {
         return aze.a.lenientOptionalFieldOf($$0, d).validate(dgg.a::a);
      }

      public boolean a(jh $$0, arp $$1) {
         return this.b.a($$1.a(dfv.b, $$0)) && this.c.a($$1.a(dfv.a, $$0));
      }

      public aze<Integer> a() {
         return this.b;
      }

      public aze<Integer> b() {
         return this.c;
      }
   }
}
