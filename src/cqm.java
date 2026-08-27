import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqm(qx d, Optional<cqm.a> e) {
   public static final String a = "entity";
   public static final Codec<cqm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qx.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqm.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqm::new)
   );
   public static final Codec<bfi<cqm>> c = bfi.a(b);

   public cqm() {
      this(new qx(), Optional.empty());
   }

   public cqm(qx d, Optional<cqm.a> e) {
      if (d.e("id")) {
         aex $$2 = aex.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qx a() {
      return this.d;
   }

   public Optional<cqm.a> b() {
      return this.e;
   }

   public qx c() {
      return this.d;
   }

   public Optional<cqm.a> d() {
      return this.e;
   }

   public static record a(arq<Integer> b, arq<Integer> c) {
      private static final arq<Integer> d = new arq<>(0, 15);
      public static final Codec<cqm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqm.a::new)
      );

      private static DataResult<arq<Integer>> a(arq<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<arq<Integer>> a(String $$0) {
         return arg.a(arq.a.optionalFieldOf($$0, d), cqm.a::a);
      }

      public arq<Integer> a() {
         return this.b;
      }

      public arq<Integer> b() {
         return this.c;
      }
   }
}
