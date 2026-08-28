import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dha(tq d, Optional<dha.a> e, Optional<but> f) {
   public static final String a = "entity";
   public static final Codec<dha> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tq.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dha.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               but.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dha::new)
   );
   public static final Codec<bqq<dha>> c = bqq.a(b);

   public dha() {
      this(new tq(), Optional.empty(), Optional.empty());
   }

   public dha(tq d, Optional<dha.a> e, Optional<but> f) {
      if (d.e("id")) {
         aku $$3 = aku.c(d.l("id"));
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

   public Optional<dha.a> b() {
      return this.e;
   }

   public Optional<but> c() {
      return this.f;
   }

   public static record a(ayq<Integer> b, ayq<Integer> c) {
      private static final ayq<Integer> d = new ayq<>(0, 15);
      public static final Codec<dha.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dha.a::new)
      );

      private static DataResult<ayq<Integer>> a(ayq<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayq<Integer>> a(String $$0) {
         return ayq.a.lenientOptionalFieldOf($$0, d).validate(dha.a::a);
      }

      public boolean a(ji $$0, arc $$1) {
         return this.b.a($$1.a(dgp.b, $$0)) && this.c.a($$1.a(dgp.a, $$0));
      }

      public ayq<Integer> a() {
         return this.b;
      }

      public ayq<Integer> b() {
         return this.c;
      }
   }
}
