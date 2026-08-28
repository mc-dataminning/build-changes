import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record djj(tx d, Optional<djj.a> e, Optional<bwm> f) {
   public static final String a = "entity";
   public static final Codec<djj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tx.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               djj.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bwm.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, djj::new)
   );
   public static final Codec<bsj<djj>> c = bsj.a(b);

   public djj() {
      this(new tx(), Optional.empty(), Optional.empty());
   }

   public djj(tx d, Optional<djj.a> e, Optional<bwm> f) {
      if (d.e("id")) {
         ale $$3 = ale.c(d.l("id"));
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

   public tx a() {
      return this.d;
   }

   public Optional<djj.a> b() {
      return this.e;
   }

   public Optional<bwm> c() {
      return this.f;
   }

   public static record a(azc<Integer> b, azc<Integer> c) {
      private static final azc<Integer> d = new azc<>(0, 15);
      public static final Codec<djj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, djj.a::new)
      );

      private static DataResult<azc<Integer>> a(azc<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<azc<Integer>> a(String $$0) {
         return azc.a.lenientOptionalFieldOf($$0, d).validate(djj.a::a);
      }

      public boolean a(iu $$0, aro $$1) {
         return this.b.a($$1.a(diy.b, $$0)) && this.c.a($$1.a(diy.a, $$0));
      }

      public azc<Integer> a() {
         return this.b;
      }

      public azc<Integer> b() {
         return this.c;
      }
   }
}
