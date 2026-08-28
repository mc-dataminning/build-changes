import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etz extends esy {
   public static final Codec<wy> a = xa.a.validate($$0 -> cxz.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<etz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cxz.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), esx.a.forGetter($$0x -> $$0x.d))).apply($$0, etz::new)
   );
   private final List<ark<wy>> c;
   private final esx d;

   protected etz(List<euw> $$0, List<ark<wy>> $$1, esx $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      $$0.a(kq.J, cxz.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cxz a(cxz $$0) {
      List<ark<wy>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eta<etz> b() {
      return etb.N;
   }
}
