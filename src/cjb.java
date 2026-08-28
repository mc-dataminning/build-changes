import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import javax.annotation.Nullable;

public class cjb extends ciz implements btt {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajp<Boolean> e = ajt.a(cjb.class, ajr.k);
   public static final String b = "sheared";

   public static buj.a gq() {
      return ciz.s().a(buk.s, 16.0);
   }

   public cjb(bsn<? extends cjb> $$0, dcg $$1) {
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
   protected bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxh.M, $$0);
         if (!this.dR().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg v() {
      return avh.cn;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.cp;
   }

   @Override
   protected avg n_() {
      return avh.co;
   }

   @Override
   protected avg t() {
      return avh.cr;
   }

   @Override
   protected cmr a(cud $$0, float $$1, @Nullable cud $$2) {
      cmr $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cmt $$4) {
         $$4.a(new brp(brr.s, 100));
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
   public void a(avi $$0) {
      this.dR().a(null, this, avh.cq, $$0, 1.0F, 1.0F);
      this.gu();
      this.w(true);
   }

   private void gu() {
      if (this.dR() instanceof aqm $$0) {
         erb $$1 = $$0.o().bf().b(eqs.bc);
         eqz $$2 = new eqz.a($$0).a(ets.f, this.dp()).a(ets.a, this).a(etr.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cud $$3 = (cud)var4.next();
            this.a($$3, this.dm());
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bF();
   }
}
