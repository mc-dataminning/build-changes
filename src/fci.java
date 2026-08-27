import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fci extends fdm {
   static final ahh b = new ahh("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fic a;
   private final Consumer<dxr> p;
   dxr q;
   private vg r;
   private vg t;
   private fci.a u;
   private exr v;

   public fci(fic $$0, Consumer<dxr> $$1, dxr $$2) {
      super(vg.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dxr n() {
      return this.q;
   }

   public void a(dxr $$0) {
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      this.r = vg.c("createWorld.customize.flat.tile");
      this.t = vg.c("createWorld.customize.flat.height");
      this.u = this.d(new fci.a());
      this.v = this.d(exr.a(vg.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<dxo> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.o();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(exr.a(vg.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fdi(this));
         this.q.g();
         this.o();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(exr.a(vf.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(exr.a(vf.e, $$0 -> {
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.q.g();
      this.o();
   }

   void o() {
      this.v.j = this.E();
   }

   private boolean E() {
      return this.u.i() != null;
   }

   @Override
   public void d() {
      this.f.a(this.a);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends eyn<fci.a.a> {
      public a() {
         super(fci.this.f, fci.this.g, fci.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < fci.this.q.e().size(); $$0++) {
            this.b(new fci.a.a());
         }
      }

      public void a(@Nullable fci.a.a $$0) {
         super.a($$0);
         fci.this.o();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < fci.this.q.e().size(); $$1++) {
            this.b(new fci.a.a());
         }

         List<fci.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends eyn.a<fci.a.a> {
         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dxo $$10 = fci.this.q.e().get(fci.this.q.e().size() - $$1 - 1);
            djp $$11 = $$10.b();
            cng $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fci.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vg $$13;
            if ($$1 == 0) {
               $$13 = vg.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fci.this.q.e().size() - 1) {
               $$13 = vg.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vg.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fci.this.i, $$13, $$3 + 2 + 213 - fci.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cng a(djp $$0) {
            cnb $$1 = $$0.b().j();
            if ($$1 == cnj.a) {
               if ($$0.a(cxa.G)) {
                  $$1 = cnj.qy;
               } else if ($$0.a(cxa.H)) {
                  $$1 = cnj.qz;
               }
            }

            return new cng($$1);
         }

         @Override
         public vg a() {
            dxo $$0 = fci.this.q.e().get(fci.this.q.e().size() - a.this.l().indexOf(this) - 1);
            cng $$1 = this.a($$0.b());
            return (vg)(!$$1.b() ? vg.a("narrator.select", $$1.y()) : vf.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(exe $$0, int $$1, int $$2, cng $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(exe $$0, int $$1, int $$2) {
            $$0.a(fci.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
