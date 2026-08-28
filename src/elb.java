import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elb implements enb {
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alr.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alr.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ewo.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ewo.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, elb::new)
   );
   public final List<alr> b;
   public final List<alr> c;
   public final jg<ewn> d;
   public final jg<ewn> e;
   public final int f;

   public elb(List<alr> $$0, List<alr> $$1, jg<ewn> $$2, jg<ewn> $$3, int $$4) {
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
