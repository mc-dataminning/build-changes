import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeq implements egp {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ali.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               epy.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               epy.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eeq::new)
   );
   public final List<ali> b;
   public final List<ali> c;
   public final jq<epx> d;
   public final jq<epx> e;
   public final int f;

   public eeq(List<ali> $$0, List<ali> $$1, jq<epx> $$2, jq<epx> $$3, int $$4) {
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
