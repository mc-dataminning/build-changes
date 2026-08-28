import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebc implements edb {
   public static final Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ale.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               emi.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               emi.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebc::new)
   );
   public final List<ale> b;
   public final List<ale> c;
   public final ji<emh> d;
   public final ji<emh> e;
   public final int f;

   public ebc(List<ale> $$0, List<ale> $$1, ji<emh> $$2, ji<emh> $$3, int $$4) {
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
