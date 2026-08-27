import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dqa implements drz {
   public static final Codec<dqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agi.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               agi.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ebg.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ebg.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dqa::new)
   );
   public final List<agi> b;
   public final List<agi> c;
   public final ib<ebf> d;
   public final ib<ebf> e;
   public final int f;

   public dqa(List<agi> $$0, List<agi> $$1, ib<ebf> $$2, ib<ebf> $$3, int $$4) {
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
