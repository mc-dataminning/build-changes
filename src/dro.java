import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends dqw implements dsb {
   public static final MapCodec<dro> c = b(dro::new);

   @Override
   public MapCodec<dro> a() {
      return c;
   }

   protected dro(ebf.d $$0) {
      super($$0, jc.b, fgj.b(), true);
   }

   @Override
   protected dqx c() {
      return (dqx)dng.mI;
   }

   @Override
   protected exq b_(ebg $$0) {
      return exr.c.a(false);
   }

   @Override
   protected boolean o(ebg $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      return false;
   }

   @Override
   public boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      return false;
   }
}
