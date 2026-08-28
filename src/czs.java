import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czs(List<czs.a> c, float d, int e) {
   public static final Codec<czs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czs.a.a.listOf().fieldOf("rules").forGetter(czs::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czs::b),
               ayi.l.optionalFieldOf("damage_per_block", 1).forGetter(czs::c)
            )
            .apply($$0, czs::new)
   );
   public static final yn<wa, czs> b = yn.a(czs.a.b.a(yl.a()), czs::a, yl.l, czs::b, yl.h, czs::c, czs::new);

   public float a(dwy $$0) {
      for (czs.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dwy $$0) {
      for (czs.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czs.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jv<djn> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.f).fieldOf("blocks").forGetter(czs.a::a),
                  ayi.o.optionalFieldOf("speed").forGetter(czs.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czs.a::c)
               )
               .apply($$0, czs.a::new)
      );
      public static final yn<wa, czs.a> b = yn.a(yl.c(mc.f), czs.a::a, yl.l.a(yl::a), czs.a::b, yl.b.a(yl::a), czs.a::c, czs.a::new);

      public static czs.a a(jv<djn> $$0, float $$1) {
         return new czs.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czs.a a(jv<djn> $$0) {
         return new czs.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czs.a b(jv<djn> $$0, float $$1) {
         return new czs.a($$0, Optional.of($$1), Optional.empty());
      }

      public jv<djn> a() {
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
