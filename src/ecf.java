import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecf implements eek {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akt.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akt.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ens.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ens.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecf::new)
   );
   public final List<akt> b;
   public final List<akt> c;
   public final ja<enr> d;
   public final ja<enr> e;
   public final int f;

   public ecf(List<akt> $$0, List<akt> $$1, ja<enr> $$2, ja<enr> $$3, int $$4) {
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
