public class fnd extends fld {
   private static final wu a = wu.c("jigsaw_block.joint_label");
   private static final wu b = wu.c("jigsaw_block.pool");
   private static final wu c = wu.c("jigsaw_block.name");
   private static final wu d = wu.c("jigsaw_block.target");
   private static final wu r = wu.c("jigsaw_block.final_state");
   private static final wu s = wu.c("jigsaw_block.placement_priority");
   private static final wu u = wu.c("jigsaw_block.placement_priority.tooltip");
   private static final wu v = wu.c("jigsaw_block.selection_priority");
   private static final wu w = wu.c("jigsaw_block.selection_priority.tooltip");
   private final dom x;
   private ffn y;
   private ffn z;
   private ffn A;
   private ffn B;
   private ffn C;
   private ffn D;
   int E;
   private boolean F = true;
   private ffl<dom.a> G;
   private ffe H;
   private ffe I;
   private dom.a J;

   public fnd(dom $$0) {
      super(fcw.a);
      this.x = $$0;
   }

   private void m() {
      this.D();
      this.m.a(null);
   }

   private void C() {
      this.m.a(null);
   }

   private void D() {
      this.m
         .L()
         .b(new ahp(this.x.az_(), new akh(this.y.a()), new akh(this.z.a()), new akh(this.A.a()), this.B.a(), this.J, this.a(this.C.a()), this.a(this.D.a())));
   }

   private int a(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.m.L().b(new agu(this.x.az_(), this.E, this.F));
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   protected void aM_() {
      this.A = new ffn(this.p, this.n / 2 - 153, 20, 300, 20, b);
      this.A.f(128);
      this.A.a(this.x.d().a().toString());
      this.A.b($$0x -> this.F());
      this.d(this.A);
      this.y = new ffn(this.p, this.n / 2 - 153, 55, 300, 20, c);
      this.y.f(128);
      this.y.a(this.x.b().toString());
      this.y.b($$0x -> this.F());
      this.d(this.y);
      this.z = new ffn(this.p, this.n / 2 - 153, 90, 300, 20, d);
      this.z.f(128);
      this.z.a(this.x.c().toString());
      this.z.b($$0x -> this.F());
      this.d(this.z);
      this.B = new ffn(this.p, this.n / 2 - 153, 125, 300, 20, r);
      this.B.f(256);
      this.B.a(this.x.f());
      this.d(this.B);
      this.C = new ffn(this.p, this.n / 2 - 153, 160, 98, 20, v);
      this.C.f(3);
      this.C.a(Integer.toString(this.x.l()));
      this.C.a(fgp.a(w));
      this.d(this.C);
      this.D = new ffn(this.p, this.n / 2 - 50, 160, 98, 20, s);
      this.D.f(3);
      this.D.a(Integer.toString(this.x.k()));
      this.D.a(fgp.a(u));
      this.d(this.D);
      this.J = this.x.j();
      this.G = this.c(ffl.<dom.a>a(dom.a::a).a(dom.a.values()).a(this.J).a().a(this.n / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.J = $$1));
      boolean $$0 = dhg.m(this.x.n()).o().b();
      this.G.j = $$0;
      this.G.k = $$0;
      this.c(new ffa(this.n / 2 - 154, 185, 100, 20, wt.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wu.a("jigsaw_block.levels", fnd.this.E));
         }

         @Override
         protected void a() {
            fnd.this.E = axz.a(axz.b(0.0, 20.0, this.c));
         }
      });
      this.c(ffl.b(this.F).a(this.n / 2 - 50, 185, 100, 20, wu.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.F = $$1));
      this.I = this.c((ffe)ffe.a(wu.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.E();
      }).a(this.n / 2 + 54, 185, 100, 20).a());
      this.H = this.c((ffe)ffe.a(wt.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((ffe)ffe.a(wt.e, $$0x -> this.C()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aC_() {
      this.b(this.A);
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private void F() {
      boolean $$0 = akh.i(this.y.a()) && akh.i(this.z.a()) && akh.i(this.A.a());
      this.H.j = $$0;
      this.I.j = $$0;
   }

   @Override
   public void a(fde $$0, int $$1, int $$2) {
      String $$3 = this.y.a();
      String $$4 = this.z.a();
      String $$5 = this.A.a();
      String $$6 = this.B.a();
      String $$7 = this.C.a();
      String $$8 = this.D.a();
      int $$9 = this.E;
      dom.a $$10 = this.J;
      this.b($$0, $$1, $$2);
      this.y.a($$3);
      this.z.a($$4);
      this.A.a($$5);
      this.B.a($$6);
      this.E = $$9;
      this.J = $$10;
      this.G.a($$10);
      this.C.a($$7);
      this.D.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.H.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, b, this.n / 2 - 153, 10, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, c, this.n / 2 - 153, 45, 10526880);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, d, this.n / 2 - 153, 80, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, r, this.n / 2 - 153, 115, 10526880);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, v, this.n / 2 - 153, 150, 10526880);
      this.D.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, s, this.n / 2 - 50, 150, 10526880);
      this.C.a($$0, $$1, $$2, $$3);
      if (dhg.m(this.x.n()).o().b()) {
         $$0.b(this.p, a, this.n / 2 + 53, 150, 10526880);
      }
   }
}
