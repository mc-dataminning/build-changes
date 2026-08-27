import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqm extends epo {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(cvj.h.fieldOf("pages").forGetter($$0x -> $$0x.b), epn.e.f.forGetter($$0x -> $$0x.c))).apply($$0, eqm::new)
   );
   private final List<aqv<ws>> b;
   private final epn c;

   protected eqm(List<erh> $$0, List<aqv<ws>> $$1, epn $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      $$0.a(jz.A, cvj.a, this::a);
      return $$0;
   }

   @VisibleForTesting
   public cvj a(cvj $$0) {
      List<aqv<ws>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public epq b() {
      return epr.I;
   }
}
