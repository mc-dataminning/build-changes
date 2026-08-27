import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe implements drz {
   public static final Codec<dqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhi.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dhi.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dhi.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dhi.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dny.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dqe::new)
   );
   public final dhi b;
   public final dhi c;
   public final dhi d;
   public final dhi e;
   public final dny f;
   public final boolean g;

   public dqe(dhi $$0, dhi $$1, dhi $$2, dhi $$3, dny $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
