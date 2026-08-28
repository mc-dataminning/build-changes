import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dld(ua d, Optional<dld.a> e, Optional<bxq> f) {
   public static final String a = "entity";
   public static final Codec<dld> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ua.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dld.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bxq.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dld::new)
   );
   public static final Codec<btm<dld>> c = btm.a(b);

   public dld() {
      this(new ua(), Optional.empty(), Optional.empty());
   }

   public dld(ua d, Optional<dld.a> e, Optional<bxq> f) {
      Optional<alr> $$3 = d.a("id", alr.a);
      if ($$3.isPresent()) {
         d.a("id", alr.a, $$3.get());
      } else {
         d.r("id");
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ua a() {
      return this.d;
   }

   public Optional<dld.a> b() {
      return this.e;
   }

   public Optional<bxq> c() {
      return this.f;
   }

   public static record a(azr<Integer> b, azr<Integer> c) {
      private static final azr<Integer> d = new azr<>(0, 15);
      public static final Codec<dld.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dld.a::new)
      );

      private static DataResult<azr<Integer>> a(azr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azr<Integer>> a(String $$0) {
         return azr.a.lenientOptionalFieldOf($$0, d).validate(dld.a::a);
      }

      public boolean a(iw $$0, asb $$1) {
         return this.b.a($$1.a(dks.b, $$0)) && this.c.a($$1.a(dks.a, $$0));
      }

      public azr<Integer> a() {
         return this.b;
      }

      public azr<Integer> b() {
         return this.c;
      }
   }
}
