import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czq(List<czq.a> c, float d, int e) {
   public static final Codec<czq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czq.a.a.listOf().fieldOf("rules").forGetter(czq::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czq::b),
               ayi.l.optionalFieldOf("damage_per_block", 1).forGetter(czq::c)
            )
            .apply($$0, czq::new)
   );
   public static final yn<wa, czq> b = yn.a(czq.a.b.a(yl.a()), czq::a, yl.l, czq::b, yl.h, czq::c, czq::new);

   public float a(dww $$0) {
      for (czq.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dww $$0) {
      for (czq.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czq.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jv<djl> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.f).fieldOf("blocks").forGetter(czq.a::a),
                  ayi.o.optionalFieldOf("speed").forGetter(czq.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czq.a::c)
               )
               .apply($$0, czq.a::new)
      );
      public static final yn<wa, czq.a> b = yn.a(yl.c(mc.f), czq.a::a, yl.l.a(yl::a), czq.a::b, yl.b.a(yl::a), czq.a::c, czq.a::new);

      public static czq.a a(jv<djl> $$0, float $$1) {
         return new czq.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czq.a a(jv<djl> $$0) {
         return new czq.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czq.a b(jv<djl> $$0, float $$1) {
         return new czq.a($$0, Optional.of($$1), Optional.empty());
      }

      public jv<djl> a() {
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
