import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcl extends fbu {
   public static final MapCodec<fcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axt.b(mh.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fcl::new)
   );
   private final axt<czr> b;

   private fcl(List<fdq> $$0, axt<czr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fcl> b() {
      return fbx.G;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      js<czr> $$2 = $$1.d().J_().f(mh.aU);
      Optional<jf<czr>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kk.ab, new dco($$3.get()));
      }

      return $$0;
   }

   public static fbu.a<?> a(axt<czr> $$0) {
      return a($$1 -> new fcl($$1, $$0));
   }
}
