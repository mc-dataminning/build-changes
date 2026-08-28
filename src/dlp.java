import com.mojang.serialization.MapCodec;

public class dlp extends dff implements dfi {
   public static final MapCodec<dlp> a = b(dlp::new);

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dsg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      $$0.b($$2.d(), dfh.sG.o());
   }

   @Override
   public ja a(ja $$0) {
      return $$0.d();
   }
}
