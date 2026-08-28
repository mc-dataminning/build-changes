import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dkt(ua d, Optional<dkt.a> e, Optional<bxh> f) {
   public static final String a = "entity";
   public static final Codec<dkt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ua.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dkt.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bxh.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dkt::new)
   );
   public static final Codec<btd<dkt>> c = btd.a(b);

   public dkt() {
      this(new ua(), Optional.empty(), Optional.empty());
   }

   public dkt(ua d, Optional<dkt.a> e, Optional<bxh> f) {
      Optional<alk> $$3 = d.a("id", alk.a);
      if ($$3.isPresent()) {
         d.a("id", alk.a, $$3.get());
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

   public Optional<dkt.a> b() {
      return this.e;
   }

   public Optional<bxh> c() {
      return this.f;
   }

   public static record a(azi<Integer> b, azi<Integer> c) {
      private static final azi<Integer> d = new azi<>(0, 15);
      public static final Codec<dkt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dkt.a::new)
      );

      private static DataResult<azi<Integer>> a(azi<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azi<Integer>> a(String $$0) {
         return azi.a.lenientOptionalFieldOf($$0, d).validate(dkt.a::a);
      }

      public boolean a(iw $$0, aru $$1) {
         return this.b.a($$1.a(dki.b, $$0)) && this.c.a($$1.a(dki.a, $$0));
      }

      public azi<Integer> a() {
         return this.b;
      }

      public azi<Integer> b() {
         return this.c;
      }
   }
}
