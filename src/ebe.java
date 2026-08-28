import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebe implements edd {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alf.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               emk.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               emk.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebe::new)
   );
   public final List<alf> b;
   public final List<alf> c;
   public final ji<emj> d;
   public final ji<emj> e;
   public final int f;

   public ebe(List<alf> $$0, List<alf> $$1, ji<emj> $$2, ji<emj> $$3, int $$4) {
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
