import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fay extends fcc {
   static final agt b = new agt("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fgs a;
   private final Consumer<dwr> p;
   dwr q;
   private vb r;
   private vb t;
   private fay.a u;
   private ewh v;

   public fay(fgs $$0, Consumer<dwr> $$1, dwr $$2) {
      super(vb.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dwr k() {
      return this.q;
   }

   public void a(dwr $$0) {
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      this.r = vb.c("createWorld.customize.flat.tile");
      this.t = vb.c("createWorld.customize.flat.height");
      this.u = new fay.a();
      this.e(this.u);
      this.v = this.d(ewh.a(vb.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dwo> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.e();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(ewh.a(vb.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fby(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(ewh.a(va.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ewh.a(va.e, $$0 -> {
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.q.g();
      this.l();
   }

   void l() {
      this.v.i = this.C();
   }

   private boolean C() {
      return this.u.f() != null;
   }

   @Override
   public void aF_() {
      this.f.a(this.a);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends exd<fay.a.a> {
      private static final agt m = new agt("textures/gui/container/stats_icons.png");

      public a() {
         super(fay.this.f, fay.this.g, fay.this.h, 43, fay.this.h - 60, 24);

         for (int $$0 = 0; $$0 < fay.this.q.e().size(); $$0++) {
            this.b(new fay.a.a());
         }
      }

      public void a(@Nullable fay.a.a $$0) {
         super.a($$0);
         fay.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void e() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < fay.this.q.e().size(); $$1++) {
            this.b(new fay.a.a());
         }

         List<fay.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends exd.a<fay.a.a> {
         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dwo $$10 = fay.this.q.e().get(fay.this.q.e().size() - $$1 - 1);
            dip $$11 = $$10.b();
            cmh $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fay.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vb $$13;
            if ($$1 == 0) {
               $$13 = vb.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fay.this.q.e().size() - 1) {
               $$13 = vb.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vb.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fay.this.i, $$13, $$3 + 2 + 213 - fay.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cmh a(dip $$0) {
            cmc $$1 = $$0.b().k();
            if ($$1 == cmk.a) {
               if ($$0.a(cwb.G)) {
                  $$1 = cmk.qw;
               } else if ($$0.a(cwb.H)) {
                  $$1 = cmk.qx;
               }
            }

            return new cmh($$1);
         }

         @Override
         public vb a() {
            dwo $$0 = fay.this.q.e().get(fay.this.q.e().size() - a.this.i().indexOf(this) - 1);
            cmh $$1 = this.a($$0.b());
            return (vb)(!$$1.b() ? vb.a("narrator.select", $$1.y()) : va.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(evw $$0, int $$1, int $$2, cmh $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(evw $$0, int $$1, int $$2) {
            $$0.a(fay.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
