import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edh implements efg {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alb.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alb.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eop.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eop.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, edh::new)
   );
   public final List<alb> b;
   public final List<alb> c;
   public final jn<eoo> d;
   public final jn<eoo> e;
   public final int f;

   public edh(List<alb> $$0, List<alb> $$1, jn<eoo> $$2, jn<eoo> $$3, int $$4) {
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
