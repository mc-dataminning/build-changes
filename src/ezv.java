import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezv extends faz {
   static final agm b = new agm("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final ffp a;
   private final Consumer<dvp> p;
   dvp q;
   private uv r;
   private uv t;
   private ezv.a u;
   private eve v;

   public ezv(ffp $$0, Consumer<dvp> $$1, dvp $$2) {
      super(uv.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dvp k() {
      return this.q;
   }

   public void a(dvp $$0) {
      this.q = $$0;
   }

   @Override
   protected void aQ_() {
      this.r = uv.c("createWorld.customize.flat.tile");
      this.t = uv.c("createWorld.customize.flat.height");
      this.u = new ezv.a();
      this.e(this.u);
      this.v = this.d(eve.a(uv.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dvm> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.e();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(eve.a(uv.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new fav(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(eve.a(uu.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(eve.a(uu.e, $$0 -> {
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
   public void aG_() {
      this.f.a(this.a);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.r, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends ewa<ezv.a.a> {
      private static final agm m = new agm("textures/gui/container/stats_icons.png");

      public a() {
         super(ezv.this.f, ezv.this.g, ezv.this.h, 43, ezv.this.h - 60, 24);

         for (int $$0 = 0; $$0 < ezv.this.q.e().size(); $$0++) {
            this.b(new ezv.a.a());
         }
      }

      public void a(@Nullable ezv.a.a $$0) {
         super.a($$0);
         ezv.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void e() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < ezv.this.q.e().size(); $$1++) {
            this.b(new ezv.a.a());
         }

         List<ezv.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends ewa.a<ezv.a.a> {
         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dvm $$10 = ezv.this.q.e().get(ezv.this.q.e().size() - $$1 - 1);
            dhn $$11 = $$10.b();
            clo $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(ezv.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            uv $$13;
            if ($$1 == 0) {
               $$13 = uv.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == ezv.this.q.e().size() - 1) {
               $$13 = uv.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = uv.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(ezv.this.i, $$13, $$3 + 2 + 213 - ezv.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private clo a(dhn $$0) {
            clj $$1 = $$0.b().k();
            if ($$1 == clr.a) {
               if ($$0.a(cvh.G)) {
                  $$1 = clr.qw;
               } else if ($$0.a(cvh.H)) {
                  $$1 = clr.qx;
               }
            }

            return new clo($$1);
         }

         @Override
         public uv a() {
            dvm $$0 = ezv.this.q.e().get(ezv.this.q.e().size() - a.this.i().indexOf(this) - 1);
            clo $$1 = this.a($$0.b());
            return (uv)(!$$1.b() ? uv.a("narrator.select", $$1.y()) : uu.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(eut $$0, int $$1, int $$2, clo $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(eut $$0, int $$1, int $$2) {
            $$0.a(ezv.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
