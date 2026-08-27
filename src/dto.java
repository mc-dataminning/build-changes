import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dto extends dxi {
   public static final MapCodec<dto> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ean.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               blo.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dsk.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               dtp.b.optionalFieldOf("debug_settings", dtp.a).forGetter($$0x -> $$0x.h),
               iz.a(ki.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dto::new)
   );
   public final ean e;
   public final blo f;
   public final dsk g;
   public final dtp h;
   public final ip<czf> i;

   public dto(float $$0, ean $$1, blo $$2, dsk $$3, dtp $$4, ip<czf> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
