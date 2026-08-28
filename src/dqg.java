import com.mojang.serialization.MapCodec;

public class dqg extends dle {
   public static final MapCodec<dqg> a = b(dqg::new);
   public static final int b = 3;
   public static final dzm c = dzc.av;
   private static final fdo[] d = dku.a(3, $$0 -> dku.b(16.0, 0.0, (double)(5 + $$0 * 3)));

   @Override
   public MapCodec<dqg> a() {
      return a;
   }

   protected dqg(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.ej);
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(cyc.tk);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }
}
