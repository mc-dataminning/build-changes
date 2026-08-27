import com.mojang.serialization.MapCodec;

public class cwc extends czj {
   public static final MapCodec<cwc> a = b(cwc::new);

   @Override
   public MapCodec<cwc> a() {
      return a;
   }

   public cwc(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ht $$4 = $$2.d();
         dhi $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), hx.b)) {
            atp.a($$1, $$2, $$3, js.D);
         }
      }
   }
}
