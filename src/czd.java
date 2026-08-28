import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czd(List<czd.a> c, float d, int e) {
   public static final Codec<czd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czd.a.a.listOf().fieldOf("rules").forGetter(czd::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czd::b),
               ayt.l.optionalFieldOf("damage_per_block", 1).forGetter(czd::c)
            )
            .apply($$0, czd::new)
   );
   public static final zg<wt, czd> b = zg.a(czd.a.b.a(ze.a()), czd::a, ze.j, czd::b, ze.h, czd::c, czd::new);

   public float a(dvj $$0) {
      for (czd.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dvj $$0) {
      for (czd.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czd.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<die> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(lz.f).fieldOf("blocks").forGetter(czd.a::a),
                  ayt.o.optionalFieldOf("speed").forGetter(czd.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czd.a::c)
               )
               .apply($$0, czd.a::new)
      );
      public static final zg<wt, czd.a> b = zg.a(ze.c(lz.f), czd.a::a, ze.j.a(ze::a), czd.a::b, ze.b.a(ze::a), czd.a::c, czd.a::new);

      public static czd.a a(ju<die> $$0, float $$1) {
         return new czd.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czd.a a(ju<die> $$0) {
         return new czd.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czd.a b(ju<die> $$0, float $$1) {
         return new czd.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<die> a() {
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
