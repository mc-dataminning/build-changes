import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cyx(List<cyx.a> c, float d, int e) {
   public static final Codec<cyx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyx.a.a.listOf().fieldOf("rules").forGetter(cyx::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cyx::b),
               ays.l.optionalFieldOf("damage_per_block", 1).forGetter(cyx::c)
            )
            .apply($$0, cyx::new)
   );
   public static final zf<ws, cyx> b = zf.a(cyx.a.b.a(zd.a()), cyx::a, zd.j, cyx::b, zd.h, cyx::c, cyx::new);

   public float a(dvd $$0) {
      for (cyx.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dvd $$0) {
      for (cyx.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cyx.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jt<dhy> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cyx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ke.a(ly.f).fieldOf("blocks").forGetter(cyx.a::a),
                  ays.o.optionalFieldOf("speed").forGetter(cyx.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cyx.a::c)
               )
               .apply($$0, cyx.a::new)
      );
      public static final zf<ws, cyx.a> b = zf.a(zd.c(ly.f), cyx.a::a, zd.j.a(zd::a), cyx.a::b, zd.b.a(zd::a), cyx.a::c, cyx.a::new);

      public static cyx.a a(jt<dhy> $$0, float $$1) {
         return new cyx.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cyx.a a(jt<dhy> $$0) {
         return new cyx.a($$0, Optional.empty(), Optional.of(false));
      }

      public static cyx.a b(jt<dhy> $$0, float $$1) {
         return new cyx.a($$0, Optional.of($$1), Optional.empty());
      }

      public jt<dhy> a() {
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
