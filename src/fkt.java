import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkt extends fly {
   static final akm b = new akm("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fqo a;
   private final Consumer<efm> w;
   efm x;
   private wx y;
   private wx z;
   private fkt.a A;
   private ffz B;

   public fkt(fqo $$0, Consumer<efm> $$1, efm $$2) {
      super(wx.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public efm l() {
      return this.x;
   }

   public void a(efm $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = wx.c("createWorld.customize.flat.tile");
      this.z = wx.c("createWorld.customize.flat.height");
      this.A = this.c(new fkt.a());
      this.B = this.c(ffz.a(wx.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<efj> $$1 = this.x.e();
            int $$2 = this.A.aE_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(ffz.a(wx.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new flu(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(ffz.a(ww.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(ffz.a(ww.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.C();
   }

   private boolean C() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fgv<fkt.a.a> {
      public a() {
         super(fkt.this.m, fkt.this.n, fkt.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fkt.this.x.e().size(); $$0++) {
            this.b(new fkt.a.a());
         }
      }

      public void a(@Nullable fkt.a.a $$0) {
         super.a($$0);
         fkt.this.m();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fkt.this.x.e().size(); $$1++) {
            this.b(new fkt.a.a());
         }

         List<fkt.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fgv.a<fkt.a.a> {
         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            efj $$10 = fkt.this.x.e().get(fkt.this.x.e().size() - $$1 - 1);
            drb $$11 = $$10.b();
            cto $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fkt.this.p, $$12.x(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wx $$13;
            if ($$1 == 0) {
               $$13 = wx.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fkt.this.x.e().size() - 1) {
               $$13 = wx.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wx.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fkt.this.p, $$13, $$3 + 2 + 213 - fkt.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cto a(drb $$0) {
            ctj $$1 = $$0.b().q();
            if ($$1 == ctr.a) {
               if ($$0.a(dea.G)) {
                  $$1 = ctr.qz;
               } else if ($$0.a(dea.H)) {
                  $$1 = ctr.qA;
               }
            }

            return new cto($$1);
         }

         @Override
         public wx a() {
            efj $$0 = fkt.this.x.e().get(fkt.this.x.e().size() - a.this.aE_().indexOf(this) - 1);
            cto $$1 = this.a($$0.b());
            return (wx)(!$$1.e() ? wx.a("narrator.select", $$1.x()) : ww.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(ffm $$0, int $$1, int $$2, cto $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ffm $$0, int $$1, int $$2) {
            $$0.a(fkt.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
