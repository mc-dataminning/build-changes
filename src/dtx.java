import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dtx implements dvw {
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aiy.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               efd.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               efd.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtx::new)
   );
   public final List<aiy> b;
   public final List<aiy> c;
   public final ij<efc> d;
   public final ij<efc> e;
   public final int f;

   public dtx(List<aiy> $$0, List<aiy> $$1, ij<efc> $$2, ij<efc> $$3, int $$4) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Fossil structure lists need at least one entry");
      } else if ($$0.size() != $$1.size()) {
         throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
      }
   }
}
