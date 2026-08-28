import javax.annotation.Nullable;

public class flb extends fkq {
   private static final alh a = alh.b("widget/checkbox_selected_highlighted");
   private static final alh b = alh.b("widget/checkbox_selected");
   private static final alh c = alh.b("widget/checkbox_highlighted");
   private static final alh d = alh.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final flb.b p;
   private final flt q;

   flb(int $$0, int $$1, int $$2, xh $$3, fkk $$4, boolean $$5, flb.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new flt($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xh $$1, fkk $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fkk $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xh $$0, fkk $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static flb.a a(xh $$0, fkk $$1) {
      return new flb.a($$0, $$1);
   }

   public static int a(fkk $$0) {
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
   public void a(fox $$0) {
      $$0.a(fow.a, this.aP_());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fow.d, xh.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fow.d, xh.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      fja $$4 = fja.Q();
      fkk $$5 = $$4.h;
      alh $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gig::B, $$6, this.D(), this.E(), $$8, $$8, axu.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xh a;
      private final fkk b;
      private int c;
      private int d = 0;
      private int e = 0;
      private flb.b f = flb.b.a;
      private boolean g = false;
      @Nullable
      private fjd<Boolean> h = null;
      @Nullable
      private fmk i = null;

      a(xh $$0, fkk $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = flb.b($$0, $$1);
      }

      public flb.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public flb.a a(flb.b $$0) {
         this.f = $$0;
         return this;
      }

      public flb.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public flb.a a(fjd<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public flb.a a(fmk $$0) {
         this.i = $$0;
         return this;
      }

      public flb.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public flb a() {
         flb.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         flb $$1 = new flb(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      flb.b a = ($$0, $$1) -> {
      };

      void onValueChange(flb var1, boolean var2);
   }
}
