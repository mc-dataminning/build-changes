import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egx implements eis {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxn.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dxn.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dxn.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dxn.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eep.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egx::new)
   );
   public final dxn b;
   public final dxn c;
   public final dxn d;
   public final dxn e;
   public final eep f;
   public final boolean g;

   public egx(dxn $$0, dxn $$1, dxn $$2, dxn $$3, eep $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
