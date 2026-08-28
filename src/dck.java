import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dck(ur d, Optional<dck.a> e, Optional<bsy> f) {
   public static final String a = "entity";
   public static final Codec<dck> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ur.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dck.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bsy.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dck::new)
   );
   public static final Codec<boz<dck>> c = boz.a(b);

   public dck() {
      this(new ur(), Optional.empty(), Optional.empty());
   }

   public dck(ur d, Optional<dck.a> e, Optional<bsy> f) {
      if (d.e("id")) {
         alb $$3 = alb.a(d.l("id"));
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

   public ur a() {
      return this.d;
   }

   public Optional<dck.a> b() {
      return this.e;
   }

   public Optional<bsy> c() {
      return this.f;
   }

   public static record a(aym<Integer> b, aym<Integer> c) {
      private static final aym<Integer> d = new aym<>(0, 15);
      public static final Codec<dck.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dck.a::new)
      );

      private static DataResult<aym<Integer>> a(aym<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aym<Integer>> a(String $$0) {
         return aym.a.lenientOptionalFieldOf($$0, d).validate(dck.a::a);
      }

      public boolean a(iz $$0, arb $$1) {
         return this.b.a($$1.a(dcc.b, $$0)) && this.c.a($$1.a(dcc.a, $$0));
      }

      public aym<Integer> a() {
         return this.b;
      }

      public aym<Integer> b() {
         return this.c;
      }
   }
}
