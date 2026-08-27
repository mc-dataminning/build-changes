import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dob implements dqa {
   public static final Codec<dob> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aew.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aew.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dza.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dza.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dob::new)
   );
   public final List<aew> b;
   public final List<aew> c;
   public final he<dyz> d;
   public final he<dyz> e;
   public final int f;

   public dob(List<aew> $$0, List<aew> $$1, he<dyz> $$2, he<dyz> $$3, int $$4) {
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
