import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dez(uf d, Optional<dez.a> e, Optional<bty> f) {
   public static final String a = "entity";
   public static final Codec<dez> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uf.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dez.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bty.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dez::new)
   );
   public static final Codec<bpz<dez>> c = bpz.a(b);

   public dez() {
      this(new uf(), Optional.empty(), Optional.empty());
   }

   public dez(uf d, Optional<dez.a> e, Optional<bty> f) {
      if (d.e("id")) {
         alc $$3 = alc.c(d.l("id"));
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

   public uf a() {
      return this.d;
   }

   public Optional<dez.a> b() {
      return this.e;
   }

   public Optional<bty> c() {
      return this.f;
   }

   public static record a(ayv<Integer> b, ayv<Integer> c) {
      private static final ayv<Integer> d = new ayv<>(0, 15);
      public static final Codec<dez.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dez.a::new)
      );

      private static DataResult<ayv<Integer>> a(ayv<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayv<Integer>> a(String $$0) {
         return ayv.a.lenientOptionalFieldOf($$0, d).validate(dez.a::a);
      }

      public boolean a(je $$0, arh $$1) {
         return this.b.a($$1.a(dep.b, $$0)) && this.c.a($$1.a(dep.a, $$0));
      }

      public ayv<Integer> a() {
         return this.b;
      }

      public ayv<Integer> b() {
         return this.c;
      }
   }
}
