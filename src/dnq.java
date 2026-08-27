import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnq implements dpp {
   public static final Codec<dnq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aep.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aep.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dyp.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dyp.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dnq::new)
   );
   public final List<aep> b;
   public final List<aep> c;
   public final hf<dyo> d;
   public final hf<dyo> e;
   public final int f;

   public dnq(List<aep> $$0, List<aep> $$1, hf<dyo> $$2, hf<dyo> $$3, int $$4) {
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
