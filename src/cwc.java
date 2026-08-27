import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cwc(List<cwc.a> c, float d, int e) {
   public static final Codec<cwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwc.a.a.listOf().fieldOf("rules").forGetter(cwc::a),
               axh.a(Codec.FLOAT, "default_mining_speed", 1.0F).forGetter(cwc::b),
               axh.a(axh.i, "damage_per_block", Integer.valueOf(1)).forGetter(cwc::c)
            )
            .apply($$0, cwc::new)
   );
   public static final ys<wf, cwc> b = ys.a(cwc.a.b.a(yq.a()), cwc::a, yq.h, cwc::b, yq.f, cwc::c, cwc::new);

   public float a(dqh $$0) {
      for (cwc.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dqh $$0) {
      for (cwc.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cwc.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ja<dde> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cwc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jl.a(le.f).fieldOf("blocks").forGetter(cwc.a::a),
                  axh.a(axh.k, "speed").forGetter(cwc.a::b),
                  axh.a(Codec.BOOL, "correct_for_drops").forGetter(cwc.a::c)
               )
               .apply($$0, cwc.a::new)
      );
      public static final ys<wf, cwc.a> b = ys.a(yq.c(le.f), cwc.a::a, yq.h.a(yq::a), cwc.a::b, yq.b.a(yq::a), cwc.a::c, cwc.a::new);

      public static cwc.a a(List<dde> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwc.a a(awg<dde> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cwc.a a(awg<dde> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cwc.a b(awg<dde> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cwc.a b(List<dde> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cwc.a a(awg<dde> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwc.a(ld.e.a($$0), $$1, $$2);
      }

      private static cwc.a a(List<dde> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cwc.a(ja.a($$0.stream().map(dde::r).collect(Collectors.toList())), $$1, $$2);
      }

      public ja<dde> a() {
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
