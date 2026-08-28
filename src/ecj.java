import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecj implements eei {
   public static final Codec<ecj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akr.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akr.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ens.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ens.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecj::new)
   );
   public final List<akr> b;
   public final List<akr> c;
   public final jm<enr> d;
   public final jm<enr> e;
   public final int f;

   public ecj(List<akr> $$0, List<akr> $$1, jm<enr> $$2, jm<enr> $$3, int $$4) {
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
