import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmm extends fnl {
   static final akk b = new akk("container/slot");
   private static final int c = 18;
   private static final int q = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fsi a;
   private final Consumer<eha> w;
   eha x;
   private wu y;
   private wu z;
   private fmm.a A;
   private fhu B;

   public fmm(fsi $$0, Consumer<eha> $$1, eha $$2) {
      super(wu.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public eha l() {
      return this.x;
   }

   public void a(eha $$0) {
      this.x = $$0;
   }

   @Override
   protected void aP_() {
      this.y = wu.c("createWorld.customize.flat.tile");
      this.z = wu.c("createWorld.customize.flat.height");
      this.A = this.c(new fmm.a());
      this.B = this.c(fhu.a(wu.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<egx> $$1 = this.x.e();
            int $$2 = this.A.aG_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aG_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.c();
            this.m();
         }
      }).a(this.m / 2 - 155, this.n - 52, 150, 20).a());
      this.c(fhu.a(wu.c("createWorld.customize.presets"), $$0 -> {
         this.l.a(new fnh(this));
         this.x.g();
         this.m();
      }).a(this.m / 2 + 5, this.n - 52, 150, 20).a());
      this.c(fhu.a(wt.d, $$0 -> {
         this.w.accept(this.x);
         this.l.a(this.a);
         this.x.g();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fhu.a(wt.e, $$0 -> {
         this.l.a(this.a);
         this.x.g();
      }).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.D();
   }

   private boolean D() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
      int $$4 = this.m / 2 - 92 - 16;
      $$0.b(this.o, this.y, $$4, 32, 16777215);
      $$0.b(this.o, this.z, $$4 + 2 + 213 - this.o.a(this.z), 32, 16777215);
   }

   class a extends fiq<fmm.a.a> {
      public a() {
         super(fmm.this.l, fmm.this.m, fmm.this.n - 103, 43, 24);

         for (int $$0 = 0; $$0 < fmm.this.x.e().size(); $$0++) {
            this.b(new fmm.a.a());
         }
      }

      public void a(@Nullable fmm.a.a $$0) {
         super.a($$0);
         fmm.this.m();
      }

      public void c() {
         int $$0 = this.aG_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fmm.this.x.e().size(); $$1++) {
            this.b(new fmm.a.a());
         }

         List<fmm.a.a> $$2 = this.aG_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fiq.a<fmm.a.a> {
         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            egx $$10 = fmm.this.x.e().get(fmm.this.x.e().size() - $$1 - 1);
            dsl $$11 = $$10.b();
            cud $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fmm.this.o, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wu $$13;
            if ($$1 == 0) {
               $$13 = wu.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fmm.this.x.e().size() - 1) {
               $$13 = wu.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wu.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fmm.this.o, $$13, $$3 + 2 + 213 - fmm.this.o.a($$13), $$2 + 3, 16777215, false);
         }

         private cud a(dsl $$0) {
            cty $$1 = $$0.b().r();
            if ($$1 == cug.a) {
               if ($$0.a(dfk.G)) {
                  $$1 = cug.qz;
               } else if ($$0.a(dfk.H)) {
                  $$1 = cug.qA;
               }
            }

            return new cud($$1);
         }

         @Override
         public wu a() {
            egx $$0 = fmm.this.x.e().get(fmm.this.x.e().size() - a.this.aG_().indexOf(this) - 1);
            cud $$1 = this.a($$0.b());
            return (wu)(!$$1.e() ? wu.a("narrator.select", $$1.w()) : wt.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fhh $$0, int $$1, int $$2, cud $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fhh $$0, int $$1, int $$2) {
            $$0.a(fmm.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
