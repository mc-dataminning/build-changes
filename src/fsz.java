import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsz extends fty {
   static final alz b = alz.b("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final fyx a;
   private final Consumer<emn> x;
   emn y;
   private xv z;
   private xv A;
   private fsz.a B;
   private fof C;

   public fsz(fyx $$0, Consumer<emn> $$1, emn $$2) {
      super(xv.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public emn k() {
      return this.y;
   }

   public void a(emn $$0) {
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      this.z = xv.c("createWorld.customize.flat.tile");
      this.A = xv.c("createWorld.customize.flat.height");
      this.B = this.c(new fsz.a());
      this.C = this.c(fof.a(xv.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<emk> $$1 = this.y.e();
            int $$2 = this.B.aI_().indexOf(this.B.g());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aI_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.b();
            this.l();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fof.a(xv.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new ftu(this));
         this.y.g();
         this.l();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fof.a(xu.d, $$0 -> {
         this.x.accept(this.y);
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fof.a(xu.e, $$0 -> {
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.y.g();
      this.l();
   }

   void l() {
      this.C.j = this.E();
   }

   private boolean E() {
      return this.B.g() != null;
   }

   @Override
   public void aP_() {
      this.m.a(this.a);
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.z, $$4, 32, 16777215);
      $$0.b(this.p, this.A, $$4 + 2 + 213 - this.p.a(this.A), 32, 16777215);
   }

   class a extends fpc<fsz.a.a> {
      public a() {
         super(fsz.this.m, fsz.this.n, fsz.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fsz.this.y.e().size(); $$0++) {
            this.b(new fsz.a.a());
         }
      }

      public void a(@Nullable fsz.a.a $$0) {
         super.a($$0);
         fsz.this.l();
      }

      public void b() {
         int $$0 = this.aI_().indexOf(this.g());
         this.j();

         for (int $$1 = 0; $$1 < fsz.this.y.e().size(); $$1++) {
            this.b(new fsz.a.a());
         }

         List<fsz.a.a> $$2 = this.aI_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fpc.a<fsz.a.a> {
         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            emk $$10 = fsz.this.y.e().get(fsz.this.y.e().size() - $$1 - 1);
            dxv $$11 = $$10.b();
            cxp $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fsz.this.p, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xv $$13;
            if ($$1 == 0) {
               $$13 = xv.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fsz.this.y.e().size() - 1) {
               $$13 = xv.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xv.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fsz.this.p, $$13, $$3 + 2 + 213 - fsz.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cxp a(dxv $$0) {
            cxl $$1 = $$0.b().j();
            if ($$1 == cxt.a) {
               if ($$0.a(dko.J)) {
                  $$1 = cxt.qX;
               } else if ($$0.a(dko.K)) {
                  $$1 = cxt.qY;
               }
            }

            return new cxp($$1);
         }

         @Override
         public xv a() {
            emk $$0 = fsz.this.y.e().get(fsz.this.y.e().size() - a.this.aI_().indexOf(this) - 1);
            cxp $$1 = this.a($$0.b());
            return (xv)(!$$1.f() ? xv.a("narrator.select", $$1.y()) : xu.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fns $$0, int $$1, int $$2, cxp $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fns $$0, int $$1, int $$2) {
            $$0.a(glv::C, fsz.b, $$1, $$2, 18, 18);
         }
      }
   }
}
