import org.joml.Matrix4f;

public abstract class fuc<T extends bjt> {
   protected static final float b = 0.025F;
   protected final fub c;
   private final esw a;
   protected float d;
   protected float e = 1.0F;

   protected fuc(fud.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      ht $$2 = ht.a($$0.k($$1));
      return fpa.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, ht $$1) {
      return $$0.dL().a(cri.a, $$1);
   }

   protected int a(T $$0, ht $$1) {
      return $$0.bM() ? 15 : $$0.dL().a(cri.b, $$1);
   }

   public boolean a(T $$0, fsc $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         eia $$5 = $$0.h_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new eia($$0.dq() - 2.0, $$0.ds() - 2.0, $$0.dw() - 2.0, $$0.dq() + 2.0, $$0.ds() + 2.0, $$0.dw() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public eif a(T $$0, float $$1) {
      return eif.b;
   }

   public void a(T $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.O_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cB() || $$0.ac() && $$0 == this.c.c;
   }

   public abstract afw a(T var1);

   public esw b() {
      return this.a;
   }

   protected void a(T $$0, ui $$1, emh $$2, fpb $$3, int $$4) {
      double $$5 = this.c.b($$0);
      if (!($$5 > 4096.0)) {
         boolean $$6 = !$$0.bU();
         float $$7 = $$0.dh();
         int $$8 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a(0.0F, $$7, 0.0F);
         $$2.a(this.c.b());
         $$2.b(-0.025F, -0.025F, 0.025F);
         Matrix4f $$9 = $$2.c().a();
         float $$10 = ero.O().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         esw $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? esw.a.b : esw.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, esw.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
