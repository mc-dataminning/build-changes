import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffd extends fgh {
   static final ajc b = new ajc("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fkx a;
   private final Consumer<eaj> p;
   eaj q;
   private vs r;
   private vs t;
   private ffd.a u;
   private fak v;

   public ffd(fkx $$0, Consumer<eaj> $$1, eaj $$2) {
      super(vs.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public eaj n() {
      return this.q;
   }

   public void a(eaj $$0) {
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      this.r = vs.c("createWorld.customize.flat.tile");
      this.t = vs.c("createWorld.customize.flat.height");
      this.u = this.c(new ffd.a());
      this.v = this.c(fak.a(vs.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<eag> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.o();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.c(fak.a(vs.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fgd(this));
         this.q.g();
         this.o();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.c(fak.a(vr.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fak.a(vr.e, $$0 -> {
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends fbg<ffd.a.a> {
      public a() {
         super(ffd.this.f, ffd.this.g, ffd.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < ffd.this.q.e().size(); $$0++) {
            this.b(new ffd.a.a());
         }
      }

      public void a(@Nullable ffd.a.a $$0) {
         super.a($$0);
         ffd.this.o();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < ffd.this.q.e().size(); $$1++) {
            this.b(new ffd.a.a());
         }

         List<ffd.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fbg.a<ffd.a.a> {
         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eag $$10 = ffd.this.q.e().get(ffd.this.q.e().size() - $$1 - 1);
            dme $$11 = $$10.b();
            cpq $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(ffd.this.i, $$12.z(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vs $$13;
            if ($$1 == 0) {
               $$13 = vs.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ffd.this.q.e().size() - 1) {
               $$13 = vs.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vs.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(ffd.this.i, $$13, $$3 + 2 + 213 - ffd.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cpq a(dme $$0) {
            cpl $$1 = $$0.b().l();
            if ($$1 == cpt.a) {
               if ($$0.a(czh.G)) {
                  $$1 = cpt.qy;
               } else if ($$0.a(czh.H)) {
                  $$1 = cpt.qz;
               }
            }

            return new cpq($$1);
         }

         @Override
         public vs a() {
            eag $$0 = ffd.this.q.e().get(ffd.this.q.e().size() - a.this.l().indexOf(this) - 1);
            cpq $$1 = this.a($$0.b());
            return (vs)(!$$1.b() ? vs.a("narrator.select", $$1.z()) : vr.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(ezx $$0, int $$1, int $$2, cpq $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ezx $$0, int $$1, int $$2) {
            $$0.a(ffd.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
