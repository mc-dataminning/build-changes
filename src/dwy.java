public class dwy extends dwn {
   private boolean a;
   private boolean b;
   private boolean c;
   private final dhq d = new dhq() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         dwy.this.e();
      }

      @Override
      public aro e() {
         return (aro)dwy.this.n;
      }

      @Override
      public void f() {
         dzo $$0 = dwy.this.n.a_(dwy.this.o);
         this.e().a(dwy.this.o, $$0, $$0, 3);
      }

      @Override
      public fdw g() {
         return fdw.b(dwy.this.o);
      }

      @Override
      public ei i() {
         ja $$0 = dwy.this.m().c(dnd.b);
         return new ei(this, fdw.b(dwy.this.o), new fdv(0.0F, $$0.p()), this.e(), 2, this.n().getString(), this.n(), this.e().p(), null);
      }

      @Override
      public boolean j() {
         return !dwy.this.n();
      }
   };

   public dwy(iu $$0, dzo $$1) {
      super(dwp.x, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      $$0.a("powered", this.c());
      $$0.a("conditionMet", this.j());
      $$0.a("auto", this.d());
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d.b($$0, $$1);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   public dhq a() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean c() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.b;
      this.b = $$0;
      if (!$$1 && $$0 && !this.a && this.n != null && this.s() != dwy.a.a) {
         this.u();
      }
   }

   public void f() {
      dwy.a $$0 = this.s();
      if ($$0 == dwy.a.b && (this.a || this.b) && this.n != null) {
         this.u();
      }
   }

   private void u() {
      dlu $$0 = this.m().b();
      if ($$0 instanceof dnd) {
         this.k();
         this.n.a(this.o, $$0, 1);
      }
   }

   public boolean j() {
      return this.c;
   }

   public boolean k() {
      this.c = true;
      if (this.t()) {
         iu $$0 = this.o.a(this.n.a_(this.o).c(dnd.b).g());
         if (this.n.a_($$0).b() instanceof dnd) {
            dwn $$1 = this.n.c_($$0);
            this.c = $$1 instanceof dwy && ((dwy)$$1).a().k() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public dwy.a s() {
      dzo $$0 = this.m();
      if ($$0.a(dlw.gi)) {
         return dwy.a.c;
      } else if ($$0.a(dlw.li)) {
         return dwy.a.b;
      } else {
         return $$0.a(dlw.lj) ? dwy.a.a : dwy.a.c;
      }
   }

   public boolean t() {
      dzo $$0 = this.n.a_(this.aw_());
      return $$0.b() instanceof dnd ? $$0.c(dnd.c) : false;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.d.b($$0.a(kj.g));
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.d.o());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("CustomName");
      $$0.r("conditionMet");
      $$0.r("powered");
   }

   public static enum a {
      a,
      b,
      c;
   }
}
