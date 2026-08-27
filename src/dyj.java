import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyj implements eai {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ajv.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ejp.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ejp.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dyj::new)
   );
   public final List<ajv> b;
   public final List<ajv> c;
   public final in<ejo> d;
   public final in<ejo> e;
   public final int f;

   public dyj(List<ajv> $$0, List<ajv> $$1, in<ejo> $$2, in<ejo> $$3, int $$4) {
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
