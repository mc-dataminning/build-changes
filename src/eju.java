import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eju implements eiz {
   public static final Codec<eju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etw.a.fieldOf("state").forGetter($$0x -> $$0x.b),
               Codec.BOOL.fieldOf("requires_block_below").orElse(true).forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("rock_count").orElse(4).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("hole_count").orElse(1).forGetter($$0x -> $$0x.e),
               kf.a(mb.f).fieldOf("valid_blocks").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eju::new)
   );
   public final etw b;
   public final boolean c;
   public final int d;
   public final int e;
   public final ju<dkl> f;

   public eju(etw $$0, boolean $$1, int $$2, int $$3, ju<dkl> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }
}
