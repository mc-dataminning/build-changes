import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cwv(List<cwv.a> c, float d, int e) {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwv.a.a.listOf().fieldOf("rules").forGetter(cwv::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cwv::b),
               axn.i.optionalFieldOf("damage_per_block", 1).forGetter(cwv::c)
            )
            .apply($$0, cwv::new)
   );
   public static final yv<wi, cwv> b = yv.a(cwv.a.b.a(yt.a()), cwv::a, yt.h, cwv::b, yt.f, cwv::c, cwv::new);

   public float a(drd $$0) {
      for (cwv.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(drd $$0) {
      for (cwv.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cwv.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jb<dea> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cwv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jm.a(lf.f).fieldOf("blocks").forGetter(cwv.a::a),
                  axn.k.optionalFieldOf("speed").forGetter(cwv.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cwv.a::c)
               )
               .apply($$0, cwv.a::new)
      );
      public static final yv<wi, cwv.a> b = yv.a(yt.c(lf.f), cwv.a::a, yt.h.a(yt::a), cwv.a::b, yt.b.a(yt::a), cwv.a::c, cwv.a::new);

      public static cwv.a a(List<dea> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwv.a a(awm<dea> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwv.a a(awm<dea> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cwv.a b(awm<dea> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cwv.a b(List<dea> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cwv.a a(awm<dea> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwv.a(le.e.a($$0), $$1, $$2);
      }

      private static cwv.a a(List<dea> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwv.a(jb.a($$0.stream().map(dea::q).collect(Collectors.toList())), $$1, $$2);
      }

      public jb<dea> a() {
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
