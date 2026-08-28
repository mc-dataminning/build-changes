import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eik(List<eik.a> b, jm c, eeq d, boolean e) implements eit {
   public static final Codec<eik> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eik.a.a.listOf().fieldOf("layers").forGetter(eik::a),
               jm.g.fieldOf("direction").forGetter(eik::b),
               eeq.b.fieldOf("allowed_placement").forGetter(eik::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eik::d)
            )
            .apply($$0, eik::new)
   );

   public static eik.a a(bsf $$0, eku $$1) {
      return new eik.a($$0, $$1);
   }

   public static eik b(bsf $$0, eku $$1) {
      return new eik(List.of(a($$0, $$1)), jm.b, eeq.c, false);
   }

   public List<eik.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public eeq c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bsf b, eku c) {
      public static final Codec<eik.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsf.d.fieldOf("height").forGetter(eik.a::a), eku.a.fieldOf("provider").forGetter(eik.a::b)).apply($$0, eik.a::new)
      );

      public bsf a() {
         return this.b;
      }

      public eku b() {
         return this.c;
      }
   }
}
