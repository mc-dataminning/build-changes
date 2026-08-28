import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhc(tq d, Optional<dhc.a> e, Optional<buv> f) {
   public static final String a = "entity";
   public static final Codec<dhc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tq.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dhc.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               buv.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dhc::new)
   );
   public static final Codec<bqs<dhc>> c = bqs.a(b);

   public dhc() {
      this(new tq(), Optional.empty(), Optional.empty());
   }

   public dhc(tq d, Optional<dhc.a> e, Optional<buv> f) {
      if (d.e("id")) {
         akv $$3 = akv.c(d.l("id"));
         if ($$3 != null) {
            d.a("id", $$3.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tq a() {
      return this.d;
   }

   public Optional<dhc.a> b() {
      return this.e;
   }

   public Optional<buv> c() {
      return this.f;
   }

   public static record a(ayr<Integer> b, ayr<Integer> c) {
      private static final ayr<Integer> d = new ayr<>(0, 15);
      public static final Codec<dhc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dhc.a::new)
      );

      private static DataResult<ayr<Integer>> a(ayr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayr<Integer>> a(String $$0) {
         return ayr.a.lenientOptionalFieldOf($$0, d).validate(dhc.a::a);
      }

      public boolean a(ji $$0, ard $$1) {
         return this.b.a($$1.a(dgr.b, $$0)) && this.c.a($$1.a(dgr.a, $$0));
      }

      public ayr<Integer> a() {
         return this.b;
      }

      public ayr<Integer> b() {
         return this.c;
      }
   }
}
