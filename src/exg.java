import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exg extends eyk {
   static final aex b = new aex("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fcy a;
   private final Consumer<dtl> p;
   dtl q;
   private tl s;
   private tl t;
   private exg.a u;
   private esq v;

   public exg(fcy $$0, Consumer<dtl> $$1, dtl $$2) {
      super(tl.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dtl k() {
      return this.q;
   }

   public void a(dtl $$0) {
      this.q = $$0;
   }

   @Override
   protected void aI_() {
      this.s = tl.c("createWorld.customize.flat.tile");
      this.t = tl.c("createWorld.customize.flat.height");
      this.u = new exg.a();
      this.e(this.u);
      this.v = this.d(esq.a(tl.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dti> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(esq.a(tl.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new eyh(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(esq.a(tk.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esq.a(tk.e, $$0 -> {
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
   public void az_() {
      this.f.a(this.a);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends etm<exg.a.a> {
      private static final aex m = new aex("textures/gui/container/stats_icons.png");

      public a() {
         super(exg.this.f, exg.this.g, exg.this.h, 43, exg.this.h - 60, 24);

         for (int $$0 = 0; $$0 < exg.this.q.e().size(); $$0++) {
            this.b(new exg.a.a());
         }
      }

      public void a(@Nullable exg.a.a $$0) {
         super.a($$0);
         exg.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void d() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < exg.this.q.e().size(); $$1++) {
            this.b(new exg.a.a());
         }

         List<exg.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends etm.a<exg.a.a> {
         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dti $$10 = exg.this.q.e().get(exg.this.q.e().size() - $$1 - 1);
            dfj $$11 = $$10.b();
            cjf $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(exg.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            tl $$13;
            if ($$1 == 0) {
               $$13 = tl.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == exg.this.q.e().size() - 1) {
               $$13 = tl.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = tl.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(exg.this.i, $$13, $$3 + 2 + 213 - exg.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cjf a(dfj $$0) {
            cja $$1 = $$0.b().k();
            if ($$1 == cji.a) {
               if ($$0.a(csw.G)) {
                  $$1 = cji.pL;
               } else if ($$0.a(csw.H)) {
                  $$1 = cji.pM;
               }
            }

            return new cjf($$1);
         }

         @Override
         public tl a() {
            dti $$0 = exg.this.q.e().get(exg.this.q.e().size() - a.this.i().indexOf(this) - 1);
            cjf $$1 = this.a($$0.b());
            return (tl)(!$$1.b() ? tl.a("narrator.select", $$1.y()) : tk.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(esf $$0, int $$1, int $$2, cjf $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(esf $$0, int $$1, int $$2) {
            $$0.a(exg.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
