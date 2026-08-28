import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egz implements eiy {
   public static final Codec<egz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aku.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               esk.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               esk.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, egz::new)
   );
   public final List<aku> b;
   public final List<aku> c;
   public final jr<esj> d;
   public final jr<esj> e;
   public final int f;

   public egz(List<aku> $$0, List<aku> $$1, jr<esj> $$2, jr<esj> $$3, int $$4) {
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
