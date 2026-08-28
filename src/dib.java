import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dib(ux d, Optional<dib.a> e, Optional<bvt> f) {
   public static final String a = "entity";
   public static final Codec<dib> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ux.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dib.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bvt.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dib::new)
   );
   public static final Codec<brq<dib>> c = brq.a(b);

   public dib() {
      this(new ux(), Optional.empty(), Optional.empty());
   }

   public dib(ux d, Optional<dib.a> e, Optional<bvt> f) {
      if (d.e("id")) {
         alz $$3 = alz.c(d.l("id"));
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

   public ux a() {
      return this.d;
   }

   public Optional<dib.a> b() {
      return this.e;
   }

   public Optional<bvt> c() {
      return this.f;
   }

   public static record a(azw<Integer> b, azw<Integer> c) {
      private static final azw<Integer> d = new azw<>(0, 15);
      public static final Codec<dib.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dib.a::new)
      );

      private static DataResult<azw<Integer>> a(azw<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azw<Integer>> a(String $$0) {
         return azw.a.lenientOptionalFieldOf($$0, d).validate(dib.a::a);
      }

      public boolean a(jh $$0, ash $$1) {
         return this.b.a($$1.a(dhq.b, $$0)) && this.c.a($$1.a(dhq.a, $$0));
      }

      public azw<Integer> a() {
         return this.b;
      }

      public azw<Integer> b() {
         return this.c;
      }
   }
}
