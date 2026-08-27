import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqc extends fly {
   private static final wx a = wx.c("gui.abuseReport.reason.title");
   private static final wx b = wx.c("gui.abuseReport.reason.description");
   private static final wx c = wx.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fly u;
   @Nullable
   private fqc.a v;
   @Nullable
   fxx w;
   private final Consumer<fxx> x;
   final fjm y = new fjm(this);

   public fqc(@Nullable fly $$0, @Nullable fxx $$1, Consumer<fxx> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aM_() {
      this.y.a(a, this.p);
      fjq $$0 = this.y.c(fjq.d().a(4));
      this.v = $$0.a(new fqc.a(this.m));
      fqc.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fjr.b(this.I()));
      fjq $$2 = this.y.b(fjq.e().a(8));
      $$2.a(ffz.a(c, fkp.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(ffz.a(ww.d, $$0x -> {
         fqc.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.m.a(this.u);
      }).a());
      this.y.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.n, this.J(), this.y.c());
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.D() + 4, -1);
      fqc.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.C() - 4;
         int $$7 = this.D() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int C() {
      return (this.n + 320) / 2;
   }

   private int D() {
      return this.E() - this.I();
   }

   private int E() {
      return this.o - this.y.b() - 4;
   }

   private int F() {
      return 320;
   }

   private int I() {
      return 62;
   }

   int J() {
      return this.y.d() - this.I() - 8;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }

   public class a extends fgv<fqc.a.a> {
      public a(fdz $$1) {
         super($$1, fqc.this.n, fqc.this.J(), fqc.this.y.c(), 18);

         for (fxx $$2 : fxx.values()) {
            this.b(new fqc.a.a($$2));
         }
      }

      @Nullable
      public fqc.a.a a(fxx $$0) {
         return this.aE_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fqc.a.a $$0) {
         super.a($$0);
         fqc.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fgv.a<fqc.a.a> {
         final fxx b;

         public a(fxx $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fqc.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wx a() {
            return wx.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fxx b() {
            return this.b;
         }
      }
   }
}
