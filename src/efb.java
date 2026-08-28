import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efb implements eha {
   public static final Codec<efb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alj.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alj.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eqj.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eqj.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, efb::new)
   );
   public final List<alj> b;
   public final List<alj> c;
   public final jq<eqi> d;
   public final jq<eqi> e;
   public final int f;

   public efb(List<alj> $$0, List<alj> $$1, jq<eqi> $$2, jq<eqi> $$3, int $$4) {
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
