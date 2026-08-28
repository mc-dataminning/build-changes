import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ect(List<ect.a> b, je c, dzb d, boolean e) implements edc {
   public static final Codec<ect> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ect.a.a.listOf().fieldOf("layers").forGetter(ect::a),
               je.g.fieldOf("direction").forGetter(ect::b),
               dzb.b.fieldOf("allowed_placement").forGetter(ect::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ect::d)
            )
            .apply($$0, ect::new)
   );

   public static ect.a a(bpz $$0, efd $$1) {
      return new ect.a($$0, $$1);
   }

   public static ect b(bpz $$0, efd $$1) {
      return new ect(List.of(a($$0, $$1)), je.b, dzb.c, false);
   }

   public List<ect.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dzb c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpz b, efd c) {
      public static final Codec<ect.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpz.d.fieldOf("height").forGetter(ect.a::a), efd.a.fieldOf("provider").forGetter(ect.a::b)).apply($$0, ect.a::new)
      );

      public bpz a() {
         return this.b;
      }

      public efd b() {
         return this.c;
      }
   }
}
