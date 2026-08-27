import com.mojang.serialization.MapCodec;

public class cvo extends cwq {
   public static final MapCodec<cvo> a = b(cvo::new);

   @Override
   public MapCodec<? extends cvo> a() {
      return a;
   }

   public cvo(djg.d $$0) {
      super($$0);
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         $$0.a(null, $$4, ars.G, art.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, ars.E, art.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
