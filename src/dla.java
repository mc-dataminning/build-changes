import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dla extends dkj implements dlm {
   public static final MapCodec<dla> c = b(dla::new);

   @Override
   public MapCodec<dla> a() {
      return c;
   }

   protected dla(dtz.d $$0) {
      super($$0, jj.b, eyu.b(), true);
   }

   @Override
   protected dkk c() {
      return (dkk)dgx.mc;
   }

   @Override
   protected eqb b_(dua $$0) {
      return eqc.c.a(false);
   }

   @Override
   protected boolean o(dua $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return false;
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      return false;
   }
}
