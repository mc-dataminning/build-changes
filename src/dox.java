import com.mojang.serialization.MapCodec;

public class dox extends djx {
   public static final MapCodec<dox> a = b(dox::new);
   public static final int b = 3;
   public static final dxx c = dxo.av;
   private static final fbv[] d = new fbv[]{
      djn.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.ej);
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(cwu.tg);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }
}
