import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drh implements dtg {
   public static final Codec<drh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agt.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               agt.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ecn.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ecn.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, drh::new)
   );
   public final List<agt> b;
   public final List<agt> c;
   public final ie<ecm> d;
   public final ie<ecm> e;
   public final int f;

   public drh(List<agt> $$0, List<agt> $$1, ie<ecm> $$2, ie<ecm> $$3, int $$4) {
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
