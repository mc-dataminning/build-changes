import javax.annotation.Nullable;

public class fqi extends fpn<cqb> {
   private static final akt D = new akt("container/fletching/progresss");
   private static final akt E = new akt("textures/gui/container/fletching.png");
   private int F = 100;
   private final long G;
   @Nullable
   private xe H = null;
   private boolean I = false;

   public fqi(cqb $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2);
      this.c += 320;
      this.u += 160;
      this.G = fgj.Q().r.Z();
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.r = (this.c - this.p.a(this.n())) / 2;
   }

   private xe a(char $$0, char $$1, char $$2, boolean $$3) {
      xe $$4 = xe.i().a(dqy.b.a($$2), ", ", dqy.b.a(Character.valueOf($$0)));
      xe $$5 = $$2 >= 'j'
         ? xe.c("item.minecraft.amber_gem")
         : xe.i().a(dqy.b.a((char)($$2 + 1)), ", ", $$3 ? dqy.b.a(Character.valueOf($$1)) : dqy.b.a("unknown"));
      return xe.a("screen.fletching.title", $$4, $$5);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.w.p();
      boolean $$5 = this.w.q();
      if ($$4 != 0 && this.H == null || $$5 != this.I) {
         this.H = this.a(this.w.n(), this.w.o(), this.w.m(), $$5);
         this.F = $$4;
         this.I = $$5;
         this.r = (this.c - this.p.a(this.n())) / 2;
      }

      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   public xe n() {
      return this.H != null ? this.H : super.n();
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      long $$6 = fgj.Q().r.Z() - this.G;
      $$6 = Math.max(0L, $$6 - 20L);
      if ($$6 > 160L) {
         $$0.a(E, $$4, $$5, 0, 0.0F, 0.0F, this.c, this.d, 512, 512);
      } else {
         $$0.a(E, $$4 + 160, $$5 + 4, 0, 160.0F, 4.0F, this.c - 320, this.d - 4, 512, 512);
         int $$7 = 160 - (int)$$6;
         $$0.a(E, $$4 + $$7, $$5, 0, 0.0F, 0.0F, 164, 19, 512, 512);
         $$0.a(E, $$4 + this.c - 160 - $$7 - 4, $$5, 0, (float)(this.c - 160 - 4), 0.0F, 164, 19, 512, 512);
         $$0.a(E, $$4 + 160 + 4, $$5, 0, 164.0F, 0.0F, this.c - 320 - 8, this.d, 512, 512);
      }

      int $$8 = this.w.l();
      if ($$8 > 0) {
         float $$9 = ((float)$$8 + $$1) / (float)this.F;
         double $$10 = (Math.PI * 2) * (double)$$9;
         double $$11 = (1.0 - Math.cos($$10)) * 59.0;
         double $$12 = Math.sin(2.0 * $$10) * 21.0;
         this.a($$0, cuk.qM.v(), (float)($$4 + 160 + 79 - 59) + (float)$$11, (float)($$5 + 38) + (float)$$12, (float)$$10);
         int $$13 = (int)(21.0F * (1.0F - (float)$$8 / (float)this.F));
         if ($$13 > 0) {
            $$0.a(D, 9, 21, 0, 0, $$4 + 160 + 83, $$5 + 35, 9, $$13);
         }
      }
   }
}
