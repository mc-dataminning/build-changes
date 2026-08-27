import com.mojang.serialization.MapCodec;

public class dbc extends das implements cwm {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      $$0.a($$2.d(), dbd.c(), 2);
   }
}
