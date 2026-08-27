import com.mojang.serialization.MapCodec;

public class dfg extends daj {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final int b = 3;
   public static final dnz c = dnp.as;
   private static final eqk[] d = new eqk[]{
      daa.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   protected dfg(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.dW);
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(cqn.si);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }
}
