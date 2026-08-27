import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyz implements eay {
   public static final Codec<dyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akf.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               akf.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               ekf.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               ekf.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dyz::new)
   );
   public final List<akf> b;
   public final List<akf> c;
   public final iv<eke> d;
   public final iv<eke> e;
   public final int f;

   public dyz(List<akf> $$0, List<akf> $$1, iv<eke> $$2, iv<eke> $$3, int $$4) {
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
