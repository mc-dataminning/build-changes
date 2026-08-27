import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsh implements dug {
   public static final Codec<dsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahh.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ahh.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               edn.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               edn.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dsh::new)
   );
   public final List<ahh> b;
   public final List<ahh> c;
   public final ih<edm> d;
   public final ih<edm> e;
   public final int f;

   public dsh(List<ahh> $$0, List<ahh> $$1, ih<edm> $$2, ih<edm> $$3, int $$4) {
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
