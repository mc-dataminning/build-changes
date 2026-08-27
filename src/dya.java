import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dya implements dzz {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajt.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ajt.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ejg.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ejg.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dya::new)
   );
   public final List<ajt> b;
   public final List<ajt> c;
   public final il<ejf> d;
   public final il<ejf> e;
   public final int f;

   public dya(List<ajt> $$0, List<ajt> $$1, il<ejf> $$2, il<ejf> $$3, int $$4) {
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
