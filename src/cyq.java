import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cyq(List<cyq.a> c, float d, int e) {
   public static final Codec<cyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyq.a.a.listOf().fieldOf("rules").forGetter(cyq::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cyq::b),
               ayl.k.optionalFieldOf("damage_per_block", 1).forGetter(cyq::c)
            )
            .apply($$0, cyq::new)
   );
   public static final zb<wo, cyq> b = zb.a(cyq.a.b.a(yz.a()), cyq::a, yz.i, cyq::b, yz.g, cyq::c, cyq::new);

   public float a(dua $$0) {
      for (cyq.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dua $$0) {
      for (cyq.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cyq.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jr<dgv> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cyq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.a(lv.f).fieldOf("blocks").forGetter(cyq.a::a),
                  ayl.m.optionalFieldOf("speed").forGetter(cyq.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cyq.a::c)
               )
               .apply($$0, cyq.a::new)
      );
      public static final zb<wo, cyq.a> b = zb.a(yz.c(lv.f), cyq.a::a, yz.i.a(yz::a), cyq.a::b, yz.b.a(yz::a), cyq.a::c, cyq.a::new);

      public static cyq.a a(jr<dgv> $$0, float $$1) {
         return new cyq.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cyq.a a(jr<dgv> $$0) {
         return new cyq.a($$0, Optional.empty(), Optional.of(false));
      }

      public static cyq.a b(jr<dgv> $$0, float $$1) {
         return new cyq.a($$0, Optional.of($$1), Optional.empty());
      }

      public jr<dgv> a() {
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
