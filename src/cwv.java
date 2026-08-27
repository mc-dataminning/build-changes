import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwv(sy d, Optional<cwv.a> e) {
   public static final String a = "entity";
   public static final Codec<cwv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sy.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cwv.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cwv::new)
   );
   public static final Codec<bkv<cwv>> c = bkv.a(b);

   public cwv() {
      this(new sy(), Optional.empty());
   }

   public cwv(sy d, Optional<cwv.a> e) {
      if (d.e("id")) {
         ajc $$2 = ajc.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sy a() {
      return this.d;
   }

   public Optional<cwv.a> b() {
      return this.e;
   }

   public sy c() {
      return this.d;
   }

   public Optional<cwv.a> d() {
      return this.e;
   }

   public static record a(awe<Integer> b, awe<Integer> c) {
      private static final awe<Integer> d = new awe<>(0, 15);
      public static final Codec<cwv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cwv.a::new)
      );

      private static DataResult<awe<Integer>> a(awe<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<awe<Integer>> a(String $$0) {
         return avu.a(awe.a.optionalFieldOf($$0, d), cwv.a::a);
      }

      public boolean a(ib $$0, apa $$1) {
         return this.b.a($$1.a(cwn.b, $$0)) && this.c.a($$1.a(cwn.a, $$0));
      }

      public awe<Integer> a() {
         return this.b;
      }

      public awe<Integer> b() {
         return this.c;
      }
   }
}
