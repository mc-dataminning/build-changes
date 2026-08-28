import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebp implements edo {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akk.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               emv.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               emv.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebp::new)
   );
   public final List<akk> b;
   public final List<akk> c;
   public final jj<emu> d;
   public final jj<emu> e;
   public final int f;

   public ebp(List<akk> $$0, List<akk> $$1, jj<emu> $$2, jj<emu> $$3, int $$4) {
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
