import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftn extends fum {
   private static final wp b = wp.c("createWorld.customize.flat.title");
   static final akv c = akv.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fsi y = new fsi(this, 33, 64);
   protected final fzl a;
   private final Consumer<elq> z;
   elq A;
   @Nullable
   private ftn.a B;
   @Nullable
   private fou C;

   public ftn(fzl $$0, Consumer<elq> $$1, elq $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public elq l() {
      return this.A;
   }

   public void a(elq $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aR_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new ftn.a());
      fsm $$0 = this.y.b(fsm.d().a(4));
      $$0.c().e();
      fsm $$1 = $$0.a(fsm.e().a(8));
      fsm $$2 = $$0.a(fsm.e().a(8));
      this.C = $$1.a(fou.a(wp.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eln> $$1x = this.A.e();
            int $$2x = this.B.aH_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aH_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fou.a(wp.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fui(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fou.a(wo.d, $$0x -> {
         this.z.accept(this.A);
         this.aO_();
         this.A.g();
      }).a());
      $$2.a(fou.a(wo.e, $$0x -> {
         this.aO_();
         this.A.g();
      }).a());
      this.A.g();
      this.m();
      this.y.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.a(this.n, this.y);
      }

      this.y.a();
   }

   void m() {
      if (this.C != null) {
         this.C.j = this.E();
      }
   }

   private boolean E() {
      return this.B != null && this.B.p() != null;
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   class a extends fpq<ftn.a.a> {
      private static final wp m = wp.c("createWorld.customize.flat.tile").a(n.t);
      private static final wp n = wp.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(ftn.this.m, ftn.this.n, ftn.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < ftn.this.A.e().size(); $$0++) {
            this.b(new ftn.a.a());
         }
      }

      public void a(@Nullable ftn.a.a $$0) {
         super.a($$0);
         ftn.this.m();
      }

      public void b() {
         int $$0 = this.aH_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < ftn.this.A.e().size(); $$1++) {
            this.b(new ftn.a.a());
         }

         List<ftn.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fof $$0, int $$1, int $$2) {
         $$0.b(ftn.this.p, m, $$1, $$2, -1);
         $$0.b(ftn.this.p, n, $$1 + this.a() - ftn.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fpq.a<ftn.a.a> {
         @Override
         public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eln $$10 = ftn.this.A.e().get(ftn.this.A.e().size() - $$1 - 1);
            dwy $$11 = $$10.b();
            cwq $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(ftn.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wp $$14;
            if ($$1 == 0) {
               $$14 = wp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ftn.this.A.e().size() - 1) {
               $$14 = wp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(ftn.this.p, $$14, $$3 + $$4 - ftn.this.p.a($$14) - 8, $$13, -1);
         }

         private cwq a(dwy $$0) {
            cwm $$1 = $$0.b().j();
            if ($$1 == cwu.a) {
               if ($$0.a(djp.J)) {
                  $$1 = cwu.rg;
               } else if ($$0.a(djp.K)) {
                  $$1 = cwu.rh;
               }
            }

            return new cwq($$1);
         }

         @Override
         public wp a() {
            eln $$0 = ftn.this.A.e().get(ftn.this.A.e().size() - a.this.aH_().indexOf(this) - 1);
            cwq $$1 = this.a($$0.b());
            return (wp)(!$$1.f() ? wp.a("narrator.select", $$1.y()) : wo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fof $$0, int $$1, int $$2, cwq $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fof $$0, int $$1, int $$2) {
            $$0.a(gmj::H, ftn.c, $$1, $$2, 18, 18);
         }
      }
   }
}
