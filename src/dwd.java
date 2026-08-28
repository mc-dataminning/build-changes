import com.mojang.serialization.MapCodec;

public class dwd extends dpx implements dnr {
   public static final MapCodec<dwd> c = b(dwd::new);

   @Override
   public MapCodec<dwd> a() {
      return c;
   }

   public dwd(ebp.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      a($$0, $$2, new dak(this));
   }
}
