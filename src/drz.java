import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drz implements dty {
   public static final Codec<drz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ahg.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               edf.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               edf.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, drz::new)
   );
   public final List<ahg> b;
   public final List<ahg> c;
   public final ih<ede> d;
   public final ih<ede> e;
   public final int f;

   public drz(List<ahg> $$0, List<ahg> $$1, ih<ede> $$2, ih<ede> $$3, int $$4) {
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
