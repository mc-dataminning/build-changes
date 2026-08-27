import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fis extends fjx {
   static final ajv b = new ajv("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int o = 1;
   private static final int p = 1;
   private static final int q = 2;
   private static final int r = 2;
   protected final fom a;
   private final Consumer<edt> s;
   edt u;
   private wi v;
   private wi w;
   private fis.a x;
   private fdy y;

   public fis(fom $$0, Consumer<edt> $$1, edt $$2) {
      super(wi.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.s = $$1;
      this.u = $$2;
   }

   public edt l() {
      return this.u;
   }

   public void a(edt $$0) {
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      this.v = wi.c("createWorld.customize.flat.tile");
      this.w = wi.c("createWorld.customize.flat.height");
      this.x = this.c(new fis.a());
      this.y = this.c(fdy.a(wi.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<edq> $$1 = this.u.e();
            int $$2 = this.x.aE_().indexOf(this.x.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.x.a($$1.isEmpty() ? null : this.x.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.u.g();
            this.x.d();
            this.m();
         }
      }).a(this.k / 2 - 155, this.l - 52, 150, 20).a());
      this.c(fdy.a(wi.c("createWorld.customize.presets"), $$0 -> {
         this.j.a(new fjt(this));
         this.u.g();
         this.m();
      }).a(this.k / 2 + 5, this.l - 52, 150, 20).a());
      this.c(fdy.a(wh.d, $$0 -> {
         this.s.accept(this.u);
         this.j.a(this.a);
         this.u.g();
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a());
      this.c(fdy.a(wh.e, $$0 -> {
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 8, 16777215);
      int $$4 = this.k / 2 - 92 - 16;
      $$0.b(this.m, this.v, $$4, 32, 16777215);
      $$0.b(this.m, this.w, $$4 + 2 + 213 - this.m.a(this.w), 32, 16777215);
   }

   class a extends feu<fis.a.a> {
      public a() {
         super(fis.this.j, fis.this.k, fis.this.l - 103, 43, 24);

         for (int $$0 = 0; $$0 < fis.this.u.e().size(); $$0++) {
            this.b(new fis.a.a());
         }
      }

      public void a(@Nullable fis.a.a $$0) {
         super.a($$0);
         fis.this.m();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fis.this.u.e().size(); $$1++) {
            this.b(new fis.a.a());
         }

         List<fis.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends feu.a<fis.a.a> {
         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            edq $$10 = fis.this.u.e().get(fis.this.u.e().size() - $$1 - 1);
            dpi $$11 = $$10.b();
            crs $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fis.this.m, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wi $$13;
            if ($$1 == 0) {
               $$13 = wi.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fis.this.u.e().size() - 1) {
               $$13 = wi.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wi.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fis.this.m, $$13, $$3 + 2 + 213 - fis.this.m.a($$13), $$2 + 3, 16777215, false);
         }

         private crs a(dpi $$0) {
            crn $$1 = $$0.b().p();
            if ($$1 == crv.a) {
               if ($$0.a(dcj.G)) {
                  $$1 = crv.qy;
               } else if ($$0.a(dcj.H)) {
                  $$1 = crv.qz;
               }
            }

            return new crs($$1);
         }

         @Override
         public wi a() {
            edq $$0 = fis.this.u.e().get(fis.this.u.e().size() - a.this.aE_().indexOf(this) - 1);
            crs $$1 = this.a($$0.b());
            return (wi)(!$$1.d() ? wi.a("narrator.select", $$1.w()) : wh.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fdl $$0, int $$1, int $$2, crs $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.d()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fdl $$0, int $$1, int $$2) {
            $$0.a(fis.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
