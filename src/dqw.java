import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqw extends dqe implements drj {
   public static final MapCodec<dqw> c = b(dqw::new);

   @Override
   public MapCodec<dqw> a() {
      return c;
   }

   protected dqw(ean.d $$0) {
      super($$0, jb.b, ffo.b(), true);
   }

   @Override
   protected dqf c() {
      return (dqf)dmo.mI;
   }

   @Override
   protected ewv b_(eao $$0) {
      return eww.c.a(false);
   }

   @Override
   protected boolean o(eao $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return false;
   }

   @Override
   public boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      return false;
   }
}
