import com.mojang.serialization.MapCodec;

public class cvw extends cwy {
   public static final MapCodec<cvw> a = b(cvw::new);

   @Override
   public MapCodec<? extends cvw> a() {
      return a;
   }

   public cvw(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         $$0.a(null, $$4, art.G, aru.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, art.E, aru.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
