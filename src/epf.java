import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public abstract class epf implements eqh, eqt, esi, esn {
   public static final acq m = new acq("textures/gui/widgets.png");
   public static final acq n = new acq("textures/gui/accessibility.png");
   private static final double a = 0.5;
   private static final double b = 3.0;
   protected int o;
   protected int p;
   private int c;
   private int d;
   private sw e;
   protected boolean q;
   public boolean r = true;
   public boolean s = true;
   protected float t = 1.0F;
   private int f;
   private boolean g;
   @Nullable
   private eqp h;
   private int i;
   private long j;
   private boolean k;

   public epf(int $$0, int $$1, int $$2, int $$3, sw $$4) {
      this.c = $$0;
      this.d = $$1;
      this.o = $$2;
      this.p = $$3;
      this.e = $$4;
   }

   @Override
   public int h() {
      return this.p;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.s) {
         this.q = $$1 >= this.p() && $$2 >= this.r() && $$1 < this.p() + this.o && $$2 < this.r() + this.p;
         this.b($$0, $$1, $$2, $$3);
         this.a();
      }
   }

   private void a() {
      if (this.h != null) {
         boolean $$0 = this.q || this.aB_() && enn.N().aT().b();
         if ($$0 != this.k) {
            if ($$0) {
               this.j = ac.b();
            }

            this.k = $$0;
         }

         if ($$0 && ac.b() - this.j > (long)this.i) {
            euq $$1 = enn.N().z;
            if ($$1 != null) {
               $$1.a(this.h, this.i(), this.aB_());
            }
         }
      }
   }

   protected exi i() {
      return (exi)(!this.q && this.aB_() && enn.N().aT().b() ? new exe(this) : new exk(this));
   }

   public void a(@Nullable eqp $$0) {
      this.h = $$0;
   }

   @Nullable
   public eqp j() {
      return this.h;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   protected tj aE_() {
      return a(this.l());
   }

   public static tj a(sw $$0) {
      return sw.a("gui.narrate.button", $$0);
   }

   public abstract void b(eox var1, int var2, int var3, float var4);

   protected static void a(eox $$0, eov $$1, sw $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$1.a($$2);
      int $$9 = ($$4 + $$6 - 9) / 2 + 1;
      int $$10 = $$5 - $$3;
      if ($$8 > $$10) {
         int $$11 = $$8 - $$10;
         double $$12 = (double)ac.b() / 1000.0;
         double $$13 = Math.max((double)$$11 * 0.5, 3.0);
         double $$14 = Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * $$12 / $$13)) / 2.0 + 0.5;
         double $$15 = apa.d($$14, 0.0, (double)$$11);
         $$0.c($$3, $$4, $$5, $$6);
         $$0.b($$1, $$2, $$3 - (int)$$15, $$9, $$7);
         $$0.f();
      } else {
         $$0.a($$1, $$2, ($$3 + $$5) / 2, $$9, $$7);
      }
   }

   protected void a(eox $$0, eov $$1, int $$2, int $$3) {
      int $$4 = this.p() + $$2;
      int $$5 = this.p() + this.k() - $$2;
      a($$0, $$1, this.l(), $$4, this.r(), $$5, this.r() + this.h(), $$3);
   }

   public void a(eox $$0, acq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      int $$11 = $$5;
      if (!this.aD_()) {
         $$11 = $$5 + $$6 * 2;
      } else if (this.n()) {
         $$11 = $$5 + $$6;
      }

      RenderSystem.enableDepthTest();
      $$0.a($$1, $$2, $$3, (float)$$4, (float)$$11, $$7, $$8, $$9, $$10);
   }

   public void a(double $$0, double $$1) {
   }

   public void b(double $$0, double $$1) {
   }

   protected void a(double $$0, double $$1, double $$2, double $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.r && this.s) {
         if (this.c($$2)) {
            boolean $$3 = this.d($$0, $$1);
            if ($$3) {
               this.a(enn.N().ah());
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
         this.b($$0, $$1);
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
         this.a($$0, $$1, $$3, $$4);
         return true;
      } else {
         return false;
      }
   }

   protected boolean d(double $$0, double $$1) {
      return this.r && this.s && $$0 >= (double)this.p() && $$1 >= (double)this.r() && $$0 < (double)(this.p() + this.o) && $$1 < (double)(this.r() + this.p);
   }

   @Nullable
   @Override
   public eou a(esv $$0) {
      if (!this.r || !this.s) {
         return null;
      } else {
         return !this.aB_() ? eou.a(this) : null;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.r && this.s && $$0 >= (double)this.p() && $$1 >= (double)this.r() && $$0 < (double)(this.p() + this.o) && $$1 < (double)(this.r() + this.p);
   }

   public void a(fzc $$0) {
      $$0.a(fxt.a(amh.yo, 1.0F));
   }

   @Override
   public int k() {
      return this.o;
   }

   public void d(int $$0) {
      this.o = $$0;
   }

   public void a(float $$0) {
      this.t = $$0;
   }

   public void b(sw $$0) {
      this.e = $$0;
   }

   public sw l() {
      return this.e;
   }

   @Override
   public boolean aB_() {
      return this.g;
   }

   public boolean m() {
      return this.q;
   }

   public boolean n() {
      return this.m() || this.aB_();
   }

   @Override
   public boolean aD_() {
      return this.s && this.r;
   }

   @Override
   public void b_(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public esn.a q() {
      if (this.aB_()) {
         return esn.a.c;
      } else {
         return this.q ? esn.a.b : esn.a.a;
      }
   }

   @Override
   public final void b(esp $$0) {
      this.a($$0);
      if (this.h != null) {
         this.h.b($$0);
      }
   }

   protected abstract void a(esp var1);

   protected void c(esp $$0) {
      $$0.a(eso.a, this.aE_());
      if (this.r) {
         if (this.aB_()) {
            $$0.a(eso.d, sw.c("narration.button.usage.focused"));
         } else {
            $$0.a(eso.d, sw.c("narration.button.usage.hovered"));
         }
      }
   }

   @Override
   public int p() {
      return this.c;
   }

   @Override
   public void e(int $$0) {
      this.c = $$0;
   }

   @Override
   public int r() {
      return this.d;
   }

   @Override
   public void f(int $$0) {
      this.d = $$0;
   }

   @Override
   public void a(Consumer<epf> $$0) {
      $$0.accept(this);
   }

   @Override
   public esz s() {
      return esi.super.s();
   }

   @Override
   public int aC_() {
      return this.f;
   }

   public void g(int $$0) {
      this.f = $$0;
   }
}
