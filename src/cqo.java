import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqo(qy d, Optional<cqo.a> e) {
   public static final String a = "entity";
   public static final Codec<cqo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qy.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqo::new)
   );
   public static final Codec<bfk<cqo>> c = bfk.a(b);

   public cqo() {
      this(new qy(), Optional.empty());
   }

   public cqo(qy d, Optional<cqo.a> e) {
      if (d.e("id")) {
         aey $$2 = aey.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qy a() {
      return this.d;
   }

   public Optional<cqo.a> b() {
      return this.e;
   }

   public qy c() {
      return this.d;
   }

   public Optional<cqo.a> d() {
      return this.e;
   }

   public static record a(arr<Integer> b, arr<Integer> c) {
      private static final arr<Integer> d = new arr<>(0, 15);
      public static final Codec<cqo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqo.a::new)
      );

      private static DataResult<arr<Integer>> a(arr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<arr<Integer>> a(String $$0) {
         return arh.a(arr.a.optionalFieldOf($$0, d), cqo.a::a);
      }

      public arr<Integer> a() {
         return this.b;
      }

      public arr<Integer> b() {
         return this.c;
      }
   }
}
