import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dpo implements drn {
   public static final Codec<dpo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agg.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               agg.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eau.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eau.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dpo::new)
   );
   public final List<agg> b;
   public final List<agg> c;
   public final ib<eat> d;
   public final ib<eat> e;
   public final int f;

   public dpo(List<agg> $$0, List<agg> $$1, ib<eat> $$2, ib<eat> $$3, int $$4) {
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
