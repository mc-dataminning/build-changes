import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxv(List<cxv.a> c, float d, int e) {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxv.a.a.listOf().fieldOf("rules").forGetter(cxv::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxv::b),
               ayh.k.optionalFieldOf("damage_per_block", 1).forGetter(cxv::c)
            )
            .apply($$0, cxv::new)
   );
   public static final zn<xa, cxv> b = zn.a(cxv.a.b.a(zl.a()), cxv::a, zl.i, cxv::b, zl.g, cxv::c, cxv::new);

   public float a(dsd $$0) {
      for (cxv.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsd $$0) {
      for (cxv.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxv.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<dfa> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxv.a::a),
                  ayh.m.optionalFieldOf("speed").forGetter(cxv.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxv.a::c)
               )
               .apply($$0, cxv.a::new)
      );
      public static final zn<xa, cxv.a> b = zn.a(zl.c(lq.f), cxv.a::a, zl.i.a(zl::a), cxv.a::b, zl.b.a(zl::a), cxv.a::c, cxv.a::new);

      public static cxv.a a(List<dfa> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxv.a a(axf<dfa> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxv.a a(axf<dfa> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxv.a b(axf<dfa> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxv.a b(List<dfa> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxv.a a(axf<dfa> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxv.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxv.a a(List<dfa> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxv.a(jm.a($$0.stream().map(dfa::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<dfa> a() {
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
