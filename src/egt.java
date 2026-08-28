import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egt implements eis {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alz.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               esd.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               esd.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egt::new)
   );
   public final List<alz> b;
   public final List<alz> c;
   public final jq<esc> d;
   public final jq<esc> e;
   public final int f;

   public egt(List<alz> $$0, List<alz> $$1, jq<esc> $$2, jq<esc> $$3, int $$4) {
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
