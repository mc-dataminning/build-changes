import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsl {
   public final dzx a;
   public final dzx b;
   public final dzx c;
   public final dzx d;
   public final dzx e;
   public final List<dnb> f;
   public final avd<dac> g;
   public final avd<dac> h;
   public static final Codec<dsl> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzx.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dzx.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dzx.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dzx.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dzx.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               awe.a(dnb.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               avd.b(kj.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               avd.b(kj.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dsl::new)
   );

   public dsl(dzx $$0, dzx $$1, dzx $$2, dzx $$3, dzx $$4, List<dnb> $$5, avd<dac> $$6, avd<dac> $$7) {
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
