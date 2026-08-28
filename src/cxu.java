import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxu(List<cxu.a> c, float d, int e) {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxu.a.a.listOf().fieldOf("rules").forGetter(cxu::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxu::b),
               ayh.k.optionalFieldOf("damage_per_block", 1).forGetter(cxu::c)
            )
            .apply($$0, cxu::new)
   );
   public static final zn<xa, cxu> b = zn.a(cxu.a.b.a(zl.a()), cxu::a, zl.i, cxu::b, zl.g, cxu::c, cxu::new);

   public float a(dsc $$0) {
      for (cxu.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsc $$0) {
      for (cxu.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxu.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<dez> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxu.a::a),
                  ayh.m.optionalFieldOf("speed").forGetter(cxu.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxu.a::c)
               )
               .apply($$0, cxu.a::new)
      );
      public static final zn<xa, cxu.a> b = zn.a(zl.c(lq.f), cxu.a::a, zl.i.a(zl::a), cxu.a::b, zl.b.a(zl::a), cxu.a::c, cxu.a::new);

      public static cxu.a a(List<dez> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxu.a a(axf<dez> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxu.a a(axf<dez> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxu.a b(axf<dez> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxu.a b(List<dez> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxu.a a(axf<dez> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxu.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxu.a a(List<dez> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxu.a(jm.a($$0.stream().map(dez::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<dez> a() {
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
