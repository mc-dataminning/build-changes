import com.mojang.serialization.MapCodec;

public abstract class cvi extends cwp {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eml h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eml b = emi.a(
      emi.b(), emi.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), elw.e
   );
   protected final jd.a c;

   @Override
   protected abstract MapCodec<? extends cvi> a();

   public cvi(djf.d $$0, jd.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(djg $$0) {
      return 0.0;
   }

   protected boolean a(djg $$0, hx $$1, blu $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      jd $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2) {
      return h;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   public abstract boolean d(djg var1);

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      hx $$4 = dcg.a((cto)$$1, $$2);
      if ($$4 != null) {
         eep $$5 = dcg.a($$1, $$4);
         if ($$5 != eer.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eep $$0) {
      return false;
   }

   protected void a(djg $$0, cto $$1, hx $$2, eep $$3) {
   }
}
