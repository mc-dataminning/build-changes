import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fgc extends fhh {
   static final ajh b = new ajh("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final flx a;
   private final Consumer<ebh> p;
   ebh q;
   private vu r;
   private vu t;
   private fgc.a u;
   private fbi v;

   public fgc(flx $$0, Consumer<ebh> $$1, ebh $$2) {
      super(vu.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public ebh n() {
      return this.q;
   }

   public void a(ebh $$0) {
      this.q = $$0;
   }

   @Override
   protected void aO_() {
      this.r = vu.c("createWorld.customize.flat.tile");
      this.t = vu.c("createWorld.customize.flat.height");
      this.u = this.c(new fgc.a());
      this.v = this.c(fbi.a(vu.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<ebe> $$1 = this.q.e();
            int $$2 = this.u.l().indexOf(this.u.i());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.l().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.d();
            this.o();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.c(fbi.a(vu.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fhd(this));
         this.q.g();
         this.o();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.c(fbi.a(vt.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fbi.a(vt.e, $$0 -> {
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends fce<fgc.a.a> {
      public a() {
         super(fgc.this.f, fgc.this.g, fgc.this.h - 103, 43, 24);

         for (int $$0 = 0; $$0 < fgc.this.q.e().size(); $$0++) {
            this.b(new fgc.a.a());
         }
      }

      public void a(@Nullable fgc.a.a $$0) {
         super.a($$0);
         fgc.this.o();
      }

      @Override
      protected int c() {
         return this.g - 70;
      }

      public void d() {
         int $$0 = this.l().indexOf(this.i());
         this.m();

         for (int $$1 = 0; $$1 < fgc.this.q.e().size(); $$1++) {
            this.b(new fgc.a.a());
         }

         List<fgc.a.a> $$2 = this.l();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fce.a<fgc.a.a> {
         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ebe $$10 = fgc.this.q.e().get(fgc.this.q.e().size() - $$1 - 1);
            dnb $$11 = $$10.b();
            cqm $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fgc.this.i, $$12.z(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            vu $$13;
            if ($$1 == 0) {
               $$13 = vu.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fgc.this.q.e().size() - 1) {
               $$13 = vu.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = vu.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fgc.this.i, $$13, $$3 + 2 + 213 - fgc.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private cqm a(dnb $$0) {
            cqh $$1 = $$0.b().l();
            if ($$1 == cqp.a) {
               if ($$0.a(dae.G)) {
                  $$1 = cqp.qy;
               } else if ($$0.a(dae.H)) {
                  $$1 = cqp.qz;
               }
            }

            return new cqm($$1);
         }

         @Override
         public vu a() {
            ebe $$0 = fgc.this.q.e().get(fgc.this.q.e().size() - a.this.l().indexOf(this) - 1);
            cqm $$1 = this.a($$0.b());
            return (vu)(!$$1.b() ? vu.a("narrator.select", $$1.z()) : vt.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(fav $$0, int $$1, int $$2, cqm $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fav $$0, int $$1, int $$2) {
            $$0.a(fgc.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
