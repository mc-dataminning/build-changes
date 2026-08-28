import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecs(List<ecs.a> b, je c, dza d, boolean e) implements edb {
   public static final Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecs.a.a.listOf().fieldOf("layers").forGetter(ecs::a),
               je.g.fieldOf("direction").forGetter(ecs::b),
               dza.b.fieldOf("allowed_placement").forGetter(ecs::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ecs::d)
            )
            .apply($$0, ecs::new)
   );

   public static ecs.a a(bpy $$0, efc $$1) {
      return new ecs.a($$0, $$1);
   }

   public static ecs b(bpy $$0, efc $$1) {
      return new ecs(List.of(a($$0, $$1)), je.b, dza.c, false);
   }

   public List<ecs.a> a() {
      return this.b;
   }

   public je b() {
      return this.c;
   }

   public dza c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bpy b, efc c) {
      public static final Codec<ecs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bpy.d.fieldOf("height").forGetter(ecs.a::a), efc.a.fieldOf("provider").forGetter(ecs.a::b)).apply($$0, ecs.a::new)
      );

      public bpy a() {
         return this.b;
      }

      public efc b() {
         return this.c;
      }
   }
}
