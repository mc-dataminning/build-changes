import javax.annotation.Nullable;

public class foa extends fnp {
   private static final alp a = alp.b("widget/checkbox_selected_highlighted");
   private static final alp b = alp.b("widget/checkbox_selected");
   private static final alp c = alp.b("widget/checkbox_highlighted");
   private static final alp d = alp.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final foa.b p;
   private final fot q;

   foa(int $$0, int $$1, int $$2, xk $$3, fnj $$4, boolean $$5, foa.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fot($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xk $$1, fnj $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fnj $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xk $$0, fnj $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static foa.a a(xk $$0, fnj $$1) {
      return new foa.a($$0, $$1);
   }

   public static int a(fnj $$0) {
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
   public void a(frw $$0) {
      $$0.a(frv.a, this.aR_());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(frv.d, xk.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(frv.d, xk.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      flz $$4 = flz.Q();
      fnj $$5 = $$4.h;
      alp $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(glq::H, $$6, this.D(), this.E(), $$8, $$8, ayf.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xk a;
      private final fnj b;
      private int c;
      private int d = 0;
      private int e = 0;
      private foa.b f = foa.b.a;
      private boolean g = false;
      @Nullable
      private fmc<Boolean> h = null;
      @Nullable
      private fpk i = null;

      a(xk $$0, fnj $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = foa.b($$0, $$1);
      }

      public foa.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public foa.a a(foa.b $$0) {
         this.f = $$0;
         return this;
      }

      public foa.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public foa.a a(fmc<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public foa.a a(fpk $$0) {
         this.i = $$0;
         return this;
      }

      public foa.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public foa a() {
         foa.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         foa $$1 = new foa(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      foa.b a = ($$0, $$1) -> {
      };

      void onValueChange(foa var1, boolean var2);
   }
}
