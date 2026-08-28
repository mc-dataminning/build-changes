import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record daq(List<daq.a> c, float d, int e) {
   public static final Codec<daq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               daq.a.a.listOf().fieldOf("rules").forGetter(daq::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(daq::b),
               azn.l.optionalFieldOf("damage_per_block", 1).forGetter(daq::c)
            )
            .apply($$0, daq::new)
   );
   public static final zt<xg, daq> b = zt.a(daq.a.b.a(zr.a()), daq::a, zr.l, daq::b, zr.h, daq::c, daq::new);

   public float a(dxu $$0) {
      for (daq.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dxu $$0) {
      for (daq.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<daq.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(ju<dkl> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<daq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.f).fieldOf("blocks").forGetter(daq.a::a),
                  azn.o.optionalFieldOf("speed").forGetter(daq.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(daq.a::c)
               )
               .apply($$0, daq.a::new)
      );
      public static final zt<xg, daq.a> b = zt.a(zr.c(mb.f), daq.a::a, zr.l.a(zr::a), daq.a::b, zr.b.a(zr::a), daq.a::c, daq.a::new);

      public static daq.a a(ju<dkl> $$0, float $$1) {
         return new daq.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static daq.a a(ju<dkl> $$0) {
         return new daq.a($$0, Optional.empty(), Optional.of(false));
      }

      public static daq.a b(ju<dkl> $$0, float $$1) {
         return new daq.a($$0, Optional.of($$1), Optional.empty());
      }

      public ju<dkl> a() {
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
