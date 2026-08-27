import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecw implements ecb {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emu.a.fieldOf("state").forGetter($$0x -> $$0x.b),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter($$0x -> $$0x.e),
               jm.a(lf.f).fieldOf("valid_blocks").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecw::new)
   );
   public final emu b;
   public final boolean c;
   public final int d;
   public final int e;
   public final jb<ddy> f;

   public ecw(emu $$0, boolean $$1, int $$2, int $$3, jb<ddy> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }
}
