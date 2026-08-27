import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dti(List<dti.a> b, ic c, dpq d, boolean e) implements dtr {
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dti.a.a.listOf().fieldOf("layers").forGetter(dti::a),
               ic.g.fieldOf("direction").forGetter(dti::b),
               dpq.b.fieldOf("allowed_placement").forGetter(dti::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dti::d)
            )
            .apply($$0, dti::new)
   );

   public static dti.a a(bja $$0, dvs $$1) {
      return new dti.a($$0, $$1);
   }

   public static dti b(bja $$0, dvs $$1) {
      return new dti(List.of(a($$0, $$1)), ic.b, dpq.c, false);
   }

   public List<dti.a> a() {
      return this.b;
   }

   public ic b() {
      return this.c;
   }

   public dpq c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bja b, dvs c) {
      public static final Codec<dti.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bja.d.fieldOf("height").forGetter(dti.a::a), dvs.a.fieldOf("provider").forGetter(dti.a::b)).apply($$0, dti.a::new)
      );

      public bja a() {
         return this.b;
      }

      public dvs b() {
         return this.c;
      }
   }
}
