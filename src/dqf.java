import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqf implements dse {
   public static final Codec<dqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agm.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               agm.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ebl.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ebl.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dqf::new)
   );
   public final List<agm> b;
   public final List<agm> c;
   public final ig<ebk> d;
   public final ig<ebk> e;
   public final int f;

   public dqf(List<agm> $$0, List<agm> $$1, ig<ebk> $$2, ig<ebk> $$3, int $$4) {
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
