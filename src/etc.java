import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etc extends esb {
   public static final Codec<wu> a = ww.a.validate($$0 -> cxi.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<etc> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxi.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), esa.a.forGetter($$0x -> $$0x.d))).apply($$0, etc::new)
   );
   private final List<arb<wu>> c;
   private final esa d;

   protected etc(List<etz> $$0, List<arb<wu>> $$1, esa $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      $$0.a(kn.J, cxi.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxi a(cxi $$0) {
      List<arb<wu>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public esd<etc> b() {
      return ese.N;
   }
}
