import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxg(List<cxg.a> c, float d, int e) {
   public static final Codec<cxg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxg.a.a.listOf().fieldOf("rules").forGetter(cxg::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxg::b),
               axo.k.optionalFieldOf("damage_per_block", 1).forGetter(cxg::c)
            )
            .apply($$0, cxg::new)
   );
   public static final ys<wf, cxg> b = ys.a(cxg.a.b.a(yq.a()), cxg::a, yq.i, cxg::b, yq.g, cxg::c, cxg::new);

   public float a(dsk $$0) {
      for (cxg.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsk $$0) {
      for (cxg.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxg.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jn<dfh> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.f).fieldOf("blocks").forGetter(cxg.a::a),
                  axo.m.optionalFieldOf("speed").forGetter(cxg.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxg.a::c)
               )
               .apply($$0, cxg.a::new)
      );
      public static final ys<wf, cxg.a> b = ys.a(yq.c(lr.f), cxg.a::a, yq.i.a(yq::a), cxg.a::b, yq.b.a(yq::a), cxg.a::c, cxg.a::new);

      public static cxg.a a(List<dfh> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxg.a a(awm<dfh> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxg.a a(awm<dfh> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxg.a b(awm<dfh> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxg.a b(List<dfh> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxg.a a(awm<dfh> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxg.a(lq.e.a($$0), $$1, $$2);
      }

      private static cxg.a a(List<dfh> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxg.a(jn.a($$0.stream().map(dfh::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jn<dfh> a() {
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
