import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehu(List<ehu.a> b, jn c, eea d, boolean e) implements eid {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehu.a.a.listOf().fieldOf("layers").forGetter(ehu::a),
               jn.g.fieldOf("direction").forGetter(ehu::b),
               eea.b.fieldOf("allowed_placement").forGetter(ehu::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ehu::d)
            )
            .apply($$0, ehu::new)
   );

   public static ehu.a a(brq $$0, eke $$1) {
      return new ehu.a($$0, $$1);
   }

   public static ehu b(brq $$0, eke $$1) {
      return new ehu(List.of(a($$0, $$1)), jn.b, eea.c, false);
   }

   public List<ehu.a> a() {
      return this.b;
   }

   public jn b() {
      return this.c;
   }

   public eea c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brq b, eke c) {
      public static final Codec<ehu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brq.d.fieldOf("height").forGetter(ehu.a::a), eke.a.fieldOf("provider").forGetter(ehu.a::b)).apply($$0, ehu.a::new)
      );

      public brq a() {
         return this.b;
      }

      public eke b() {
         return this.c;
      }
   }
}
