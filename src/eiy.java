import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eiy implements ekx {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ale.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               euj.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               euj.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eiy::new)
   );
   public final List<ale> b;
   public final List<ale> c;
   public final je<eui> d;
   public final je<eui> e;
   public final int f;

   public eiy(List<ale> $$0, List<ale> $$1, je<eui> $$2, je<eui> $$3, int $$4) {
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
