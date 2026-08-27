import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record csw(sd d, Optional<csw.a> e) {
   public static final String a = "entity";
   public static final Codec<csw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sd.a.fieldOf("entity").forGetter($$0x -> $$0x.d), csw.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, csw::new)
   );
   public static final Codec<bhl<csw>> c = bhl.a(b);

   public csw() {
      this(new sd(), Optional.empty());
   }

   public csw(sd d, Optional<csw.a> e) {
      if (d.e("id")) {
         agm $$2 = agm.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sd a() {
      return this.d;
   }

   public Optional<csw.a> b() {
      return this.e;
   }

   public sd c() {
      return this.d;
   }

   public Optional<csw.a> d() {
      return this.e;
   }

   public static record a(ati<Integer> b, ati<Integer> c) {
      private static final ati<Integer> d = new ati<>(0, 15);
      public static final Codec<csw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, csw.a::new)
      );

      private static DataResult<ati<Integer>> a(ati<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<ati<Integer>> a(String $$0) {
         return asy.a(ati.a.optionalFieldOf($$0, d), csw.a::a);
      }

      public ati<Integer> a() {
         return this.b;
      }

      public ati<Integer> b() {
         return this.c;
      }
   }
}
