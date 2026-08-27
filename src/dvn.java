import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvn {
   public final ecz a;
   public final ecz b;
   public final ecz c;
   public final ecz d;
   public final ecz e;
   public final List<dpy> f;
   public final awd<dcv> g;
   public final awd<dcv> h;
   public static final Codec<dvn> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
               ecz.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
               ecz.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
               ecz.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
               ecz.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
               axe.a(dpy.b.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
               awd.b(ld.f).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
               awd.b(ld.f).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dvn::new)
   );

   public dvn(ecz $$0, ecz $$1, ecz $$2, ecz $$3, ecz $$4, List<dpy> $$5, awd<dcv> $$6, awd<dcv> $$7) {
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
