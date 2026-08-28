import javax.annotation.Nullable;

public class flj extends fky {
   private static final ali a = ali.b("widget/checkbox_selected_highlighted");
   private static final ali b = ali.b("widget/checkbox_selected");
   private static final ali c = ali.b("widget/checkbox_highlighted");
   private static final ali d = ali.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final flj.b p;
   private final fmb q;

   flj(int $$0, int $$1, int $$2, xi $$3, fks $$4, boolean $$5, flj.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fmb($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xi $$1, fks $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fks $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xi $$0, fks $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static flj.a a(xi $$0, fks $$1) {
      return new flj.a($$0, $$1);
   }

   public static int a(fks $$0) {
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
   public void a(fpf $$0) {
      $$0.a(fpe.a, this.aO_());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fpe.d, xi.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fpe.d, xi.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      fji $$4 = fji.Q();
      fks $$5 = $$4.h;
      ali $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gir::B, $$6, this.D(), this.E(), $$8, $$8, axv.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xi a;
      private final fks b;
      private int c;
      private int d = 0;
      private int e = 0;
      private flj.b f = flj.b.a;
      private boolean g = false;
      @Nullable
      private fjl<Boolean> h = null;
      @Nullable
      private fms i = null;

      a(xi $$0, fks $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = flj.b($$0, $$1);
      }

      public flj.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public flj.a a(flj.b $$0) {
         this.f = $$0;
         return this;
      }

      public flj.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public flj.a a(fjl<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public flj.a a(fms $$0) {
         this.i = $$0;
         return this;
      }

      public flj.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public flj a() {
         flj.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         flj $$1 = new flj(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      flj.b a = ($$0, $$1) -> {
      };

      void onValueChange(flj var1, boolean var2);
   }
}
