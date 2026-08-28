import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dco(ur d, Optional<dco.a> e, Optional<btc> f) {
   public static final String a = "entity";
   public static final Codec<dco> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ur.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dco.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               btc.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dco::new)
   );
   public static final Codec<bpd<dco>> c = bpd.a(b);

   public dco() {
      this(new ur(), Optional.empty(), Optional.empty());
   }

   public dco(ur d, Optional<dco.a> e, Optional<btc> f) {
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

   public Optional<dco.a> b() {
      return this.e;
   }

   public Optional<btc> c() {
      return this.f;
   }

   public static record a(ayq<Integer> b, ayq<Integer> c) {
      private static final ayq<Integer> d = new ayq<>(0, 15);
      public static final Codec<dco.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dco.a::new)
      );

      private static DataResult<ayq<Integer>> a(ayq<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayq<Integer>> a(String $$0) {
         return ayq.a.lenientOptionalFieldOf($$0, d).validate(dco.a::a);
      }

      public boolean a(iz $$0, are $$1) {
         return this.b.a($$1.a(dcg.b, $$0)) && this.c.a($$1.a(dcg.a, $$0));
      }

      public ayq<Integer> a() {
         return this.b;
      }

      public ayq<Integer> b() {
         return this.c;
      }
   }
}
