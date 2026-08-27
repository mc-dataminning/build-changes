import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqh(qu d, Optional<cqh.a> e) {
   public static final String a = "entity";
   public static final Codec<cqh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qu.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqh.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqh::new)
   );
   public static final Codec<bfd<cqh>> c = bfd.a(b);

   public cqh() {
      this(new qu(), Optional.empty());
   }

   public cqh(qu d, Optional<cqh.a> e) {
      if (d.e("id")) {
         aeu $$2 = aeu.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qu a() {
      return this.d;
   }

   public Optional<cqh.a> b() {
      return this.e;
   }

   public qu c() {
      return this.d;
   }

   public Optional<cqh.a> d() {
      return this.e;
   }

   public static record a(arl<Integer> b, arl<Integer> c) {
      private static final arl<Integer> d = new arl<>(0, 15);
      public static final Codec<cqh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqh.a::new)
      );

      private static DataResult<arl<Integer>> a(arl<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<arl<Integer>> a(String $$0) {
         return arb.a(arl.a.optionalFieldOf($$0, d), cqh.a::a);
      }

      public arl<Integer> a() {
         return this.b;
      }

      public arl<Integer> b() {
         return this.c;
      }
   }
}
