import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxt(List<cxt.a> c, float d, int e) {
   public static final Codec<cxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxt.a.a.listOf().fieldOf("rules").forGetter(cxt::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxt::b),
               ayg.k.optionalFieldOf("damage_per_block", 1).forGetter(cxt::c)
            )
            .apply($$0, cxt::new)
   );
   public static final zm<wz, cxt> b = zm.a(cxt.a.b.a(zk.a()), cxt::a, zk.i, cxt::b, zk.g, cxt::c, cxt::new);

   public float a(dsb $$0) {
      for (cxt.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dsb $$0) {
      for (cxt.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxt.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<dey> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxt.a::a),
                  ayg.m.optionalFieldOf("speed").forGetter(cxt.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxt.a::c)
               )
               .apply($$0, cxt.a::new)
      );
      public static final zm<wz, cxt.a> b = zm.a(zk.c(lq.f), cxt.a::a, zk.i.a(zk::a), cxt.a::b, zk.b.a(zk::a), cxt.a::c, cxt.a::new);

      public static cxt.a a(List<dey> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxt.a a(axe<dey> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxt.a a(axe<dey> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxt.a b(axe<dey> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxt.a b(List<dey> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxt.a a(axe<dey> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxt.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxt.a a(List<dey> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxt.a(jm.a($$0.stream().map(dey::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<dey> a() {
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
