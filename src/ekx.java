import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekx extends ekh {
   public static final Codec<ekx> a = RecordCodecBuilder.create($$0 -> a($$0).and(tu.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ekx::new));
   private final sw b;

   private ekx(List<elu> $$0, sw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekj b() {
      return ekk.g;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      $$0.x().a(this.b);
      return $$0;
   }

   @Deprecated
   public static ekh.a<?> a(sw $$0) {
      return a($$1 -> new ekx($$1, $$0));
   }
}
