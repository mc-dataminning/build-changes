import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehr(List<ehr.a> b, jn c, edx d, boolean e) implements eia {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehr.a.a.listOf().fieldOf("layers").forGetter(ehr::a),
               jn.g.fieldOf("direction").forGetter(ehr::b),
               edx.b.fieldOf("allowed_placement").forGetter(ehr::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ehr::d)
            )
            .apply($$0, ehr::new)
   );

   public static ehr.a a(brn $$0, ekb $$1) {
      return new ehr.a($$0, $$1);
   }

   public static ehr b(brn $$0, ekb $$1) {
      return new ehr(List.of(a($$0, $$1)), jn.b, edx.c, false);
   }

   public List<ehr.a> a() {
      return this.b;
   }

   public jn b() {
      return this.c;
   }

   public edx c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brn b, ekb c) {
      public static final Codec<ehr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brn.d.fieldOf("height").forGetter(ehr.a::a), ekb.a.fieldOf("provider").forGetter(ehr.a::b)).apply($$0, ehr.a::new)
      );

      public brn a() {
         return this.b;
      }

      public ekb b() {
         return this.c;
      }
   }
}
