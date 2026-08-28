import javax.annotation.Nullable;

public class fog extends fnv {
   private static final alz a = alz.b("widget/checkbox_selected_highlighted");
   private static final alz b = alz.b("widget/checkbox_selected");
   private static final alz c = alz.b("widget/checkbox_highlighted");
   private static final alz d = alz.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fog.b p;
   private final foz q;

   fog(int $$0, int $$1, int $$2, xv $$3, fnp $$4, boolean $$5, fog.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new foz($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xv $$1, fnp $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fnp $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xv $$0, fnp $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fog.a a(xv $$0, fnp $$1) {
      return new fog.a($$0, $$1);
   }

   public static int a(fnp $$0) {
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
   public void a(fsc $$0) {
      $$0.a(fsb.a, this.aR_());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fsb.d, xv.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fsb.d, xv.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
      fmf $$4 = fmf.Q();
      fnp $$5 = $$4.h;
      alz $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(glu::C, $$6, this.D(), this.E(), $$8, $$8, ayp.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xv a;
      private final fnp b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fog.b f = fog.b.a;
      private boolean g = false;
      @Nullable
      private fmi<Boolean> h = null;
      @Nullable
      private fpq i = null;

      a(xv $$0, fnp $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fog.b($$0, $$1);
      }

      public fog.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fog.a a(fog.b $$0) {
         this.f = $$0;
         return this;
      }

      public fog.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fog.a a(fmi<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fog.a a(fpq $$0) {
         this.i = $$0;
         return this;
      }

      public fog.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fog a() {
         fog.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fog $$1 = new fog(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fog.b a = ($$0, $$1) -> {
      };

      void onValueChange(fog var1, boolean var2);
   }
}
