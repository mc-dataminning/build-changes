import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record csj(rz d, Optional<csj.a> e) {
   public static final String a = "entity";
   public static final Codec<csj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(rz.a.fieldOf("entity").forGetter($$0x -> $$0x.d), csj.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, csj::new)
   );
   public static final Codec<bha<csj>> c = bha.a(b);

   public csj() {
      this(new rz(), Optional.empty());
   }

   public csj(rz d, Optional<csj.a> e) {
      if (d.e("id")) {
         agg $$2 = agg.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public rz a() {
      return this.d;
   }

   public Optional<csj.a> b() {
      return this.e;
   }

   public rz c() {
      return this.d;
   }

   public Optional<csj.a> d() {
      return this.e;
   }

   public static record a(ata<Integer> b, ata<Integer> c) {
      private static final ata<Integer> d = new ata<>(0, 15);
      public static final Codec<csj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, csj.a::new)
      );

      private static DataResult<ata<Integer>> a(ata<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ata<Integer>> a(String $$0) {
         return asq.a(ata.a.optionalFieldOf($$0, d), csj.a::a);
      }

      public ata<Integer> a() {
         return this.b;
      }

      public ata<Integer> b() {
         return this.c;
      }
   }
}
