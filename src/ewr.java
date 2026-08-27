public class ewr extends evw implements ewt<cch> {
   private final cch q;
   private final cbr r = new cbr() {
      @Override
      public void a(cbf $$0, int $$1, cfz $$2) {
         ewr.this.H();
      }

      @Override
      public void a(cbf $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ewr.this.I();
         }
      }
   };

   public ewr(cch $$0, byn $$1, sw $$2) {
      this.q = $$0;
   }

   public cch G() {
      return this.q;
   }

   @Override
   protected void b() {
      super.b();
      this.q.a(this.r);
   }

   @Override
   public void aw_() {
      this.f.t.q();
      super.aw_();
   }

   @Override
   public void ax_() {
      super.ax_();
      this.q.b(this.r);
   }

   @Override
   protected void l() {
      if (this.f.t.fZ()) {
         this.d(epi.a(sv.d, $$0 -> this.aw_()).a(this.g / 2 - 100, 196, 98, 20).a());
         this.d(epi.a(sw.c("lectern.take_book"), $$0 -> this.c(3)).a(this.g / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void D() {
      this.c(1);
   }

   @Override
   protected void E() {
      this.c(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.q.m()) {
         this.c(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void c(int $$0) {
      this.f.r.a(this.q.j, $$0);
   }

   @Override
   public boolean az_() {
      return false;
   }

   void H() {
      cfz $$0 = this.q.l();
      this.a(evw.a.a($$0));
   }

   void I() {
      this.a(this.q.m());
   }

   @Override
   protected void F() {
      this.f.t.q();
   }
}
