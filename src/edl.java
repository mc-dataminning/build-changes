import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edl extends edi {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edi.d.forGetter($$0x -> $$0x),
               brk.c.fieldOf("horizontal_radius_multiplier").forGetter($$0x -> $$0x.b),
               brk.c.fieldOf("vertical_radius_multiplier").forGetter($$0x -> $$0x.c),
               brk.a(-1.0F, 1.0F).fieldOf("floor_level").forGetter($$0x -> $$0x.j)
            )
            .apply($$0, edl::new)
   );
   public final brk b;
   public final brk c;
   final brk j;

   public edl(float $$0, eki $$1, brk $$2, ecd $$3, edj $$4, ju<dij> $$5, brk $$6, brk $$7, brk $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.b = $$6;
      this.c = $$7;
      this.j = $$8;
   }

   public edl(float $$0, eki $$1, brk $$2, ecd $$3, ju<dij> $$4, brk $$5, brk $$6, brk $$7) {
      this($$0, $$1, $$2, $$3, edj.a, $$4, $$5, $$6, $$7);
   }

   public edl(edi $$0, brk $$1, brk $$2, brk $$3) {
      this($$0.l, $$0.e, $$0.f, $$0.g, $$0.h, $$0.i, $$1, $$2, $$3);
   }
}
