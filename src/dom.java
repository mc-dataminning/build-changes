import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dnu implements doz {
   public static final MapCodec<dom> c = b(dom::new);

   @Override
   public MapCodec<dom> a() {
      return c;
   }

   protected dom(dxp.d $$0) {
      super($$0, jn.b, fco.b(), true);
   }

   @Override
   protected dnv c() {
      return (dnv)dkg.mE;
   }

   @Override
   protected etw b_(dxq $$0) {
      return etx.c.a(false);
   }

   @Override
   protected boolean o(dxq $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      return false;
   }
}
