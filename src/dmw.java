import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends dmq implements dmv {
   public static final MapCodec<dmw> a = b(dmw::new);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(ebf.d $$0) {
      super($$0);
   }

   @Override
   public cyy b() {
      return cyy.a;
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dxz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.p, dxz::a);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxz $$5) {
         $$3.a($$5);
         $$3.a(axb.ab);
      }

      return but.a;
   }
}
