import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezq extends fau {
   static final agi b = new agi("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final ffk a;
   private final Consumer<dvk> p;
   dvk q;
   private ur r;
   private ur t;
   private ezq.a u;
   private euz v;

   public ezq(ffk $$0, Consumer<dvk> $$1, dvk $$2) {
      super(ur.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dvk k() {
      return this.q;
   }

   public void a(dvk $$0) {
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      this.r = ur.c("createWorld.customize.flat.tile");
      this.t = ur.c("createWorld.customize.flat.height");
      this.u = new ezq.a();
      this.e(this.u);
      this.v = this.d(euz.a(ur.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dvh> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.e();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(euz.a(ur.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new faq(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(euz.a(uq.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(euz.a(uq.e, $$0 -> {
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
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends evv<ezq.a.a> {
      private static final agi m = new agi("textures/gui/container/stats_icons.png");

      public a() {
         super(ezq.this.f, ezq.this.g, ezq.this.h, 43, ezq.this.h - 60, 24);

         for (int $$0 = 0; $$0 < ezq.this.q.e().size(); $$0++) {
            this.b(new ezq.a.a());
         }
      }

      public void a(@Nullable ezq.a.a $$0) {
         super.a($$0);
         ezq.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void e() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < ezq.this.q.e().size(); $$1++) {
            this.b(new ezq.a.a());
         }

         List<ezq.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends evv.a<ezq.a.a> {
         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dvh $$10 = ezq.this.q.e().get(ezq.this.q.e().size() - $$1 - 1);
            dhi $$11 = $$10.b();
            clj $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(ezq.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            ur $$13;
            if ($$1 == 0) {
               $$13 = ur.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ezq.this.q.e().size() - 1) {
               $$13 = ur.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = ur.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(ezq.this.i, $$13, $$3 + 2 + 213 - ezq.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private clj a(dhi $$0) {
            cle $$1 = $$0.b().k();
            if ($$1 == clm.a) {
               if ($$0.a(cvc.G)) {
                  $$1 = clm.qw;
               } else if ($$0.a(cvc.H)) {
                  $$1 = clm.qx;
               }
            }

            return new clj($$1);
         }

         @Override
         public ur a() {
            dvh $$0 = ezq.this.q.e().get(ezq.this.q.e().size() - a.this.i().indexOf(this) - 1);
            clj $$1 = this.a($$0.b());
            return (ur)(!$$1.b() ? ur.a("narrator.select", $$1.y()) : uq.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(euo $$0, int $$1, int $$2, clj $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(euo $$0, int $$1, int $$2) {
            $$0.a(ezq.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
