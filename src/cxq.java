import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxq(ta d, Optional<cxq.a> e) {
   public static final String a = "entity";
   public static final Codec<cxq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ta.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cxq.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cxq::new)
   );
   public static final Codec<blm<cxq>> c = blm.a(b);

   public cxq() {
      this(new ta(), Optional.empty());
   }

   public cxq(ta d, Optional<cxq.a> e) {
      if (d.e("id")) {
         ajh $$2 = ajh.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public ta a() {
      return this.d;
   }

   public Optional<cxq.a> b() {
      return this.e;
   }

   public ta c() {
      return this.d;
   }

   public Optional<cxq.a> d() {
      return this.e;
   }

   public static record a(awo<Integer> b, awo<Integer> c) {
      private static final awo<Integer> d = new awo<>(0, 15);
      public static final Codec<cxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cxq.a::new)
      );

      private static DataResult<awo<Integer>> a(awo<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<awo<Integer>> a(String $$0) {
         return awe.a(awo.a.optionalFieldOf($$0, d), cxq.a::a);
      }

      public boolean a(ib $$0, apf $$1) {
         return this.b.a($$1.a(cxi.b, $$0)) && this.c.a($$1.a(cxi.a, $$0));
      }

      public awo<Integer> a() {
         return this.b;
      }

      public awo<Integer> b() {
         return this.c;
      }
   }
}
