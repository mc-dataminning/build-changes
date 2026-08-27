import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eae implements ecd {
   public static final Codec<eae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akn.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akn.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               elk.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               elk.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eae::new)
   );
   public final List<akn> b;
   public final List<akn> c;
   public final ix<elj> d;
   public final ix<elj> e;
   public final int f;

   public eae(List<akn> $$0, List<akn> $$1, ix<elj> $$2, ix<elj> $$3, int $$4) {
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
