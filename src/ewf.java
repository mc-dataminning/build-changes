import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class ewf implements exk, eyc, ezt, ezy {
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int f;
   protected int g;
   private int c;
   private int d;
   private vb e;
   protected boolean h;
   public boolean i = true;
   public boolean j = true;
   protected float k = 1.0F;
   private int l;
   private boolean m;
   @Nullable
   private exs n;

   public ewf(int $$0, int $$1, int $$2, int $$3, vb $$4) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = $$3;
      this.e = $$4;
   }

   @Override
   public int i() {
      return this.g;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      if (this.j) {
         this.h = $$1 >= this.p() && $$2 >= this.r() && $$1 < this.p() + this.f && $$2 < this.r() + this.g;
         this.b($$0, $$1, $$2, $$3);
         if (this.n != null) {
            this.n.a(this.m(), this.aJ_(), this.s());
         }
      }
   }

   public void a(@Nullable exs $$0) {
      this.n = $$0;
   }

   @Nullable
   public exs j() {
      return this.n;
   }

   public void b(int $$0) {
      if (this.n != null) {
         this.n.a($$0);
      }
   }

   protected vp aM_() {
      return a(this.l());
   }

   public static vp a(vb $$0) {
      return vb.a("gui.narrate.button", $$0);
   }

   protected abstract void b(evw var1, int var2, int var3, float var4);

   protected static void a(evw $$0, evu $$1, vb $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      a($$0, $$1, $$2, ($$3 + $$5) / 2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static void a(evw $$0, evu $$1, vb $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      int $$9 = $$1.a($$2);
      int $$10 = ($$5 + $$7 - 9) / 2 + 1;
      int $$11 = $$6 - $$4;
      if ($$9 > $$11) {
         int $$12 = $$9 - $$11;
         double $$13 = (double)ac.b() / 1000.0;
         double $$14 = Math.max((double)$$12 * 0.5, 3.0);
         double $$15 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$13 / $$14)) / 2.0 + 0.5;
         double $$16 = aty.d($$15, 0.0, (double)$$12);
         $$0.c($$4, $$5, $$6, $$7);
         $$0.b($$1, $$2, $$4 - (int)$$16, $$10, $$8);
         $$0.f();
      } else {
         int $$17 = aty.a($$3, $$4 + $$9 / 2, $$6 - $$9 / 2);
         $$0.a($$1, $$2, $$17, $$10, $$8);
      }
   }

   protected void a(evw $$0, evu $$1, int $$2, int $$3) {
      int $$4 = this.p() + $$2;
      int $$5 = this.p() + this.k() - $$2;
      a($$0, $$1, this.l(), $$4, this.r(), $$5, this.r() + this.i(), $$3);
   }

   public void a(double $$0, double $$1) {
   }

   public void c(double $$0, double $$1) {
   }

   protected void b(double $$0, double $$1, double $$2, double $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.i && this.j) {
         if (this.c($$2)) {
            boolean $$3 = this.d($$0, $$1);
            if ($$3) {
               this.a(euk.N().ah());
               this.a($$0, $$1);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.c($$2)) {
         this.c($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected boolean c(int $$0) {
      return $$0 == 0;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (this.c($$2)) {
         this.b($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean d(double $$0, double $$1) {
      return this.i
         && this.j
         && $$0 >= (double)this.p()
         && $$1 >= (double)this.r()
         && $$0 < (double)(this.p() + this.k())
         && $$1 < (double)(this.r() + this.i());
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      if (!this.i || !this.j) {
         return null;
      } else {
         return !this.aJ_() ? evt.a(this) : null;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.i && this.j && $$0 >= (double)this.p() && $$1 >= (double)this.r() && $$0 < (double)(this.p() + this.f) && $$1 < (double)(this.r() + this.g);
   }

   public void a(gia $$0) {
      $$0.a(ggr.a(arc.zu, 1.0F));
   }

   @Override
   public int k() {
      return this.f;
   }

   public void d(int $$0) {
      this.f = $$0;
   }

   public void e(int $$0) {
      this.g = $$0;
   }

   public void a(float $$0) {
      this.k = $$0;
   }

   public void b(vb $$0) {
      this.e = $$0;
   }

   public vb l() {
      return this.e;
   }

   @Override
   public boolean aJ_() {
      return this.m;
   }

   public boolean m() {
      return this.h;
   }

   public boolean n() {
      return this.m() || this.aJ_();
   }

   @Override
   public boolean aL_() {
      return this.j && this.i;
   }

   @Override
   public void a(boolean $$0) {
      this.m = $$0;
   }

   @Override
   public ezy.a q() {
      if (this.aJ_()) {
         return ezy.a.c;
      } else {
         return this.h ? ezy.a.b : ezy.a.a;
      }
   }

   @Override
   public final void b(faa $$0) {
      this.a($$0);
      if (this.n != null) {
         this.n.b($$0);
      }
   }

   protected abstract void a(faa var1);

   protected void c(faa $$0) {
      $$0.a(ezz.a, this.aM_());
      if (this.i) {
         if (this.aJ_()) {
            $$0.a(ezz.d, vb.c("narration.button.usage.focused"));
         } else {
            $$0.a(ezz.d, vb.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int p() {
      return this.c;
   }

   @Override
   public void f(int $$0) {
      this.c = $$0;
   }

   @Override
   public int r() {
      return this.d;
   }

   @Override
   public void g(int $$0) {
      this.d = $$0;
   }

   @Override
   public void a(Consumer<ewf> $$0) {
      $$0.accept(this);
   }

   @Override
   public fak s() {
      return ezt.super.s();
   }

   @Override
   public int aK_() {
      return this.l;
   }

   public void h(int $$0) {
      this.l = $$0;
   }
}
