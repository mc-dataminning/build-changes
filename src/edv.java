import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edv implements efu {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alc.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alc.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               epd.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               epd.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, edv::new)
   );
   public final List<alc> b;
   public final List<alc> c;
   public final jn<epc> d;
   public final jn<epc> e;
   public final int f;

   public edv(List<alc> $$0, List<alc> $$1, jn<epc> $$2, jn<epc> $$3, int $$4) {
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
