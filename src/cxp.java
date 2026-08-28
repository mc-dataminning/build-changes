import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxp(List<cxp.a> c, float d, int e) {
   public static final Codec<cxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxp.a.a.listOf().fieldOf("rules").forGetter(cxp::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxp::b),
               ayc.k.optionalFieldOf("damage_per_block", 1).forGetter(cxp::c)
            )
            .apply($$0, cxp::new)
   );
   public static final zj<ww, cxp> b = zj.a(cxp.a.b.a(zh.a()), cxp::a, zh.i, cxp::b, zh.g, cxp::c, cxp::new);

   public float a(drx $$0) {
      for (cxp.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(drx $$0) {
      for (cxp.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxp.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<deu> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxp.a::a),
                  ayc.m.optionalFieldOf("speed").forGetter(cxp.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxp.a::c)
               )
               .apply($$0, cxp.a::new)
      );
      public static final zj<ww, cxp.a> b = zj.a(zh.c(lq.f), cxp.a::a, zh.i.a(zh::a), cxp.a::b, zh.b.a(zh::a), cxp.a::c, cxp.a::new);

      public static cxp.a a(List<deu> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxp.a a(axb<deu> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxp.a a(axb<deu> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxp.a b(axb<deu> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxp.a b(List<deu> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxp.a a(axb<deu> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxp.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxp.a a(List<deu> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxp.a(jm.a($$0.stream().map(deu::q).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<deu> a() {
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
