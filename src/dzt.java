import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzt extends edn {
   public static final MapCodec<dzt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               egs.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpy.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dyp.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dzu.b.optionalFieldOf("debug_settings", dzu.a).forGetter($$0x -> $$0x.h),
               jx.a(lq.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzt::new)
   );
   public final egs e;
   public final bpy f;
   public final dyp g;
   public final dzu h;
   public final jm<dfa> i;

   public dzt(float $$0, egs $$1, bpy $$2, dyp $$3, dzu $$4, jm<dfa> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
