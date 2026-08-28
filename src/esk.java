import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esk extends ers {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esk::new)
   );
   private final axe<cuf> b;

   private esk(List<etq> $$0, axe<cuf> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<esk> b() {
      return erv.G;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      cug.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ers.a<?> a(axe<cuf> $$0) {
      return a($$1 -> new esk($$1, $$0));
   }
}
