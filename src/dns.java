import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dns implements dpr {
   public static final Codec<dns> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aer.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aer.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dyr.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dyr.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dns::new)
   );
   public final List<aer> b;
   public final List<aer> c;
   public final he<dyq> d;
   public final he<dyq> e;
   public final int f;

   public dns(List<aer> $$0, List<aer> $$1, he<dyq> $$2, he<dyq> $$3, int $$4) {
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
