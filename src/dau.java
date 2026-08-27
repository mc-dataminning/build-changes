import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dau(ua d, Optional<dau.a> e) {
   public static final String a = "entity";
   public static final Codec<dau> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ua.a.fieldOf("entity").forGetter($$0x -> $$0x.d), dau.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, dau::new)
   );
   public static final Codec<bnw<dau>> c = bnw.a(b);

   public dau() {
      this(new ua(), Optional.empty());
   }

   public dau(ua d, Optional<dau.a> e) {
      if (d.e("id")) {
         akh $$2 = akh.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public ua a() {
      return this.d;
   }

   public Optional<dau.a> b() {
      return this.e;
   }

   public ua c() {
      return this.d;
   }

   public Optional<dau.a> d() {
      return this.e;
   }

   public static record a(axr<Integer> b, axr<Integer> c) {
      private static final axr<Integer> d = new axr<>(0, 15);
      public static final Codec<dau.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dau.a::new)
      );

      private static DataResult<axr<Integer>> a(axr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axr<Integer>> a(String $$0) {
         return axh.a(axr.a.optionalFieldOf($$0, d), dau.a::a);
      }

      public boolean a(in $$0, aqh $$1) {
         return this.b.a($$1.a(dam.b, $$0)) && this.c.a($$1.a(dam.a, $$0));
      }

      public axr<Integer> a() {
         return this.b;
      }

      public axr<Integer> b() {
         return this.c;
      }
   }
}
