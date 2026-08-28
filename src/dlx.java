import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends dlr implements dlw {
   public static final MapCodec<dlx> a = b(dlx::new);

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(eag.d $$0) {
      super($$0);
   }

   @Override
   public cyb b() {
      return cyb.a;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.p, dxa::a);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxa $$5) {
         $$3.a($$5);
         $$3.a(awx.ab);
      }

      return bud.a;
   }
}
