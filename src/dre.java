import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dre extends dix {
   public static final MapCodec<dre> a = b(dre::new);

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   protected dre(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.j, $$0.C ? dvp::a : dvp::b);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhc.a($$0, $$2, "SpawnData");
   }
}
