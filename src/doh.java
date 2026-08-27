import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doh implements dqc {
   public static final Codec<doh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfl.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dfl.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dfl.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dfl.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dmb.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, doh::new)
   );
   public final dfl b;
   public final dfl c;
   public final dfl d;
   public final dfl e;
   public final dmb f;
   public final boolean g;

   public doh(dfl $$0, dfl $$1, dfl $$2, dfl $$3, dmb $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
