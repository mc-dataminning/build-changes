import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwi(sw d, Optional<cwi.a> e) {
   public static final String a = "entity";
   public static final Codec<cwi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sw.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cwi.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cwi::new)
   );
   public static final Codec<bkg<cwi>> c = bkg.a(b);

   public cwi() {
      this(new sw(), Optional.empty());
   }

   public cwi(sw d, Optional<cwi.a> e) {
      if (d.e("id")) {
         aiy $$2 = aiy.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sw a() {
      return this.d;
   }

   public Optional<cwi.a> b() {
      return this.e;
   }

   public sw c() {
      return this.d;
   }

   public Optional<cwi.a> d() {
      return this.e;
   }

   public static record a(awa<Integer> b, awa<Integer> c) {
      private static final awa<Integer> d = new awa<>(0, 15);
      public static final Codec<cwi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cwi.a::new)
      );

      private static DataResult<awa<Integer>> a(awa<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<awa<Integer>> a(String $$0) {
         return avq.a(awa.a.optionalFieldOf($$0, d), cwi.a::a);
      }

      public boolean a(hz $$0, aow $$1) {
         return this.b.a($$1.a(cwa.b, $$0)) && this.c.a($$1.a(cwa.a, $$0));
      }

      public awa<Integer> a() {
         return this.b;
      }

      public awa<Integer> b() {
         return this.c;
      }
   }
}
