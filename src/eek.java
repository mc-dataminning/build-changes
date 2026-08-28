import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eek implements egj {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alh.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alh.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eps.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eps.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eek::new)
   );
   public final List<alh> b;
   public final List<alh> c;
   public final jp<epr> d;
   public final jp<epr> e;
   public final int f;

   public eek(List<alh> $$0, List<alh> $$1, jp<epr> $$2, jp<epr> $$3, int $$4) {
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
