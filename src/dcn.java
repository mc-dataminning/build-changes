import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcn(ur d, Optional<dcn.a> e, Optional<btb> f) {
   public static final String a = "entity";
   public static final Codec<dcn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ur.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dcn.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               btb.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dcn::new)
   );
   public static final Codec<bpc<dcn>> c = bpc.a(b);

   public dcn() {
      this(new ur(), Optional.empty(), Optional.empty());
   }

   public dcn(ur d, Optional<dcn.a> e, Optional<btb> f) {
      if (d.e("id")) {
         ale $$3 = ale.a(d.l("id"));
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

   public ur a() {
      return this.d;
   }

   public Optional<dcn.a> b() {
      return this.e;
   }

   public Optional<btb> c() {
      return this.f;
   }

   public static record a(ayp<Integer> b, ayp<Integer> c) {
      private static final ayp<Integer> d = new ayp<>(0, 15);
      public static final Codec<dcn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dcn.a::new)
      );

      private static DataResult<ayp<Integer>> a(ayp<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayp<Integer>> a(String $$0) {
         return ayp.a.lenientOptionalFieldOf($$0, d).validate(dcn.a::a);
      }

      public boolean a(iz $$0, are $$1) {
         return this.b.a($$1.a(dcf.b, $$0)) && this.c.a($$1.a(dcf.a, $$0));
      }

      public ayp<Integer> a() {
         return this.b;
      }

      public ayp<Integer> b() {
         return this.c;
      }
   }
}
