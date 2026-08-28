import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drd extends diw {
   public static final MapCodec<drd> a = b(drd::new);

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   protected drd(dwu.d $$0) {
      super($$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.j, $$0.C ? dvo::a : dvo::b);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhb.a($$0, $$2, "SpawnData");
   }
}
