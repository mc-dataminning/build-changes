import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eho implements egt {
   public static final Codec<eho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ero.a.fieldOf("state").forGetter($$0x -> $$0x.b),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter($$0x -> $$0x.e),
               kf.a(ma.f).fieldOf("valid_blocks").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eho::new)
   );
   public final ero b;
   public final boolean c;
   public final int d;
   public final int e;
   public final ju<dij> f;

   public eho(ero $$0, boolean $$1, int $$2, int $$3, ju<dij> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }
}
