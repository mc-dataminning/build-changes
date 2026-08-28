import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmn extends dlw implements dmz {
   public static final MapCodec<dmn> c = b(dmn::new);

   @Override
   public MapCodec<dmn> a() {
      return c;
   }

   protected dmn(dvn.d $$0) {
      super($$0, jm.b, fai.b(), true);
   }

   @Override
   protected dlx c() {
      return (dlx)dil.mc;
   }

   @Override
   protected ero b_(dvo $$0) {
      return erp.c.a(false);
   }

   @Override
   protected boolean o(dvo $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return false;
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      return false;
   }
}
