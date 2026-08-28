import com.mojang.serialization.MapCodec;

public class dpr extends dju implements dhp {
   public static final MapCodec<dpr> c = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return c;
   }

   public dpr(dur.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return true;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      a($$0, $$2, new cvs(this));
   }
}
