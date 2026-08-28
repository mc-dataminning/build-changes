import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dht(um d, Optional<dht.a> e, Optional<bvl> f) {
   public static final String a = "entity";
   public static final Codec<dht> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               um.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dht.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bvl.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dht::new)
   );
   public static final Codec<bri<dht>> c = bri.a(b);

   public dht() {
      this(new um(), Optional.empty(), Optional.empty());
   }

   public dht(um d, Optional<dht.a> e, Optional<bvl> f) {
      if (d.e("id")) {
         alp $$3 = alp.c(d.l("id"));
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

   public um a() {
      return this.d;
   }

   public Optional<dht.a> b() {
      return this.e;
   }

   public Optional<bvl> c() {
      return this.f;
   }

   public static record a(azm<Integer> b, azm<Integer> c) {
      private static final azm<Integer> d = new azm<>(0, 15);
      public static final Codec<dht.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dht.a::new)
      );

      private static DataResult<azm<Integer>> a(azm<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azm<Integer>> a(String $$0) {
         return azm.a.lenientOptionalFieldOf($$0, d).validate(dht.a::a);
      }

      public boolean a(jh $$0, arx $$1) {
         return this.b.a($$1.a(dhi.b, $$0)) && this.c.a($$1.a(dhi.a, $$0));
      }

      public azm<Integer> a() {
         return this.b;
      }

      public azm<Integer> b() {
         return this.c;
      }
   }
}
