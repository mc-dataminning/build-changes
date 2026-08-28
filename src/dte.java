import com.mojang.serialization.MapCodec;

public class dte extends dnd implements dkx {
   public static final MapCodec<dte> c = b(dte::new);

   @Override
   public MapCodec<dte> a() {
      return c;
   }

   public dte(dyl.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return true;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      a($$0, $$2, new cxy(this));
   }
}
