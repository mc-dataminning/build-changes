import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbo(ud d, Optional<dbo.a> e, Optional<akm> f) {
   public static final String a = "entity";
   public static final Codec<dbo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ud.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dbo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               akm.a.optionalFieldOf("equipment_loot_table").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dbo::new)
   );
   public static final Codec<boe<dbo>> c = boe.a(b);

   public dbo() {
      this(new ud(), Optional.empty(), Optional.empty());
   }

   public dbo(ud d, Optional<dbo.a> e, Optional<akm> f) {
      if (d.e("id")) {
         akm $$3 = akm.a(d.l("id"));
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

   public ud a() {
      return this.d;
   }

   public Optional<dbo.a> b() {
      return this.e;
   }

   public Optional<akm> c() {
      return this.f;
   }

   public static record a(axw<Integer> b, axw<Integer> c) {
      private static final axw<Integer> d = new axw<>(0, 15);
      public static final Codec<dbo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dbo.a::new)
      );

      private static DataResult<axw<Integer>> a(axw<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axw<Integer>> a(String $$0) {
         return axw.a.lenientOptionalFieldOf($$0, d).validate(dbo.a::a);
      }

      public boolean a(io $$0, aqm $$1) {
         return this.b.a($$1.a(dbg.b, $$0)) && this.c.a($$1.a(dbg.a, $$0));
      }

      public axw<Integer> a() {
         return this.b;
      }

      public axw<Integer> b() {
         return this.c;
      }
   }
}
