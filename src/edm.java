import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edm {
   public final ela a;
   public final ela b;
   public final ela c;
   public final ela d;
   public final ela e;
   public final List<dxu> f;
   public final ayk<dkl> g;
   public final ayk<dkl> h;
   public static final Codec<edm> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ela.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ela.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ela.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ela.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ela.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               azn.a(dxu.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               ayk.b(mb.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               ayk.b(mb.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, edm::new)
   );

   public edm(ela $$0, ela $$1, ela $$2, ela $$3, ela $$4, List<dxu> $$5, ayk<dkl> $$6, ayk<dkl> $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }
}
