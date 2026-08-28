import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfo(uj d, Optional<dfo.a> e, Optional<buj> f) {
   public static final String a = "entity";
   public static final Codec<dfo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uj.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dfo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               buj.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dfo::new)
   );
   public static final Codec<bqg<dfo>> c = bqg.a(b);

   public dfo() {
      this(new uj(), Optional.empty(), Optional.empty());
   }

   public dfo(uj d, Optional<dfo.a> e, Optional<buj> f) {
      if (d.e("id")) {
         alh $$3 = alh.c(d.l("id"));
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

   public uj a() {
      return this.d;
   }

   public Optional<dfo.a> b() {
      return this.e;
   }

   public Optional<buj> c() {
      return this.f;
   }

   public static record a(azb<Integer> b, azb<Integer> c) {
      private static final azb<Integer> d = new azb<>(0, 15);
      public static final Codec<dfo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dfo.a::new)
      );

      private static DataResult<azb<Integer>> a(azb<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azb<Integer>> a(String $$0) {
         return azb.a.lenientOptionalFieldOf($$0, d).validate(dfo.a::a);
      }

      public boolean a(jg $$0, arm $$1) {
         return this.b.a($$1.a(dfe.b, $$0)) && this.c.a($$1.a(dfe.a, $$0));
      }

      public azb<Integer> a() {
         return this.b;
      }

      public azb<Integer> b() {
         return this.c;
      }
   }
}
