import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcr(us d, Optional<dcr.a> e, Optional<btf> f) {
   public static final String a = "entity";
   public static final Codec<dcr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               us.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dcr.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               btf.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dcr::new)
   );
   public static final Codec<bpg<dcr>> c = bpg.a(b);

   public dcr() {
      this(new us(), Optional.empty(), Optional.empty());
   }

   public dcr(us d, Optional<dcr.a> e, Optional<btf> f) {
      if (d.e("id")) {
         alf $$3 = alf.a(d.l("id"));
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

   public us a() {
      return this.d;
   }

   public Optional<dcr.a> b() {
      return this.e;
   }

   public Optional<btf> c() {
      return this.f;
   }

   public static record a(ayr<Integer> b, ayr<Integer> c) {
      private static final ayr<Integer> d = new ayr<>(0, 15);
      public static final Codec<dcr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dcr.a::new)
      );

      private static DataResult<ayr<Integer>> a(ayr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayr<Integer>> a(String $$0) {
         return ayr.a.lenientOptionalFieldOf($$0, d).validate(dcr.a::a);
      }

      public boolean a(iz $$0, arf $$1) {
         return this.b.a($$1.a(dcj.b, $$0)) && this.c.a($$1.a(dcj.a, $$0));
      }

      public ayr<Integer> a() {
         return this.b;
      }

      public ayr<Integer> b() {
         return this.c;
      }
   }
}
