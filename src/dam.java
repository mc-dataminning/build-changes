import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dam(List<dam.a> c, float d, int e) {
   public static final Codec<dam> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dam.a.a.listOf().fieldOf("rules").forGetter(dam::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dam::b),
               azn.l.optionalFieldOf("damage_per_block", 1).forGetter(dam::c)
            )
            .apply($$0, dam::new)
   );
   public static final zt<xg, dam> b = zt.a(dam.a.b.a(zr.a()), dam::a, zr.l, dam::b, zr.h, dam::c, dam::new);

   public float a(dxn $$0) {
      for (dam.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dxn $$0) {
      for (dam.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dam.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<dke> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dam.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.f).fieldOf("blocks").forGetter(dam.a::a),
                  azn.o.optionalFieldOf("speed").forGetter(dam.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dam.a::c)
               )
               .apply($$0, dam.a::new)
      );
      public static final zt<xg, dam.a> b = zt.a(zr.c(mb.f), dam.a::a, zr.l.a(zr::a), dam.a::b, zr.b.a(zr::a), dam.a::c, dam.a::new);

      public static dam.a a(ju<dke> $$0, float $$1) {
         return new dam.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dam.a a(ju<dke> $$0) {
         return new dam.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dam.a b(ju<dke> $$0, float $$1) {
         return new dam.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<dke> a() {
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
