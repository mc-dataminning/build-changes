import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dkt implements dms {
   public static final Codec<dkt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               acq.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               acq.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dvs.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dvs.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dkt::new)
   );
   public final List<acq> b;
   public final List<acq> c;
   public final he<dvr> d;
   public final he<dvr> e;
   public final int f;

   public dkt(List<acq> $$0, List<acq> $$1, he<dvr> $$2, he<dvr> $$3, int $$4) {
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
