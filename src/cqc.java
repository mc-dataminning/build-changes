import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cqc(qr d, Optional<cqc.a> e) {
   public static final String a = "entity";
   public static final Codec<cqc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(qr.a.fieldOf("entity").forGetter($$0x -> $$0x.d), cqc.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, cqc::new)
   );
   public static final Codec<bfa<cqc>> c = bfa.a(b);

   public cqc() {
      this(new qr(), Optional.empty());
   }

   public cqc(qr d, Optional<cqc.a> e) {
      if (d.e("id")) {
         aer $$2 = aer.a(d.l("id"));
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

   public Optional<cqc.a> b() {
      return this.e;
   }

   public qr c() {
      return this.d;
   }

   public Optional<cqc.a> d() {
      return this.e;
   }

   public static record a(ari<Integer> b, ari<Integer> c) {
      private static final ari<Integer> d = new ari<>(0, 15);
      public static final Codec<cqc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, cqc.a::new)
      );

      private static DataResult<ari<Integer>> a(ari<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ari<Integer>> a(String $$0) {
         return aqy.a(ari.a.optionalFieldOf($$0, d), cqc.a::a);
      }

      public ari<Integer> a() {
         return this.b;
      }

      public ari<Integer> b() {
         return this.c;
      }
   }
}
