import com.mojang.serialization.MapCodec;

public class ctr extends cut {
   public static final MapCodec<ctr> a = b(ctr::new);

   @Override
   public MapCodec<? extends ctr> a() {
      return a;
   }

   public ctr(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      if (!$$0.B) {
         ht $$4 = $$2.a();
         $$0.a(null, $$4, aqn.G, aqo.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aqn.E, aqo.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
