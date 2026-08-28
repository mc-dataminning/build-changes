import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtw extends dlm {
   public static final MapCodec<dtw> a = b(dtw::new);

   @Override
   public MapCodec<dtw> a() {
      return a;
   }

   protected dtw(dzy.d $$0) {
      super($$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.j, $$0.C ? dyp::a : dyp::b);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
