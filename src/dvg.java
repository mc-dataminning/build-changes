import com.mojang.serialization.MapCodec;

public class dvg extends dpa implements dmu {
   public static final MapCodec<dvg> c = b(dvg::new);

   @Override
   public MapCodec<dvg> a() {
      return c;
   }

   public dvg(eas.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return true;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      a($$0, $$2, new czn(this));
   }
}
