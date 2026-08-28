import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebf implements ede {
   public static final Codec<ebf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alf.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eml.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eml.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebf::new)
   );
   public final List<alf> b;
   public final List<alf> c;
   public final ji<emk> d;
   public final ji<emk> e;
   public final int f;

   public ebf(List<alf> $$0, List<alf> $$1, ji<emk> $$2, ji<emk> $$3, int $$4) {
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
