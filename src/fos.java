import javax.annotation.Nullable;

public class fos extends fof {
   private static final aku a = aku.b("widget/checkbox_selected_highlighted");
   private static final aku b = aku.b("widget/checkbox_selected");
   private static final aku c = aku.b("widget/checkbox_highlighted");
   private static final aku d = aku.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fos.b p;
   private final fpk q;

   fos(int $$0, int $$1, int $$2, wo $$3, fnz $$4, boolean $$5, fos.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fpk($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wo $$1, fnz $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fnz $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wo $$0, fnz $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fos.a a(wo $$0, fnz $$1) {
      return new fos.a($$0, $$1);
   }

   public static int a(fnz $$0) {
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
   public void a(fsn $$0) {
      $$0.a(fsm.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fsm.d, wo.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fsm.d, wo.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      flh $$4 = flh.Q();
      fnz $$5 = $$4.h;
      aku $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gmf::H, $$6, this.F(), this.G(), $$8, $$8, axj.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wo a;
      private final fnz b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fos.b f = fos.b.a;
      private boolean g = false;
      @Nullable
      private flk<Boolean> h = null;
      @Nullable
      private fqb i = null;

      a(wo $$0, fnz $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fos.b($$0, $$1);
      }

      public fos.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fos.a a(fos.b $$0) {
         this.f = $$0;
         return this;
      }

      public fos.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fos.a a(flk<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fos.a a(fqb $$0) {
         this.i = $$0;
         return this;
      }

      public fos.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fos a() {
         fos.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fos $$1 = new fos(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fos.b a = ($$0, $$1) -> {
      };

      void onValueChange(fos var1, boolean var2);
   }
}
