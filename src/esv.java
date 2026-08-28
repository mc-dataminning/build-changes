import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esv extends ert {
   public static final Codec<xo> a = xq.a.validate($$0 -> cxx.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<esv> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxx.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), ers.a.forGetter($$0x -> $$0x.d))).apply($$0, esv::new)
   );
   private final List<arv<xo>> c;
   private final ers d;

   protected esv(List<etr> $$0, List<arv<xo>> $$1, ers $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.J, cxx.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxx a(cxx $$0) {
      List<arv<xo>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public erv<esv> b() {
      return erw.N;
   }
}
