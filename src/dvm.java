import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvm extends dna {
   public static final MapCodec<dvm> a = b(dvm::new);

   @Override
   public MapCodec<dvm> a() {
      return a;
   }

   protected dvm(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eag($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.j, $$0.C ? eag::a : eag::b);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
