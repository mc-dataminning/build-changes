import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhj extends dgs implements dhv {
   public static final MapCodec<dhj> c = b(dhj::new);

   @Override
   public MapCodec<dhj> a() {
      return c;
   }

   protected dhj(dqg.d $$0) {
      super($$0, is.b, euf.b(), true);
   }

   @Override
   protected dgt c() {
      return (dgt)ddg.mc;
   }

   @Override
   protected ema b_(dqh $$0) {
      return emb.c.a(false);
   }

   @Override
   protected boolean m(dqh $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return false;
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      return false;
   }
}
