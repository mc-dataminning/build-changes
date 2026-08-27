import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnh extends fon {
   static final akt b = new akt("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fth a;
   private final Consumer<ehv> w;
   ehv x;
   private xe y;
   private xe z;
   private fnh.a A;
   private fin B;

   public fnh(fth $$0, Consumer<ehv> $$1, ehv $$2) {
      super(xe.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public ehv l() {
      return this.x;
   }

   public void a(ehv $$0) {
      this.x = $$0;
   }

   @Override
   protected void aN_() {
      this.y = xe.c("createWorld.customize.flat.tile");
      this.z = xe.c("createWorld.customize.flat.height");
      this.A = this.c(new fnh.a());
      this.B = this.c(fin.a(xe.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<ehs> $$1 = this.x.e();
            int $$2 = this.A.aE_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.B();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fin.a(xe.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new foj(this));
         this.x.g();
         this.B();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fin.a(xd.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fin.a(xd.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.B();
   }

   void B() {
      this.B.j = this.C();
   }

   private boolean C() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fjj<fnh.a.a> {
      public a() {
         super(fnh.this.m, fnh.this.n, fnh.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fnh.this.x.e().size(); $$0++) {
            this.b(new fnh.a.a());
         }
      }

      public void a(@Nullable fnh.a.a $$0) {
         super.a($$0);
         fnh.this.B();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fnh.this.x.e().size(); $$1++) {
            this.b(new fnh.a.a());
         }

         List<fnh.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fjj.a<fnh.a.a> {
         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ehs $$10 = fnh.this.x.e().get(fnh.this.x.e().size() - $$1 - 1);
            dtc $$11 = $$10.b();
            cuh $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fnh.this.p, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xe $$13;
            if ($$1 == 0) {
               $$13 = xe.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fnh.this.x.e().size() - 1) {
               $$13 = xe.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xe.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fnh.this.p, $$13, $$3 + 2 + 213 - fnh.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cuh a(dtc $$0) {
            cuc $$1 = $$0.b().q();
            if ($$1 == cuk.a) {
               if ($$0.a(dfe.al)) {
                  $$1 = cuk.rW;
               } else if ($$0.a(dfe.am)) {
                  $$1 = cuk.rX;
               }
            }

            return new cuh($$1);
         }

         @Override
         public xe a() {
            ehs $$0 = fnh.this.x.e().get(fnh.this.x.e().size() - a.this.aE_().indexOf(this) - 1);
            cuh $$1 = this.a($$0.b());
            return (xe)(!$$1.d() ? xe.a("narrator.select", $$1.w()) : xd.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fia $$0, int $$1, int $$2, cuh $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.d()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fia $$0, int $$1, int $$2) {
            $$0.a(fnh.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
