import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eye extends exd {
   public static final Codec<wp> a = wr.a.validate($$0 -> czw.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eye> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czw.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), exc.a.forGetter($$0x -> $$0x.d))).apply($$0, eye::new)
   );
   private final List<arv<wp>> c;
   private final exc d;

   protected eye(List<eyz> $$0, List<arv<wp>> $$1, exc $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.T, czw.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czw a(czw $$0) {
      List<arv<wp>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exf<eye> b() {
      return exg.N;
   }
}
