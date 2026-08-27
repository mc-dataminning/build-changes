import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fol extends flz {
   private static final wx a = wx.c("structure_block.structure_name");
   private static final wx b = wx.c("structure_block.position");
   private static final wx c = wx.c("structure_block.size");
   private static final wx d = wx.c("structure_block.integrity");
   private static final wx r = wx.c("structure_block.custom_data");
   private static final wx s = wx.c("structure_block.include_entities");
   private static final wx u = wx.c("structure_block.detect_size");
   private static final wx v = wx.c("structure_block.show_air");
   private static final wx w = wx.c("structure_block.show_boundingbox");
   private static final ImmutableList<dsn> x = ImmutableList.copyOf(dsn.values());
   private static final ImmutableList<dsn> y = x.stream().filter($$0 -> $$0 != dsn.d).collect(ImmutableList.toImmutableList());
   private final dpx z;
   private dix A = dix.a;
   private dkn B = dkn.a;
   private dsn C = dsn.d;
   private boolean D;
   private boolean E;
   private boolean F;
   private fgj G;
   private fgj H;
   private fgj I;
   private fgj J;
   private fgj K;
   private fgj L;
   private fgj M;
   private fgj N;
   private fgj O;
   private fgj P;
   private fga Q;
   private fga R;
   private fga S;
   private fga T;
   private fga U;
   private fga V;
   private fga W;
   private fgh<Boolean> X;
   private fgh<dix> Y;
   private fgh<Boolean> Z;
   private fgh<Boolean> aa;
   private final DecimalFormat ab = new DecimalFormat("0.0###");

   public fol(dpx $$0) {
      super(wx.c(dec.pa.g()));
      this.z = $$0;
      this.ab.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dpx.a.a)) {
         this.m.a(null);
      }
   }

   private void C() {
      this.z.a(this.A);
      this.z.a(this.B);
      this.z.a(this.C);
      this.z.a(this.D);
      this.z.d(this.E);
      this.z.e(this.F);
      this.m.a(null);
   }

   @Override
   protected void aN_() {
      this.c((fga)fga.a(ww.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fga)fga.a(ww.e, $$0x -> this.C()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.A = this.z.k();
      this.B = this.z.l();
      this.C = this.z.v();
      this.D = this.z.w();
      this.E = this.z.E();
      this.F = this.z.F();
      this.Q = this.c((fga)fga.a(wx.c("structure_block.button.save"), $$0x -> {
         if (this.z.v() == dsn.a) {
            this.a(dpx.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.R = this.c((fga)fga.a(wx.c("structure_block.button.load"), $$0x -> {
         if (this.z.v() == dsn.b) {
            this.a(dpx.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fgh.<dsn>a($$0x -> wx.c("structure_block.mode." + $$0x.c()))
            .a(y, x)
            .a()
            .a(this.C)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, wx.b("MODE"), ($$0x, $$1x) -> {
               this.z.a($$1x);
               this.a($$1x);
            })
      );
      this.W = this.c((fga)fga.a(wx.c("structure_block.button.detect_size"), $$0x -> {
         if (this.z.v() == dsn.a) {
            this.a(dpx.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.X = this.c(fgh.b(!this.z.w()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, s, ($$0x, $$1x) -> this.z.a(!$$1x)));
      this.Y = this.c(fgh.<dix>a(dix::b).a(dix.values()).a().a(this.A).a(this.n / 2 - 20, 185, 40, 20, wx.b("MIRROR"), ($$0x, $$1x) -> this.z.a($$1x)));
      this.Z = this.c(fgh.b(this.z.E()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, v, ($$0x, $$1x) -> this.z.d($$1x)));
      this.aa = this.c(fgh.b(this.z.F()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.z.e($$1x)));
      this.S = this.c((fga)fga.a(wx.b("0"), $$0x -> {
         this.z.a(dkn.a);
         this.D();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.T = this.c((fga)fga.a(wx.b("90"), $$0x -> {
         this.z.a(dkn.b);
         this.D();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fga)fga.a(wx.b("180"), $$0x -> {
         this.z.a(dkn.c);
         this.D();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.V = this.c((fga)fga.a(wx.b("270"), $$0x -> {
         this.z.a(dkn.d);
         this.D();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.G = new fgj(this.p, this.n / 2 - 152, 40, 300, 20, wx.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fol.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.G.f(128);
      this.G.a(this.z.c());
      this.d(this.G);
      io $$0 = this.z.f();
      this.H = new fgj(this.p, this.n / 2 - 152, 80, 80, 20, wx.c("structure_block.position.x"));
      this.H.f(15);
      this.H.a(Integer.toString($$0.u()));
      this.d(this.H);
      this.I = new fgj(this.p, this.n / 2 - 72, 80, 80, 20, wx.c("structure_block.position.y"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.v()));
      this.d(this.I);
      this.J = new fgj(this.p, this.n / 2 + 8, 80, 80, 20, wx.c("structure_block.position.z"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.w()));
      this.d(this.J);
      js $$1 = this.z.j();
      this.K = new fgj(this.p, this.n / 2 - 152, 120, 80, 20, wx.c("structure_block.size.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$1.u()));
      this.d(this.K);
      this.L = new fgj(this.p, this.n / 2 - 72, 120, 80, 20, wx.c("structure_block.size.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.v()));
      this.d(this.L);
      this.M = new fgj(this.p, this.n / 2 + 8, 120, 80, 20, wx.c("structure_block.size.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.w()));
      this.d(this.M);
      this.N = new fgj(this.p, this.n / 2 - 152, 120, 80, 20, wx.c("structure_block.integrity.integrity"));
      this.N.f(15);
      this.N.a(this.ab.format((double)this.z.x()));
      this.d(this.N);
      this.O = new fgj(this.p, this.n / 2 - 72, 120, 80, 20, wx.c("structure_block.integrity.seed"));
      this.O.f(31);
      this.O.a(Long.toString(this.z.y()));
      this.d(this.O);
      this.P = new fgj(this.p, this.n / 2 - 152, 120, 240, 20, wx.c("structure_block.custom_data"));
      this.P.f(128);
      this.P.a(this.z.u());
      this.d(this.P);
      this.D();
      this.a(this.C);
   }

   @Override
   protected void aD_() {
      this.b(this.G);
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(feb $$0, int $$1, int $$2) {
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

   private void D() {
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

   private void a(dsn $$0) {
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
            this.D();
            break;
         case c:
            this.G.g(true);
            break;
         case d:
            this.P.g(true);
      }
   }

   private boolean a(dpx.a $$0) {
      io $$1 = new io(this.c(this.H.a()), this.c(this.I.a()), this.c(this.J.a()));
      js $$2 = new js(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      float $$3 = this.b(this.N.a());
      long $$4 = this.a(this.O.a());
      this.m
         .L()
         .b(new ahw(this.z.aA_(), $$0, this.z.v(), this.G.a(), $$1, $$2, this.z.k(), this.z.l(), this.P.a(), this.z.w(), this.z.E(), this.z.F(), $$3, $$4));
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
      this.C();
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
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dsn $$4 = this.z.v();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != dsn.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.G.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dsn.b || $$4 == dsn.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, s, this.n / 2 + 154 - this.p.a(s), 150, 10526880);
      }

      if ($$4 == dsn.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 110, 10526880);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 70, 10526880);
      }

      if ($$4 == dsn.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 70, 10526880);
      }

      if ($$4 == dsn.d) {
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
