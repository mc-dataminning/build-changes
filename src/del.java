import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record del(uf d, Optional<del.a> e, Optional<btt> f) {
   public static final String a = "entity";
   public static final Codec<del> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               uf.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               del.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               btt.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, del::new)
   );
   public static final Codec<bpu<del>> c = bpu.a(b);

   public del() {
      this(new uf(), Optional.empty(), Optional.empty());
   }

   public del(uf d, Optional<del.a> e, Optional<btt> f) {
      if (d.e("id")) {
         alb $$3 = alb.c(d.l("id"));
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

   public Optional<del.a> b() {
      return this.e;
   }

   public Optional<btt> c() {
      return this.f;
   }

   public static record a(ayu<Integer> b, ayu<Integer> c) {
      private static final ayu<Integer> d = new ayu<>(0, 15);
      public static final Codec<del.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, del.a::new)
      );

      private static DataResult<ayu<Integer>> a(ayu<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayu<Integer>> a(String $$0) {
         return ayu.a.lenientOptionalFieldOf($$0, d).validate(del.a::a);
      }

      public boolean a(je $$0, arg $$1) {
         return this.b.a($$1.a(deb.b, $$0)) && this.c.a($$1.a(deb.a, $$0));
      }

      public ayu<Integer> a() {
         return this.b;
      }

      public ayu<Integer> b() {
         return this.c;
      }
   }
}
