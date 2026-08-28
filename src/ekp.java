import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekp implements emp {
   public static final Codec<ekp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ali.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ewc.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ewc.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ekp::new)
   );
   public final List<ali> b;
   public final List<ali> c;
   public final jf<ewb> d;
   public final jf<ewb> e;
   public final int f;

   public ekp(List<ali> $$0, List<ali> $$1, jf<ewb> $$2, jf<ewb> $$3, int $$4) {
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
