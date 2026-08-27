import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cug(sn d, Optional<cug.a> e) {
   public static final String a = "entity";
   public static final Codec<cug> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sn.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cug.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cug::new)
   );
   public static final Codec<bil<cug>> c = bil.a(b);

   public cug() {
      this(new sn(), Optional.empty());
   }

   public cug(sn d, Optional<cug.a> e) {
      if (d.e("id")) {
         ahg $$2 = ahg.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sn a() {
      return this.d;
   }

   public Optional<cug.a> b() {
      return this.e;
   }

   public sn c() {
      return this.d;
   }

   public Optional<cug.a> d() {
      return this.e;
   }

   public static record a(aug<Integer> b, aug<Integer> c) {
      private static final aug<Integer> d = new aug<>(0, 15);
      public static final Codec<cug.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cug.a::new)
      );

      private static DataResult<aug<Integer>> a(aug<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aug<Integer>> a(String $$0) {
         return atw.a(aug.a.optionalFieldOf($$0, d), cug.a::a);
      }

      public aug<Integer> a() {
         return this.b;
      }

      public aug<Integer> b() {
         return this.c;
      }
   }
}
