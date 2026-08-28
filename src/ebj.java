import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebj implements edi {
   public static final Codec<ebj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akk.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               emp.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               emp.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebj::new)
   );
   public final List<akk> b;
   public final List<akk> c;
   public final jj<emo> d;
   public final jj<emo> e;
   public final int f;

   public ebj(List<akk> $$0, List<akk> $$1, jj<emo> $$2, jj<emo> $$3, int $$4) {
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
