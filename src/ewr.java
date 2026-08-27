import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewr extends exv {
   static final aep b = new aep("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fcf a;
   private final Consumer<dta> p;
   dta q;
   private te s;
   private te t;
   private ewr.a u;
   private esi v;

   public ewr(fcf $$0, Consumer<dta> $$1, dta $$2) {
      super(te.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dta k() {
      return this.q;
   }

   public void a(dta $$0) {
      this.q = $$0;
   }

   @Override
   protected void aE_() {
      this.s = te.c("createWorld.customize.flat.tile");
      this.t = te.c("createWorld.customize.flat.height");
      this.u = new ewr.a();
      this.e(this.u);
      this.v = this.d(esi.a(te.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.B()) {
            List<dsx> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(esi.a(te.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new exs(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(esi.a(td.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esi.a(td.e, $$0 -> {
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.q.g();
      this.l();
   }

   void l() {
      this.v.i = this.B();
   }

   private boolean B() {
      return this.u.f() != null;
   }

   @Override
   public void au_() {
      this.f.a(this.a);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends ete<ewr.a.a> {
      private static final aep l = new aep("textures/gui/container/stats_icons.png");

      public a() {
         super(ewr.this.f, ewr.this.g, ewr.this.h, 43, ewr.this.h - 60, 24);

         for (int $$0 = 0; $$0 < ewr.this.q.e().size(); $$0++) {
            this.b(new ewr.a.a());
         }
      }

      public void a(@Nullable ewr.a.a $$0) {
         super.a($$0);
         ewr.this.l();
      }

      @Override
      protected int c() {
         return this.d - 70;
      }

      public void d() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < ewr.this.q.e().size(); $$1++) {
            this.b(new ewr.a.a());
         }

         List<ewr.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends ete.a<ewr.a.a> {
         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dsx $$10 = ewr.this.q.e().get(ewr.this.q.e().size() - $$1 - 1);
            dey $$11 = $$10.b();
            ciw $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(ewr.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            te $$13;
            if ($$1 == 0) {
               $$13 = te.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ewr.this.q.e().size() - 1) {
               $$13 = te.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = te.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(ewr.this.i, $$13, $$3 + 2 + 213 - ewr.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private ciw a(dey $$0) {
            cir $$1 = $$0.b().k();
            if ($$1 == ciz.a) {
               if ($$0.a(csl.G)) {
                  $$1 = ciz.pL;
               } else if ($$0.a(csl.H)) {
                  $$1 = ciz.pM;
               }
            }

            return new ciw($$1);
         }

         @Override
         public te a() {
            dsx $$0 = ewr.this.q.e().get(ewr.this.q.e().size() - a.this.i().indexOf(this) - 1);
            ciw $$1 = this.a($$0.b());
            return (te)(!$$1.b() ? te.a("narrator.select", $$1.y()) : td.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               a.this.a(this);
               return true;
            } else {
               return false;
            }
         }

         private void a(erx $$0, int $$1, int $$2, ciw $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(erx $$0, int $$1, int $$2) {
            $$0.a(ewr.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
