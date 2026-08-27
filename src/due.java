import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class due implements dwd {
   public static final Codec<due> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aiy.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               efk.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               efk.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, due::new)
   );
   public final List<aiy> b;
   public final List<aiy> c;
   public final ij<efj> d;
   public final ij<efj> e;
   public final int f;

   public due(List<aiy> $$0, List<aiy> $$1, ij<efj> $$2, ij<efj> $$3, int $$4) {
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
