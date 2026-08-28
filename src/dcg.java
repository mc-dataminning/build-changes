import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dcg(List<dcg.a> c, float d, int e, boolean f) {
   public static final Codec<dcg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dcg.a.a.listOf().fieldOf("rules").forGetter(dcg::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dcg::b),
               ayu.l.optionalFieldOf("damage_per_block", 1).forGetter(dcg::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dcg::d)
            )
            .apply($$0, dcg::new)
   );
   public static final yw<wj, dcg> b = yw.a(dcg.a.b.a(yu.a()), dcg::a, yu.l, dcg::b, yu.h, dcg::c, yu.b, dcg::d, dcg::new);

   public float a(eah $$0) {
      for (dcg.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(eah $$0) {
      for (dcg.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dcg.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public static record a(ji<dmf> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dcg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.i).fieldOf("blocks").forGetter(dcg.a::a),
                  ayu.o.optionalFieldOf("speed").forGetter(dcg.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dcg.a::c)
               )
               .apply($$0, dcg.a::new)
      );
      public static final yw<wj, dcg.a> b = yw.a(yu.c(mg.i), dcg.a::a, yu.l.a(yu::a), dcg.a::b, yu.b.a(yu::a), dcg.a::c, dcg.a::new);

      public static dcg.a a(ji<dmf> $$0, float $$1) {
         return new dcg.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dcg.a a(ji<dmf> $$0) {
         return new dcg.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dcg.a b(ji<dmf> $$0, float $$1) {
         return new dcg.a($$0, Optional.of($$1), Optional.empty());
      }

      public ji<dmf> a() {
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
