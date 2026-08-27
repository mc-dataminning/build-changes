import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drs implements dtr {
   public static final Codec<drs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahd.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ahd.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ecy.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ecy.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, drs::new)
   );
   public final List<ahd> b;
   public final List<ahd> c;
   public final ih<ecx> d;
   public final ih<ecx> e;
   public final int f;

   public drs(List<ahd> $$0, List<ahd> $$1, ih<ecx> $$2, ih<ecx> $$3, int $$4) {
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
