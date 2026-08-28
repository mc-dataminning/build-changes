import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehf implements eja {
   public static final Codec<ehf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxv.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dxv.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dxv.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dxv.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eex.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ehf::new)
   );
   public final dxv b;
   public final dxv c;
   public final dxv d;
   public final dxv e;
   public final eex f;
   public final boolean g;

   public ehf(dxv $$0, dxv $$1, dxv $$2, dxv $$3, eex $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
