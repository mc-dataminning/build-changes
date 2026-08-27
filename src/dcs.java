import com.mojang.serialization.MapCodec;

public class dcs extends cwj implements cwm {
   public static final MapCodec<dcs> a = b(dcs::new);

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dcs(diz.d $$0) {
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
      $$0.b($$2.d(), cwl.sG.o());
   }
}
