import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fku extends flz {
   static final akn b = new akn("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fqo a;
   private final Consumer<efo> w;
   efo x;
   private wx y;
   private wx z;
   private fku.a A;
   private fga B;

   public fku(fqo $$0, Consumer<efo> $$1, efo $$2) {
      super(wx.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public efo l() {
      return this.x;
   }

   public void a(efo $$0) {
      this.x = $$0;
   }

   @Override
   protected void aN_() {
      this.y = wx.c("createWorld.customize.flat.tile");
      this.z = wx.c("createWorld.customize.flat.height");
      this.A = this.c(new fku.a());
      this.B = this.c(fga.a(wx.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<efl> $$1 = this.x.e();
            int $$2 = this.A.aF_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aF_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fga.a(wx.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new flv(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fga.a(ww.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fga.a(ww.e, $$0 -> {
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
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fgw<fku.a.a> {
      public a() {
         super(fku.this.m, fku.this.n, fku.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fku.this.x.e().size(); $$0++) {
            this.b(new fku.a.a());
         }
      }

      public void a(@Nullable fku.a.a $$0) {
         super.a($$0);
         fku.this.m();
      }

      public void d() {
         int $$0 = this.aF_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fku.this.x.e().size(); $$1++) {
            this.b(new fku.a.a());
         }

         List<fku.a.a> $$2 = this.aF_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fgw.a<fku.a.a> {
         @Override
         public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            efl $$10 = fku.this.x.e().get(fku.this.x.e().size() - $$1 - 1);
            drd $$11 = $$10.b();
            ctq $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fku.this.p, $$12.x(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wx $$13;
            if ($$1 == 0) {
               $$13 = wx.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fku.this.x.e().size() - 1) {
               $$13 = wx.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wx.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fku.this.p, $$13, $$3 + 2 + 213 - fku.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private ctq a(drd $$0) {
            ctl $$1 = $$0.b().r();
            if ($$1 == ctt.a) {
               if ($$0.a(dec.G)) {
                  $$1 = ctt.qz;
               } else if ($$0.a(dec.H)) {
                  $$1 = ctt.qA;
               }
            }

            return new ctq($$1);
         }

         @Override
         public wx a() {
            efl $$0 = fku.this.x.e().get(fku.this.x.e().size() - a.this.aF_().indexOf(this) - 1);
            ctq $$1 = this.a($$0.b());
            return (wx)(!$$1.e() ? wx.a("narrator.select", $$1.x()) : ww.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(ffn $$0, int $$1, int $$2, ctq $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ffn $$0, int $$1, int $$2) {
            $$0.a(fku.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
