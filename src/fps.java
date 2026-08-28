import org.apache.commons.lang3.math.Fraction;

public class fps implements fpu {
   private static final akk a = new akk("container/bundle/background");
   private static final int b = 4;
   private static final int c = 1;
   private static final int d = 18;
   private static final int e = 20;
   private final cwp f;

   public fps(cwp $$0) {
      this.f = $$0;
   }

   @Override
   public int a() {
      return this.c() + 4;
   }

   @Override
   public int a(fhf $$0) {
      return this.b();
   }

   private int b() {
      return this.d() * 18 + 2;
   }

   private int c() {
      return this.e() * 20 + 2;
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, fhh $$3) {
      int $$4 = this.d();
      int $$5 = this.e();
      $$3.a(a, $$1, $$2, this.b(), this.c());
      boolean $$6 = this.f.e().compareTo(Fraction.ONE) >= 0;
      int $$7 = 0;

      for (int $$8 = 0; $$8 < $$5; $$8++) {
         for (int $$9 = 0; $$9 < $$4; $$9++) {
            int $$10 = $$1 + $$9 * 18 + 1;
            int $$11 = $$2 + $$8 * 20 + 1;
            this.a($$10, $$11, $$7++, $$6, $$3, $$0);
         }
      }
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3, fhh $$4, fhf $$5) {
      if ($$2 >= this.f.d()) {
         this.a($$4, $$0, $$1, $$3 ? fps.a.a : fps.a.b);
      } else {
         cud $$6 = this.f.a($$2);
         this.a($$4, $$0, $$1, fps.a.b);
         $$4.a($$6, $$0 + 1, $$1 + 1, $$2);
         $$4.a($$5, $$6, $$0 + 1, $$1 + 1);
         if ($$2 == 0) {
            foa.a($$4, $$0 + 1, $$1 + 1, 0);
         }
      }
   }

   private void a(fhh $$0, int $$1, int $$2, fps.a $$3) {
      $$0.a($$3.c, $$1, $$2, 0, $$3.d, $$3.e);
   }

   private int d() {
      return Math.max(2, (int)Math.ceil(Math.sqrt((double)this.f.d() + 1.0)));
   }

   private int e() {
      return (int)Math.ceil(((double)this.f.d() + 1.0) / (double)this.d());
   }

   static enum a {
      a(new akk("container/bundle/blocked_slot"), 18, 20),
      b(new akk("container/bundle/slot"), 18, 20);

      public final akk c;
      public final int d;
      public final int e;

      private a(final akk $$0, final int $$1, final int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }
   }
}
