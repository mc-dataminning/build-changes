import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqe extends epo {
   public static final Codec<eqe> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awd.b(ld.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eqe::new)
   );
   private final awd<crv> b;

   private eqe(List<erh> $$0, awd<crv> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.B;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      crw.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static epo.a<?> a(awd<crv> $$0) {
      return a($$1 -> new eqe($$1, $$0));
   }
}
