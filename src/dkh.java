import com.mojang.serialization.MapCodec;

public class dkh extends dfj {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final int b = 3;
   public static final dtd c = dst.as;
   private static final ewl[] d = new ewl[]{
      dfa.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(dfc.dW);
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(cut.sj);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }
}
