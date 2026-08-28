import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czh(List<czh.a> c, float d, int e) {
   public static final Codec<czh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czh.a.a.listOf().fieldOf("rules").forGetter(czh::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czh::b),
               ayw.l.optionalFieldOf("damage_per_block", 1).forGetter(czh::c)
            )
            .apply($$0, czh::new)
   );
   public static final zj<ww, czh> b = zj.a(czh.a.b.a(zh.a()), czh::a, zh.j, czh::b, zh.h, czh::c, czh::new);

   public float a(dvo $$0) {
      for (czh.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dvo $$0) {
      for (czh.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czh.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<dij> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.f).fieldOf("blocks").forGetter(czh.a::a),
                  ayw.o.optionalFieldOf("speed").forGetter(czh.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czh.a::c)
               )
               .apply($$0, czh.a::new)
      );
      public static final zj<ww, czh.a> b = zj.a(zh.c(ma.f), czh.a::a, zh.j.a(zh::a), czh.a::b, zh.b.a(zh::a), czh.a::c, czh.a::new);

      public static czh.a a(ju<dij> $$0, float $$1) {
         return new czh.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czh.a a(ju<dij> $$0) {
         return new czh.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czh.a b(ju<dij> $$0, float $$1) {
         return new czh.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<dij> a() {
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
