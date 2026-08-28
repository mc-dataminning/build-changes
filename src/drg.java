import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drg extends diz {
   public static final MapCodec<drg> a = b(drg::new);

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.j, $$0.C ? dvr::a : dvr::b);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhe.a($$0, $$2, "SpawnData");
   }
}
