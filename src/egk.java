import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egk(List<egk.a> b, jm c, ecq d, boolean e) implements egt {
   public static final Codec<egk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egk.a.a.listOf().fieldOf("layers").forGetter(egk::a),
               jm.g.fieldOf("direction").forGetter(egk::b),
               ecq.b.fieldOf("allowed_placement").forGetter(egk::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(egk::d)
            )
            .apply($$0, egk::new)
   );

   public static egk.a a(brm $$0, eiu $$1) {
      return new egk.a($$0, $$1);
   }

   public static egk b(brm $$0, eiu $$1) {
      return new egk(List.of(a($$0, $$1)), jm.b, ecq.c, false);
   }

   public List<egk.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public ecq c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brm b, eiu c) {
      public static final Codec<egk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brm.d.fieldOf("height").forGetter(egk.a::a), eiu.a.fieldOf("provider").forGetter(egk.a::b)).apply($$0, egk.a::new)
      );

      public brm a() {
         return this.b;
      }

      public eiu b() {
         return this.c;
      }
   }
}
