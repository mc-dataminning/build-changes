import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record czr(List<czr.a> c, float d, int e) {
   public static final Codec<czr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czr.a.a.listOf().fieldOf("rules").forGetter(czr::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(czr::b),
               ayi.l.optionalFieldOf("damage_per_block", 1).forGetter(czr::c)
            )
            .apply($$0, czr::new)
   );
   public static final ym<vz, czr> b = ym.a(czr.a.b.a(yk.a()), czr::a, yk.l, czr::b, yk.h, czr::c, czr::new);

   public float a(dwx $$0) {
      for (czr.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dwx $$0) {
      for (czr.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<czr.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jv<djm> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<czr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.f).fieldOf("blocks").forGetter(czr.a::a),
                  ayi.o.optionalFieldOf("speed").forGetter(czr.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(czr.a::c)
               )
               .apply($$0, czr.a::new)
      );
      public static final ym<vz, czr.a> b = ym.a(yk.c(mc.f), czr.a::a, yk.l.a(yk::a), czr.a::b, yk.b.a(yk::a), czr.a::c, czr.a::new);

      public static czr.a a(jv<djm> $$0, float $$1) {
         return new czr.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static czr.a a(jv<djm> $$0) {
         return new czr.a($$0, Optional.empty(), Optional.of(false));
      }

      public static czr.a b(jv<djm> $$0, float $$1) {
         return new czr.a($$0, Optional.of($$1), Optional.empty());
      }

      public jv<djm> a() {
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
