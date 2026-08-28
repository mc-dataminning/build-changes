import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import javax.annotation.Nullable;

public class cjl extends cjj implements bud {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajv<Boolean> e = ajz.a(cjl.class, ajx.k);
   public static final String b = "sheared";

   public static but.a gp() {
      return cjj.s().a(buu.s, 16.0);
   }

   public cjl(bsw<? extends cjl> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("sheared", this.gq());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gq() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV) && this.a()) {
         this.a(avp.h);
         this.a(dxw.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqq.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avn v() {
      return avo.cn;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.cp;
   }

   @Override
   protected avn n_() {
      return avo.co;
   }

   @Override
   protected avn t() {
      return avo.cr;
   }

   @Override
   protected cnb a(cuo $$0, float $$1, @Nullable cuo $$2) {
      cnb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cnd $$4) {
         $$4.a(new bry(bsa.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gm() {
      return 50;
   }

   @Override
   protected int gn() {
      return 70;
   }

   @Override
   public void a(avp $$0) {
      this.dQ().a(null, this, avo.cq, $$0, 1.0F, 1.0F);
      this.gt();
      this.w(true);
   }

   private void gt() {
      if (this.dQ() instanceof aqt $$0) {
         erq $$1 = $$0.o().be().b(erh.bc);
         ero $$2 = new ero.a($$0).a(euh.f, this.do()).a(euh.a, this).a(eug.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuo $$3 = (cuo)var4.next();
            this.a($$3, this.dl());
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gq() && this.bE();
   }
}
