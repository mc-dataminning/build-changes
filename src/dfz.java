import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfz(un d, Optional<dfz.a> e, Optional<bus> f) {
   public static final String a = "entity";
   public static final Codec<dfz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               un.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dfz.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bus.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dfz::new)
   );
   public static final Codec<bqp<dfz>> c = bqp.a(b);

   public dfz() {
      this(new un(), Optional.empty(), Optional.empty());
   }

   public dfz(un d, Optional<dfz.a> e, Optional<bus> f) {
      if (d.e("id")) {
         all $$3 = all.c(d.l("id"));
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

   public un a() {
      return this.d;
   }

   public Optional<dfz.a> b() {
      return this.e;
   }

   public Optional<bus> c() {
      return this.f;
   }

   public static record a(azf<Integer> b, azf<Integer> c) {
      private static final azf<Integer> d = new azf<>(0, 15);
      public static final Codec<dfz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dfz.a::new)
      );

      private static DataResult<azf<Integer>> a(azf<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azf<Integer>> a(String $$0) {
         return azf.a.lenientOptionalFieldOf($$0, d).validate(dfz.a::a);
      }

      public boolean a(jh $$0, arq $$1) {
         return this.b.a($$1.a(dfo.b, $$0)) && this.c.a($$1.a(dfo.a, $$0));
      }

      public azf<Integer> a() {
         return this.b;
      }

      public azf<Integer> b() {
         return this.c;
      }
   }
}
