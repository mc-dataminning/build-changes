import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbq(ud d, Optional<dbq.a> e, Optional<akn> f) {
   public static final String a = "entity";
   public static final Codec<dbq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ud.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dbq.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               akn.a.optionalFieldOf("equipment_loot_table").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dbq::new)
   );
   public static final Codec<bog<dbq>> c = bog.a(b);

   public dbq() {
      this(new ud(), Optional.empty(), Optional.empty());
   }

   public dbq(ud d, Optional<dbq.a> e, Optional<akn> f) {
      if (d.e("id")) {
         akn $$3 = akn.a(d.l("id"));
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

   public Optional<dbq.a> b() {
      return this.e;
   }

   public Optional<akn> c() {
      return this.f;
   }

   public static record a(axx<Integer> b, axx<Integer> c) {
      private static final axx<Integer> d = new axx<>(0, 15);
      public static final Codec<dbq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dbq.a::new)
      );

      private static DataResult<axx<Integer>> a(axx<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axx<Integer>> a(String $$0) {
         return axx.a.lenientOptionalFieldOf($$0, d).validate(dbq.a::a);
      }

      public boolean a(io $$0, aqn $$1) {
         return this.b.a($$1.a(dbi.b, $$0)) && this.c.a($$1.a(dbi.a, $$0));
      }

      public axx<Integer> a() {
         return this.b;
      }

      public axx<Integer> b() {
         return this.c;
      }
   }
}
