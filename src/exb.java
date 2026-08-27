import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exb extends eyf {
   static final aeu b = new aeu("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fct a;
   private final Consumer<dtg> p;
   dtg q;
   private ti s;
   private ti t;
   private exb.a u;
   private esl v;

   public exb(fct $$0, Consumer<dtg> $$1, dtg $$2) {
      super(ti.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dtg k() {
      return this.q;
   }

   public void a(dtg $$0) {
      this.q = $$0;
   }

   @Override
   protected void aD_() {
      this.s = ti.c("createWorld.customize.flat.tile");
      this.t = ti.c("createWorld.customize.flat.height");
      this.u = new exb.a();
      this.e(this.u);
      this.v = this.d(esl.a(ti.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dtd> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(esl.a(ti.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new eyc(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(esl.a(th.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esl.a(th.e, $$0 -> {
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
   public void au_() {
      this.f.a(this.a);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends eth<exb.a.a> {
      private static final aeu m = new aeu("textures/gui/container/stats_icons.png");

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

      class a extends eth.a<exb.a.a> {
         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dtd $$10 = exb.this.q.e().get(exb.this.q.e().size() - $$1 - 1);
            dfe $$11 = $$10.b();
            cja $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(exb.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            ti $$13;
            if ($$1 == 0) {
               $$13 = ti.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == exb.this.q.e().size() - 1) {
               $$13 = ti.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = ti.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(exb.this.i, $$13, $$3 + 2 + 213 - exb.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cja a(dfe $$0) {
            civ $$1 = $$0.b().k();
            if ($$1 == cjd.a) {
               if ($$0.a(csr.G)) {
                  $$1 = cjd.pL;
               } else if ($$0.a(csr.H)) {
                  $$1 = cjd.pM;
               }
            }

            return new cja($$1);
         }

         @Override
         public ti a() {
            dtd $$0 = exb.this.q.e().get(exb.this.q.e().size() - a.this.i().indexOf(this) - 1);
            cja $$1 = this.a($$0.b());
            return (ti)(!$$1.b() ? ti.a("narrator.select", $$1.y()) : th.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(esa $$0, int $$1, int $$2, cja $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(esa $$0, int $$1, int $$2) {
            $$0.a(exb.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
