import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlo extends dkx implements dma {
   public static final MapCodec<dlo> c = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return c;
   }

   protected dlo(dun.d $$0) {
      super($$0, jj.b, ezj.b(), true);
   }

   @Override
   protected dky c() {
      return (dky)dhl.mc;
   }

   @Override
   protected eqp b_(duo $$0) {
      return eqq.c.a(false);
   }

   @Override
   protected boolean o(duo $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return false;
   }

   @Override
   public boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      return false;
   }
}
