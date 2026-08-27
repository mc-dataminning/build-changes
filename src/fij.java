import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fij extends fjo {
   static final ajt b = new ajt("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int o = 1;
   private static final int p = 1;
   private static final int q = 2;
   private static final int r = 2;
   protected final fod a;
   private final Consumer<edk> s;
   edk u;
   private wg v;
   private wg w;
   private fij.a x;
   private fdp y;

   public fij(fod $$0, Consumer<edk> $$1, edk $$2) {
      super(wg.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.s = $$1;
      this.u = $$2;
   }

   public edk l() {
      return this.u;
   }

   public void a(edk $$0) {
      this.u = $$0;
   }

   @Override
   protected void aN_() {
      this.v = wg.c("createWorld.customize.flat.tile");
      this.w = wg.c("createWorld.customize.flat.height");
      this.x = this.c(new fij.a());
      this.y = this.c(fdp.a(wg.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<edh> $$1 = this.u.e();
            int $$2 = this.x.aF_().indexOf(this.x.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.x.a($$1.isEmpty() ? null : this.x.aF_().get(Math.min($$2, $$1.size() - 1)));
            this.u.g();
            this.x.d();
            this.m();
         }
      }).a(this.k / 2 - 155, this.l - 52, 150, 20).a());
      this.c(fdp.a(wg.c("createWorld.customize.presets"), $$0 -> {
         this.j.a(new fjk(this));
         this.u.g();
         this.m();
      }).a(this.k / 2 + 5, this.l - 52, 150, 20).a());
      this.c(fdp.a(wf.d, $$0 -> {
         this.s.accept(this.u);
         this.j.a(this.a);
         this.u.g();
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a());
      this.c(fdp.a(wf.e, $$0 -> {
         this.j.a(this.a);
         this.u.g();
      }).a(this.k / 2 + 5, this.l - 28, 150, 20).a());
      this.u.g();
      this.m();
   }

   void m() {
      this.y.j = this.C();
   }

   private boolean C() {
      return this.x.h() != null;
   }

   @Override
   public void d() {
      this.j.a(this.a);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 8, 16777215);
      int $$4 = this.k / 2 - 92 - 16;
      $$0.b(this.m, this.v, $$4, 32, 16777215);
      $$0.b(this.m, this.w, $$4 + 2 + 213 - this.m.a(this.w), 32, 16777215);
   }

   class a extends fel<fij.a.a> {
      public a() {
         super(fij.this.j, fij.this.k, fij.this.l - 103, 43, 24);

         for (int $$0 = 0; $$0 < fij.this.u.e().size(); $$0++) {
            this.b(new fij.a.a());
         }
      }

      public void a(@Nullable fij.a.a $$0) {
         super.a($$0);
         fij.this.m();
      }

      public void d() {
         int $$0 = this.aF_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fij.this.u.e().size(); $$1++) {
            this.b(new fij.a.a());
         }

         List<fij.a.a> $$2 = this.aF_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fel.a<fij.a.a> {
         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            edh $$10 = fij.this.u.e().get(fij.this.u.e().size() - $$1 - 1);
            doz $$11 = $$10.b();
            crj $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fij.this.m, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wg $$13;
            if ($$1 == 0) {
               $$13 = wg.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fij.this.u.e().size() - 1) {
               $$13 = wg.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wg.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fij.this.m, $$13, $$3 + 2 + 213 - fij.this.m.a($$13), $$2 + 3, 16777215, false);
         }

         private crj a(doz $$0) {
            cre $$1 = $$0.b().p();
            if ($$1 == crm.a) {
               if ($$0.a(dca.G)) {
                  $$1 = crm.qy;
               } else if ($$0.a(dca.H)) {
                  $$1 = crm.qz;
               }
            }

            return new crj($$1);
         }

         @Override
         public wg a() {
            edh $$0 = fij.this.u.e().get(fij.this.u.e().size() - a.this.aF_().indexOf(this) - 1);
            crj $$1 = this.a($$0.b());
            return (wg)(!$$1.d() ? wg.a("narrator.select", $$1.w()) : wf.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fdc $$0, int $$1, int $$2, crj $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.d()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fdc $$0, int $$1, int $$2) {
            $$0.a(fij.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
