import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcn extends fbw {
   public static final MapCodec<fcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axv.b(mi.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fcn::new)
   );
   private final axv<czt> b;

   private fcn(List<fds> $$0, axv<czt> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fcn> b() {
      return fbz.G;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      jt<czt> $$2 = $$1.d().J_().f(mi.aU);
      Optional<jg<czt>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kl.ab, new dcq($$3.get()));
      }

      return $$0;
   }

   public static fbw.a<?> a(axv<czt> $$0) {
      return a($$1 -> new fcn($$1, $$0));
   }
}
