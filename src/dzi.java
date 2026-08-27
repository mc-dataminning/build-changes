import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dzi implements ebh {
   public static final Codec<dzi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akh.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akh.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eko.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eko.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dzi::new)
   );
   public final List<akh> b;
   public final List<akh> c;
   public final iw<ekn> d;
   public final iw<ekn> e;
   public final int f;

   public dzi(List<akh> $$0, List<akh> $$1, iw<ekn> $$2, iw<ekn> $$3, int $$4) {
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
