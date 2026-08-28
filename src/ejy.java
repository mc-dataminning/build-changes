import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejy implements elx {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alg.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alg.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               evj.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               evj.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ejy::new)
   );
   public final List<alg> b;
   public final List<alg> c;
   public final jf<evi> d;
   public final jf<evi> e;
   public final int f;

   public ejy(List<alg> $$0, List<alg> $$1, jf<evi> $$2, jf<evi> $$3, int $$4) {
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
