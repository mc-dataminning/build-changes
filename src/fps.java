import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fps extends fnf {
   private static final xp a = xp.c("structure_block.structure_name");
   private static final xp b = xp.c("structure_block.position");
   private static final xp c = xp.c("structure_block.size");
   private static final xp d = xp.c("structure_block.integrity");
   private static final xp r = xp.c("structure_block.custom_data");
   private static final xp s = xp.c("structure_block.include_entities");
   private static final xp u = xp.c("structure_block.detect_size");
   private static final xp v = xp.c("structure_block.show_air");
   private static final xp w = xp.c("structure_block.show_boundingbox");
   private static final ImmutableList<dto> x = ImmutableList.copyOf(dto.values());
   private static final ImmutableList<dto> y = x.stream().filter($$0 -> $$0 != dto.d).collect(ImmutableList.toImmutableList());
   private final dqy z;
   private djy A = djy.a;
   private dlo B = dlo.a;
   private dto C = dto.d;
   private boolean D;
   private boolean E;
   private boolean F;
   private fhp G;
   private fhp H;
   private fhp I;
   private fhp J;
   private fhp K;
   private fhp L;
   private fhp M;
   private fhp N;
   private fhp O;
   private fhp P;
   private fhg Q;
   private fhg R;
   private fhg S;
   private fhg T;
   private fhg U;
   private fhg V;
   private fhg W;
   private fhn<Boolean> X;
   private fhn<djy> Y;
   private fhn<Boolean> Z;
   private fhn<Boolean> aa;
   private final DecimalFormat ab = new DecimalFormat("0.0###");

   public fps(dqy $$0) {
      super(xp.c(dfd.pa.g()));
      this.z = $$0;
      this.ab.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dqy.a.a)) {
         this.m.a(null);
      }
   }

   private void E() {
      this.z.a(this.A);
      this.z.a(this.B);
      this.z.a(this.C);
      this.z.a(this.D);
      this.z.d(this.E);
      this.z.e(this.F);
      this.m.a(null);
   }

   @Override
   protected void aM_() {
      this.c((fhg)fhg.a(xo.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fhg)fhg.a(xo.e, $$0x -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.A = this.z.k();
      this.B = this.z.l();
      this.C = this.z.v();
      this.D = this.z.w();
      this.E = this.z.E();
      this.F = this.z.F();
      this.Q = this.c((fhg)fhg.a(xp.c("structure_block.button.save"), $$0x -> {
         if (this.z.v() == dto.a) {
            this.a(dqy.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.R = this.c((fhg)fhg.a(xp.c("structure_block.button.load"), $$0x -> {
         if (this.z.v() == dto.b) {
            this.a(dqy.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fhn.<dto>a($$0x -> xp.c("structure_block.mode." + $$0x.c()))
            .a(y, x)
            .a()
            .a(this.C)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, xp.b("MODE"), ($$0x, $$1x) -> {
               this.z.a($$1x);
               this.a($$1x);
            })
      );
      this.W = this.c((fhg)fhg.a(xp.c("structure_block.button.detect_size"), $$0x -> {
         if (this.z.v() == dto.a) {
            this.a(dqy.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.X = this.c(fhn.b(!this.z.w()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, s, ($$0x, $$1x) -> this.z.a(!$$1x)));
      this.Y = this.c(fhn.<djy>a(djy::b).a(djy.values()).a().a(this.A).a(this.n / 2 - 20, 185, 40, 20, xp.b("MIRROR"), ($$0x, $$1x) -> this.z.a($$1x)));
      this.Z = this.c(fhn.b(this.z.E()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, v, ($$0x, $$1x) -> this.z.d($$1x)));
      this.aa = this.c(fhn.b(this.z.F()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.z.e($$1x)));
      this.S = this.c((fhg)fhg.a(xp.b("0"), $$0x -> {
         this.z.a(dlo.a);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.T = this.c((fhg)fhg.a(xp.b("90"), $$0x -> {
         this.z.a(dlo.b);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fhg)fhg.a(xp.b("180"), $$0x -> {
         this.z.a(dlo.c);
         this.F();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.V = this.c((fhg)fhg.a(xp.b("270"), $$0x -> {
         this.z.a(dlo.d);
         this.F();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.G = new fhp(this.p, this.n / 2 - 152, 40, 300, 20, xp.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fps.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.G.f(128);
      this.G.a(this.z.c());
      this.d(this.G);
      iz $$0 = this.z.f();
      this.H = new fhp(this.p, this.n / 2 - 152, 80, 80, 20, xp.c("structure_block.position.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$0.u()));
      this.d(this.H);
      this.I = new fhp(this.p, this.n / 2 - 72, 80, 80, 20, xp.c("structure_block.position.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.v()));
      this.d(this.I);
      this.J = new fhp(this.p, this.n / 2 + 8, 80, 80, 20, xp.c("structure_block.position.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.w()));
      this.d(this.J);
      kd $$1 = this.z.j();
      this.K = new fhp(this.p, this.n / 2 - 152, 120, 80, 20, xp.c("structure_block.size.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$1.u()));
      this.d(this.K);
      this.L = new fhp(this.p, this.n / 2 - 72, 120, 80, 20, xp.c("structure_block.size.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.v()));
      this.d(this.L);
      this.M = new fhp(this.p, this.n / 2 + 8, 120, 80, 20, xp.c("structure_block.size.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.w()));
      this.d(this.M);
      this.N = new fhp(this.p, this.n / 2 - 152, 120, 80, 20, xp.c("structure_block.integrity.integrity"));
      this.N.f(15);
      this.N.a(this.ab.format((double)this.z.x()));
      this.d(this.N);
      this.O = new fhp(this.p, this.n / 2 - 72, 120, 80, 20, xp.c("structure_block.integrity.seed"));
      this.O.f(31);
      this.O.a(Long.toString(this.z.y()));
      this.d(this.O);
      this.P = new fhp(this.p, this.n / 2 - 152, 120, 240, 20, xp.c("structure_block.custom_data"));
      this.P.f(128);
      this.P.a(this.z.u());
      this.d(this.P);
      this.F();
      this.a(this.C);
   }

   @Override
   protected void aB_() {
      this.b(this.G);
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(ffh $$0, int $$1, int $$2) {
      String $$3 = this.G.a();
      String $$4 = this.H.a();
      String $$5 = this.I.a();
      String $$6 = this.J.a();
      String $$7 = this.K.a();
      String $$8 = this.L.a();
      String $$9 = this.M.a();
      String $$10 = this.N.a();
      String $$11 = this.O.a();
      String $$12 = this.P.a();
      this.b($$0, $$1, $$2);
      this.G.a($$3);
      this.H.a($$4);
      this.I.a($$5);
      this.J.a($$6);
      this.K.a($$7);
      this.L.a($$8);
      this.M.a($$9);
      this.N.a($$10);
      this.O.a($$11);
      this.P.a($$12);
   }

   private void F() {
      this.S.j = true;
      this.T.j = true;
      this.U.j = true;
      this.V.j = true;
      switch (this.z.l()) {
         case a:
            this.S.j = false;
            break;
         case c:
            this.U.j = false;
            break;
         case d:
            this.V.j = false;
            break;
         case b:
            this.T.j = false;
      }
   }

   private void a(dto $$0) {
      this.G.g(false);
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.g(false);
      this.O.g(false);
      this.P.g(false);
      this.Q.k = false;
      this.R.k = false;
      this.W.k = false;
      this.X.k = false;
      this.Y.k = false;
      this.S.k = false;
      this.T.k = false;
      this.U.k = false;
      this.V.k = false;
      this.Z.k = false;
      this.aa.k = false;
      switch ($$0) {
         case a:
            this.G.g(true);
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.Q.k = true;
            this.W.k = true;
            this.X.k = true;
            this.Z.k = true;
            break;
         case b:
            this.G.g(true);
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.N.g(true);
            this.O.g(true);
            this.R.k = true;
            this.X.k = true;
            this.Y.k = true;
            this.S.k = true;
            this.T.k = true;
            this.U.k = true;
            this.V.k = true;
            this.aa.k = true;
            this.F();
            break;
         case c:
            this.G.g(true);
            break;
         case d:
            this.P.g(true);
      }
   }

   private boolean a(dqy.a $$0) {
      iz $$1 = new iz(this.c(this.H.a()), this.c(this.I.a()), this.c(this.J.a()));
      kd $$2 = new kd(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      float $$3 = this.b(this.N.a());
      long $$4 = this.a(this.O.a());
      this.m
         .L()
         .b(new aio(this.z.ay_(), $$0, this.z.v(), this.G.a(), $$1, $$2, this.z.k(), this.z.l(), this.P.a(), this.z.w(), this.z.E(), this.z.F(), $$3, $$4));
      return true;
   }

   private long a(String $$0) {
      try {
         return Long.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   private float b(String $$0) {
      try {
         return Float.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private int c(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void d() {
      this.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dto $$4 = this.z.v();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != dto.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.G.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dto.b || $$4 == dto.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, s, this.n / 2 + 154 - this.p.a(s), 150, 10526880);
      }

      if ($$4 == dto.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 110, 10526880);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 70, 10526880);
      }

      if ($$4 == dto.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 70, 10526880);
      }

      if ($$4 == dto.d) {
         $$0.b(this.p, r, this.n / 2 - 153, 110, 10526880);
         this.P.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.p, $$4.a(), this.n / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
