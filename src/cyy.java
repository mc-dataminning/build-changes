import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cyy(List<cyy.a> c, float d, int e) {
   public static final Codec<cyy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyy.a.a.listOf().fieldOf("rules").forGetter(cyy::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cyy::b),
               ayo.k.optionalFieldOf("damage_per_block", 1).forGetter(cyy::c)
            )
            .apply($$0, cyy::new)
   );
   public static final zc<wp, cyy> b = zc.a(cyy.a.b.a(za.a()), cyy::a, za.j, cyy::b, za.h, cyy::c, cyy::new);

   public float a(dus $$0) {
      for (cyy.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dus $$0) {
      for (cyy.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cyy.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(js<dhm> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cyy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.a(lw.f).fieldOf("blocks").forGetter(cyy.a::a),
                  ayo.n.optionalFieldOf("speed").forGetter(cyy.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cyy.a::c)
               )
               .apply($$0, cyy.a::new)
      );
      public static final zc<wp, cyy.a> b = zc.a(za.c(lw.f), cyy.a::a, za.j.a(za::a), cyy.a::b, za.b.a(za::a), cyy.a::c, cyy.a::new);

      public static cyy.a a(js<dhm> $$0, float $$1) {
         return new cyy.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cyy.a a(js<dhm> $$0) {
         return new cyy.a($$0, Optional.empty(), Optional.of(false));
      }

      public static cyy.a b(js<dhm> $$0, float $$1) {
         return new cyy.a($$0, Optional.of($$1), Optional.empty());
      }

      public js<dhm> a() {
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
