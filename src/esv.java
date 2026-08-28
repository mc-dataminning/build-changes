import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esv extends esb {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akh.a(lr.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esv::new)
   );
   private final jj<ctv> b;

   private esv(List<etz> $$0, jj<ctv> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<esv> b() {
      return ese.f;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      return $$0.a(this.b.a(), $$0.H());
   }
}
