import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvc extends dmq {
   public static final MapCodec<dvc> a = b(dvc::new);

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   protected dvc(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.j, $$0.C ? dzw::a : dzw::b);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, daa $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
