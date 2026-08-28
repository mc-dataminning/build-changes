import com.mojang.serialization.MapCodec;

public class dvr extends dpl implements dnf {
   public static final MapCodec<dvr> c = b(dvr::new);

   @Override
   public MapCodec<dvr> a() {
      return c;
   }

   public dvr(ebd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return true;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      a($$0, $$2, new czy(this));
   }
}
