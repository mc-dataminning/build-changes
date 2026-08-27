import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exb extends eye {
   static final aez b = new aez("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fct a;
   private final Consumer<dtf> p;
   dtf q;
   private tl s;
   private tl t;
   private exb.a u;
   private esk v;

   public exb(fct $$0, Consumer<dtf> $$1, dtf $$2) {
      super(tl.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dtf k() {
      return this.q;
   }

   public void a(dtf $$0) {
      this.q = $$0;
   }

   @Override
   protected void aH_() {
      this.s = tl.c("createWorld.customize.flat.tile");
      this.t = tl.c("createWorld.customize.flat.height");
      this.u = new exb.a();
      this.e(this.u);
      this.v = this.d(esk.a(tl.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<dtc> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(esk.a(tl.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new eyb(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(esk.a(tk.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esk.a(tk.e, $$0 -> {
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.q.g();
      this.l();
   }

   void l() {
      this.v.i = this.D();
   }

   private boolean D() {
      return this.u.f() != null;
   }

   @Override
   public void az_() {
      this.f.a(this.a);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends etg<exb.a.a> {
      private static final aez m = new aez("textures/gui/container/stats_icons.png");

      public a() {
         super(exb.this.f, exb.this.g, exb.this.h, 43, exb.this.h - 60, 24);

         for (int $$0 = 0; $$0 < exb.this.q.e().size(); $$0++) {
            this.b(new exb.a.a());
         }
      }

      public void a(@Nullable exb.a.a $$0) {
         super.a($$0);
         exb.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void d() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < exb.this.q.e().size(); $$1++) {
            this.b(new exb.a.a());
         }

         List<exb.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends etg.a<exb.a.a> {
         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dtc $$10 = exb.this.q.e().get(exb.this.q.e().size() - $$1 - 1);
            dfd $$11 = $$10.b();
            cjl $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(exb.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            tl $$13;
            if ($$1 == 0) {
               $$13 = tl.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == exb.this.q.e().size() - 1) {
               $$13 = tl.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = tl.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(exb.this.i, $$13, $$3 + 2 + 213 - exb.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cjl a(dfd $$0) {
            cjg $$1 = $$0.b().k();
            if ($$1 == cjo.a) {
               if ($$0.a(cte.G)) {
                  $$1 = cjo.pL;
               } else if ($$0.a(cte.H)) {
                  $$1 = cjo.pM;
               }
            }

            return new cjl($$1);
         }

         @Override
         public tl a() {
            dtc $$0 = exb.this.q.e().get(exb.this.q.e().size() - a.this.i().indexOf(this) - 1);
            cjl $$1 = this.a($$0.b());
            return (tl)(!$$1.b() ? tl.a("narrator.select", $$1.y()) : tk.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(erz $$0, int $$1, int $$2, cjl $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(erz $$0, int $$1, int $$2) {
            $$0.a(exb.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
