import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efl(List<efl.a> b, jj c, ebr d, boolean e) implements efu {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efl.a.a.listOf().fieldOf("layers").forGetter(efl::a),
               jj.g.fieldOf("direction").forGetter(efl::b),
               ebr.b.fieldOf("allowed_placement").forGetter(efl::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(efl::d)
            )
            .apply($$0, efl::new)
   );

   public static efl.a a(bqu $$0, ehv $$1) {
      return new efl.a($$0, $$1);
   }

   public static efl b(bqu $$0, ehv $$1) {
      return new efl(List.of(a($$0, $$1)), jj.b, ebr.c, false);
   }

   public List<efl.a> a() {
      return this.b;
   }

   public jj b() {
      return this.c;
   }

   public ebr c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bqu b, ehv c) {
      public static final Codec<efl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqu.d.fieldOf("height").forGetter(efl.a::a), ehv.a.fieldOf("provider").forGetter(efl.a::b)).apply($$0, efl.a::new)
      );

      public bqu a() {
         return this.b;
      }

      public ehv b() {
         return this.c;
      }
   }
}
