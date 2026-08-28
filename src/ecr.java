import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecr(List<ecr.a> b, je c, dyz d, boolean e) implements eda {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecr.a.a.listOf().fieldOf("layers").forGetter(ecr::a),
               je.g.fieldOf("direction").forGetter(ecr::b),
               dyz.b.fieldOf("allowed_placement").forGetter(ecr::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ecr::d)
            )
            .apply($$0, ecr::new)
   );

   public static ecr.a a(bpx $$0, efb $$1) {
      return new ecr.a($$0, $$1);
   }

   public static ecr b(bpx $$0, efb $$1) {
      return new ecr(List.of(a($$0, $$1)), je.b, dyz.c, false);
   }

   public List<ecr.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dyz c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpx b, efb c) {
      public static final Codec<ecr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpx.d.fieldOf("height").forGetter(ecr.a::a), efb.a.fieldOf("provider").forGetter(ecr.a::b)).apply($$0, ecr.a::new)
      );

      public bpx a() {
         return this.b;
      }

      public efb b() {
         return this.c;
      }
   }
}
