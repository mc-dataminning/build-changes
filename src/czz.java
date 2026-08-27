import com.mojang.serialization.MapCodec;

public class czz extends cvc {
   public static final MapCodec<czz> a = b(czz::new);
   public static final int b = 3;
   public static final dhw c = dhm.as;
   private static final ekb[] d = new ekb[]{
      cut.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<czz> a() {
      return a;
   }

   protected czz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(cuv.dW);
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cle.rv);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }
}
