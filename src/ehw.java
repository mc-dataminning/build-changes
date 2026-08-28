import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehw implements ejv {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ald.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               ald.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               eth.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               eth.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehw::new)
   );
   public final List<ald> b;
   public final List<ald> c;
   public final js<etg> d;
   public final js<etg> e;
   public final int f;

   public ehw(List<ald> $$0, List<ald> $$1, js<etg> $$2, js<etg> $$3, int $$4) {
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
