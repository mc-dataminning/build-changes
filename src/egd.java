import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egd implements eic {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aku.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ern.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ern.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egd::new)
   );
   public final List<aku> b;
   public final List<aku> c;
   public final jr<erm> d;
   public final jr<erm> e;
   public final int f;

   public egd(List<aku> $$0, List<aku> $$1, jr<erm> $$2, jr<erm> $$3, int $$4) {
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
