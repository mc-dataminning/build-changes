import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import javax.annotation.Nullable;

public class cix extends civ implements btp {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajp<Boolean> e = ajt.a(cix.class, ajr.k);
   public static final String b = "sheared";

   public static buf.a gq() {
      return civ.s().a(bug.s, 16.0);
   }

   public cix(bsj<? extends cix> $$0, dcd $$1) {
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
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gr() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.rV) && this.a()) {
         this.a(avg.h);
         this.a(dxa.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ave v() {
      return avf.cn;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.cp;
   }

   @Override
   protected ave o_() {
      return avf.co;
   }

   @Override
   protected ave u() {
      return avf.cr;
   }

   @Override
   protected cmn a(cua $$0, float $$1, @Nullable cua $$2) {
      cmn $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cmp $$4) {
         $$4.a(new brl(brn.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gn() {
      return 50;
   }

   @Override
   protected int go() {
      return 70;
   }

   @Override
   public void a(avg $$0) {
      this.dP().a(null, this, avf.cq, $$0, 1.0F, 1.0F);
      this.gu();
      this.w(true);
   }

   private void gu() {
      if (this.dP() instanceof aqk $$0 && $$0.ab().b(dbz.f)) {
         eqt $$1 = $$0.o().be().b(eqk.bc);
         eqr $$2 = new eqr.a($$0).a(etk.f, this.dn()).a(etk.a, this).a(etj.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cua $$3 = (cua)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bD();
   }
}
