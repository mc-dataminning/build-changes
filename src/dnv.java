import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dnv implements dpu {
   public static final Codec<dnv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aez.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               aez.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dyu.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dyu.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dnv::new)
   );
   public final List<aez> b;
   public final List<aez> c;
   public final he<dyt> d;
   public final he<dyt> e;
   public final int f;

   public dnv(List<aez> $$0, List<aez> $$1, he<dyt> $$2, he<dyt> $$3, int $$4) {
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
