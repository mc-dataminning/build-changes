import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czo(tm d, Optional<czo.a> e) {
   public static final String a = "entity";
   public static final Codec<czo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(tm.a.fieldOf("entity").forGetter($$0x -> $$0x.d), czo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, czo::new)
   );
   public static final Codec<bmk<czo>> c = bmk.a(b);

   public czo() {
      this(new tm(), Optional.empty());
   }

   public czo(tm d, Optional<czo.a> e) {
      if (d.e("id")) {
         ajt $$2 = ajt.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public tm a() {
      return this.d;
   }

   public Optional<czo.a> b() {
      return this.e;
   }

   public tm c() {
      return this.d;
   }

   public Optional<czo.a> d() {
      return this.e;
   }

   public static record a(axc<Integer> b, axc<Integer> c) {
      private static final axc<Integer> d = new axc<>(0, 15);
      public static final Codec<czo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, czo.a::new)
      );

      private static DataResult<axc<Integer>> a(axc<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axc<Integer>> a(String $$0) {
         return aws.a(axc.a.optionalFieldOf($$0, d), czo.a::a);
      }

      public boolean a(ib $$0, aps $$1) {
         return this.b.a($$1.a(czg.b, $$0)) && this.c.a($$1.a(czg.a, $$0));
      }

      public axc<Integer> a() {
         return this.b;
      }

      public axc<Integer> b() {
         return this.c;
      }
   }
}
