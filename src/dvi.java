import com.mojang.serialization.MapCodec;

public class dvi extends dnj {
   public static final MapCodec<dvi> g = b(dvi::new);

   @Override
   public MapCodec<dvi> a() {
      return g;
   }

   public dvi(eag.d $$0) {
      super(() -> dxh.c, $$0);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dze($$0, $$1);
   }

   @Override
   protected awu<alg> c() {
      return awx.i.b(awx.ai);
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return azm.a(dxn.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
