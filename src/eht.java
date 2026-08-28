import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eht(List<eht.a> b, jn c, edz d, boolean e) implements eic {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eht.a.a.listOf().fieldOf("layers").forGetter(eht::a),
               jn.g.fieldOf("direction").forGetter(eht::b),
               edz.b.fieldOf("allowed_placement").forGetter(eht::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(eht::d)
            )
            .apply($$0, eht::new)
   );

   public static eht.a a(brp $$0, ekd $$1) {
      return new eht.a($$0, $$1);
   }

   public static eht b(brp $$0, ekd $$1) {
      return new eht(List.of(a($$0, $$1)), jn.b, edz.c, false);
   }

   public List<eht.a> a() {
      return this.b;
   }

   public jn b() {
      return this.c;
   }

   public edz c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brp b, ekd c) {
      public static final Codec<eht.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brp.d.fieldOf("height").forGetter(eht.a::a), ekd.a.fieldOf("provider").forGetter(eht.a::b)).apply($$0, eht.a::new)
      );

      public brp a() {
         return this.b;
      }

      public ekd b() {
         return this.c;
      }
   }
}
