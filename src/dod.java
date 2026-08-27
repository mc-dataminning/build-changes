import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dod implements dqc {
   public static final Codec<dod> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aey.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aey.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dzc.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dzc.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dod::new)
   );
   public final List<aey> b;
   public final List<aey> c;
   public final hg<dzb> d;
   public final hg<dzb> e;
   public final int f;

   public dod(List<aey> $$0, List<aey> $$1, hg<dzb> $$2, hg<dzb> $$3, int $$4) {
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
