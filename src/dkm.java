import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkm extends dkg implements dkl {
   public static final MapCodec<dkm> a = b(dkm::new);

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dyl.d $$0) {
      super($$0);
   }

   @Override
   public cwv b() {
      return cwv.a;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.p, dvg::a);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvg $$5) {
         $$3.a($$5);
         $$3.a(awu.ab);
      }

      return btq.a;
   }
}
