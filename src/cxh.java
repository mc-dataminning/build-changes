import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxh(List<cxh.a> c, float d, int e) {
   public static final Codec<cxh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxh.a.a.listOf().fieldOf("rules").forGetter(cxh::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxh::b),
               axo.k.optionalFieldOf("damage_per_block", 1).forGetter(cxh::c)
            )
            .apply($$0, cxh::new)
   );
   public static final ys<wf, cxh> b = ys.a(cxh.a.b.a(yq.a()), cxh::a, yq.i, cxh::b, yq.g, cxh::c, cxh::new);

   public float a(dsl $$0) {
      for (cxh.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsl $$0) {
      for (cxh.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxh.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jn<dfi> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.f).fieldOf("blocks").forGetter(cxh.a::a),
                  axo.m.optionalFieldOf("speed").forGetter(cxh.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxh.a::c)
               )
               .apply($$0, cxh.a::new)
      );
      public static final ys<wf, cxh.a> b = ys.a(yq.c(lr.f), cxh.a::a, yq.i.a(yq::a), cxh.a::b, yq.b.a(yq::a), cxh.a::c, cxh.a::new);

      public static cxh.a a(List<dfi> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxh.a a(awm<dfi> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxh.a a(awm<dfi> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxh.a b(awm<dfi> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxh.a b(List<dfi> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxh.a a(awm<dfi> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxh.a(lq.e.a($$0), $$1, $$2);
      }

      private static cxh.a a(List<dfi> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxh.a(jn.a($$0.stream().map(dfi::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jn<dfi> a() {
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
