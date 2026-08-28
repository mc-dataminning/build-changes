import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecv implements edb {
   public static final Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpy.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpy.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecv::new)
   );
   private final bpy b;
   private final bpy c;

   public ecv(bpy $$0, bpy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpy a() {
      return this.b;
   }

   public bpy b() {
      return this.c;
   }
}
