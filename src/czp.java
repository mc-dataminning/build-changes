import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czp(List<czp.a> c, float d, int e) {
   public static final Codec<czp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czp.a.a.listOf().fieldOf("rules").forGetter(czp::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czp::b),
               ayh.l.optionalFieldOf("damage_per_block", 1).forGetter(czp::c)
            )
            .apply($$0, czp::new)
   );
   public static final ym<vz, czp> b = ym.a(czp.a.b.a(yk.a()), czp::a, yk.l, czp::b, yk.h, czp::c, czp::new);

   public float a(dwv $$0) {
      for (czp.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dwv $$0) {
      for (czp.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czp.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jv<djk> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.f).fieldOf("blocks").forGetter(czp.a::a),
                  ayh.o.optionalFieldOf("speed").forGetter(czp.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czp.a::c)
               )
               .apply($$0, czp.a::new)
      );
      public static final ym<vz, czp.a> b = ym.a(yk.c(mc.f), czp.a::a, yk.l.a(yk::a), czp.a::b, yk.b.a(yk::a), czp.a::c, czp.a::new);

      public static czp.a a(jv<djk> $$0, float $$1) {
         return new czp.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czp.a a(jv<djk> $$0) {
         return new czp.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czp.a b(jv<djk> $$0, float $$1) {
         return new czp.a($$0, Optional.of($$1), Optional.empty());
      }

      public jv<djk> a() {
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
