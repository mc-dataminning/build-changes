import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fea extends ffe {
   static final aiy b = new aiy("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fju a;
   private final Consumer<dzh> p;
   dzh q;
   private vq r;
   private vq t;
   private fea.a u;
   private ezh v;

   public fea(fju $$0, Consumer<dzh> $$1, dzh $$2) {
      super(vq.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dzh n() {
      return this.q;
   }

   public void a(dzh $$0) {
      this.q = $$0;
   }

   @Override
   protected void aQ_() {
      this.r = vq.c("createWorld.customize.flat.tile");
      this.t = vq.c("createWorld.customize.flat.height");
      this.u = this.d(new fea.a());
      this.v = this.d(ezh.a(vq.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<dze> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.o();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(ezh.a(vq.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new ffa(this));
         this.q.g();
         this.o();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(ezh.a(vp.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ezh.a(vp.e, $$0 -> {
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
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends fad<fea.a.a> {
      public a() {
         super(fea.this.f, fea.this.g, fea.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < fea.this.q.e().size(); $$0++) {
            this.b(new fea.a.a());
         }
      }

      public void a(@Nullable fea.a.a $$0) {
         super.a($$0);
         fea.this.o();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < fea.this.q.e().size(); $$1++) {
            this.b(new fea.a.a());
         }

         List<fea.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fad.a<fea.a.a> {
         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dze $$10 = fea.this.q.e().get(fea.this.q.e().size() - $$1 - 1);
            dlf $$11 = $$10.b();
            coz $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fea.this.i, $$12.z(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vq $$13;
            if ($$1 == 0) {
               $$13 = vq.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fea.this.q.e().size() - 1) {
               $$13 = vq.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vq.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fea.this.i, $$13, $$3 + 2 + 213 - fea.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private coz a(dlf $$0) {
            cou $$1 = $$0.b().j();
            if ($$1 == cpc.a) {
               if ($$0.a(cyq.G)) {
                  $$1 = cpc.qy;
               } else if ($$0.a(cyq.H)) {
                  $$1 = cpc.qz;
               }
            }

            return new coz($$1);
         }

         @Override
         public vq a() {
            dze $$0 = fea.this.q.e().get(fea.this.q.e().size() - a.this.l().indexOf(this) - 1);
            coz $$1 = this.a($$0.b());
            return (vq)(!$$1.b() ? vq.a("narrator.select", $$1.z()) : vp.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(eyu $$0, int $$1, int $$2, coz $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(eyu $$0, int $$1, int $$2) {
            $$0.a(fea.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
