import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eit extends eii {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asw.b(ke.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eit::new)
   );
   private final asw<cmq> b;

   private eit(List<ejv> $$0, asw<cmq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eik b() {
      return eil.A;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      cmr.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eii.a<?> a(asw<cmq> $$0) {
      return a($$1 -> new eit($$1, $$0));
   }
}
