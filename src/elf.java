import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elf implements enb {
   public static final Codec<elf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebq.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               ebq.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               ebq.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               ebq.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               eiw.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elf::new)
   );
   public final ebq b;
   public final ebq c;
   public final ebq d;
   public final ebq e;
   public final eiw f;
   public final boolean g;

   public elf(ebq $$0, ebq $$1, ebq $$2, ebq $$3, eiw $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
