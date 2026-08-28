import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezc extends eyb {
   public static final Codec<xv> a = xx.a.validate($$0 -> daw.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<ezc> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(daw.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), eya.a.forGetter($$0x -> $$0x.d))).apply($$0, ezc::new)
   );
   private final List<asz<xv>> c;
   private final eya d;

   protected ezc(List<ezx> $$0, List<asz<xv>> $$1, eya $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxo a(cxo $$0, ewo $$1) {
      $$0.a(ku.T, daw.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public daw a(daw $$0) {
      List<asz<xv>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public eyd<ezc> b() {
      return eye.N;
   }
}
