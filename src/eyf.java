import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyf extends exe {
   public static final Codec<wo> a = wq.a.validate($$0 -> czx.g.encodeStart(JavaOps.INSTANCE, $$0).map($$1 -> $$0));
   public static final MapCodec<eyf> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czx.a(a).fieldOf("pages").forGetter($$0x -> $$0x.c), exd.a.forGetter($$0x -> $$0x.d))).apply($$0, eyf::new)
   );
   private final List<aru<wo>> c;
   private final exd d;

   protected eyf(List<eza> $$0, List<aru<wo>> $$1, exd $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.T, czx.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public czx a(czx $$0) {
      List<aru<wo>> $$1 = this.d.a($$0.a(), this.c);
      return $$0.b($$1);
   }

   @Override
   public exg<eyf> b() {
      return exh.N;
   }
}
