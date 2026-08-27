import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqm extends epw {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(awg.b(le.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eqm::new)
   );
   private final awg<csr> b;

   private eqm(List<erq> $$0, awg<csr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.D;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      css.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static epw.a<?> a(awg<csr> $$0) {
      return a($$1 -> new eqm($$1, $$0));
   }
}
