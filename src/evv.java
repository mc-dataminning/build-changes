import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evv extends euu {
   public static final Codec<xd> a = xf.a.validate($$0 -> czb.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<evv> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czb.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eut.a.forGetter($$0x -> $$0x.d))).apply($$0, evv::new)
   );
   private final List<ary<xd>> c;
   private final eut d;

   protected evv(List<ews> $$0, List<ary<xd>> $$1, eut $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.O, czb.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czb a(czb $$0) {
      List<ary<xd>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public euw<evv> b() {
      return eux.N;
   }
}
