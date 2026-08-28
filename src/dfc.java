import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfc(ug d, Optional<dfc.a> e, Optional<bub> f) {
   public static final String a = "entity";
   public static final Codec<dfc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ug.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dfc.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bub.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dfc::new)
   );
   public static final Codec<bqc<dfc>> c = bqc.a(b);

   public dfc() {
      this(new ug(), Optional.empty(), Optional.empty());
   }

   public dfc(ug d, Optional<dfc.a> e, Optional<bub> f) {
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

   public ug a() {
      return this.d;
   }

   public Optional<dfc.a> b() {
      return this.e;
   }

   public Optional<bub> c() {
      return this.f;
   }

   public static record a(ayx<Integer> b, ayx<Integer> c) {
      private static final ayx<Integer> d = new ayx<>(0, 15);
      public static final Codec<dfc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dfc.a::new)
      );

      private static DataResult<ayx<Integer>> a(ayx<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ayx<Integer>> a(String $$0) {
         return ayx.a.lenientOptionalFieldOf($$0, d).validate(dfc.a::a);
      }

      public boolean a(jf $$0, arj $$1) {
         return this.b.a($$1.a(des.b, $$0)) && this.c.a($$1.a(des.a, $$0));
      }

      public ayx<Integer> a() {
         return this.b;
      }

      public ayx<Integer> b() {
         return this.c;
      }
   }
}
