import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record crq(rt d, Optional<crq.a> e) {
   public static final String a = "entity";
   public static final Codec<crq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(rt.a.fieldOf("entity").forGetter($$0x -> $$0x.d), crq.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, crq::new)
   );
   public static final Codec<bgl<crq>> c = bgl.a(b);

   public crq() {
      this(new rt(), Optional.empty());
   }

   public crq(rt d, Optional<crq.a> e) {
      if (d.e("id")) {
         afw $$2 = afw.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public rt a() {
      return this.d;
   }

   public Optional<crq.a> b() {
      return this.e;
   }

   public rt c() {
      return this.d;
   }

   public Optional<crq.a> d() {
      return this.e;
   }

   public static record a(asq<Integer> b, asq<Integer> c) {
      private static final asq<Integer> d = new asq<>(0, 15);
      public static final Codec<crq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, crq.a::new)
      );

      private static DataResult<asq<Integer>> a(asq<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<asq<Integer>> a(String $$0) {
         return asg.a(asq.a.optionalFieldOf($$0, d), crq.a::a);
      }

      public asq<Integer> a() {
         return this.b;
      }

      public asq<Integer> b() {
         return this.c;
      }
   }
}
