import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dmj(List<dmj.a> b, ha c, dir d, boolean e) implements dms {
   public static final Codec<dmj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmj.a.a.listOf().fieldOf("layers").forGetter(dmj::a),
               ha.g.fieldOf("direction").forGetter(dmj::b),
               dir.b.fieldOf("allowed_placement").forGetter(dmj::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dmj::d)
            )
            .apply($$0, dmj::new)
   );

   public static dmj.a a(bdc $$0, dot $$1) {
      return new dmj.a($$0, $$1);
   }

   public static dmj b(bdc $$0, dot $$1) {
      return new dmj(List.of(a($$0, $$1)), ha.b, dir.c, false);
   }

   public List<dmj.a> a() {
      return this.b;
   }

   public ha b() {
      return this.c;
   }

   public dir c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bdc b, dot c) {
      public static final Codec<dmj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bdc.d.fieldOf("height").forGetter(dmj.a::a), dot.a.fieldOf("provider").forGetter(dmj.a::b)).apply($$0, dmj.a::new)
      );

      public bdc a() {
         return this.b;
      }

      public dot b() {
         return this.c;
      }
   }
}
