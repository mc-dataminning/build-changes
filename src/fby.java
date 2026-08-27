import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fby extends exz {
   private static final tf a = tf.c("gui.abuseReport.reason.title");
   private static final tf b = tf.c("gui.abuseReport.reason.description");
   private static final tf c = tf.c("gui.chatReport.read_info");
   private static final int k = 95;
   private static final int l = 150;
   private static final int m = 20;
   private static final int n = 320;
   private static final int o = 4;
   @Nullable
   private final exz p;
   @Nullable
   private fby.a q;
   @Nullable
   fjg s;
   private final Consumer<fjg> t;

   public fby(@Nullable exz $$0, @Nullable fjg $$1, Consumer<fjg> $$2) {
      super(a);
      this.p = $$0;
      this.s = $$1;
      this.t = $$2;
   }

   @Override
   protected void aE_() {
      this.q = new fby.a(this.f);
      this.e(this.q);
      fby.a.a $$0 = x.a(this.s, this.q::a);
      this.q.a($$0);
      int $$1 = this.g / 2 - 150 - 5;
      this.d(esh.a(c, $$0x -> this.f.a(new ewr($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/aboutjavareporting");
            }

            this.f.a(this);
         }, "https://aka.ms/aboutjavareporting", true))).a($$1, this.l(), 150, 20).a());
      int $$2 = this.g / 2 + 5;
      this.d(esh.a(te.d, $$0x -> {
         fby.a.a $$1x = this.q.f();
         if ($$1x != null) {
            this.t.accept($$1x.b());
         }

         this.f.a(this.p);
      }).a($$2, this.l(), 150, 20).a());
      super.aE_();
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.q.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 16, 16777215);
      $$0.a(this.B(), this.D(), this.C(), this.E(), 2130706432);
      $$0.b(this.i, b, this.B() + 4, this.D() + 4, -8421505);
      fby.a.a $$4 = this.q.f();
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

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
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
   public void au_() {
      this.f.a(this.p);
   }

   public class a extends etd<fby.a.a> {
      public a(eqm $$1) {
         super($$1, fby.this.g, fby.this.h, 40, fby.this.h - 95, 18);

         for (fjg $$2 : fjg.values()) {
            this.b(new fby.a.a($$2));
         }
      }

      @Nullable
      public fby.a.a a(fjg $$0) {
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

      public void a(@Nullable fby.a.a $$0) {
         super.a($$0);
         fby.this.s = $$0 != null ? $$0.b() : null;
      }

      public class a extends etd.a<fby.a.a> {
         final fjg b;

         public a(fjg $$1) {
            this.b = $$1;
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fby.this.i, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public tf a() {
            return tf.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
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

         public fjg b() {
            return this.b;
         }
      }
   }
}
