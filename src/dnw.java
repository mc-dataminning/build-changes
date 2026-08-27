import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnw implements dpv {
   public static final Codec<dnw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aeu.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aeu.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dyv.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dyv.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dnw::new)
   );
   public final List<aeu> b;
   public final List<aeu> c;
   public final hg<dyu> d;
   public final hg<dyu> e;
   public final int f;

   public dnw(List<aeu> $$0, List<aeu> $$1, hg<dyu> $$2, hg<dyu> $$3, int $$4) {
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
