import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbp extends fct {
   static final ahd b = new ahd("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fhj a;
   private final Consumer<dxc> p;
   dxc q;
   private vd r;
   private vd t;
   private fbp.a u;
   private ewy v;

   public fbp(fhj $$0, Consumer<dxc> $$1, dxc $$2) {
      super(vd.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dxc m() {
      return this.q;
   }

   public void a(dxc $$0) {
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      this.r = vd.c("createWorld.customize.flat.tile");
      this.t = vd.c("createWorld.customize.flat.height");
      this.u = this.d(new fbp.a());
      this.v = this.d(ewy.a(vd.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dwz> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.n();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(ewy.a(vd.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fcp(this));
         this.q.g();
         this.n();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(ewy.a(vc.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ewy.a(vc.e, $$0 -> {
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.q.g();
      this.n();
   }

   void n() {
      this.v.j = this.C();
   }

   private boolean C() {
      return this.u.i() != null;
   }

   @Override
   public void aE_() {
      this.f.a(this.a);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends exu<fbp.a.a> {
      public a() {
         super(fbp.this.f, fbp.this.g, fbp.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < fbp.this.q.e().size(); $$0++) {
            this.b(new fbp.a.a());
         }
      }

      public void a(@Nullable fbp.a.a $$0) {
         super.a($$0);
         fbp.this.n();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < fbp.this.q.e().size(); $$1++) {
            this.b(new fbp.a.a());
         }

         List<fbp.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends exu.a<fbp.a.a> {
         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dwz $$10 = fbp.this.q.e().get(fbp.this.q.e().size() - $$1 - 1);
            dja $$11 = $$10.b();
            cmr $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fbp.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vd $$13;
            if ($$1 == 0) {
               $$13 = vd.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fbp.this.q.e().size() - 1) {
               $$13 = vd.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vd.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fbp.this.i, $$13, $$3 + 2 + 213 - fbp.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cmr a(dja $$0) {
            cmm $$1 = $$0.b().k();
            if ($$1 == cmu.a) {
               if ($$0.a(cwl.G)) {
                  $$1 = cmu.qw;
               } else if ($$0.a(cwl.H)) {
                  $$1 = cmu.qx;
               }
            }

            return new cmr($$1);
         }

         @Override
         public vd a() {
            dwz $$0 = fbp.this.q.e().get(fbp.this.q.e().size() - a.this.l().indexOf(this) - 1);
            cmr $$1 = this.a($$0.b());
            return (vd)(!$$1.b() ? vd.a("narrator.select", $$1.y()) : vc.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(ewm $$0, int $$1, int $$2, cmr $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ewm $$0, int $$1, int $$2) {
            $$0.a(fbp.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
