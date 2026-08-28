import java.util.List;

public class cup extends ctx {
   private static final int j = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cup(ctx.a $$0) {
      super($$0);
   }

   @Override
   public cuc a(cuc $$0, dcf $$1, btb $$2) {
      if ($$2 instanceof aqn $$3) {
         am.A.a($$3, $$0);
         $$3.b(avr.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.dq(), avh.sr, $$2.df(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
         $$2.e(brq.E);
         $$2.b(new bro(brq.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return 32;
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.c;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      return cue.a($$0, $$1, $$2);
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kn.Q, Integer.valueOf(0));
      List<bro> $$5 = List.of(new bro(brq.E, 120000, $$4, false, false, true));
      cwd.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
