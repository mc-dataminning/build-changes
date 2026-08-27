import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjo extends fkt {
   static final akf b = new akf("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fpj a;
   private final Consumer<eej> w;
   eej x;
   private ws y;
   private ws z;
   private fjo.a A;
   private feu B;

   public fjo(fpj $$0, Consumer<eej> $$1, eej $$2) {
      super(ws.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public eej l() {
      return this.x;
   }

   public void a(eej $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = ws.c("createWorld.customize.flat.tile");
      this.z = ws.c("createWorld.customize.flat.height");
      this.A = this.c(new fjo.a());
      this.B = this.c(feu.a(ws.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<eeg> $$1 = this.x.e();
            int $$2 = this.A.aE_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(feu.a(ws.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fkp(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(feu.a(wr.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(feu.a(wr.e, $$0 -> {
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
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends ffq<fjo.a.a> {
      public a() {
         super(fjo.this.m, fjo.this.n, fjo.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fjo.this.x.e().size(); $$0++) {
            this.b(new fjo.a.a());
         }
      }

      public void a(@Nullable fjo.a.a $$0) {
         super.a($$0);
         fjo.this.m();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fjo.this.x.e().size(); $$1++) {
            this.b(new fjo.a.a());
         }

         List<fjo.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends ffq.a<fjo.a.a> {
         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eeg $$10 = fjo.this.x.e().get(fjo.this.x.e().size() - $$1 - 1);
            dpy $$11 = $$10.b();
            csd $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fjo.this.p, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            ws $$13;
            if ($$1 == 0) {
               $$13 = ws.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fjo.this.x.e().size() - 1) {
               $$13 = ws.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = ws.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fjo.this.p, $$13, $$3 + 2 + 213 - fjo.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private csd a(dpy $$0) {
            cry $$1 = $$0.b().p();
            if ($$1 == csg.a) {
               if ($$0.a(dcx.G)) {
                  $$1 = csg.qz;
               } else if ($$0.a(dcx.H)) {
                  $$1 = csg.qA;
               }
            }

            return new csd($$1);
         }

         @Override
         public ws a() {
            eeg $$0 = fjo.this.x.e().get(fjo.this.x.e().size() - a.this.aE_().indexOf(this) - 1);
            csd $$1 = this.a($$0.b());
            return (ws)(!$$1.d() ? ws.a("narrator.select", $$1.w()) : wr.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(feh $$0, int $$1, int $$2, csd $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.d()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(feh $$0, int $$1, int $$2) {
            $$0.a(fjo.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
