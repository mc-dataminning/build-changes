import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqj extends dpr implements dqw {
   public static final MapCodec<dqj> c = b(dqj::new);

   @Override
   public MapCodec<dqj> a() {
      return c;
   }

   protected dqj(dzy.d $$0) {
      super($$0, ja.b, fez.b(), true);
   }

   @Override
   protected dps c() {
      return (dps)dmc.mF;
   }

   @Override
   protected ewg b_(dzz $$0) {
      return ewh.c.a(false);
   }

   @Override
   protected boolean o(dzz $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      return false;
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      return false;
   }
}
