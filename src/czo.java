import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czo(List<czo.a> c, float d, int e) {
   public static final Codec<czo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czo.a.a.listOf().fieldOf("rules").forGetter(czo::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czo::b),
               ayv.l.optionalFieldOf("damage_per_block", 1).forGetter(czo::c)
            )
            .apply($$0, czo::new)
   );
   public static final zh<wu, czo> b = zh.a(czo.a.b.a(zf.a()), czo::a, zf.k, czo::b, zf.h, czo::c, czo::new);

   public float a(dvv $$0) {
      for (czo.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dvv $$0) {
      for (czo.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czo.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<diq> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.f).fieldOf("blocks").forGetter(czo.a::a),
                  ayv.o.optionalFieldOf("speed").forGetter(czo.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czo.a::c)
               )
               .apply($$0, czo.a::new)
      );
      public static final zh<wu, czo.a> b = zh.a(zf.c(ma.f), czo.a::a, zf.k.a(zf::a), czo.a::b, zf.b.a(zf::a), czo.a::c, czo.a::new);

      public static czo.a a(ju<diq> $$0, float $$1) {
         return new czo.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czo.a a(ju<diq> $$0) {
         return new czo.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czo.a b(ju<diq> $$0, float $$1) {
         return new czo.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<diq> a() {
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
