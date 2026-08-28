import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dar(List<dar.a> c, float d, int e) {
   public static final Codec<dar> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dar.a.a.listOf().fieldOf("rules").forGetter(dar::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dar::b),
               azn.l.optionalFieldOf("damage_per_block", 1).forGetter(dar::c)
            )
            .apply($$0, dar::new)
   );
   public static final zt<xg, dar> b = zt.a(dar.a.b.a(zr.a()), dar::a, zr.l, dar::b, zr.h, dar::c, dar::new);

   public float a(dxv $$0) {
      for (dar.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dxv $$0) {
      for (dar.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dar.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<dkm> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dar.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.f).fieldOf("blocks").forGetter(dar.a::a),
                  azn.o.optionalFieldOf("speed").forGetter(dar.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dar.a::c)
               )
               .apply($$0, dar.a::new)
      );
      public static final zt<xg, dar.a> b = zt.a(zr.c(mb.f), dar.a::a, zr.l.a(zr::a), dar.a::b, zr.b.a(zr::a), dar.a::c, dar.a::new);

      public static dar.a a(ju<dkm> $$0, float $$1) {
         return new dar.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dar.a a(ju<dkm> $$0) {
         return new dar.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dar.a b(ju<dkm> $$0, float $$1) {
         return new dar.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<dkm> a() {
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
