import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fel extends fah {
   private static final ur a = ur.c("gui.abuseReport.reason.title");
   private static final ur b = ur.c("gui.abuseReport.reason.description");
   private static final ur c = ur.c("gui.abuseReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final fah p;
   @Nullable
   private fel.a q;
   @Nullable
   flx r;
   private final Consumer<flx> t;

   public fel(@Nullable fah $$0, @Nullable flx $$1, Consumer<flx> $$2) {
      super(a);
      this.p = $$0;
      this.r = $$1;
      this.t = $$2;
   }

   @Override
   protected void aO_() {
      this.q = new fel.a(this.f);
      this.e(this.q);
      fel.a.a $$0 = x.a(this.r, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(eum.a(c, eyz.b(this, "https://aka.ms/aboutjavareporting")).a($$1, this.l(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(eum.a(uq.d, $$0x -> {
         fel.a.a $$1x = this.q.f();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.l(), 150, 20).a());
      super.aO_();
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.C(), this.E(), this.D(), this.F(), 2130706432);
      $$0.b(this.i, b, this.C() + 4, this.E() + 4, -8421505);
      fel.a.a $$4 = this.q.f();
      if ($$4 != null) {
         int $$5 = this.C() + 4 + 16;
         int $$6 = this.D() - 4;
         int $$7 = this.E() + 4 + 9 + 2;
         int $$8 = this.F() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.i.b($$4.b.c(), $$9);
         $$0.a(this.i, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private int l() {
      return this.h - 20 - 4;
   }

   private int C() {
      return (this.g - 320) / 2;
   }

   private int D() {
      return (this.g + 320) / 2;
   }

   private int E() {
      return this.h - 95 + 4;
   }

   private int F() {
      return this.l() - 4;
   }

   @Override
   public void aE_() {
      this.f.a(this.p);
   }

   public class a extends evi<fel.a.a> {
      public a(esr $$1) {
         super($$1, fel.this.g, fel.this.h, 40, fel.this.h - 95, 18);

         for (flx $$2 : flx.values()) {
            this.b(new fel.a.a($$2));
         }
      }

      @Nullable
      public fel.a.a a(flx $$0) {
         return this.i().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      @Override
      protected int c() {
         return this.p() - 2;
      }

      public void a(@Nullable fel.a.a $$0) {
         super.a($$0);
         fel.this.r = $$0 != null ? $$0.b() : null;
      }

      public class a extends evi.a<fel.a.a> {
         final flx b;

         public a(flx $$1) {
            this.b = $$1;
         }

         @Override
         public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fel.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public ur a() {
            return ur.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         public flx b() {
            return this.b;
         }
      }
   }
}
