import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhq extends fdm {
   private static final vg a = vg.c("gui.abuseReport.reason.title");
   private static final vg b = vg.c("gui.abuseReport.reason.description");
   private static final vg c = vg.c("gui.abuseReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final fdm p;
   @Nullable
   private fhq.a q;
   @Nullable
   fpg r;
   private final Consumer<fpg> t;

   public fhq(@Nullable fdm $$0, @Nullable fpg $$1, Consumer<fpg> $$2) {
      super(a);
      this.p = $$0;
      this.r = $$1;
      this.t = $$2;
   }

   @Override
   protected void aP_() {
      this.q = this.d(new fhq.a(this.f));
      fhq.a.a $$0 = x.a(this.r, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(exr.a(c, fce.b(this, "https://aka.ms/aboutjavareporting")).a($$1, this.o(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(exr.a(vf.d, $$0x -> {
         fhq.a.a $$1x = this.q.i();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.o(), 150, 20).a());
      super.aP_();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.E(), this.I(), this.H(), this.J(), 2130706432);
      $$0.b(this.i, b, this.E() + 4, this.I() + 4, -8421505);
      fhq.a.a $$4 = this.q.i();
      if ($$4 != null) {
         int $$5 = this.E() + 4 + 16;
         int $$6 = this.H() - 4;
         int $$7 = this.I() + 4 + 9 + 2;
         int $$8 = this.J() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.i.b($$4.b.c(), $$9);
         $$0.a(this.i, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private int o() {
      return this.h - 20 - 4;
   }

   private int E() {
      return (this.g - 320) / 2;
   }

   private int H() {
      return (this.g + 320) / 2;
   }

   private int I() {
      return this.h - 95 + 4;
   }

   private int J() {
      return this.o() - 4;
   }

   @Override
   public void d() {
      this.f.a(this.p);
   }

   public class a extends eyn<fhq.a.a> {
      public a(evr $$1) {
         super($$1, fhq.this.g, fhq.this.h - 95 - 40, 40, 18);

         for (fpg $$2 : fpg.values()) {
            this.b(new fhq.a.a($$2));
         }
      }

      @Nullable
      public fhq.a.a a(fpg $$0) {
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

      public void a(@Nullable fhq.a.a $$0) {
         super.a($$0);
         fhq.this.r = $$0 != null ? $$0.b() : null;
      }

      public class a extends eyn.a<fhq.a.a> {
         final fpg b;

         public a(fpg $$1) {
            this.b = $$1;
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fhq.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public vg a() {
            return vg.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }

         public fpg b() {
            return this.b;
         }
      }
   }
}
