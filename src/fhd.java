import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhd extends fcz {
   private static final vf a = vf.c("gui.abuseReport.reason.title");
   private static final vf b = vf.c("gui.abuseReport.reason.description");
   private static final vf c = vf.c("gui.abuseReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final fcz p;
   @Nullable
   private fhd.a q;
   @Nullable
   fos r;
   private final Consumer<fos> t;

   public fhd(@Nullable fcz $$0, @Nullable fos $$1, Consumer<fos> $$2) {
      super(a);
      this.p = $$0;
      this.r = $$1;
      this.t = $$2;
   }

   @Override
   protected void aN_() {
      this.q = this.d(new fhd.a(this.f));
      fhd.a.a $$0 = x.a(this.r, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(exe.a(c, fbr.b(this, "https://aka.ms/aboutjavareporting")).a($$1, this.n(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(exe.a(ve.d, $$0x -> {
         fhd.a.a $$1x = this.q.i();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.n(), 150, 20).a());
      super.aN_();
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.C(), this.E(), this.D(), this.H(), 2130706432);
      $$0.b(this.i, b, this.C() + 4, this.E() + 4, -8421505);
      fhd.a.a $$4 = this.q.i();
      if ($$4 != null) {
         int $$5 = this.C() + 4 + 16;
         int $$6 = this.D() - 4;
         int $$7 = this.E() + 4 + 9 + 2;
         int $$8 = this.H() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.i.b($$4.b.c(), $$9);
         $$0.a(this.i, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private int n() {
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

   private int H() {
      return this.n() - 4;
   }

   @Override
   public void aE_() {
      this.f.a(this.p);
   }

   public class a extends eya<fhd.a.a> {
      public a(evg $$1) {
         super($$1, fhd.this.g, fhd.this.h - 95 - 40, 40, 18);

         for (fos $$2 : fos.values()) {
            this.b(new fhd.a.a($$2));
         }
      }

      @Nullable
      public fhd.a.a a(fos $$0) {
         return this.l().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      @Override
      protected int c() {
         return this.r() - 2;
      }

      public void a(@Nullable fhd.a.a $$0) {
         super.a($$0);
         fhd.this.r = $$0 != null ? $$0.b() : null;
      }

      public class a extends eya.a<fhd.a.a> {
         final fos b;

         public a(fos $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fhd.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public vf a() {
            return vf.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         public fos b() {
            return this.b;
         }
      }
   }
}
