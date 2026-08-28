import com.mojang.serialization.MapCodec;

public class dls extends dfi implements dfl {
   public static final MapCodec<dls> a = b(dls::new);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dsk.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      $$0.b($$2.d(), dfk.sG.o());
   }

   @Override
   public ja a(ja $$0) {
      return $$0.d();
   }
}
