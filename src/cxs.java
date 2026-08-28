import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxs(List<cxs.a> c, float d, int e) {
   public static final Codec<cxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxs.a.a.listOf().fieldOf("rules").forGetter(cxs::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxs::b),
               ayf.k.optionalFieldOf("damage_per_block", 1).forGetter(cxs::c)
            )
            .apply($$0, cxs::new)
   );
   public static final zm<wz, cxs> b = zm.a(cxs.a.b.a(zk.a()), cxs::a, zk.i, cxs::b, zk.g, cxs::c, cxs::new);

   public float a(dsa $$0) {
      for (cxs.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsa $$0) {
      for (cxs.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxs.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<dex> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxs.a::a),
                  ayf.m.optionalFieldOf("speed").forGetter(cxs.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxs.a::c)
               )
               .apply($$0, cxs.a::new)
      );
      public static final zm<wz, cxs.a> b = zm.a(zk.c(lq.f), cxs.a::a, zk.i.a(zk::a), cxs.a::b, zk.b.a(zk::a), cxs.a::c, cxs.a::new);

      public static cxs.a a(List<dex> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxs.a a(axe<dex> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxs.a a(axe<dex> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxs.a b(axe<dex> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxs.a b(List<dex> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxs.a a(axe<dex> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxs.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxs.a a(List<dex> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxs.a(jm.a($$0.stream().map(dex::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<dex> a() {
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
