import com.mojang.serialization.MapCodec;

public class dtf extends dle implements dkx {
   public static final MapCodec<dtf> a = b(dtf::new);
   private static final fdo b = dku.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   protected dtf(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      dnd.a($$0, o($$3).m(), $$2, 2);
   }

   private static dnd o(dym $$0) {
      return (dnd)($$0.a(dkw.bB) ? dkw.jg : dkw.jf);
   }
}
