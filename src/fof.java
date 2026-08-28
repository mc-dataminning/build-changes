public abstract class fof extends fon {
   protected static final int e = 2;
   private static final fqd a = new fqd(aku.b("widget/button"), aku.b("widget/button_disabled"), aku.b("widget/button_highlighted"));

   public fof(int $$0, int $$1, int $$2, int $$3, wo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fob $$0, int $$1, int $$2, float $$3) {
      flh $$4 = flh.Q();
      $$0.a(gmf::H, a.a(this.j, this.D()), this.F(), this.G(), this.A(), this.y(), axj.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayy.f(this.l * 255.0F) << 24);
   }

   public void a(fob $$0, fnz $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.j || !this.k) {
         return false;
      } else if (fss.a($$0)) {
         this.a(flh.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
