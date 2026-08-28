import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddo(ub d, Optional<ddo.a> e, Optional<bta> f) {
   public static final String a = "entity";
   public static final Codec<ddo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ub.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               ddo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bta.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ddo::new)
   );
   public static final Codec<bpb<ddo>> c = bpb.a(b);

   public ddo() {
      this(new ub(), Optional.empty(), Optional.empty());
   }

   public ddo(ub d, Optional<ddo.a> e, Optional<bta> f) {
      if (d.e("id")) {
         akr $$3 = akr.c(d.l("id"));
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

   public ub a() {
      return this.d;
   }

   public Optional<ddo.a> b() {
      return this.e;
   }

   public Optional<bta> c() {
      return this.f;
   }

   public static record a(ayg<Integer> b, ayg<Integer> c) {
      private static final ayg<Integer> d = new ayg<>(0, 15);
      public static final Codec<ddo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, ddo.a::new)
      );

      private static DataResult<ayg<Integer>> a(ayg<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayg<Integer>> a(String $$0) {
         return ayg.a.lenientOptionalFieldOf($$0, d).validate(ddo.a::a);
      }

      public boolean a(jd $$0, aqu $$1) {
         return this.b.a($$1.a(ddf.b, $$0)) && this.c.a($$1.a(ddf.a, $$0));
      }

      public ayg<Integer> a() {
         return this.b;
      }

      public ayg<Integer> b() {
         return this.c;
      }
   }
}
