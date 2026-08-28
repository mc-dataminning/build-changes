import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecx implements edb {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsb.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpy.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpy.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecx::new)
   );
   private final dsb b;
   private final dsb c;
   private final bpy d;
   private final bpy e;

   public ecx(dsb $$0, dsb $$1, bpy $$2, bpy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsb a() {
      return this.b;
   }

   public dsb b() {
      return this.c;
   }

   public bpy c() {
      return this.d;
   }

   public bpy d() {
      return this.e;
   }
}
