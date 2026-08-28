import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dax(List<dax.a> c, float d, int e, boolean f) {
   public static final Codec<dax> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dax.a.a.listOf().fieldOf("rules").forGetter(dax::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dax::b),
               ays.l.optionalFieldOf("damage_per_block", 1).forGetter(dax::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dax::d)
            )
            .apply($$0, dax::new)
   );
   public static final yt<wg, dax> b = yt.a(dax.a.b.a(yr.a()), dax::a, yr.l, dax::b, yr.h, dax::c, yr.b, dax::d, dax::new);

   public float a(dym $$0) {
      for (dax.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dym $$0) {
      for (dax.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dax.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public static record a(jw<dku> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kh.a(me.f).fieldOf("blocks").forGetter(dax.a::a),
                  ays.o.optionalFieldOf("speed").forGetter(dax.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dax.a::c)
               )
               .apply($$0, dax.a::new)
      );
      public static final yt<wg, dax.a> b = yt.a(yr.c(me.f), dax.a::a, yr.l.a(yr::a), dax.a::b, yr.b.a(yr::a), dax.a::c, dax.a::new);

      public static dax.a a(jw<dku> $$0, float $$1) {
         return new dax.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dax.a a(jw<dku> $$0) {
         return new dax.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dax.a b(jw<dku> $$0, float $$1) {
         return new dax.a($$0, Optional.of($$1), Optional.empty());
      }

      public jw<dku> a() {
         return this.c;
      }

      public Optional<Float> b() {
         return this.d;
      }

      public Optional<Boolean> c() {
         return this.e;
      }
   }
}
