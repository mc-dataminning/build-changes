import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyg extends exf {
   public static final Codec<wp> a = wr.a.validate($$0 -> czy.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eyg> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czy.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), exe.a.forGetter($$0x -> $$0x.d))).apply($$0, eyg::new)
   );
   private final List<arv<wp>> c;
   private final exe d;

   protected eyg(List<ezb> $$0, List<arv<wp>> $$1, exe $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.T, czy.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czy a(czy $$0) {
      List<arv<wp>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exh<eyg> b() {
      return exi.N;
   }
}
