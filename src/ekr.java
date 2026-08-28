import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekr implements emr {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alk.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alk.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ewe.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ewe.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ekr::new)
   );
   public final List<alk> b;
   public final List<alk> c;
   public final jg<ewd> d;
   public final jg<ewd> e;
   public final int f;

   public ekr(List<alk> $$0, List<alk> $$1, jg<ewd> $$2, jg<ewd> $$3, int $$4) {
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
