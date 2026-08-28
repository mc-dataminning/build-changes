import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxx(List<cxx.a> c, float d, int e) {
   public static final Codec<cxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxx.a.a.listOf().fieldOf("rules").forGetter(cxx::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxx::b),
               axw.k.optionalFieldOf("damage_per_block", 1).forGetter(cxx::c)
            )
            .apply($$0, cxx::new)
   );
   public static final yx<wk, cxx> b = yx.a(cxx.a.b.a(yv.a()), cxx::a, yv.i, cxx::b, yv.g, cxx::c, cxx::new);

   public float a(dtc $$0) {
      for (cxx.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dtc $$0) {
      for (cxx.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxx.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jq<dfy> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.a(lu.f).fieldOf("blocks").forGetter(cxx.a::a),
                  axw.m.optionalFieldOf("speed").forGetter(cxx.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxx.a::c)
               )
               .apply($$0, cxx.a::new)
      );
      public static final yx<wk, cxx.a> b = yx.a(yv.c(lu.f), cxx.a::a, yv.i.a(yv::a), cxx.a::b, yv.b.a(yv::a), cxx.a::c, cxx.a::new);

      public static cxx.a a(List<dfy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxx.a a(awu<dfy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxx.a a(awu<dfy> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxx.a b(awu<dfy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxx.a b(List<dfy> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxx.a a(awu<dfy> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxx.a(lt.e.a($$0), $$1, $$2);
      }

      private static cxx.a a(List<dfy> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxx.a(jq.a($$0.stream().map(dfy::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jq<dfy> a() {
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
