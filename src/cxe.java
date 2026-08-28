import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxe(List<cxe.a> c, float d, int e) {
   public static final Codec<cxe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxe.a.a.listOf().fieldOf("rules").forGetter(cxe::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxe::b),
               axm.k.optionalFieldOf("damage_per_block", 1).forGetter(cxe::c)
            )
            .apply($$0, cxe::new)
   );
   public static final ys<wf, cxe> b = ys.a(cxe.a.b.a(yq.a()), cxe::a, yq.i, cxe::b, yq.g, cxe::c, cxe::new);

   public float a(dsh $$0) {
      for (cxe.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsh $$0) {
      for (cxe.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxe.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jn<dff> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.f).fieldOf("blocks").forGetter(cxe.a::a),
                  axm.m.optionalFieldOf("speed").forGetter(cxe.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxe.a::c)
               )
               .apply($$0, cxe.a::new)
      );
      public static final ys<wf, cxe.a> b = ys.a(yq.c(lr.f), cxe.a::a, yq.i.a(yq::a), cxe.a::b, yq.b.a(yq::a), cxe.a::c, cxe.a::new);

      public static cxe.a a(List<dff> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxe.a a(awk<dff> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxe.a a(awk<dff> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxe.a b(awk<dff> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxe.a b(List<dff> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxe.a a(awk<dff> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxe.a(lq.e.a($$0), $$1, $$2);
      }

      private static cxe.a a(List<dff> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxe.a(jn.a($$0.stream().map(dff::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jn<dff> a() {
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
