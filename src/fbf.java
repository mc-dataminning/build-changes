public class fbf extends gtb {
   private static final int a = 212;
   private static final wu b = wu.c("mco.configure.world.name");
   private static final wu c = wu.c("mco.configure.world.description");
   private final fan B;
   private final eze C;
   private ffn D;
   private ffn E;

   public fbf(fan $$0, eze $$1) {
      super(wu.c("mco.configure.world.settings.title"));
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.C.e == eze.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      ffe $$2 = ffe.a(wu.c($$1), $$0x -> {
         if (this.C.e == eze.c.b) {
            wu $$1x = wu.c("mco.configure.world.close.question.line1");
            wu $$2x = wu.c("mco.configure.world.close.question.line2");
            this.m.a(new fat($$0xx -> {
               if ($$0xx) {
                  this.B.a(this);
               } else {
                  this.m.a(this);
               }
            }, fat.a.b, $$1x, $$2x, true));
         } else {
            this.B.a(false, this);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.E = new ffn(this.m.h, $$0, g(4), 212, 20, wu.c("mco.configure.world.name"));
      this.E.f(32);
      this.E.a(this.C.b());
      this.c(this.E);
      this.D = new ffn(this.m.h, $$0, g(8), 212, 20, wu.c("mco.configure.world.description"));
      this.D.f(32);
      this.D.a(this.C.a());
      this.c(this.D);
      ffe $$3 = this.c(ffe.a(wu.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.E.b($$1x -> $$3.j = !ayu.h($$1x));
      this.c(ffe.a(wt.e, $$0x -> this.d()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, b, this.n / 2 - 106, g(3), -1, false);
      $$0.a(this.p, c, this.n / 2 - 106, g(7), -1, false);
   }

   public void g() {
      this.B.a(this.E.a(), this.D.a());
   }
}
