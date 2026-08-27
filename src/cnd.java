import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cnd(qr d, Optional<cnd.a> e) {
   public static final String a = "entity";
   public static final Codec<cnd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qr.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cnd.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cnd::new)
   );
   public static final Codec<bch<cnd>> c = bch.a(b);

   public cnd() {
      this(new qr(), Optional.empty());
   }

   public cnd(qr d, Optional<cnd.a> e) {
      if (d.e("id")) {
         acq $$2 = acq.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public qr a() {
      return this.d;
   }

   public Optional<cnd.a> b() {
      return this.e;
   }

   public qr c() {
      return this.d;
   }

   public Optional<cnd.a> d() {
      return this.e;
   }

   public static record a(aot<Integer> b, aot<Integer> c) {
      private static final aot<Integer> d = new aot<>(0, 15);
      public static final Codec<cnd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cnd.a::new)
      );

      private static DataResult<aot<Integer>> a(aot<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aot<Integer>> a(String $$0) {
         return aoi.a(aot.a.optionalFieldOf($$0, d), cnd.a::a);
      }

      public aot<Integer> a() {
         return this.b;
      }

      public aot<Integer> b() {
         return this.c;
      }
   }
}
