import com.mojang.serialization.MapCodec;

public class deu extends dfw {
   public static final MapCodec<deu> a = b(deu::new);

   @Override
   public MapCodec<? extends deu> a() {
      return a;
   }

   public deu(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         $$0.a(null, $$4, avo.G, avp.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avo.E, avp.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
