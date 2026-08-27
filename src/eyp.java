import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyp extends euq {
   private static final sw a = sw.c("gui.abuseReport.reason.title");
   private static final sw b = sw.c("gui.abuseReport.reason.description");
   private static final sw c = sw.c("gui.chatReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final euq p;
   @Nullable
   private eyp.a q;
   @Nullable
   ffr r;
   private final Consumer<ffr> s;

   public eyp(@Nullable euq $$0, @Nullable ffr $$1, Consumer<ffr> $$2) {
      super(a);
      this.p = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   @Override
   protected void b() {
      this.q = new eyp.a(this.f);
      this.q.b(false);
      this.e(this.q);
      eyp.a.a $$0 = x.a(this.r, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(epi.a(c, $$0x -> this.f.a(new etj($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/aboutjavareporting");
            }

            this.f.a(this);
         }, "https://aka.ms/aboutjavareporting", true))).a($$1, this.l(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(epi.a(sv.d, $$0x -> {
         eyp.a.a $$1x = this.q.f();
         if ($$1x != null) {
            this.s.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.l(), 150, 20).a());
      super.b();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.B(), this.D(), this.C(), this.E(), 2130706432);
      $$0.b(this.i, b, this.B() + 4, this.D() + 4, -8421505);
      eyp.a.a $$4 = this.q.f();
      if ($$4 != null) {
         int $$5 = this.B() + 4 + 16;
         int $$6 = this.C() - 4;
         int $$7 = this.D() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.i.b($$4.b.c(), $$9);
         $$0.a(this.i, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int l() {
      return this.h - 20 - 4;
   }

   private int B() {
      return (this.g - 320) / 2;
   }

   private int C() {
      return (this.g + 320) / 2;
   }

   private int D() {
      return this.h - 95 + 4;
   }

   private int E() {
      return this.l() - 4;
   }

   @Override
   public void aw_() {
      this.f.a(this.p);
   }

   public class a extends eqc<eyp.a.a> {
      public a(enn $$1) {
         super($$1, eyp.this.g, eyp.this.h, 40, eyp.this.h - 95, 18);

         for (ffr $$2 : ffr.values()) {
            this.b(new eyp.a.a($$2));
         }
      }

      @Nullable
      public eyp.a.a a(ffr $$0) {
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

      public void a(@Nullable eyp.a.a $$0) {
         super.a($$0);
         eyp.this.r = $$0 != null ? $$0.b() : null;
      }

      public class a extends eqc.a<eyp.a.a> {
         final ffr b;

         public a(ffr $$1) {
            this.b = $$1;
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(eyp.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public sw a() {
            return sw.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               a.this.a(this);
               return true;
            } else {
               return false;
            }
         }

         public ffr b() {
            return this.b;
         }
      }
   }
}
