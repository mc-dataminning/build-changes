import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecf implements eee {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akq.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akq.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               enm.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               enm.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecf::new)
   );
   public final List<akq> b;
   public final List<akq> c;
   public final jm<enl> d;
   public final jm<enl> e;
   public final int f;

   public ecf(List<akq> $$0, List<akq> $$1, jm<enl> $$2, jm<enl> $$3, int $$4) {
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
