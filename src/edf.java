import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edf(List<edf.a> b, jf c, dzm d, boolean e) implements edo {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edf.a.a.listOf().fieldOf("layers").forGetter(edf::a),
               jf.g.fieldOf("direction").forGetter(edf::b),
               dzm.b.fieldOf("allowed_placement").forGetter(edf::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(edf::d)
            )
            .apply($$0, edf::new)
   );

   public static edf.a a(bpl $$0, efp $$1) {
      return new edf.a($$0, $$1);
   }

   public static edf b(bpl $$0, efp $$1) {
      return new edf(List.of(a($$0, $$1)), jf.b, dzm.c, false);
   }

   public List<edf.a> a() {
      return this.b;
   }

   public jf b() {
      return this.c;
   }

   public dzm c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpl b, efp c) {
      public static final Codec<edf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpl.d.fieldOf("height").forGetter(edf.a::a), efp.a.fieldOf("provider").forGetter(edf.a::b)).apply($$0, edf.a::new)
      );

      public bpl a() {
         return this.b;
      }

      public efp b() {
         return this.c;
      }
   }
}
