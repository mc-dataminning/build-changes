import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eac implements ecb {
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akm.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akm.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eli.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eli.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eac::new)
   );
   public final List<akm> b;
   public final List<akm> c;
   public final ix<elh> d;
   public final ix<elh> e;
   public final int f;

   public eac(List<akm> $$0, List<akm> $$1, ix<elh> $$2, ix<elh> $$3, int $$4) {
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
