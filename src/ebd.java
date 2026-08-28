import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ebd implements edc {
   public static final Codec<ebd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               alf.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               emj.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               emj.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebd::new)
   );
   public final List<alf> b;
   public final List<alf> c;
   public final ji<emi> d;
   public final ji<emi> e;
   public final int f;

   public ebd(List<alf> $$0, List<alf> $$1, ji<emi> $$2, ji<emi> $$3, int $$4) {
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
