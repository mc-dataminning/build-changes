import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eya extends ezd {
   static final afw b = new afw("container/slot");
   private static final int c = 18;
   private static final int k = 20;
   private static final int l = 1;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 2;
   protected final fds a;
   private final Consumer<dud> p;
   dud q;
   private ui s;
   private ui t;
   private eya.a u;
   private etj v;

   public eya(fds $$0, Consumer<dud> $$1, dud $$2) {
      super(ui.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.p = $$1;
      this.q = $$2;
   }

   public dud k() {
      return this.q;
   }

   public void a(dud $$0) {
      this.q = $$0;
   }

   @Override
   protected void aM_() {
      this.s = ui.c("createWorld.customize.flat.tile");
      this.t = ui.c("createWorld.customize.flat.height");
      this.u = new eya.a();
      this.e(this.u);
      this.v = this.d(etj.a(ui.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<dua> $$1 = this.q.e();
            int $$2 = this.u.i().indexOf(this.u.f());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.u.a($$1.isEmpty() ? null : this.u.i().get(Math.min($$2, $$1.size() - 1)));
            this.q.g();
            this.u.e();
            this.l();
         }
      }).a(this.g / 2 - 155, this.h - 52, 150, 20).a());
      this.d(etj.a(ui.c("createWorld.customize.presets"), $$0 -> {
         this.f.a(new eza(this));
         this.q.g();
         this.l();
      }).a(this.g / 2 + 5, this.h - 52, 150, 20).a());
      this.d(etj.a(uh.d, $$0 -> {
         this.p.accept(this.q);
         this.f.a(this.a);
         this.q.g();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(etj.a(uh.e, $$0 -> {
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
   public void aC_() {
      this.f.a(this.a);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      int $$4 = this.g / 2 - 92 - 16;
      $$0.b(this.i, this.s, $$4, 32, 16777215);
      $$0.b(this.i, this.t, $$4 + 2 + 213 - this.i.a(this.t), 32, 16777215);
   }

   class a extends euf<eya.a.a> {
      private static final afw m = new afw("textures/gui/container/stats_icons.png");

      public a() {
         super(eya.this.f, eya.this.g, eya.this.h, 43, eya.this.h - 60, 24);

         for (int $$0 = 0; $$0 < eya.this.q.e().size(); $$0++) {
            this.b(new eya.a.a());
         }
      }

      public void a(@Nullable eya.a.a $$0) {
         super.a($$0);
         eya.this.l();
      }

      @Override
      protected int c() {
         return this.e - 70;
      }

      public void e() {
         int $$0 = this.i().indexOf(this.f());
         this.j();

         for (int $$1 = 0; $$1 < eya.this.q.e().size(); $$1++) {
            this.b(new eya.a.a());
         }

         List<eya.a.a> $$2 = this.i();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends euf.a<eya.a.a> {
         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            dua $$10 = eya.this.q.e().get(eya.this.q.e().size() - $$1 - 1);
            dgb $$11 = $$10.b();
            ckj $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(eya.this.i, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            ui $$13;
            if ($$1 == 0) {
               $$13 = ui.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == eya.this.q.e().size() - 1) {
               $$13 = ui.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = ui.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(eya.this.i, $$13, $$3 + 2 + 213 - eya.this.i.a($$13), $$2 + 3, 16777215, false);
         }

         private ckj a(dgb $$0) {
            cke $$1 = $$0.b().k();
            if ($$1 == ckm.a) {
               if ($$0.a(cuc.G)) {
                  $$1 = ckm.pL;
               } else if ($$0.a(cuc.H)) {
                  $$1 = ckm.pM;
               }
            }

            return new ckj($$1);
         }

         @Override
         public ui a() {
            dua $$0 = eya.this.q.e().get(eya.this.q.e().size() - a.this.i().indexOf(this) - 1);
            ckj $$1 = this.a($$0.b());
            return (ui)(!$$1.b() ? ui.a("narrator.select", $$1.y()) : uh.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         private void a(esy $$0, int $$1, int $$2, ckj $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.b()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(esy $$0, int $$1, int $$2) {
            $$0.a(eya.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
