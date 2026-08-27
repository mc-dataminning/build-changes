import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dot implements dqs {
   public static final Codec<dot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               afw.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               afw.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dzs.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dzs.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dot::new)
   );
   public final List<afw> b;
   public final List<afw> c;
   public final ib<dzr> d;
   public final ib<dzr> e;
   public final int f;

   public dot(List<afw> $$0, List<afw> $$1, ib<dzr> $$2, ib<dzr> $$3, int $$4) {
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
