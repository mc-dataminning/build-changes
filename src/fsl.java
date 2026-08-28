import javax.annotation.Nullable;

public class fsl extends frz {
   private static final alg a = alg.b("widget/checkbox_selected_highlighted");
   private static final alg b = alg.b("widget/checkbox_selected");
   private static final alg c = alg.b("widget/checkbox_highlighted");
   private static final alg d = alg.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fsl.b p;
   private final ftd q;

   fsl(int $$0, int $$1, int $$2, wy $$3, frt $$4, boolean $$5, fsl.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new ftd($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wy $$1, frt $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(frt $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wy $$0, frt $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fsl.a a(wy $$0, frt $$1) {
      return new fsl.a($$0, $$1);
   }

   public static int a(frt $$0) {
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
   public void a(fwg $$0) {
      $$0.a(fwf.a, this.d());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fwf.d, wy.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fwf.d, wy.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(frv $$0, int $$1, int $$2, float $$3) {
      foz $$4 = foz.Q();
      frt $$5 = $$4.h;
      alg $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gqk::H, $$6, this.F(), this.G(), $$8, $$8, axw.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wy a;
      private final frt b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fsl.b f = fsl.b.a;
      private boolean g = false;
      @Nullable
      private fpc<Boolean> h = null;
      @Nullable
      private ftu i = null;

      a(wy $$0, frt $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fsl.b($$0, $$1);
      }

      public fsl.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fsl.a a(fsl.b $$0) {
         this.f = $$0;
         return this;
      }

      public fsl.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fsl.a a(fpc<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fsl.a a(ftu $$0) {
         this.i = $$0;
         return this;
      }

      public fsl.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fsl a() {
         fsl.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fsl $$1 = new fsl(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fsl.b a = ($$0, $$1) -> {
      };

      void onValueChange(fsl var1, boolean var2);
   }
}
