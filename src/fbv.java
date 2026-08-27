import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbv extends fcz {
   static final ahg b = new ahg("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fhp a;
   private final Consumer<dxi> p;
   dxi q;
   private vf r;
   private vf t;
   private fbv.a u;
   private exe v;

   public fbv(fhp $$0, Consumer<dxi> $$1, dxi $$2) {
      super(vf.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dxi m() {
      return this.q;
   }

   public void a(dxi $$0) {
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      this.r = vf.c("createWorld.customize.flat.tile");
      this.t = vf.c("createWorld.customize.flat.height");
      this.u = this.d(new fbv.a());
      this.v = this.d(exe.a(vf.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dxf> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.n();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(exe.a(vf.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fcv(this));
         this.q.g();
         this.n();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(exe.a(ve.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(exe.a(ve.e, $$0 -> {
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends eya<fbv.a.a> {
      public a() {
         super(fbv.this.f, fbv.this.g, fbv.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < fbv.this.q.e().size(); $$0++) {
            this.b(new fbv.a.a());
         }
      }

      public void a(@Nullable fbv.a.a $$0) {
         super.a($$0);
         fbv.this.n();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < fbv.this.q.e().size(); $$1++) {
            this.b(new fbv.a.a());
         }

         List<fbv.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends eya.a<fbv.a.a> {
         @Override
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dxf $$10 = fbv.this.q.e().get(fbv.this.q.e().size() - $$1 - 1);
            djg $$11 = $$10.b();
            cmx $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fbv.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vf $$13;
            if ($$1 == 0) {
               $$13 = vf.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fbv.this.q.e().size() - 1) {
               $$13 = vf.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vf.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fbv.this.i, $$13, $$3 + 2 + 213 - fbv.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cmx a(djg $$0) {
            cms $$1 = $$0.b().k();
            if ($$1 == cna.a) {
               if ($$0.a(cwr.G)) {
                  $$1 = cna.qw;
               } else if ($$0.a(cwr.H)) {
                  $$1 = cna.qx;
               }
            }

            return new cmx($$1);
         }

         @Override
         public vf a() {
            dxf $$0 = fbv.this.q.e().get(fbv.this.q.e().size() - a.this.l().indexOf(this) - 1);
            cmx $$1 = this.a($$0.b());
            return (vf)(!$$1.b() ? vf.a("narrator.select", $$1.y()) : ve.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(ews $$0, int $$1, int $$2, cmx $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ews $$0, int $$1, int $$2) {
            $$0.a(fbv.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
