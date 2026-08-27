import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cuf(sn d, Optional<cuf.a> e) {
   public static final String a = "entity";
   public static final Codec<cuf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sn.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cuf.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cuf::new)
   );
   public static final Codec<bik<cuf>> c = bik.a(b);

   public cuf() {
      this(new sn(), Optional.empty());
   }

   public cuf(sn d, Optional<cuf.a> e) {
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

   public Optional<cuf.a> b() {
      return this.e;
   }

   public sn c() {
      return this.d;
   }

   public Optional<cuf.a> d() {
      return this.e;
   }

   public static record a(auf<Integer> b, auf<Integer> c) {
      private static final auf<Integer> d = new auf<>(0, 15);
      public static final Codec<cuf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cuf.a::new)
      );

      private static DataResult<auf<Integer>> a(auf<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<auf<Integer>> a(String $$0) {
         return atv.a(auf.a.optionalFieldOf($$0, d), cuf.a::a);
      }

      public auf<Integer> a() {
         return this.b;
      }

      public auf<Integer> b() {
         return this.c;
      }
   }
}
