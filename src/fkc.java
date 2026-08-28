import javax.annotation.Nullable;

public class fkc extends fjr {
   private static final alb a = alb.b("widget/checkbox_selected_highlighted");
   private static final alb b = alb.b("widget/checkbox_selected");
   private static final alb c = alb.b("widget/checkbox_highlighted");
   private static final alb d = alb.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fkc.b p;
   private final fku q;

   fkc(int $$0, int $$1, int $$2, xd $$3, fjl $$4, boolean $$5, fkc.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fku($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xd $$1, fjl $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fjl $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xd $$0, fjl $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fkc.a a(xd $$0, fjl $$1) {
      return new fkc.a($$0, $$1);
   }

   public static int a(fjl $$0) {
      return 9 + 8;
   }

   @Override
   public void b() {
      this.o = !this.o;
      this.p.onValueChange(this, this.o);
   }

   public boolean a() {
      return this.o;
   }

   @Override
   public void a(fnx $$0) {
      $$0.a(fnw.a, this.aQ_());
      if (this.j) {
         if (this.aO_()) {
            $$0.a(fnw.d, xd.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fnw.d, xd.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      fib $$4 = fib.Q();
      fjl $$5 = $$4.h;
      alb $$6;
      if (this.o) {
         $$6 = this.aO_() ? a : b;
      } else {
         $$6 = this.aO_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(ghe::C, $$6, this.D(), this.E(), $$8, $$8, axn.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xd a;
      private final fjl b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fkc.b f = fkc.b.a;
      private boolean g = false;
      @Nullable
      private fie<Boolean> h = null;
      @Nullable
      private fll i = null;

      a(xd $$0, fjl $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fkc.b($$0, $$1);
      }

      public fkc.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fkc.a a(fkc.b $$0) {
         this.f = $$0;
         return this;
      }

      public fkc.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fkc.a a(fie<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fkc.a a(fll $$0) {
         this.i = $$0;
         return this;
      }

      public fkc.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkc a() {
         fkc.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fkc $$1 = new fkc(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fkc.b a = ($$0, $$1) -> {
      };

      void onValueChange(fkc var1, boolean var2);
   }
}
