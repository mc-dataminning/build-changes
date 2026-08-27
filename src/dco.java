import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dco extends dfx {
   public static final MapCodec<dco> b = b(dco::new);

   @Override
   public MapCodec<dco> a() {
      return b;
   }

   protected dco(djo.d $$0) {
      super(ddz.b.e, $$0);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      cxa.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      return cxa.gK.a($$0, $$1);
   }
}
