public class fsj extends fqs {
   private static final xh a = xh.c("jigsaw_block.joint_label");
   private static final xh b = xh.c("jigsaw_block.pool");
   private static final xh c = xh.c("jigsaw_block.name");
   private static final xh d = xh.c("jigsaw_block.target");
   private static final xh s = xh.c("jigsaw_block.final_state");
   private static final xh u = xh.c("jigsaw_block.placement_priority");
   private static final xh v = xh.c("jigsaw_block.placement_priority.tooltip");
   private static final xh w = xh.c("jigsaw_block.selection_priority");
   private static final xh x = xh.c("jigsaw_block.selection_priority.tooltip");
   private final dti y;
   private fli z;
   private fli A;
   private fli B;
   private fli C;
   private fli D;
   private fli E;
   int F;
   private boolean G = true;
   private flg<dti.a> H;
   private fkz I;
   private fkz J;
   private dti.a K;

   public fsj(dti $$0) {
      super(fir.a);
      this.y = $$0;
   }

   private void m() {
      this.E();
      this.m.a(null);
   }

   private void D() {
      this.m.a(null);
   }

   private void E() {
      this.m.L().b(new ain(this.y.aC_(), alh.a(this.z.a()), alh.a(this.A.a()), alh.a(this.B.a()), this.C.a(), this.K, this.b(this.D.a()), this.b(this.E.a())));
   }

   private int b(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void F() {
      this.m.L().b(new ahr(this.y.aC_(), this.F, this.G));
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   protected void aS_() {
      this.B = new fli(this.p, this.n / 2 - 153, 20, 300, 20, b);
      this.B.f(128);
      this.B.a(this.y.d().a().toString());
      this.B.b($$0x -> this.G());
      this.d(this.B);
      this.z = new fli(this.p, this.n / 2 - 153, 55, 300, 20, c);
      this.z.f(128);
      this.z.a(this.y.b().toString());
      this.z.b($$0x -> this.G());
      this.d(this.z);
      this.A = new fli(this.p, this.n / 2 - 153, 90, 300, 20, d);
      this.A.f(128);
      this.A.a(this.y.c().toString());
      this.A.b($$0x -> this.G());
      this.d(this.A);
      this.C = new fli(this.p, this.n / 2 - 153, 125, 300, 20, s);
      this.C.f(256);
      this.C.a(this.y.f());
      this.d(this.C);
      this.D = new fli(this.p, this.n / 2 - 153, 160, 98, 20, w);
      this.D.f(3);
      this.D.a(Integer.toString(this.y.t()));
      this.D.a(fmk.a(x));
      this.d(this.D);
      this.E = new fli(this.p, this.n / 2 - 50, 160, 98, 20, u);
      this.E.f(3);
      this.E.a(Integer.toString(this.y.k()));
      this.E.a(fmk.a(v));
      this.d(this.E);
      this.K = this.y.j();
      this.H = this.c(flg.<dti.a>a(dti.a::a).a(dti.a.values()).a(this.K).a().a(this.n / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.K = $$1));
      boolean $$0 = dlz.o(this.y.m()).o().b();
      this.H.j = $$0;
      this.H.k = $$0;
      this.c(new fkv(this.n / 2 - 154, 185, 100, 20, xg.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(xh.a("jigsaw_block.levels", fsj.this.F));
         }

         @Override
         protected void a() {
            fsj.this.F = azj.a(azj.b(0.0, 20.0, this.c));
         }
      });
      this.c(flg.b(this.G).a(this.n / 2 - 50, 185, 100, 20, xh.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.G = $$1));
      this.J = this.c((fkz)fkz.a(xh.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.F();
      }).a(this.n / 2 + 54, 185, 100, 20).a());
      this.I = this.c((fkz)fkz.a(xg.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fkz)fkz.a(xg.e, $$0x -> this.D()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.G();
   }

   @Override
   protected void aH_() {
      this.b(this.B);
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public static boolean a(String $$0) {
      return alh.c($$0) != null;
   }

   private void G() {
      boolean $$0 = a(this.z.a()) && a(this.A.a()) && a(this.B.a());
      this.I.j = $$0;
      this.J.j = $$0;
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
      String $$3 = this.z.a();
      String $$4 = this.A.a();
      String $$5 = this.B.a();
      String $$6 = this.C.a();
      String $$7 = this.D.a();
      String $$8 = this.E.a();
      int $$9 = this.F;
      dti.a $$10 = this.K;
      this.b($$0, $$1, $$2);
      this.z.a($$3);
      this.A.a($$4);
      this.B.a($$5);
      this.C.a($$6);
      this.F = $$9;
      this.K = $$10;
      this.H.a($$10);
      this.D.a($$7);
      this.E.a($$8);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (!this.I.j || $$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, b, this.n / 2 - 153, 10, 10526880);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, c, this.n / 2 - 153, 45, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, d, this.n / 2 - 153, 80, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, s, this.n / 2 - 153, 115, 10526880);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, w, this.n / 2 - 153, 150, 10526880);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.b(this.p, u, this.n / 2 - 50, 150, 10526880);
      this.D.a($$0, $$1, $$2, $$3);
      if (dlz.o(this.y.m()).o().b()) {
         $$0.b(this.p, a, this.n / 2 + 53, 150, 10526880);
      }
   }
}
