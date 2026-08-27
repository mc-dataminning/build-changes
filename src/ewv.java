import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewv extends exz {
   static final aer b = new aer("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fcj a;
   private final Consumer<dtc> p;
   dtc q;
   private tf s;
   private tf t;
   private ewv.a u;
   private esh v;

   public ewv(fcj $$0, Consumer<dtc> $$1, dtc $$2) {
      super(tf.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dtc k() {
      return this.q;
   }

   public void a(dtc $$0) {
      this.q = $$0;
   }

   @Override
   protected void aE_() {
      this.s = tf.c("createWorld.customize.flat.tile");
      this.t = tf.c("createWorld.customize.flat.height");
      this.u = new ewv.a();
      this.e(this.u);
      this.v = this.d(esh.a(tf.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.B()) {
            List<dsz> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(esh.a(tf.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new exw(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(esh.a(te.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esh.a(te.e, $$0 -> {
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends etd<ewv.a.a> {
      private static final aer m = new aer("textures/gui/container/stats_icons.png");

      public a() {
         super(ewv.this.f, ewv.this.g, ewv.this.h, 43, ewv.this.h - 60, 24);

         for (int $$0 = 0; $$0 < ewv.this.q.e().size(); $$0++) {
            this.b(new ewv.a.a());
         }
      }

      public void a(@Nullable ewv.a.a $$0) {
         super.a($$0);
         ewv.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void d() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < ewv.this.q.e().size(); $$1++) {
            this.b(new ewv.a.a());
         }

         List<ewv.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends etd.a<ewv.a.a> {
         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dsz $$10 = ewv.this.q.e().get(ewv.this.q.e().size() - $$1 - 1);
            dfa $$11 = $$10.b();
            ciy $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(ewv.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            tf $$13;
            if ($$1 == 0) {
               $$13 = tf.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ewv.this.q.e().size() - 1) {
               $$13 = tf.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = tf.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(ewv.this.i, $$13, $$3 + 2 + 213 - ewv.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private ciy a(dfa $$0) {
            cit $$1 = $$0.b().k();
            if ($$1 == cjb.a) {
               if ($$0.a(csn.G)) {
                  $$1 = cjb.pL;
               } else if ($$0.a(csn.H)) {
                  $$1 = cjb.pM;
               }
            }

            return new ciy($$1);
         }

         @Override
         public tf a() {
            dsz $$0 = ewv.this.q.e().get(ewv.this.q.e().size() - a.this.i().indexOf(this) - 1);
            ciy $$1 = this.a($$0.b());
            return (tf)(!$$1.b() ? tf.a("narrator.select", $$1.y()) : te.a);
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

         private void a(erw $$0, int $$1, int $$2, ciy $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(erw $$0, int $$1, int $$2) {
            $$0.a(ewv.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
