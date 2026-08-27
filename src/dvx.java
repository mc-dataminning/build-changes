import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvx implements dxw {
   public static final Codec<dvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajh.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ajh.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ehd.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ehd.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dvx::new)
   );
   public final List<ajh> b;
   public final List<ajh> c;
   public final il<ehc> d;
   public final il<ehc> e;
   public final int f;

   public dvx(List<ajh> $$0, List<ajh> $$1, il<ehc> $$2, il<ehc> $$3, int $$4) {
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
