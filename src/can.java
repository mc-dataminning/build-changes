public class can extends caf {
   static final aby<String> c = acb.a(can.class, aca.e);
   static final aby<sw> d = acb.a(can.class, aca.f);
   private final cln e = new can.a();
   private static final int f = 4;
   private int g;

   public can(bfn<? extends can> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public can(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.s, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cfu j() {
      return cgc.na;
   }

   @Override
   protected void a_() {
      super.a_();
      this.aj().a(c, "");
      this.aj().a(d, sv.a);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.e.b($$0);
      this.aj().b(c, this.A().m());
      this.aj().b(d, this.A().l());
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public caf.a t() {
      return caf.a.g;
   }

   @Override
   public dcb w() {
      return cpo.fN.n();
   }

   public cln A() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ag - this.g >= 4) {
         this.A().a(this.dI());
         this.g = this.ag;
      }
   }

   @Override
   public bdx a(byo $$0, bdw $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.aj().b(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.aj().b(c));
      }
   }

   @Override
   public boolean cK() {
      return true;
   }

   public class a extends cln {
      @Override
      public aif e() {
         return (aif)can.this.dI();
      }

      @Override
      public void f() {
         can.this.aj().b(can.c, this.m());
         can.this.aj().b(can.d, this.l());
      }

      @Override
      public eei g() {
         return can.this.dg();
      }

      public can h() {
         return can.this;
      }

      @Override
      public ds i() {
         return new ds(this, can.this.dg(), can.this.bE(), this.e(), 2, this.n().getString(), can.this.H_(), this.e().n(), can.this);
      }

      @Override
      public boolean j() {
         return !can.this.dD();
      }
   }
}
