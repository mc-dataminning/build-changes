import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fcm extends eyk {
   private static final tl a = tl.c("gui.abuseReport.reason.title");
   private static final tl b = tl.c("gui.abuseReport.reason.description");
   private static final tl c = tl.c("gui.abuseReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final eyk p;
   @Nullable
   private fcm.a q;
   @Nullable
   fjx s;
   private final Consumer<fjx> t;

   public fcm(@Nullable eyk $$0, @Nullable fjx $$1, Consumer<fjx> $$2) {
      super(a);
      this.p = $$0;
      this.s = $$1;
      this.t = $$2;
   }

   @Override
   protected void aH_() {
      this.q = new fcm.a(this.f);
      this.e(this.q);
      fcm.a.a $$0 = x.a(this.s, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(esq.a(c, $$0x -> this.f.a(new exc($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/aboutjavareporting");
            }

            this.f.a(this);
         }, "https://aka.ms/aboutjavareporting", true))).a($$1, this.l(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(esq.a(tk.d, $$0x -> {
         fcm.a.a $$1x = this.q.f();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.l(), 150, 20).a());
      super.aH_();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.D(), this.F(), this.E(), this.G(), 2130706432);
      $$0.b(this.i, b, this.D() + 4, this.F() + 4, -8421505);
      fcm.a.a $$4 = this.q.f();
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
   public void b(esf $$0, int $$1, int $$2, float $$3) {
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

   public class a extends etm<fcm.a.a> {
      public a(eqv $$1) {
         super($$1, fcm.this.g, fcm.this.h, 40, fcm.this.h - 95, 18);

         for (fjx $$2 : fjx.values()) {
            this.b(new fcm.a.a($$2));
         }
      }

      @Nullable
      public fcm.a.a a(fjx $$0) {
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

      public void a(@Nullable fcm.a.a $$0) {
         super.a($$0);
         fcm.this.s = $$0 != null ? $$0.b() : null;
      }

      public class a extends etm.a<fcm.a.a> {
         final fjx b;

         public a(fjx $$1) {
            this.b = $$1;
         }

         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fcm.this.i, this.b.b(), $$10, $$11, -1);
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

         public fjx b() {
            return this.b;
         }
      }
   }
}
