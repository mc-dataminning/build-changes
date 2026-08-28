import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dok extends dns implements dow {
   public static final MapCodec<dok> c = b(dok::new);

   @Override
   public MapCodec<dok> a() {
      return c;
   }

   protected dok(dxn.d $$0) {
      super($$0, jm.b, fci.b(), true);
   }

   @Override
   protected dnt c() {
      return (dnt)dkf.mE;
   }

   @Override
   protected etq b_(dxo $$0) {
      return etr.c.a(false);
   }

   @Override
   protected boolean o(dxo $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      return false;
   }
}
