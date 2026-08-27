import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class daj extends ddq {
   public static final MapCodec<daj> b = b(daj::new);

   @Override
   public MapCodec<daj> a() {
      return b;
   }

   protected daj(dgv.d $$0) {
      super(dbu.b.e, $$0);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      cuv.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      return cuv.gK.a($$0, $$1);
   }
}
