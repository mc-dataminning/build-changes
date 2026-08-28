import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekv implements emr {
   public static final Codec<ekv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebg.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               ebg.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               ebg.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               ebg.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eim.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ekv::new)
   );
   public final ebg b;
   public final ebg c;
   public final ebg d;
   public final ebg e;
   public final eim f;
   public final boolean g;

   public ekv(ebg $$0, ebg $$1, ebg $$2, ebg $$3, eim $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
