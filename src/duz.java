import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duz implements dwy {
   public static final Codec<duz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajc.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ajc.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               egf.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               egf.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, duz::new)
   );
   public final List<ajc> b;
   public final List<ajc> c;
   public final il<ege> d;
   public final il<ege> e;
   public final int f;

   public duz(List<ajc> $$0, List<ajc> $$1, il<ege> $$2, il<ege> $$3, int $$4) {
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
