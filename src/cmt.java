public abstract class cmt extends cmo implements cmw {
   private static final ajp<cua> g = ajt.a(cmt.class, ajr.h);

   public cmt(bsj<? extends cmt> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cmt(bsj<? extends cmt> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, dcd $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cmt(bsj<? extends cmt> $$0, bsy $$1, double $$2, double $$3, double $$4, dcd $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(cua $$0) {
      if ($$0.e()) {
         this.ap().a(g, this.y());
      } else {
         this.ap().a(g, $$0.c(1));
      }
   }

   @Override
   public cua p() {
      return this.ap().a(g);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, this.y());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("Item", 10)) {
         this.a(cua.a(this.dR(), (uu)$$0.p("Item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }
   }

   private cua y() {
      return new cua(cud.tX);
   }

   @Override
   public btq a_(int $$0) {
      return $$0 == 0 ? btq.a(this::p, this::a) : super.a_($$0);
   }
}
