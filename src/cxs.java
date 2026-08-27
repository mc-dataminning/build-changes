import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cxs(ta d, Optional<cxs.a> e) {
   public static final String a = "entity";
   public static final Codec<cxs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ta.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cxs.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cxs::new)
   );
   public static final Codec<bln<cxs>> c = bln.a(b);

   public cxs() {
      this(new ta(), Optional.empty());
   }

   public cxs(ta d, Optional<cxs.a> e) {
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

   public Optional<cxs.a> b() {
      return this.e;
   }

   public ta c() {
      return this.d;
   }

   public Optional<cxs.a> d() {
      return this.e;
   }

   public static record a(awo<Integer> b, awo<Integer> c) {
      private static final awo<Integer> d = new awo<>(0, 15);
      public static final Codec<cxs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cxs.a::new)
      );

      private static DataResult<awo<Integer>> a(awo<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<awo<Integer>> a(String $$0) {
         return awe.a(awo.a.optionalFieldOf($$0, d), cxs.a::a);
      }

      public boolean a(ib $$0, apf $$1) {
         return this.b.a($$1.a(cxk.b, $$0)) && this.c.a($$1.a(cxk.a, $$0));
      }

      public awo<Integer> a() {
         return this.b;
      }

      public awo<Integer> b() {
         return this.c;
      }
   }
}
