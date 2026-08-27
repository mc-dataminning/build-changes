import java.util.function.Consumer;
import javax.annotation.Nullable;

public class foa extends fjx {
   private static final wi a = wi.c("gui.abuseReport.reason.title");
   private static final wi b = wi.c("gui.abuseReport.reason.description");
   private static final wi c = wi.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int o = 62;
   private static final int p = 4;
   @Nullable
   private final fjx q;
   @Nullable
   private foa.a r;
   @Nullable
   fvw s;
   private final Consumer<fvw> u;
   final fhl v = new fhl(this);

   public foa(@Nullable fjx $$0, @Nullable fvw $$1, Consumer<fvw> $$2) {
      super(a);
      this.q = $$0;
      this.s = $$1;
      this.u = $$2;
   }

   @Override
   protected void aM_() {
      this.v.a(a, this.m);
      fhp $$0 = this.v.c(fhp.d().a(4));
      this.r = $$0.a(new foa.a(this.j));
      foa.a.a $$1 = x.a(this.s, this.r::a);
      this.r.a($$1);
      $$0.a(fhq.b(this.I()));
      fhp $$2 = this.v.b(fhp.e().a(8));
      $$2.a(fdy.a(c, fio.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fdy.a(wh.d, $$0x -> {
         foa.a.a $$1x = this.r.h();
         if ($$1x != null) {
            this.u.accept($$1x.b());
         }

         this.j.a(this.q);
      }).a());
      this.v.a($$1x -> {
         fdw var10000 = this.c($$1x);
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.I(), -1);
      $$0.b(this.m, b, this.m() + 4, this.D() + 4, -1);
      foa.a.a $$4 = this.r.h();
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

   public class a extends feu<foa.a.a> {
      public a(fby $$1) {
         super($$1, foa.this.k, foa.this.J(), foa.this.v.c(), 18);

         for (fvw $$2 : fvw.values()) {
            this.b(new foa.a.a($$2));
         }
      }

      @Nullable
      public foa.a.a a(fvw $$0) {
         return this.aE_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable foa.a.a $$0) {
         super.a($$0);
         foa.this.s = $$0 != null ? $$0.b() : null;
      }

      public class a extends feu.a<foa.a.a> {
         final fvw b;

         public a(fvw $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(foa.this.m, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wi a() {
            return wi.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fvw b() {
            return this.b;
         }
      }
   }
}
