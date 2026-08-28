import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edq implements edb {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsb.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsb.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpy.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, edq::new)
   );
   public final dsb b;
   public final dsb c;
   private final bpy d;

   public edq(dsb $$0, dsb $$1, bpy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpy a() {
      return this.d;
   }
}
