import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqs(qw d, Optional<cqs.a> e) {
   public static final String a = "entity";
   public static final Codec<cqs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qw.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqs.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqs::new)
   );
   public static final Codec<bfo<cqs>> c = bfo.a(b);

   public cqs() {
      this(new qw(), Optional.empty());
   }

   public cqs(qw d, Optional<cqs.a> e) {
      if (d.e("id")) {
         aez $$2 = aez.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qw a() {
      return this.d;
   }

   public Optional<cqs.a> b() {
      return this.e;
   }

   public qw c() {
      return this.d;
   }

   public Optional<cqs.a> d() {
      return this.e;
   }

   public static record a(art<Integer> b, art<Integer> c) {
      private static final art<Integer> d = new art<>(0, 15);
      public static final Codec<cqs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqs.a::new)
      );

      private static DataResult<art<Integer>> a(art<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<art<Integer>> a(String $$0) {
         return arj.a(art.a.optionalFieldOf($$0, d), cqs.a::a);
      }

      public art<Integer> a() {
         return this.b;
      }

      public art<Integer> b() {
         return this.c;
      }
   }
}
