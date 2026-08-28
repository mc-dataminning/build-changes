import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edl implements efg {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dua.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dua.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ebd.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edl::new)
   );
   public final dua b;
   public final dua c;
   public final dua d;
   public final dua e;
   public final ebd f;
   public final boolean g;

   public edl(dua $$0, dua $$1, dua $$2, dua $$3, ebd $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
