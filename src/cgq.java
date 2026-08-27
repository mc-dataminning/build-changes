import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cgq extends cgo implements brj {
   private static final int c = 50;
   private static final int d = 70;
   private static final aja<Boolean> e = aje.a(cgq.class, ajc.k);
   public static final String b = "sheared";

   public static brz.a gq() {
      return cgo.r().a(bsa.q, 16.0);
   }

   public cgq(bqg<? extends cgq> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gr() {
      return this.an.a(e);
   }

   public void w(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.rU) && this.a()) {
         this.a(aup.h);
         this.a(dub.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aun v() {
      return auo.cn;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.cp;
   }

   @Override
   protected aun o_() {
      return auo.co;
   }

   @Override
   protected aun u() {
      return auo.cr;
   }

   @Override
   protected ckg b(crs $$0, float $$1) {
      ckg $$2 = super.b($$0, $$1);
      if ($$2 instanceof cki $$3) {
         $$3.a(new bpm(bpo.s, 100));
      }

      return $$2;
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
   public void a(aup $$0) {
      this.dM().a(null, this, auo.cq, $$0, 1.0F, 1.0F);
      this.gu();
      this.w(true);
   }

   private void gu() {
      if (this.dM() instanceof apu $$0 && $$0.aa().b(czc.f)) {
         ens $$1 = $$0.o().aM().getLootTable(eni.aP);
         enq $$2 = new enq.a($$0).a(epx.f, this.dk()).a(epx.a, this).a(epw.r);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            crs $$3 = (crs)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bA();
   }
}
