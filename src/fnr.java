import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnr extends fjo {
   private static final wg a = wg.c("gui.abuseReport.reason.title");
   private static final wg b = wg.c("gui.abuseReport.reason.description");
   private static final wg c = wg.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int o = 62;
   private static final int p = 4;
   @Nullable
   private final fjo q;
   @Nullable
   private fnr.a r;
   @Nullable
   fvn s;
   private final Consumer<fvn> u;
   final fhc v = new fhc(this);

   public fnr(@Nullable fjo $$0, @Nullable fvn $$1, Consumer<fvn> $$2) {
      super(a);
      this.q = $$0;
      this.s = $$1;
      this.u = $$2;
   }

   @Override
   protected void aN_() {
      this.v.a(a, this.m);
      fhg $$0 = this.v.c(fhg.d().a(4));
      this.r = $$0.a(new fnr.a(this.j));
      fnr.a.a $$1 = x.a(this.s, this.r::a);
      this.r.a($$1);
      $$0.a(fhh.b(this.I()));
      fhg $$2 = this.v.b(fhg.e().a(8));
      $$2.a(fdp.a(c, fif.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fdp.a(wf.d, $$0x -> {
         fnr.a.a $$1x = this.r.h();
         if ($$1x != null) {
            this.u.accept($$1x.b());
         }

         this.j.a(this.q);
      }).a());
      this.v.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      if (this.r != null) {
         this.r.b(this.k, this.J(), this.v.c());
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.I(), -1);
      $$0.b(this.m, b, this.m() + 4, this.D() + 4, -1);
      fnr.a.a $$4 = this.r.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.C() - 4;
         int $$7 = this.D() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.m.b($$4.b.c(), $$9);
         $$0.a(this.m, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.k - 320) / 2;
   }

   private int C() {
      return (this.k + 320) / 2;
   }

   private int D() {
      return this.E() - this.I();
   }

   private int E() {
      return this.l - this.v.b() - 4;
   }

   private int F() {
      return 320;
   }

   private int I() {
      return 62;
   }

   int J() {
      return this.v.d() - this.I() - 8;
   }

   @Override
   public void d() {
      this.j.a(this.q);
   }

   public class a extends fel<fnr.a.a> {
      public a(fbp $$1) {
         super($$1, fnr.this.k, fnr.this.J(), fnr.this.v.c(), 18);

         for (fvn $$2 : fvn.values()) {
            this.b(new fnr.a.a($$2));
         }
      }

      @Nullable
      public fnr.a.a a(fvn $$0) {
         return this.aF_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fnr.a.a $$0) {
         super.a($$0);
         fnr.this.s = $$0 != null ? $$0.b() : null;
      }

      public class a extends fel.a<fnr.a.a> {
         final fvn b;

         public a(fvn $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fnr.this.m, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wg a() {
            return wg.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fvn b() {
            return this.b;
         }
      }
   }
}
