import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eey implements egt {
   public static final Codec<eey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvo.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dvo.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dvo.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dvo.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ecq.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eey::new)
   );
   public final dvo b;
   public final dvo c;
   public final dvo d;
   public final dvo e;
   public final ecq f;
   public final boolean g;

   public eey(dvo $$0, dvo $$1, dvo $$2, dvo $$3, ecq $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
