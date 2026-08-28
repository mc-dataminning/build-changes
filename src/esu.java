import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esu extends ers {
   public static final Codec<xo> a = xq.a.validate($$0 -> cxw.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esu> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxw.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), err.a.forGetter($$0x -> $$0x.d))).apply($$0, esu::new)
   );
   private final List<arv<xo>> c;
   private final err d;

   protected esu(List<etq> $$0, List<arv<xo>> $$1, err $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      $$0.a(km.I, cxw.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxw a(cxw $$0) {
      List<arv<xo>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eru<esu> b() {
      return erv.N;
   }
}
