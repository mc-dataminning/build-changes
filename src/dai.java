import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dai(List<dai.a> c, float d, int e) {
   public static final Codec<dai> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dai.a.a.listOf().fieldOf("rules").forGetter(dai::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dai::b),
               azd.l.optionalFieldOf("damage_per_block", 1).forGetter(dai::c)
            )
            .apply($$0, dai::new)
   );
   public static final zi<wv, dai> b = zi.a(dai.a.b.a(zg.a()), dai::a, zg.l, dai::b, zg.h, dai::c, dai::new);

   public float a(dxo $$0) {
      for (dai.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dxo $$0) {
      for (dai.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dai.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<dkd> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dai.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.f).fieldOf("blocks").forGetter(dai.a::a),
                  azd.o.optionalFieldOf("speed").forGetter(dai.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dai.a::c)
               )
               .apply($$0, dai.a::new)
      );
      public static final zi<wv, dai.a> b = zi.a(zg.c(mb.f), dai.a::a, zg.l.a(zg::a), dai.a::b, zg.b.a(zg::a), dai.a::c, dai.a::new);

      public static dai.a a(ju<dkd> $$0, float $$1) {
         return new dai.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dai.a a(ju<dkd> $$0) {
         return new dai.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dai.a b(ju<dkd> $$0, float $$1) {
         return new dai.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<dkd> a() {
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
