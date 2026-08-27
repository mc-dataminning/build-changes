import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqb(qs d, Optional<cqb.a> e) {
   public static final String a = "entity";
   public static final Codec<cqb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qs.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqb.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqb::new)
   );
   public static final Codec<bey<cqb>> c = bey.a(b);

   public cqb() {
      this(new qs(), Optional.empty());
   }

   public cqb(qs d, Optional<cqb.a> e) {
      if (d.e("id")) {
         aep $$2 = aep.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qs a() {
      return this.d;
   }

   public Optional<cqb.a> b() {
      return this.e;
   }

   public qs c() {
      return this.d;
   }

   public Optional<cqb.a> d() {
      return this.e;
   }

   public static record a(arh<Integer> b, arh<Integer> c) {
      private static final arh<Integer> d = new arh<>(0, 15);
      public static final Codec<cqb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqb.a::new)
      );

      private static DataResult<arh<Integer>> a(arh<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<arh<Integer>> a(String $$0) {
         return aqw.a(arh.a.optionalFieldOf($$0, d), cqb.a::a);
      }

      public arh<Integer> a() {
         return this.b;
      }

      public arh<Integer> b() {
         return this.c;
      }
   }
}
