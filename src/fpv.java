public class fpv extends fod {
   private static final wz a = wz.c("jigsaw_block.joint_label");
   private static final wz b = wz.c("jigsaw_block.pool");
   private static final wz c = wz.c("jigsaw_block.name");
   private static final wz r = wz.c("jigsaw_block.target");
   private static final wz s = wz.c("jigsaw_block.final_state");
   private static final wz u = wz.c("jigsaw_block.placement_priority");
   private static final wz v = wz.c("jigsaw_block.placement_priority.tooltip");
   private static final wz w = wz.c("jigsaw_block.selection_priority");
   private static final wz x = wz.c("jigsaw_block.selection_priority.tooltip");
   private final dri y;
   private fiv z;
   private fiv A;
   private fiv B;
   private fiv C;
   private fiv D;
   private fiv E;
   int F;
   private boolean G = true;
   private fit<dri.a> H;
   private fim I;
   private fim J;
   private dri.a K;

   public fpv(dri $$0) {
      super(fgg.a);
      this.y = $$0;
   }

   private void m() {
      this.D();
      this.l.a(null);
   }

   private void C() {
      this.l.a(null);
   }

   private void D() {
      this.l.L().b(new ahz(this.y.aD_(), akr.a(this.z.a()), akr.a(this.A.a()), akr.a(this.B.a()), this.C.a(), this.K, this.b(this.D.a()), this.b(this.E.a())));
   }

   private int b(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   private void E() {
      this.l.L().b(new ahe(this.y.aD_(), this.F, this.G));
   }

   @Override
   public void d() {
      this.C();
   }

   @Override
   protected void aT_() {
      this.B = new fiv(this.o, this.m / 2 - 153, 20, 300, 20, b);
      this.B.f(128);
      this.B.a(this.y.d().a().toString());
      this.B.b($$0x -> this.F());
      this.d(this.B);
      this.z = new fiv(this.o, this.m / 2 - 153, 55, 300, 20, c);
      this.z.f(128);
      this.z.a(this.y.b().toString());
      this.z.b($$0x -> this.F());
      this.d(this.z);
      this.A = new fiv(this.o, this.m / 2 - 153, 90, 300, 20, r);
      this.A.f(128);
      this.A.a(this.y.c().toString());
      this.A.b($$0x -> this.F());
      this.d(this.A);
      this.C = new fiv(this.o, this.m / 2 - 153, 125, 300, 20, s);
      this.C.f(256);
      this.C.a(this.y.f());
      this.d(this.C);
      this.D = new fiv(this.o, this.m / 2 - 153, 160, 98, 20, w);
      this.D.f(3);
      this.D.a(Integer.toString(this.y.l()));
      this.D.a(fjx.a(x));
      this.d(this.D);
      this.E = new fiv(this.o, this.m / 2 - 50, 160, 98, 20, u);
      this.E.f(3);
      this.E.a(Integer.toString(this.y.k()));
      this.E.a(fjx.a(v));
      this.d(this.E);
      this.K = this.y.j();
      this.H = this.c(fit.<dri.a>a(dri.a::a).a(dri.a.values()).a(this.K).a().a(this.m / 2 + 54, 160, 100, 20, a, ($$0x, $$1) -> this.K = $$1));
      boolean $$0 = dka.m(this.y.n()).o().b();
      this.H.j = $$0;
      this.H.k = $$0;
      this.c(new fii(this.m / 2 - 154, 185, 100, 20, wy.a, 0.0) {
         {
            this.b();
         }

         @Override
         protected void b() {
            this.b(wz.a("jigsaw_block.levels", fpv.this.F));
         }

         @Override
         protected void a() {
            fpv.this.F = ayo.a(ayo.b(0.0, 20.0, this.c));
         }
      });
      this.c(fit.b(this.G).a(this.m / 2 - 50, 185, 100, 20, wz.c("jigsaw_block.keep_jigsaws"), ($$0x, $$1) -> this.G = $$1));
      this.J = this.c((fim)fim.a(wz.c("jigsaw_block.generate"), $$0x -> {
         this.m();
         this.E();
      }).a(this.m / 2 + 54, 185, 100, 20).a());
      this.I = this.c((fim)fim.a(wy.d, $$0x -> this.m()).a(this.m / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fim)fim.a(wy.e, $$0x -> this.C()).a(this.m / 2 + 4, 210, 150, 20).a());
      this.F();
   }

   @Override
   protected void aI_() {
      this.b(this.B);
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public static boolean a(String $$0) {
      return akr.c($$0) != null;
   }

   private void F() {
      boolean $$0 = a(this.z.a()) && a(this.A.a()) && a(this.B.a());
      this.I.j = $$0;
      this.J.j = $$0;
   }

   @Override
   public void a(fgo $$0, int $$1, int $$2) {
      String $$3 = this.z.a();
      String $$4 = this.A.a();
      String $$5 = this.B.a();
      String $$6 = this.C.a();
      String $$7 = this.D.a();
      String $$8 = this.E.a();
      int $$9 = this.F;
      dri.a $$10 = this.K;
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
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, b, this.m / 2 - 153, 10, 10526880);
      this.B.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, c, this.m / 2 - 153, 45, 10526880);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, r, this.m / 2 - 153, 80, 10526880);
      this.A.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, s, this.m / 2 - 153, 115, 10526880);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, w, this.m / 2 - 153, 150, 10526880);
      this.E.a($$0, $$1, $$2, $$3);
      $$0.b(this.o, u, this.m / 2 - 50, 150, 10526880);
      this.D.a($$0, $$1, $$2, $$3);
      if (dka.m(this.y.n()).o().b()) {
         $$0.b(this.o, a, this.m / 2 + 53, 150, 10526880);
      }
   }
}
