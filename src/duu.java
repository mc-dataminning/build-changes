import com.mojang.serialization.MapCodec;

public class duu extends doo implements dmi {
   public static final MapCodec<duu> c = b(duu::new);

   @Override
   public MapCodec<duu> a() {
      return c;
   }

   public duu(eag.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return true;
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      a($$0, $$2, new czd(this));
   }
}
