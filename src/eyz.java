import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyz extends eyc {
   static final MapCodec<eyz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fav.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eyz::new));
   private final fau b;

   private eyz(List<ezy> $$0, fau $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public eye<eyz> b() {
      return eyf.Q;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      int $$2 = bae.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new dan($$2));
      return $$0;
   }

   public fau c() {
      return this.b;
   }

   public static eyc.a<?> a(fau $$0) {
      return a($$1 -> new eyz($$1, $$0));
   }
}
