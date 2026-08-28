import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cyv(List<cyv.a> c, float d, int e) {
   public static final Codec<cyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyv.a.a.listOf().fieldOf("rules").forGetter(cyv::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cyv::b),
               aym.k.optionalFieldOf("damage_per_block", 1).forGetter(cyv::c)
            )
            .apply($$0, cyv::new)
   );
   public static final zb<wo, cyv> b = zb.a(cyv.a.b.a(yz.a()), cyv::a, yz.i, cyv::b, yz.g, cyv::c, cyv::new);

   public float a(duo $$0) {
      for (cyv.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(duo $$0) {
      for (cyv.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cyv.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jr<dhj> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cyv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.a(lv.f).fieldOf("blocks").forGetter(cyv.a::a),
                  aym.n.optionalFieldOf("speed").forGetter(cyv.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cyv.a::c)
               )
               .apply($$0, cyv.a::new)
      );
      public static final zb<wo, cyv.a> b = zb.a(yz.c(lv.f), cyv.a::a, yz.i.a(yz::a), cyv.a::b, yz.b.a(yz::a), cyv.a::c, cyv.a::new);

      public static cyv.a a(jr<dhj> $$0, float $$1) {
         return new cyv.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cyv.a a(jr<dhj> $$0) {
         return new cyv.a($$0, Optional.empty(), Optional.of(false));
      }

      public static cyv.a b(jr<dhj> $$0, float $$1) {
         return new cyv.a($$0, Optional.of($$1), Optional.empty());
      }

      public jr<dhj> a() {
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
