import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import javax.annotation.Nullable;

public class cja extends ciy implements bts {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajp<Boolean> e = ajt.a(cja.class, ajr.k);
   public static final String b = "sheared";

   public static bui.a gr() {
      return ciy.s().a(buj.s, 16.0);
   }

   public cja(bsm<? extends cja> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("sheared", this.gs());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gs() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxg.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg v() {
      return avh.cn;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.cp;
   }

   @Override
   protected avg o_() {
      return avh.co;
   }

   @Override
   protected avg u() {
      return avh.cr;
   }

   @Override
   protected cmq a(cuc $$0, float $$1, @Nullable cuc $$2) {
      cmq $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cms $$4) {
         $$4.a(new bro(brq.s, 100));
      }

      return $$3;
   }

   @Override
   protected int go() {
      return 50;
   }

   @Override
   protected int gp() {
      return 70;
   }

   @Override
   public void a(avi $$0) {
      this.dQ().a(null, this, avh.cq, $$0, 1.0F, 1.0F);
      this.gv();
      this.w(true);
   }

   private void gv() {
      if (this.dQ() instanceof aqm $$0 && $$0.ab().b(dcb.f)) {
         eqz $$1 = $$0.o().bf().b(eqq.bc);
         eqx $$2 = new eqx.a($$0).a(etq.f, this.do()).a(etq.a, this).a(etp.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuc $$3 = (cuc)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gs() && this.bE();
   }
}
