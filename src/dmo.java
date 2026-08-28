import com.mojang.serialization.MapCodec;

public class dmo extends dlg {
   public static final MapCodec<dmo> b = b(dmo::new);

   @Override
   public MapCodec<dmo> a() {
      return b;
   }

   protected dmo(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      return bsj.e;
   }
}
