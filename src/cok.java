public class cok extends coc {
   static final ajp<String> c = ajt.a(cok.class, ajr.e);
   static final ajp<wu> d = ajt.a(cok.class, ajr.f);
   private final dbe e = new cok.a();
   private static final int i = 4;
   private int j;

   public cok(bsj<? extends cok> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cok(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected ctv ag_() {
      return cud.nM;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wt.a);
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public coc.a v() {
      return coc.a.g;
   }

   @Override
   public dsh x() {
      return dfh.fN.o();
   }

   public dbe B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dP());
         this.j = this.ai;
      }
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ap().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ap().a(c));
      }
   }

   @Override
   public boolean cP() {
      return true;
   }

   public class a extends dbe {
      @Override
      public aqk e() {
         return (aqk)cok.this.dP();
      }

      @Override
      public void f() {
         cok.this.ap().a(cok.c, this.m());
         cok.this.ap().a(cok.d, this.l());
      }

      @Override
      public evz g() {
         return cok.this.dn();
      }

      public cok h() {
         return cok.this;
      }

      @Override
      public eq i() {
         return new eq(this, cok.this.dn(), cok.this.bM(), this.e(), 2, this.n().getString(), cok.this.O_(), this.e().o(), cok.this);
      }

      @Override
      public boolean j() {
         return !cok.this.dK();
      }
   }
}
