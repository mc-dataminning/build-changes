import com.mojang.serialization.MapCodec;

public class cvn extends cwp {
   public static final MapCodec<cvn> a = b(cvn::new);

   @Override
   public MapCodec<? extends cvn> a() {
      return a;
   }

   public cvn(djf.d $$0) {
      super($$0);
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         $$0.a(null, $$4, arr.G, ars.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, arr.E, ars.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
