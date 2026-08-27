public class cmd extends clv {
   static final aja<String> c = aje.a(cmd.class, ajc.e);
   static final aja<wi> d = aje.a(cmd.class, ajc.f);
   private final cyh e = new cmd.a();
   private static final int i = 4;
   private int j;

   public cmd(bqg<? extends cmd> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cmd(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected crn ag_() {
      return crv.nL;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, wh.a);
   }

   @Override
   protected void a(to $$0) {
      super.a($$0);
      this.e.b($$0, this.dO());
      this.an().a(c, this.B().m());
      this.an().a(d, this.B().l());
   }

   @Override
   protected void b(to $$0) {
      super.b($$0);
      this.e.a($$0, this.dO());
   }

   @Override
   public clv.a v() {
      return clv.a.g;
   }

   @Override
   public dpi x() {
      return dcj.fN.n();
   }

   public cyh B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ah - this.j >= 4) {
         this.B().a(this.dM());
         this.j = this.ah;
      }
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aja<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.an().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.an().a(c));
      }
   }

   @Override
   public boolean cM() {
      return true;
   }

   public class a extends cyh {
      @Override
      public apu e() {
         return (apu)cmd.this.dM();
      }

      @Override
      public void f() {
         cmd.this.an().a(cmd.c, this.m());
         cmd.this.an().a(cmd.d, this.l());
      }

      @Override
      public esj g() {
         return cmd.this.dk();
      }

      public cmd h() {
         return cmd.this;
      }

      @Override
      public dv i() {
         return new dv(this, cmd.this.dk(), cmd.this.bJ(), this.e(), 2, this.n().getString(), cmd.this.O_(), this.e().o(), cmd.this);
      }

      @Override
      public boolean j() {
         return !cmd.this.dH();
      }
   }
}
