import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyn implements eai {
   public static final Codec<dyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpi.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dpi.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dpi.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dpi.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dwh.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyn::new)
   );
   public final dpi b;
   public final dpi c;
   public final dpi d;
   public final dpi e;
   public final dwh f;
   public final boolean g;

   public dyn(dpi $$0, dpi $$1, dpi $$2, dpi $$3, dwh $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
