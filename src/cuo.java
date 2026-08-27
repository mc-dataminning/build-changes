import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cuo(so d, Optional<cuo.a> e) {
   public static final String a = "entity";
   public static final Codec<cuo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(so.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cuo.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cuo::new)
   );
   public static final Codec<bim<cuo>> c = bim.a(b);

   public cuo() {
      this(new so(), Optional.empty());
   }

   public cuo(so d, Optional<cuo.a> e) {
      if (d.e("id")) {
         ahh $$2 = ahh.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public so a() {
      return this.d;
   }

   public Optional<cuo.a> b() {
      return this.e;
   }

   public so c() {
      return this.d;
   }

   public Optional<cuo.a> d() {
      return this.e;
   }

   public static record a(auh<Integer> b, auh<Integer> c) {
      private static final auh<Integer> d = new auh<>(0, 15);
      public static final Codec<cuo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cuo.a::new)
      );

      private static DataResult<auh<Integer>> a(auh<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<auh<Integer>> a(String $$0) {
         return atx.a(auh.a.optionalFieldOf($$0, d), cuo.a::a);
      }

      public auh<Integer> a() {
         return this.b;
      }

      public auh<Integer> b() {
         return this.c;
      }
   }
}
