import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egr(List<egr.a> b, jm c, ecx d, boolean e) implements eha {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egr.a.a.listOf().fieldOf("layers").forGetter(egr::a),
               jm.g.fieldOf("direction").forGetter(egr::b),
               ecx.b.fieldOf("allowed_placement").forGetter(egr::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(egr::d)
            )
            .apply($$0, egr::new)
   );

   public static egr.a a(brp $$0, ejb $$1) {
      return new egr.a($$0, $$1);
   }

   public static egr b(brp $$0, ejb $$1) {
      return new egr(List.of(a($$0, $$1)), jm.b, ecx.c, false);
   }

   public List<egr.a> a() {
      return this.b;
   }

   public jm b() {
      return this.c;
   }

   public ecx c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(brp b, ejb c) {
      public static final Codec<egr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brp.d.fieldOf("height").forGetter(egr.a::a), ejb.a.fieldOf("provider").forGetter(egr.a::b)).apply($$0, egr.a::new)
      );

      public brp a() {
         return this.b;
      }

      public ejb b() {
         return this.c;
      }
   }
}
