import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddm(ua d, Optional<ddm.a> e, Optional<bsz> f) {
   public static final String a = "entity";
   public static final Codec<ddm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ua.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               ddm.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bsz.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ddm::new)
   );
   public static final Codec<bpa<ddm>> c = bpa.a(b);

   public ddm() {
      this(new ua(), Optional.empty(), Optional.empty());
   }

   public ddm(ua d, Optional<ddm.a> e, Optional<bsz> f) {
      if (d.e("id")) {
         akq $$3 = akq.c(d.l("id"));
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

   public ua a() {
      return this.d;
   }

   public Optional<ddm.a> b() {
      return this.e;
   }

   public Optional<bsz> c() {
      return this.f;
   }

   public static record a(ayf<Integer> b, ayf<Integer> c) {
      private static final ayf<Integer> d = new ayf<>(0, 15);
      public static final Codec<ddm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, ddm.a::new)
      );

      private static DataResult<ayf<Integer>> a(ayf<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayf<Integer>> a(String $$0) {
         return ayf.a.lenientOptionalFieldOf($$0, d).validate(ddm.a::a);
      }

      public boolean a(jd $$0, aqt $$1) {
         return this.b.a($$1.a(ddd.b, $$0)) && this.c.a($$1.a(ddd.a, $$0));
      }

      public ayf<Integer> a() {
         return this.b;
      }

      public ayf<Integer> b() {
         return this.c;
      }
   }
}
