import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cio extends cim implements bth {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajs<Boolean> e = ajw.a(cio.class, aju.k);
   public static final String b = "sheared";

   public static btx.a gs() {
      return cim.s().a(bty.q, 16.0);
   }

   public cio(bsc<? extends cio> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gt() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.rV) && this.a()) {
         this.a(avj.h);
         this.a(dvw.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avh v() {
      return avi.cn;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.cp;
   }

   @Override
   protected avh o_() {
      return avi.co;
   }

   @Override
   protected avh u() {
      return avi.cr;
   }

   @Override
   protected cme b(ctq $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      if ($$2 instanceof cmg $$3) {
         $$3.a(new bre(brg.s, 100));
      }

      return $$2;
   }

   @Override
   protected int gp() {
      return 50;
   }

   @Override
   protected int gq() {
      return 70;
   }

   @Override
   public void a(avj $$0) {
      this.dP().a(null, this, avi.cq, $$0, 1.0F, 1.0F);
      this.gw();
      this.w(true);
   }

   private void gw() {
      if (this.dP() instanceof aqn $$0 && $$0.aa().b(dav.f)) {
         epm $$1 = $$0.o().be().b(epf.ba);
         epk $$2 = new epk.a($$0).a(erz.f, this.dn()).a(erz.a, this).a(ery.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            ctq $$3 = (ctq)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bD();
   }
}
