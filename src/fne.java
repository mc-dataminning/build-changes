import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fne extends fod {
   static final akr b = akr.b("container/slot");
   private static final int c = 18;
   private static final int r = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final ftc a;
   private final Consumer<eht> x;
   eht y;
   private wz z;
   private wz A;
   private fne.a B;
   private fim C;

   public fne(ftc $$0, Consumer<eht> $$1, eht $$2) {
      super(wz.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public eht l() {
      return this.y;
   }

   public void a(eht $$0) {
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      this.z = wz.c("createWorld.customize.flat.tile");
      this.A = wz.c("createWorld.customize.flat.height");
      this.B = this.c(new fne.a());
      this.C = this.c(fim.a(wz.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<ehq> $$1 = this.y.e();
            int $$2 = this.B.aK_().indexOf(this.B.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aK_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.c();
            this.m();
         }
      }).a(this.m / 2 - 155, this.n - 52, 150, 20).a());
      this.c(fim.a(wz.c("createWorld.customize.presets"), $$0 -> {
         this.l.a(new fnz(this));
         this.y.g();
         this.m();
      }).a(this.m / 2 + 5, this.n - 52, 150, 20).a());
      this.c(fim.a(wy.d, $$0 -> {
         this.x.accept(this.y);
         this.l.a(this.a);
         this.y.g();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a());
      this.c(fim.a(wy.e, $$0 -> {
         this.l.a(this.a);
         this.y.g();
      }).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
      this.y.g();
      this.m();
   }

   void m() {
      this.C.j = this.C();
   }

   private boolean C() {
      return this.B.h() != null;
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
      int $$4 = this.m / 2 - 92 - 16;
      $$0.b(this.o, this.z, $$4, 32, 16777215);
      $$0.b(this.o, this.A, $$4 + 2 + 213 - this.o.a(this.A), 32, 16777215);
   }

   class a extends fji<fne.a.a> {
      public a() {
         super(fne.this.l, fne.this.m, fne.this.n - 103, 43, 24);

         for (int $$0 = 0; $$0 < fne.this.y.e().size(); $$0++) {
            this.b(new fne.a.a());
         }
      }

      public void a(@Nullable fne.a.a $$0) {
         super.a($$0);
         fne.this.m();
      }

      public void c() {
         int $$0 = this.aK_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fne.this.y.e().size(); $$1++) {
            this.b(new fne.a.a());
         }

         List<fne.a.a> $$2 = this.aK_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fji.a<fne.a.a> {
         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ehq $$10 = fne.this.y.e().get(fne.this.y.e().size() - $$1 - 1);
            dtc $$11 = $$10.b();
            cuq $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fne.this.o, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wz $$13;
            if ($$1 == 0) {
               $$13 = wz.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fne.this.y.e().size() - 1) {
               $$13 = wz.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wz.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fne.this.o, $$13, $$3 + 2 + 213 - fne.this.o.a($$13), $$2 + 3, 16777215, false);
         }

         private cuq a(dtc $$0) {
            cul $$1 = $$0.b().r();
            if ($$1 == cut.a) {
               if ($$0.a(dga.G)) {
                  $$1 = cut.qz;
               } else if ($$0.a(dga.H)) {
                  $$1 = cut.qA;
               }
            }

            return new cuq($$1);
         }

         @Override
         public wz a() {
            ehq $$0 = fne.this.y.e().get(fne.this.y.e().size() - a.this.aK_().indexOf(this) - 1);
            cuq $$1 = this.a($$0.b());
            return (wz)(!$$1.e() ? wz.a("narrator.select", $$1.w()) : wy.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fhz $$0, int $$1, int $$2, cuq $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fhz $$0, int $$1, int $$2) {
            $$0.a(fne.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
