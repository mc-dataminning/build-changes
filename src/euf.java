import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euf extends ete {
   public static final Codec<wz> a = xb.a.validate($$0 -> cyb.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<euf> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cyb.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), etd.a.forGetter($$0x -> $$0x.d))).apply($$0, euf::new)
   );
   private final List<arl<wz>> c;
   private final etd d;

   protected euf(List<evc> $$0, List<arl<wz>> $$1, etd $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      $$0.a(kq.J, cyb.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cyb a(cyb $$0) {
      List<arl<wz>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public etg<euf> b() {
      return eth.N;
   }
}
