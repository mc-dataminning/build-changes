import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsj {
   public final dzv a;
   public final dzv b;
   public final dzv c;
   public final dzv d;
   public final dzv e;
   public final List<dmz> f;
   public final avd<daa> g;
   public final avd<daa> h;
   public static final Codec<dsj> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzv.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               dzv.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               dzv.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               dzv.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               dzv.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               awe.a(dmz.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               avd.b(kj.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               avd.b(kj.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dsj::new)
   );

   public dsj(dzv $$0, dzv $$1, dzv $$2, dzv $$3, dzv $$4, List<dmz> $$5, avd<daa> $$6, avd<daa> $$7) {
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
