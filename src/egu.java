import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egu implements eit {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alp.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alp.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ese.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ese.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egu::new)
   );
   public final List<alp> b;
   public final List<alp> c;
   public final jq<esd> d;
   public final jq<esd> e;
   public final int f;

   public egu(List<alp> $$0, List<alp> $$1, jq<esd> $$2, jq<esd> $$3, int $$4) {
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
