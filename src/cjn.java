import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import javax.annotation.Nullable;

public class cjn extends cjl implements buf {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajw<Boolean> e = aka.a(cjn.class, ajy.k);
   public static final String b = "sheared";

   public static buv.a go() {
      return cjl.s().a(buw.s, 16.0);
   }

   public cjn(bsx<? extends cjn> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("sheared", this.gp());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gp() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.rV) && this.a()) {
         this.a(avq.h);
         this.a(dxz.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqr.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avo v() {
      return avp.cn;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.cp;
   }

   @Override
   protected avo n_() {
      return avp.co;
   }

   @Override
   protected avo t() {
      return avp.cr;
   }

   @Override
   protected cnd a(cuq $$0, float $$1, @Nullable cuq $$2) {
      cnd $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cnf $$4) {
         $$4.a(new brz(bsb.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gl() {
      return 50;
   }

   @Override
   protected int gm() {
      return 70;
   }

   @Override
   public void a(avq $$0) {
      this.dP().a(null, this, avp.cq, $$0, 1.0F, 1.0F);
      this.gs();
      this.w(true);
   }

   private void gs() {
      if (this.dP() instanceof aqu $$0) {
         eru $$1 = $$0.o().be().b(erl.bc);
         ers $$2 = new ers.a($$0).a(eul.f, this.dn()).a(eul.a, this).a(euk.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuq $$3 = (cuq)var4.next();
            this.a($$3, this.dl());
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gp() && this.bE();
   }
}
