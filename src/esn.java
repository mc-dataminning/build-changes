import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends esb {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esn::new));
   private final tx b;

   private esn(List<etz> $$0, tx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esd<esn> b() {
      return ese.j;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      cwo.a(kn.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static esb.a<?> a(tx $$0) {
      return a($$1 -> new esn($$1, $$0));
   }
}
