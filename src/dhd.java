import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhd(tq d, Optional<dhd.a> e, Optional<buw> f) {
   public static final String a = "entity";
   public static final Codec<dhd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tq.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dhd.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               buw.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dhd::new)
   );
   public static final Codec<bqt<dhd>> c = bqt.a(b);

   public dhd() {
      this(new tq(), Optional.empty(), Optional.empty());
   }

   public dhd(tq d, Optional<dhd.a> e, Optional<buw> f) {
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

   public Optional<dhd.a> b() {
      return this.e;
   }

   public Optional<buw> c() {
      return this.f;
   }

   public static record a(ayr<Integer> b, ayr<Integer> c) {
      private static final ayr<Integer> d = new ayr<>(0, 15);
      public static final Codec<dhd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dhd.a::new)
      );

      private static DataResult<ayr<Integer>> a(ayr<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayr<Integer>> a(String $$0) {
         return ayr.a.lenientOptionalFieldOf($$0, d).validate(dhd.a::a);
      }

      public boolean a(ji $$0, ard $$1) {
         return this.b.a($$1.a(dgs.b, $$0)) && this.c.a($$1.a(dgs.a, $$0));
      }

      public ayr<Integer> a() {
         return this.b;
      }

      public ayr<Integer> b() {
         return this.c;
      }
   }
}
