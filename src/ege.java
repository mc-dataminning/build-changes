import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ege implements eid {
   public static final Codec<ege> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akv.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ero.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ero.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ege::new)
   );
   public final List<akv> b;
   public final List<akv> c;
   public final jr<ern> d;
   public final jr<ern> e;
   public final int f;

   public ege(List<akv> $$0, List<akv> $$1, jr<ern> $$2, jr<ern> $$3, int $$4) {
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
