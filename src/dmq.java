import com.mojang.serialization.MapCodec;

public class dmq extends dhs {
   public static final MapCodec<dmq> a = b(dmq::new);
   public static final int b = 3;
   public static final dvo c = dve.as;
   private static final ezm[] d = new ezm[]{
      dhj.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   protected dmq(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.dW);
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(cvt.sk);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }
}
