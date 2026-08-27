import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvv implements dxu {
   public static final Codec<dvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajh.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ajh.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ehb.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ehb.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dvv::new)
   );
   public final List<ajh> b;
   public final List<ajh> c;
   public final il<eha> d;
   public final il<eha> e;
   public final int f;

   public dvv(List<ajh> $$0, List<ajh> $$1, il<eha> $$2, il<eha> $$3, int $$4) {
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
