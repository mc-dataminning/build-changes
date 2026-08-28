import com.mojang.serialization.MapCodec;

public class dew extends dfy {
   public static final MapCodec<dew> a = b(dew::new);

   @Override
   public MapCodec<? extends dew> a() {
      return a;
   }

   public dew(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         $$0.a(null, $$4, avp.G, avq.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, avp.E, avq.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
