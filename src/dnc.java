import com.mojang.serialization.MapCodec;

public class dnc extends dhg implements dfb {
   public static final MapCodec<dnc> c = b(dnc::new);

   @Override
   public MapCodec<dnc> a() {
      return c;
   }

   public dnc(dsa.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      a($$0, $$2, new cuo(this));
   }
}
