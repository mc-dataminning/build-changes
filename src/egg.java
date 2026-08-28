import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egg implements eib {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dww.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dww.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dww.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dww.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               edy.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egg::new)
   );
   public final dww b;
   public final dww c;
   public final dww d;
   public final dww e;
   public final edy f;
   public final boolean g;

   public egg(dww $$0, dww $$1, dww $$2, dww $$3, edy $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
