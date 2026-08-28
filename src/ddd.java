import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ddd(List<ddd.a> c, float d, int e, boolean f) {
   public static final Codec<ddd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddd.a.a.listOf().fieldOf("rules").forGetter(ddd::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(ddd::b),
               ayy.l.optionalFieldOf("damage_per_block", 1).forGetter(ddd::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(ddd::d)
            )
            .apply($$0, ddd::new)
   );
   public static final za<wn, ddd> b = za.a(ddd.a.b.a(yy.a()), ddd::a, yy.l, ddd::b, yy.h, ddd::c, yy.b, ddd::d, ddd::new);

   public float a(ebg $$0) {
      for (ddd.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(ebg $$0) {
      for (ddd.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<ddd.a> a() {
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

   public static record a(jk<dne> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<ddd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.i).fieldOf("blocks").forGetter(ddd.a::a),
                  ayy.o.optionalFieldOf("speed").forGetter(ddd.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(ddd.a::c)
               )
               .apply($$0, ddd.a::new)
      );
      public static final za<wn, ddd.a> b = za.a(yy.c(mi.i), ddd.a::a, yy.l.a(yy::a), ddd.a::b, yy.b.a(yy::a), ddd.a::c, ddd.a::new);

      public static ddd.a a(jk<dne> $$0, float $$1) {
         return new ddd.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static ddd.a a(jk<dne> $$0) {
         return new ddd.a($$0, Optional.empty(), Optional.of(false));
      }

      public static ddd.a b(jk<dne> $$0, float $$1) {
         return new ddd.a($$0, Optional.of($$1), Optional.empty());
      }

      public jk<dne> a() {
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
