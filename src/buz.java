import org.jetbrains.annotations.Nullable;

public class buz extends chx {
   private static final akm<Integer> cg = akq.a(buz.class, ako.b);

   public buz(bus<? extends buz> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected lq n() {
      return ls.aP;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      return bus.af.a($$0, bur.e);
   }

   @Override
   protected awm q() {
      return awn.kK;
   }

   @Override
   protected awm t() {
      return awn.kH;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.kJ;
   }

   @Override
   protected awm n_() {
      return awn.kI;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.v());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.v();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(ls.aQ, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(cg, $$0);
   }

   public int v() {
      return this.al.a(cg);
   }

   public static boolean a(bus<? extends bvh> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      return $$3.v() <= $$1.O() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dis.G);
   }
}
