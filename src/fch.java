import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fch extends eye {
   private static final tl a = tl.c("gui.abuseReport.reason.title");
   private static final tl b = tl.c("gui.abuseReport.reason.description");
   private static final tl c = tl.c("gui.abuseReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final eye p;
   @Nullable
   private fch.a q;
   @Nullable
   fjt s;
   private final Consumer<fjt> t;

   public fch(@Nullable eye $$0, @Nullable fjt $$1, Consumer<fjt> $$2) {
      super(a);
      this.p = $$0;
      this.s = $$1;
      this.t = $$2;
   }

   @Override
   protected void aH_() {
      this.q = new fch.a(this.f);
      this.e(this.q);
      fch.a.a $$0 = x.a(this.s, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(esk.a(c, $$0x -> this.f.a(new ewx($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/aboutjavareporting");
            }

            this.f.a(this);
         }, "https://aka.ms/aboutjavareporting", true))).a($$1, this.l(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(esk.a(tk.d, $$0x -> {
         fch.a.a $$1x = this.q.f();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.l(), 150, 20).a());
      super.aH_();
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.D(), this.F(), this.E(), this.G(), 2130706432);
      $$0.b(this.i, b, this.D() + 4, this.F() + 4, -8421505);
      fch.a.a $$4 = this.q.f();
      if ($$4 != null) {
         int $$5 = this.D() + 4 + 16;
         int $$6 = this.E() - 4;
         int $$7 = this.F() + 4 + 9 + 2;
         int $$8 = this.G() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.i.b($$4.b.c(), $$9);
         $$0.a(this.i, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private int l() {
      return this.h - 20 - 4;
   }

   private int D() {
      return (this.g - 320) / 2;
   }

   private int E() {
      return (this.g + 320) / 2;
   }

   private int F() {
      return this.h - 95 + 4;
   }

   private int G() {
      return this.l() - 4;
   }

   @Override
   public void az_() {
      this.f.a(this.p);
   }

   public class a extends etg<fch.a.a> {
      public a(eqp $$1) {
         super($$1, fch.this.g, fch.this.h, 40, fch.this.h - 95, 18);

         for (fjt $$2 : fjt.values()) {
            this.b(new fch.a.a($$2));
         }
      }

      @Nullable
      public fch.a.a a(fjt $$0) {
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

      public void a(@Nullable fch.a.a $$0) {
         super.a($$0);
         fch.this.s = $$0 != null ? $$0.b() : null;
      }

      public class a extends etg.a<fch.a.a> {
         final fjt b;

         public a(fjt $$1) {
            this.b = $$1;
         }

         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fch.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public tl a() {
            return tl.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         public fjt b() {
            return this.b;
         }
      }
   }
}
