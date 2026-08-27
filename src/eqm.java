public class eqm extends epf {
   private static final acq a = new acq("textures/gui/tab_button.png");
   private static final int b = 130;
   private static final int c = 24;
   private static final int d = 2;
   private static final int e = 0;
   private static final int f = 3;
   private static final int g = 1;
   private static final int h = 1;
   private static final int i = 4;
   private static final int j = 2;
   private final era k;
   private final eqz l;

   public eqm(era $$0, eqz $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.a());
      this.k = $$0;
      this.l = $$1;
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      $$0.a(a, this.p(), this.r(), this.o, this.p, 2, 2, 2, 0, 130, 24, 0, this.a());
      eov $$4 = enn.N().h;
      int $$5 = this.r ? -1 : -6250336;
      this.a($$0, $$4, $$5);
      if (this.e()) {
         this.b($$0, $$4, $$5);
      }
   }

   public void a(eox $$0, eov $$1, int $$2) {
      int $$3 = this.p() + 1;
      int $$4 = this.r() + (this.e() ? 0 : 3);
      int $$5 = this.p() + this.k() - 1;
      int $$6 = this.r() + this.h();
      a($$0, $$1, this.l(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(eox $$0, eov $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.l()), this.k() - 4);
      int $$4 = this.p() + (this.k() - $$3) / 2;
      int $$5 = this.r() + this.h() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   protected int a() {
      int $$0 = 2;
      if (this.e() && this.n()) {
         $$0 = 1;
      } else if (this.e()) {
         $$0 = 0;
      } else if (this.n()) {
         $$0 = 3;
      }

      return $$0 * 24;
   }

   @Override
   protected void a(esp $$0) {
      $$0.a(eso.a, sw.a("gui.narrate.tab", this.l.a()));
   }

   @Override
   public void a(fzc $$0) {
   }

   public eqz b() {
      return this.l;
   }

   public boolean e() {
      return this.k.a() == this.l;
   }
}
