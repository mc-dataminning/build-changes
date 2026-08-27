import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cwt(List<cwt.a> c, float d, int e) {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwt.a.a.listOf().fieldOf("rules").forGetter(cwt::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cwt::b),
               axm.i.optionalFieldOf("damage_per_block", 1).forGetter(cwt::c)
            )
            .apply($$0, cwt::new)
   );
   public static final yv<wi, cwt> b = yv.a(cwt.a.b.a(yt.a()), cwt::a, yt.h, cwt::b, yt.f, cwt::c, cwt::new);

   public float a(drb $$0) {
      for (cwt.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(drb $$0) {
      for (cwt.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cwt.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jb<ddy> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cwt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jm.a(lf.f).fieldOf("blocks").forGetter(cwt.a::a),
                  axm.k.optionalFieldOf("speed").forGetter(cwt.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cwt.a::c)
               )
               .apply($$0, cwt.a::new)
      );
      public static final yv<wi, cwt.a> b = yv.a(yt.c(lf.f), cwt.a::a, yt.h.a(yt::a), cwt.a::b, yt.b.a(yt::a), cwt.a::c, cwt.a::new);

      public static cwt.a a(List<ddy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwt.a a(awl<ddy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwt.a a(awl<ddy> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cwt.a b(awl<ddy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cwt.a b(List<ddy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cwt.a a(awl<ddy> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwt.a(le.e.a($$0), $$1, $$2);
      }

      private static cwt.a a(List<ddy> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwt.a(jb.a($$0.stream().map(ddy::r).collect(Collectors.toList())), $$1, $$2);
      }

      public jb<ddy> a() {
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
