import javax.annotation.Nullable;

public class fkm extends fkb {
   private static final alc a = alc.b("widget/checkbox_selected_highlighted");
   private static final alc b = alc.b("widget/checkbox_selected");
   private static final alc c = alc.b("widget/checkbox_highlighted");
   private static final alc d = alc.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fkm.b p;
   private final fle q;

   fkm(int $$0, int $$1, int $$2, xd $$3, fjv $$4, boolean $$5, fkm.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fle($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xd $$1, fjv $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fjv $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xd $$0, fjv $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fkm.a a(xd $$0, fjv $$1) {
      return new fkm.a($$0, $$1);
   }

   public static int a(fjv $$0) {
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
   public void a(foh $$0) {
      $$0.a(fog.a, this.aO_());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fog.d, xd.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fog.d, xd.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      fil $$4 = fil.Q();
      fjv $$5 = $$4.h;
      alc $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(ghq::B, $$6, this.D(), this.E(), $$8, $$8, axo.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xd a;
      private final fjv b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fkm.b f = fkm.b.a;
      private boolean g = false;
      @Nullable
      private fio<Boolean> h = null;
      @Nullable
      private flv i = null;

      a(xd $$0, fjv $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fkm.b($$0, $$1);
      }

      public fkm.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fkm.a a(fkm.b $$0) {
         this.f = $$0;
         return this;
      }

      public fkm.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fkm.a a(fio<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fkm.a a(flv $$0) {
         this.i = $$0;
         return this;
      }

      public fkm.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkm a() {
         fkm.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fkm $$1 = new fkm(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fkm.b a = ($$0, $$1) -> {
      };

      void onValueChange(fkm var1, boolean var2);
   }
}
