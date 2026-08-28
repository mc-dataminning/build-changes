import javax.annotation.Nullable;

public class fsx extends fsl {
   private static final alg a = alg.b("widget/checkbox_selected_highlighted");
   private static final alg b = alg.b("widget/checkbox_selected");
   private static final alg c = alg.b("widget/checkbox_highlighted");
   private static final alg d = alg.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fsx.b p;
   private final ftp q;

   fsx(int $$0, int $$1, int $$2, wy $$3, fsf $$4, boolean $$5, fsx.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new ftp($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wy $$1, fsf $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fsf $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wy $$0, fsf $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fsx.a a(wy $$0, fsf $$1) {
      return new fsx.a($$0, $$1);
   }

   public static int a(fsf $$0) {
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
   public void a(fws $$0) {
      $$0.a(fwr.a, this.d());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fwr.d, wy.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fwr.d, wy.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      fpo $$4 = fpo.Q();
      fsf $$5 = $$4.h;
      alg $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gqx::H, $$6, this.F(), this.G(), $$8, $$8, axw.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wy a;
      private final fsf b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fsx.b f = fsx.b.a;
      private boolean g = false;
      @Nullable
      private fpr<Boolean> h = null;
      @Nullable
      private fug i = null;

      a(wy $$0, fsf $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fsx.b($$0, $$1);
      }

      public fsx.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fsx.a a(fsx.b $$0) {
         this.f = $$0;
         return this;
      }

      public fsx.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fsx.a a(fpr<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fsx.a a(fug $$0) {
         this.i = $$0;
         return this;
      }

      public fsx.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsx a() {
         fsx.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fsx $$1 = new fsx(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fsx.b a = ($$0, $$1) -> {
      };

      void onValueChange(fsx var1, boolean var2);
   }
}
