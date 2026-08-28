import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejn implements eli {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzz.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dzz.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dzz.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dzz.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ehf.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejn::new)
   );
   public final dzz b;
   public final dzz c;
   public final dzz d;
   public final dzz e;
   public final ehf f;
   public final boolean g;

   public ejn(dzz $$0, dzz $$1, dzz $$2, dzz $$3, ehf $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
