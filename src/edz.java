import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edz implements efu {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duo.a.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               duo.a.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               duo.a.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               duo.a.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               ebr.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, edz::new)
   );
   public final duo b;
   public final duo c;
   public final duo d;
   public final duo e;
   public final ebr f;
   public final boolean g;

   public edz(duo $$0, duo $$1, duo $$2, duo $$3, ebr $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
