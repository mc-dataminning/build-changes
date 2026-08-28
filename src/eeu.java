import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeu implements egt {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               all.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               all.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eqc.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eqc.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eeu::new)
   );
   public final List<all> b;
   public final List<all> c;
   public final jq<eqb> d;
   public final jq<eqb> e;
   public final int f;

   public eeu(List<all> $$0, List<all> $$1, jq<eqb> $$2, jq<eqb> $$3, int $$4) {
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
